import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public final class Main {
    private static final long startTime = System.currentTimeMillis();
    private static final boolean LOCAL = false;
    private static final boolean DEBUG = false;
    private static final boolean MEASURE_TIME = false;
    private static final long TL = LOCAL ? 10000 : 29000;
    private static final int INF = 1 << 29;
    private static final int TMAX = 10000;
    private static final long TMAX2 = TMAX * TMAX;
    private static final int TLAST = 9500;
    private static final double INITIAL_COOLER = 0.00001;
    private static final double FINAL_COOLER = 0.1;
    private static final Scanner sc = new Scanner(System.in);
    private static final SplittableRandom rnd = new SplittableRandom(42);
    private static final Counter counter = new Counter();
    private static final Timer timer = new Timer();
    private static int V, E;
    private static int[][] G, G_PREV;
    private static int[] orders = new int[TMAX];
    private static long[] penas0 = new long[TMAX + 1];
    private static long[] penas1 = new long[TMAX + 1];
    private static long[] penas2 = new long[TMAX + 1];
    private static int lastOrder;
    private static IntAry[] vos;
    private static PrintWriter writer;
    private static double cooler = INITIAL_COOLER;
    private static int DIST_ALLOW = 50;
    private static int RETURN_TO_SHOP_TH = 20;
    private static double INITIAL_PENA_WEIGHT = 150.0;
    private static double FINAL_PENA_WEIGHT = 1.0;
    private static double[] PENA_WEIGHT = new double[TMAX + 1];
    private static int[] orderCount = new int[TMAX + 1];

    public static void main(String[] args) {
        if (args.length > 0) DIST_ALLOW = Integer.parseInt(args[0]);
        V = sc.nextInt();
        E = sc.nextInt();
        G = new int[V][V];
        G_PREV = new int[V][V];
        vos = new IntAry[V];
        for (int i = 0; i < V; i++) {
            Arrays.fill(G[i], INF);
            vos[i] = new IntAry(TMAX * 2 / V);
            G[i][i] = 0;
            G_PREV[i][i] = i;
        }
        for (int i = 0; i < E; i++) {
            int u = Integer.parseInt(sc.next()) - 1;
            int v = Integer.parseInt(sc.next()) - 1;
            int d = Integer.parseInt(sc.next());
            G[u][v] = G[v][u] = d;
            G_PREV[u][v] = u;
            G_PREV[v][u] = v;
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < V; k++) {
                    if (G[j][k] > G[j][i] + G[i][k]) {
                        G[j][k] = G[j][i] + G[i][k];
                        G_PREV[j][k] = i;
                    }
                }
            }
        }
        sc.next();
        for (int i = 0; i < TMAX; i++) {
            if (i > 0) {
                penas0[i] = penas0[i - 1];
                penas1[i] = penas1[i - 1];
                penas2[i] = penas2[i - 1];
            }
            if (sc.next().charAt(0) == '1') {
                sc.next();
                int dst = sc.nextInt() - 1;
                orders[i] = dst;
                vos[dst].add(i);
                lastOrder = i;
                penas0[i] += i * i;
                penas1[i] -= 2 * i;
                penas2[i]++;
            }
            PENA_WEIGHT[i] = (FINAL_PENA_WEIGHT * i + INITIAL_PENA_WEIGHT * (TMAX - i)) / TMAX;
            if (i > 0) {
                orderCount[i] = orderCount[i - 1];
                if (orders[i] != 0) orderCount[i]++;
            }
        }
        orderCount[TMAX] = orderCount[TMAX - 1];
        PENA_WEIGHT[TMAX] = 0;
        penas0[TMAX] = penas0[TMAX - 1];
        penas1[TMAX] = penas1[TMAX - 1];
        penas2[TMAX] = penas2[TMAX - 1];
        for (int i = 0; i < V; i++) {
            vos[i].add(TMAX + 1);
        }
        State sol = new State();
        long worstTime = 0;
        long prevTime = System.currentTimeMillis();
        for (int turn = 0; ; turn++) {
            if (System.currentTimeMillis() - startTime + worstTime > TL - 500) {
                debug("turn:" + turn + " worstTime:" + worstTime);
                break;
            }
            State cur = greedy();
            debug("score:" + cur.score + " at turn:" + turn);
            if (cur.score > sol.score) {
                sol = cur;
            }
            long curTime = System.currentTimeMillis();
            worstTime = Math.max(worstTime, curTime - prevTime);
            prevTime = curTime;
        }
        sol = improve(sol);
        writer = new PrintWriter(System.out);
        sol.output();
        counter.print();
        timer.print();
    }

    private static State greedy() {
        final int MIN_ORDER_COUNT = 5;
        Beam[] beams = new Beam[TMAX + 1];
        beams[0] = new Beam();
        beams[0].nextDeliver = new int[V];
        for (int time = 0; time < TMAX; time++) {
            Beam beam = beams[time];
//            if (time > 0 && beams[time - 1] != null) {
//                Beam pb = beams[time - 1];
//                long newPena = pb.penaFix + (penas2[time] - pb.pena2) * time * time + (penas1[time] - pb.pena1) * time + penas0[time] - pb.pena0;
//                if (beam == null || beam.score - beam.pena < pb.score - newPena) {
//                    beam = beams[time] = beams[time - 1];
//                    beam.pena = newPena;
//                    if (orders[time] == 0) continue;
//                }
//            }
            if (beam == null) continue;
            if (beam.last) continue;
            int oc = 0;
            for (int i = 1; i < V && oc < MIN_ORDER_COUNT; i++) {
                int di = beam.nextDeliver[i];
                while (vos[i].a[di] < time) {
                    oc++;
                    di++;
                }
            }
            if (oc < MIN_ORDER_COUNT) {
                int t = time;
                while (t <= TLAST) {
                    if (oc > 0) {
                        timer.start(0);
                        Beam nb = createNextBeam(beam, t);
                        timer.stop(0);
                        timer.start(1);
                        updateBeams(beams, nb);
                        timer.stop(1);
                    }
                    if (oc == MIN_ORDER_COUNT) break;
                    t++;
                    while (t < TLAST && orders[t] == 0) {
                        t++;
                    }
                    oc++;
                }
            } else {
                for (int i = 0; i < 5; i++) {
                    timer.start(2);
                    Beam nb = createNextBeam(beam, time);
                    timer.stop(2);
                    timer.start(3);
                    updateBeams(beams, nb);
                    timer.stop(3);
                }
            }
        }
        Beam best = beams[0];
        for (int i = 1; i <= TMAX; i++) {
            if (DEBUG && beams[i] != null) {
                debugfln("t:%d score:%d %d", i, beams[i].score, beams[i].pena);
                debugfln("%d %d %d %d", penas2[i] - beams[i].pena2, penas1[i] - beams[i].pena1, penas0[i] - beams[i].pena0, beams[i].penaFix);
                long v0 = 0;
                long v1 = 0;
                long v2 = 0;
                for (int j = 0; j < V; j++) {
                    for (int k = 0; k < vos[j].size; k++) {
                        if (beams[i].nextDeliver[j] <= k && vos[j].a[k] <= i) {
                            v2++;
                            v1 -= 2 * vos[j].a[k];
                            v0 += sq(vos[j].a[k]);
                        }
                    }
                }
                debugfln("%d %d %d", v2, v1, v0);
            }
            if (beams[i] != null && beams[i].score > best.score) {
                best = beams[i];
            }
        }
        if (DEBUG) {
            int orderCount = 0;
            int undeliver = 0;
            for (int i = 0; i < TLAST; i++) {
                if (orders[i] != 0) orderCount++;
            }
            for (int i = 0; i < V; i++) {
                undeliver += vos[i].size - 1 - best.nextDeliver[i];
            }
            debug("undeliver:" + undeliver + "/" + orderCount);
        }
        State ret = new State();
        ret.score = best.score;
        ArrayList<Beam> list = new ArrayList<>();
        while (best != beams[0]) {
            list.add(best);
            best = best.prev;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            Beam b = list.get(i);
            debug(b);
            ret.path.add(0);
            ret.waitUntil.add(b.startAt);
            int t = b.startAt;
            for (int j = 0; j < b.path.size; j++) {
                int cur = b.path.a[j];
                t += G[j == 0 ? 0 : b.path.a[j - 1]][cur];
                ret.path.add(cur);
                ret.waitUntil.add(t);
            }
        }
        return ret;
    }

    private static void updateBeams(Beam[] beams, Beam beam) {
        updateBeams_(beams, beam);
//        if (beam.path.size > 1) {
//            updateBeams_(beams, beam.reversed());
//        }
    }

    private static void updateBeams_(Beam[] beams, Beam beam) {
        int t = beam.startAt;
        long score = beam.prev.score;
        long penaFix = beam.prev.penaFix;
        long pena2 = beam.prev.pena2;
        long pena1 = beam.prev.pena1;
        long pena0 = beam.prev.pena0;
        int[] nextDeliver = beam.prev.nextDeliver.clone();
        for (int i = 0; i < beam.path.size && t <= TMAX; i++) {
            int cur = beam.path.a[i];
            int arrive = t + G[i == 0 ? 0 : beam.path.a[i - 1]][cur];
            if (arrive > TMAX) {
                long curPena = penaFix + (penas2[t] - pena2) * t * t + (penas1[t] - pena1) * t + penas0[t] - pena0;
                if (beams[t] == null || beams[t].score - beams[t].pena * PENA_WEIGHT[t] < score - curPena * PENA_WEIGHT[t]) {
                    Beam nb = new Beam();
                    nb.prev = beam.prev;
                    nb.startAt = beam.startAt;
                    nb.finishAt = t;
                    nb.nextDeliver = nextDeliver.clone();
                    nb.score = score;
                    nb.penaFix = penaFix;
                    nb.pena2 = pena2;
                    nb.pena1 = pena1;
                    nb.pena0 = pena0;
                    nb.pena = curPena;
                    nb.path = beam.path.copyOf(0, i);
                    nb.last = true;
                    beams[t] = nb;
//                    debug("at:" + t + " score;" + score);
                }
                break;
            }
            t = arrive;
            while (vos[cur].a[nextDeliver[cur]] <= beam.startAt) {
                long occur = vos[cur].a[nextDeliver[cur]];
                score += TMAX2 - sq(t - occur);
                penaFix += sq(t - occur);
                pena2++;
                pena1 -= 2 * occur;
                pena0 += occur * occur;
                nextDeliver[cur]++;
            }
            int nt = t + G[cur][0];
            if (i < beam.path.size - 1 && nt <= TMAX) {
                boolean returnToShop = G[cur][0] + G[0][beam.path.a[i + 1]] <= G[cur][beam.path.a[i + 1]] + DIST_ALLOW
                        && G[cur][0] < G[cur][beam.path.a[i + 1]] + G[beam.path.a[i + 1]][0];
                returnToShop |= orderCount[nt] - orderCount[beam.startAt] > RETURN_TO_SHOP_TH;
                if (returnToShop) {
                    long curPena = penaFix + (penas2[nt] - pena2) * nt * nt + (penas1[nt] - pena1) * nt + penas0[nt] - pena0;
                    if (beams[nt] == null || beams[nt].score - beams[nt].pena * PENA_WEIGHT[nt] < score - curPena * PENA_WEIGHT[nt]) {
                        Beam nb = new Beam();
                        nb.prev = beam.prev;
                        nb.startAt = beam.startAt;
                        nb.finishAt = nt;
                        nb.nextDeliver = nextDeliver.clone();
                        nb.score = score;
                        nb.penaFix = penaFix;
                        nb.pena2 = pena2;
                        nb.pena1 = pena1;
                        nb.pena0 = pena0;
                        nb.pena = curPena;
                        nb.path = beam.path.copyOf(0, i + 1);
                        beams[nt] = nb;
//                    debug("at:" + nt + " score;" + score);
                        if (G[cur][0] + G[0][beam.path.a[i + 1]] <= G[cur][beam.path.a[i + 1]]) {
                            return;
                        }
                    }
                }
            }
        }
        t = beam.finishAt;
        if (t <= TMAX) {
            long curPena = penaFix + (penas2[t] - pena2) * t * t + (penas1[t] - pena1) * t + penas0[t] - pena0;
            if (beams[t] == null || beams[t].score - beams[t].pena * PENA_WEIGHT[t] < score - curPena * PENA_WEIGHT[t]) {
                beam.score = score;
                beam.penaFix = penaFix;
                beam.pena2 = pena2;
                beam.pena1 = pena1;
                beam.pena0 = pena0;
                beam.pena = curPena;
                beams[t] = beam;
//            debug("at:" + beam.finishAt + " score;" + beam.score);
            }
        }
    }

    private static long[] countO = new long[400];
    private static long[] coefO = new long[400];
    private static long[] constO = new long[400];

    private static Beam createNextBeam(Beam prev, int startAt) {
        timer.start(9);
        IntAry vs = new IntAry();
        for (int i = 1; i < V; i++) {
            if (vos[i].a[prev.nextDeliver[i]] <= startAt) {
                vs.add(i);
                int j = prev.nextDeliver[i];
                countO[i] = coefO[i] = constO[i] = 0;
                while (vos[i].a[j] <= startAt) {
                    countO[i]++;
                    coefO[i] += 2 * vos[i].a[j];
                    constO[i] += vos[i].a[j] * vos[i].a[j];
                    j++;
                }
            }
        }
        long score = 0;
        long t = startAt;

        for (int i = 0; i < vs.size - 1; i++) {
            int pos = rnd.nextInt(vs.size - i) + i;
            swap(vs.a, i, pos);
        }
        for (int i = 0, cur = 0; i < vs.size; i++) {
            int min = 9999;
            int mi = -1;
            for (int j = i; j < vs.size; j++) {
                if (G[cur][vs.a[j]] < min) {
                    min = G[cur][vs.a[j]];
                    mi = j;
                }
            }
            swap(vs.a, i, mi);
            cur = vs.a[i];
            t += min;
            if (t <= TMAX) {
                score += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
            }
        }
//        for (int i = 0; i < vs.size; i++) {
//            int cur = vs.a[i];
//            t += G[i == 0 ? 0 : vs.a[i - 1]][cur];
//            int j = prev.nextDeliver[cur];
//            while (vos[cur].a[j] <= startAt) {
//                score += TMAX2 - sq(t - vos[cur].a[j]);
//                j++;
//            }
//        }
        timer.stop(9);
        timer.start(10);
        for (int i = 0; i < (vs.size - 1) / 2; i++) {
            int ml = INF;
            int p1 = rnd.nextInt(vs.size);
            int pn1 = p1 == 0 ? 0 : vs.a[p1 - 1];
            int nn1 = p1 == vs.size - 1 ? 0 : vs.a[p1 + 1];
            int p2 = -1;
            for (int j = 0; j <= p1 - 1; j++) {
                int pn2 = j == 0 ? 0 : vs.a[j - 1];
                int diff = G[pn2][vs.a[p1]] + G[nn1][vs.a[j]] - G[pn2][vs.a[j]] - G[nn1][vs.a[p1]];
                if (diff < ml || diff == ml && (rnd.nextInt() & 1) == 0) {
                    ml = diff;
                    p2 = j;
                }
            }
            for (int j = p1 + 1; j < vs.size; j++) {
                int nn2 = j == vs.size - 1 ? 0 : vs.a[j + 1];
                int diff = G[pn1][vs.a[j]] + G[vs.a[p1]][nn2] - G[pn1][vs.a[p1]] - G[vs.a[j]][nn2];
                if (diff < ml || diff == ml && (rnd.nextInt() & 1) == 0) {
                    ml = diff;
                    p2 = j;
                }
            }
//            int p2 = rnd.nextInt(vs.size - 1);
            if (p2 < p1) {
                int tmp = p2;
                p2 = p1;
                p1 = tmp;
            }
            // 2-opt
            t = startAt;
            long nextScore = 0;
            int pp = 0;
            for (int j = 0; j < p1 && t <= TMAX; j++) {
                int cur = vs.a[j];
                t += G[pp][cur];
                if (t > TMAX) break;
                nextScore += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
                pp = cur;
            }
            for (int j = p2; j >= p1 && t <= TMAX; j--) {
                int cur = vs.a[j];
                t += G[pp][cur];
                if (t > TMAX) break;
                nextScore += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
                pp = cur;
            }
            for (int j = p2 + 1; j < vs.size && t <= TMAX; j++) {
                int cur = vs.a[j];
                t += G[pp][cur];
                if (t > TMAX) break;
                nextScore += countO[cur] * (TMAX2 - t * t) + coefO[cur] * t - constO[cur];
                pp = cur;
            }
            counter.add(0);
            if (score < nextScore) {
                counter.add(1);
                for (int lo = p1, hi = p2; lo < hi; lo++, hi--) {
                    swap(vs.a, lo, hi);
                }
//                debug("score:" + score + "->" + nextScore);
                score = nextScore;
            }
        }
        timer.stop(10);
        timer.start(11);
        Beam ret = new Beam(prev);
        ret.startAt = ret.finishAt = startAt;
        for (int i = 0; i < vs.size; i++) {
            int cur = vs.a[i];
            ret.finishAt += G[i == 0 ? 0 : vs.a[i - 1]][cur];
            while (vos[cur].a[ret.nextDeliver[cur]] <= startAt) {
                ret.nextDeliver[cur]++;
            }
        }
        if (startAt < lastOrder) {
            ret.finishAt += G[vs.back()][0];
        } else {
            ret.last = true;
        }
        ret.path = vs;
        ret.score = prev.score + score;
        timer.stop(11);
        return ret;
    }

    static class Beam {
        Beam prev;
        int startAt, finishAt;
        int[] nextDeliver;
        IntAry path;
        long score, penaFix, pena2, pena1, pena0, pena;
        boolean last;

        Beam() {
        }

        Beam(Beam prev) {
            this.prev = prev;
            this.nextDeliver = prev.nextDeliver.clone();
        }

        Beam reversed() {
            Beam r = new Beam();
            r.prev = this.prev;
            r.startAt = this.startAt;
            r.finishAt = this.finishAt;
            r.nextDeliver = this.nextDeliver.clone();
            r.path = new IntAry(this.path);
            r.path.reverse();
            r.last = this.last;
            return r;
        }

        public String toString() {
            return "startAt:" + startAt + " finishAt:" + finishAt + " score:" + score + "\npath:" + path;
        }
    }

    private static State improve(State st) {
        int N = st.path.size;
        int[] prevShop = new int[N];
        int[] nextShop = new int[N];
        {
            int p = 0;
            int n = N;
            for (int i = 0; i < N; i++) {
                if (st.path.a[i] == 0) p = i;
                if (st.path.a[N - 1 - i] == 0) n = N - 1 - i;
                prevShop[i] = p;
                nextShop[N - 1 - i] = n;
            }
        }
        State bestState = st.clone();
        long bestScore = st.score;
        long score = bestScore;
        int[] nextDeliver = new int[V];
        for (int turn = 0; ; turn++) {
            if ((turn & 0xFF) == 0) {
                long elapsed = System.currentTimeMillis() - startTime;
                if (elapsed > TL) {
                    debug("turn:" + turn);
                    break;
                }
                double c0 = Math.log(INITIAL_COOLER);
                double c1 = Math.log(FINAL_COOLER);
                double ratio = elapsed * 1.0 / TL;
                cooler = Math.exp(c0 * (1 - ratio) + c1 * ratio);
            }
            int pos1 = rnd.nextInt(N - 1) + 1;
            while (st.path.a[pos1] == 0) {
                pos1 = rnd.nextInt(N - 1) + 1;
            }
            int p0 = prevShop[pos1];
            int n0 = nextShop[pos1];
            if (n0 - p0 <= 2) continue;
            int pos2 = rnd.nextInt(n0 - p0 - 2) + p0 + 1;
            if (pos1 <= pos2) {
                pos2++;
            } else {
                int tmp = pos1;
                pos1 = pos2;
                pos2 = tmp;
            }
            Arrays.fill(nextDeliver, 0);
            long t = 0;
            long nextScore = 0;
            int pp = 0;
            long shopTime = 0;
            for (int j = 0; j < pos1; j++) {
                int cur = st.path.a[j];
                if (cur == 0) {
                    t += G[pp][cur];
                    if (t < st.waitUntil.a[j]) t = st.waitUntil.a[j];
                    shopTime = t;
                } else {
                    t += G[pp][cur];
                    while (vos[cur].a[nextDeliver[cur]] <= shopTime) {
                        nextScore += TMAX2 - sq(t - vos[cur].a[nextDeliver[cur]]);
                        nextDeliver[cur]++;
                    }
                }
                pp = cur;
            }
            for (int j = pos2; j >= pos1; j--) {
                int cur = st.path.a[j];
                t += G[pp][cur];
                if (t > TMAX) break;
                while (vos[cur].a[nextDeliver[cur]] <= shopTime) {
                    nextScore += TMAX2 - sq(t - vos[cur].a[nextDeliver[cur]]);
                    nextDeliver[cur]++;
                }
                pp = cur;
            }
            for (int j = pos2 + 1; j < N; j++) {
                int cur = st.path.a[j];
                if (cur == 0) {
                    t += G[pp][cur];
                    if (t < st.waitUntil.a[j]) {
                        int nt = st.waitUntil.a[j];
                        while (nt > t && orders[nt] == 0) {
                            --nt;
                        }
                        t = nt;
                    }
                    shopTime = t;
                } else {
                    t += G[pp][cur];
                    if (t > TMAX) break;
                    while (vos[cur].a[nextDeliver[cur]] <= shopTime) {
                        nextScore += TMAX2 - sq(t - vos[cur].a[nextDeliver[cur]]);
                        nextDeliver[cur]++;
                    }
                }
                pp = cur;
            }
            if (t <= TMAX && score < nextScore) {
                for (int lo = pos1, hi = pos2; lo < hi; lo++, hi--) {
                    swap(st.path.a, lo, hi);
//                    swap(st.waitUntil.a, lo, hi);
                }
                debug("score:" + score + "->" + nextScore + " at turn:" + turn + " pos1:" + pos1 + " pos2:" + pos2);
                score = nextScore;
            }

//            if (st.path.a[pos] == 0) {
//                int type = rnd.nextInt() & 1;
//                if (type == 0) {
//                    // extend wait to next order and insert it somewhere
//                    int extendTo = st.waitUntil.a[pos];
//                    while (extendTo < TLAST) {
//                        extendTo++;
//                        if (orders[extendTo] != 0) {
//                            break;
//                        }
//                    }
//                    if (st.waitUntil.a[pos] >= TLAST) continue;
//
//                } else {
//                    // shorten wait to previous order
//                }
//
//            } else {
//                int type = rnd.nextInt() & 1;
//                if (type == 0) {
//                    // skip
//                } else {
//                    // move
//
//                }
//            }
        }
        return st;
    }

    private static boolean accept(long diff) {
        if (diff >= 0) return true;
        double v = diff * cooler;
        if (v < -8.0) return false;
        return rnd.nextDouble() < Math.exp(v);
    }

    static class State {
        IntAry path;
        IntAry waitUntil;
        long score;

        State() {
            path = new IntAry();
            waitUntil = new IntAry();
        }

        public State clone() {
            State ret = new State();
            ret.path = new IntAry(this.path);
            ret.waitUntil = new IntAry(this.waitUntil);
            ret.score = this.score;
            return ret;
        }

        void goShop(int until) {
            path.add(0);
            waitUntil.add(until);
        }

        void goCustomer(int v) {
            waitUntil.add(waitUntil.back() + G[path.back()][v]);
            path.add(v);
        }

        void output() {
            debug(path);
            debug(waitUntil);
            int t = 0;
            int idx = 0;
            for (int i = 0; i < path.size - 1; i++, idx++) {
                if (path.a[i] == 0) {
                    while (t < waitUntil.a[idx]) {
                        writer.println(-1);
                        t++;
                    }
                }
                outputPath(path.a[i], path.a[i + 1]);
                t += G[path.a[i]][path.a[i + 1]];
            }
            while (t < TMAX) {
                writer.println(-1);
                t++;
            }
            writer.flush();
        }

        void outputPath(int u, int v) {
//            debug(u + "->" + v);
            if (G_PREV[u][v] == u) {
                for (int i = 0; i < G[u][v]; i++) {
                    writer.println(v + 1);
                }
            } else {
                outputPath(u, G_PREV[u][v]);
                outputPath(G_PREV[u][v], v);
            }
        }
    }

    static final class IntAry {
        int[] a;
        int size;

        IntAry() {
            a = new int[16];
        }

        IntAry(int cap) {
            a = new int[cap];
        }

        IntAry(int[] a) {
            this.a = a;
            this.size = a.length;
        }

        IntAry(IntAry that) {
            a = that.a.clone();
            size = that.size;
        }

        @Override
        public String toString() {
            return Arrays.toString(Arrays.copyOf(a, size));
        }

        IntAry copyOf(int from, int to) {
            return new IntAry(Arrays.copyOfRange(this.a, from, to));
        }

        void add(int v) {
            if (size == a.length) {
                int[] na = new int[a.length * 2];
                System.arraycopy(a, 0, na, 0, size);
                a = na;
            }
            a[size++] = v;
        }

        void addAll(IntAry ia) {
            if (this.size + ia.size < a.length) {
                int[] na = new int[this.size + ia.size];
                System.arraycopy(a, 0, na, 0, size);
                a = na;
            }
            System.arraycopy(ia.a, 0, a, size, ia.size);
            size += ia.size;
        }

        void clear() {
            size = 0;
        }

        int pop() {
            size--;
            return a[size];
        }

        int back() {
            return a[size - 1];
        }

        void remove(int pos) {
            System.arraycopy(a, pos + 1, a, pos, size - pos - 1);
            size--;
        }

        void swapRemove(int pos) {
            swap(a, pos, size - 1);
            size--;
        }

        void sort() {
            Arrays.sort(a, 0, size);
        }

        void reverse() {
            for (int lo = 0, hi = size - 1; lo < hi; lo++, hi--) {
                swap(a, lo, hi);
            }
        }
    }

    private static void swap(int[] a, int p1, int p2) {
        int tmp = a[p1];
        a[p1] = a[p2];
        a[p2] = tmp;
    }

    private static long sq(long v) {
        return v * v;
    }

    private static void debug(String str) {
        if (DEBUG) System.err.println(str);
    }

    private static void debug(Object... obj) {
        if (DEBUG) System.err.println(Arrays.deepToString(obj));
    }

    static void debugfln(String fmt, Object... obj) {
        if (DEBUG) System.err.printf(fmt + "\n", obj);
    }

    static final class Timer {
        ArrayList<Long> sum = new ArrayList<>();
        ArrayList<Long> start = new ArrayList<>();

        void start(int i) {
            if (MEASURE_TIME) {
                while (sum.size() <= i) {
                    sum.add(0L);
                    start.add(0L);
                }
                start.set(i, System.currentTimeMillis());
            }
        }

        void stop(int i) {
            if (MEASURE_TIME) {
                sum.set(i, sum.get(i) + System.currentTimeMillis() - start.get(i));
            }
        }

        void print() {
            if (MEASURE_TIME && !sum.isEmpty()) {
                System.err.print("[");
                for (int i = 0; i < sum.size(); ++i) {
                    System.err.print(sum.get(i) + ", ");
                }
                System.err.println("]");
            }
        }

    }

    private static final class Counter {
        ArrayList<Integer> count = new ArrayList<>();

        void add(int i) {
            if (DEBUG) {
                while (count.size() <= i) {
                    count.add(0);
                }
                count.set(i, count.get(i) + 1);
            }
        }

        void print() {
            if (DEBUG) {
                System.err.print("[");
                for (int i = 0; i < count.size(); ++i) {
                    System.err.print(count.get(i) + ", ");
                }
                System.err.println("]");
            }
        }
    }
}

