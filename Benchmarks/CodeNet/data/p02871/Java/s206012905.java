import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public final class Main {
    private static final long startTime = System.currentTimeMillis();
    private static final boolean LOCAL = false;
    private static final boolean DEBUG = false;
    private static final long TL = LOCAL ? 4000 : 29000;
    private static final int INF = 1 << 29;
    private static final int TMAX = 10000;
    private static final long TMAX2 = TMAX * TMAX;
    private static final int TLAST = 9500;
    private static final double INITIAL_COOLER = 0.00001;
    private static final double FINAL_COOLER = 0.1;
    private static Scanner sc = new Scanner(System.in);
    private static SplittableRandom rnd = new SplittableRandom(42);
    private static int V, E;
    private static int[][] G, G_PREV;
    private static int[] orders = new int[TMAX];
    private static IntAry[] vos;
    private static PrintWriter writer;
    private static double cooler = INITIAL_COOLER;

    public static void main(String[] args) {
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
            if (sc.next().charAt(0) == '1') {
                sc.next();
                int dst = sc.nextInt() - 1;
                orders[i] = dst;
                vos[dst].add(i);
            }
        }
        for (int i = 0; i < V; i++) {
            vos[i].add(TMAX + 1);
        }
        State sol = initialSolution();
        for (int turn = 1; ; turn++) {
            if (System.currentTimeMillis() - startTime > TL) {
                debug("turn:" + turn);
                break;
            }
            State cur = initialSolution();
            if (cur.score > sol.score) {
                sol = cur;
                debug("score:" + cur.score + " at turn:" + turn);
            }
        }
//        sol = improve(sol);
        writer = new PrintWriter(System.out);
        sol.output();
    }

    static State initialSolution() {
        State st = new State();
        int[] nextDeliver = new int[V];
//        final int WAIT_ORDER = 50;
//        final int MIN_ORDER = 10;
        int MAX_WAIT_ORDER = rnd.nextInt(200) + 50;
        int WAIT_ORDER = rnd.nextInt(MAX_WAIT_ORDER - 10) + 10;
        int MIN_ORDER = Math.min(WAIT_ORDER - 1, rnd.nextInt(20) + 2);
        int oc = 0;
        int t = 0;
        int lastLoad = -1;
        while (t < TMAX) {
//            debug("t:" + t + " oc:" + oc + " lastLoad:" + lastLoad);
            if (oc < MIN_ORDER) {
                if (t >= TLAST) break;
                while (t < TLAST && oc < WAIT_ORDER) {
                    if (orders[t] != 0) {
                        oc++;
                    }
                    if (oc == WAIT_ORDER) break;
                    t++;
                }
                st.goShop(t);
                lastLoad = t;
                WAIT_ORDER = rnd.nextInt(MAX_WAIT_ORDER - 10) + 10;
                MIN_ORDER = Math.min(WAIT_ORDER - 1, rnd.nextInt(20) + 2);
            } else {
                long maxGain = 0;
                int next = 0;
                for (int i = 1; i < V; i++) {
                    int nt = t + G[st.path.back()][i];
                    if (nt > TMAX) continue;
                    if (vos[i].a[nextDeliver[i]] > lastLoad) continue;
                    long gain = 0;
                    for (int j = nextDeliver[i]; vos[i].a[j] <= lastLoad; j++) {
                        gain += TMAX2 - sq(nt - vos[i].a[j]);
                    }
                    if (gain > maxGain) {
                        maxGain = gain;
                        next = i;
                    }
                }
                if (next == 0) break;
                t += G[st.path.back()][next];
                while (vos[next].a[nextDeliver[next]] <= lastLoad) {
                    oc--;
                    nextDeliver[next]++;
                }
                st.goCustomer(next);
                st.score += maxGain;
            }
        }

        return st;
    }

    static State improve(State st) {
        State bestState = st.clone();
        for (int turn = 0; ; turn++) {
            if ((turn & 0xFF) == 0) {
                long elapsed = System.currentTimeMillis() - startTime;
                if (elapsed > TL) {
                    debug("turn:" + turn);
                    break;
                }
                double c0 = Math.log(INITIAL_COOLER);
                double c1 = Math.log(INITIAL_COOLER);
                double ratio = elapsed * 1.0 / TL;
                cooler = Math.exp(c0 * (1 - ratio) + c1 * ratio);
            }
            int pos = rnd.nextInt(st.path.size);
            if (st.path.a[pos] == 0) {
                int type = rnd.nextInt() & 1;
                if (type == 0) {
                    // extend wait to next order and insert it somewhere
                    int extendTo = st.waitUntil.a[pos];
                    while (extendTo < TLAST) {
                        extendTo++;
                        if (orders[extendTo] != 0) {
                            break;
                        }
                    }
                    if (st.waitUntil.a[pos] >= TLAST) continue;

                } else {
                    // shorten wait to previous order
                }

            } else {
                int type = rnd.nextInt() & 1;
                if (type == 0) {
                    // skip
                } else {
                    // move

                }
            }

        }
        return bestState;
    }

    static boolean accept(long diff) {
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
            path.add(v);
            waitUntil.add(waitUntil.back() + G[path.back()][v]);
        }

        void output() {
            debug(Arrays.toString(path.a));
            debug(Arrays.toString(waitUntil.a));
            int t = 0;
            int idx = 0;
            for (int i = 0; i < path.size - 1; i++, idx++) {
                while (t < waitUntil.a[idx]) {
                    writer.println(-1);
                    t++;
                }
                debug(path.a[i] + " " + path.a[i + 1]);
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

        IntAry(int cap) {
            a = new int[cap];
        }

        IntAry() {
            a = new int[16];
        }

        IntAry(IntAry that) {
            a = that.a.clone();
            size = that.size;
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
    }

    static void swap(int[] a, int p1, int p2) {
        int tmp = a[p1];
        a[p1] = a[p2];
        a[p2] = tmp;
    }

    static long sq(long v) {
        return v * v;
    }

    static void debug(String str) {
        if (DEBUG) System.err.println(str);
    }

    static void debug(Object... obj) {
        if (DEBUG) System.err.println(Arrays.deepToString(obj));
    }

}

