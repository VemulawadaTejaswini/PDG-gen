
import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2855 Permutation Period
 *    2018/02/20
 */
public class Main {

    // 16
    private final static int JOIN_NUM = 80;
    private final static int SPLIT_NUM = JOIN_NUM * 8;

    class Item {
        int num;      // 1-
        int groupNum; // このグループのItem数
        Item next;
        Item nextG;
        Item prevG;

        @Override
        public String toString() {
            String s = "";
            Item p = this;
            for(;;) {
                if (p.nextG != null) {
                    s += String.format("(%d)", p.groupNum);
                }
                //s += String.format("%d ", p.num);
                p = p.next;
                if (p == this)
                    break;
            }
            return s;
        }

        // 所属グループを返す
        Item getGroup() {
            if (nextG != null) {
                return this;
            }
            Item p = this;
            for(;;p = p.next) {
                if (p.nextG != null)
                    return p.prevG;
            }
        }

        // ループ数を求める
        int getLoopNum() {
            Item g = getGroup();
            int num = g.groupNum;
            Item p = g.nextG;;
            for(;p != g;) {
                num += p.groupNum;
                p = p.nextG;
            }
            return num;
        }

        // groupNumをセットする
        int setGroupNum() {
            assert nextG != null;
            Item p = this;
            int i;
            for(i = 1;;i++) {
                p = p.next;
                if (p.nextG != null)
                    break;
            }
            groupNum = i;
            return groupNum;
        }


        // グループのサイズによって分割、結合する
        void organize() {
            assert nextG != null;
            //if (nextG != this) {
            //    log.printf("join? %d %d\n",groupNum, nextG.groupNum);
            //}
            
            if (groupNum > SPLIT_NUM) { // 分割
                Item p = this;
                int num = groupNum / 2;
                for(int i = 0; i < num; i++) {
                    p = p.next;
                }
                p.nextG = nextG; // group昇格
                p.prevG = this;
                nextG.prevG = p;
                nextG = p;
                p.groupNum = groupNum - num;
                groupNum = num;
                //assert(groupNum == setGroupNum());
                //assert(p.groupNum == p.setGroupNum());
            }
            else if (nextG != this && groupNum + nextG.groupNum < JOIN_NUM) {
                groupNum += nextG.groupNum;
                Item n = nextG;
                n.nextG.prevG = this;
                nextG = n.nextG;
                n.nextG = n.prevG = null;
            }
        }

        // 同じループのグループか?
        boolean sameLoopG(Item g) {
            assert nextG != null;
            assert g.nextG != null;
            if (this == g)
                return true;
            Item p = nextG;
            for(;;) {
                if (p == this)
                    return false;
                if (p == g)
                    return true;
                p = p.nextG;
            }
        }
    }

    void swap(Item p0, Item p1, int[] lcnt) {
        //log.printf("swap %d %d\n",  p0.num, p1.num);
        Item g0 = p0.getGroup();
        Item g1 = p1.getGroup();
        boolean merge = !g0.sameLoopG(g1);

        if (merge) { // 結合
            int lnum0 = g0.getLoopNum();
            int lnum1 = g1.getLoopNum();

            g0.nextG.prevG = g1;
            g1.nextG.prevG = g0;
            Item t = g0.nextG;
            g0.nextG = g1.nextG;
            g1.nextG = t;

            t = p0.next;
            p0.next = p1.next;
            p1.next = t;

            g0.setGroupNum();
            g1.setGroupNum();
            g0.organize();
            g0.prevG.organize(); // TODO
            if (g1.nextG != null) {
                g1.organize();
                g1.prevG.organize(); // TODO
            }

//            if (g0.nextG != null)
//                g0.setGroupNum();
//            if (g1.nextG != null)
//                g1.setGroupNum();
//            int gnumAfter = p0.getLoopNum();
            int lnumAfter = lnum0 + lnum1;
            //log.printf("loopnum = (%d %d)-(%d)\n", lnum0, lnum1, lnumAfter);
            if (--lcnt[lnum0] == 0) { change |= 2; lcntSet.remove(lnum0); }
            if (--lcnt[lnum1] == 0) { change |= 2; lcntSet.remove(lnum1); }
            if (lnumAfter > 1 && ++lcnt[lnumAfter     ] == 1) { change |= 1; lcntSet.add(lnumAfter); }
            //log.printf("%s\n", p0.getGroup());
        }
        else {
            Item t;
            // 分割
            //int gnum0 = g0.getLoopNum();
            if (g0 == g1) {
                // 同一グループの分割
                Item p = g0;
                for(;;p = p.next) {
                    if (p == p0)
                        break;
                    if (p == p1) {
                        t = p0;
                        p0 = p1;
                        p1 = t;
                        break;
                    }
                }
                p1.nextG = p1; // group昇格
                p1.prevG = p1;

                t = p0.next;
                p0.next = p1.next;
                p1.next = t;
                g0.setGroupNum();
                p1.setGroupNum();
                int lnum0After = g0.getLoopNum();
                int lnum1After = p1.getLoopNum();
                int lnum0 = lnum0After + lnum1After;
                //log.printf("loopnum = (%d)-(%d %d)\n", lnum0, lnum0After, lnum1After);
                if (--lcnt[lnum0] == 0) { change |= 2; lcntSet.remove(lnum0); }
                if (lnum0After > 1 && ++lcnt[lnum0After     ] == 1) { change |= 1; lcntSet.add(lnum0After); }
                if (lnum1After > 1 && ++lcnt[lnum1After     ] == 1) { change |= 1; lcntSet.add(lnum1After); }
                //log.printf("%s : %s\n", g0.getGroup(), p1.getGroup());
            }
            else {
                g0.nextG.prevG = g1;
                g1.nextG.prevG = g0;
                t = g0.nextG;
                g0.nextG = g1.nextG;
                g1.nextG = t;

                t = p0.next;
                p0.next = p1.next;
                p1.next = t;

                g0.setGroupNum();
                g1.setGroupNum();
                g0.organize();
                if (g1.nextG != null)
                    g1.organize();
//                g0.organize();
//                if (g1.nextG != null)
//                    g1.organize();
//                g0.setGroupNum();
//                if (g1.nextG != null)
//                    g1.setGroupNum();
                int lnum0After = p0.getLoopNum();
                int lnum1After = p1.getLoopNum();
                int lnum0 = lnum0After + lnum1After;
                //log.printf("loopnum = (%d)-(%d %d)\n", lnum0, lnum0After, lnum1After);
                if (--lcnt[lnum0] == 0) { change |= 2; lcntSet.remove(lnum0); }
                if (lnum0After > 1 && ++lcnt[lnum0After     ] == 1) { change |= 1; lcntSet.add(lnum0After); }
                if (lnum1After > 1 && ++lcnt[lnum1After     ] == 1) { change |= 1; lcntSet.add(lnum1After); }
                //log.printf("%s : %s\n", p0.getGroup(), p1.getGroup());
            }
        }
    }

    Item[] all;

    void init(int N) {
        all = new Item[N + 1];
//        lcnt = new int[N + 1];
//       lcnt[1] = N;
        for(int i = 1; i <= N; i++) {
            Item item = new Item();
            all[i] = item;
            item.num = i;
            item.next = item;
            item.nextG = item;
            item.prevG = item;
            item.groupNum = 1;
        }
    }

    long gcm(long a, long b) {

        while(b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    int[] S;

    int change;
    void loop(int x, int y, int[] lcnt) {
        int p = S[x];
        int xc;
        int yc = 0;
        for(xc = 1;; xc++) {
            if (p == x)
                break;
            if (p == y)
                yc = xc;
            p = S[p];
        }
        if (yc != 0) { // 分割
            if (--lcnt[xc] == 0) { change |= 2; lcntSet.remove(xc); }
            if (yc      > 1 && ++lcnt[yc     ] == 1) { change |= 1; lcntSet.add(yc); }
            if (xc - yc > 1 && ++lcnt[xc - yc] == 1) { change |= 1; lcntSet.add(xc-yc); }
        }
        else {
            p = S[y];
            for(yc = 1;; yc++) {
                if (p == y)
                    break;
                p = S[p];
            }
            // 結合
            if (xc > 1 && --lcnt[xc] == 0) { change |= 2; lcntSet.remove(xc); }
            if (yc > 1 && --lcnt[yc] == 0) { change |= 2; lcntSet.remove(yc); }
            if (++lcnt[xc + yc] == 1)  { change |= 1; lcntSet.add(xc+yc); }
        }
    }

    long calcLcm(int N, int[] lcnt, long[] pp) {
        int ppnum = 1;
        pp[0] = 1;
        for(int m = 2; m <= N; m++) {
            if (lcnt[m] > 0) {
                int mm = m;
                for(int j = 0; j < ppnum; j++) {
                    mm /= gcm(mm, pp[j]);
                    if (mm == 1)
                        break;
                }
                pp[ppnum - 1] *= mm;
                if (pp[ppnum - 1] > 100000) {
                    pp[ppnum++] = 1;
                }
                if (m > N / 2)
                    break;
            }
        }
        long p = 1;
        for(int j = 0; j < ppnum; j++) {
            p = p * pp[j];
            p = p % 1000000007;
        }
        return p;
    }

    BigInteger BIG = BigInteger.valueOf(1000000007);

    long calcLcm2big(int N, int[] lcnt) {
        BigInteger P = BigInteger.ONE;
        for(int m = 2; m <= N; m++) {
            if (lcnt[m] > 0) {
                //System.out.printf("%d ", m);
                BigInteger M = BigInteger.valueOf(m);
                M = M.divide(P.gcd(M));
                P = P.multiply(M);
                if (m > N / 2)
                    break;
            }
        }
        P = P.mod(BIG);
        long p = P.longValue();
        return p;
    }

    long calcLcm3set(Set<Integer> lcntSet) {
        BigInteger P = BigInteger.ONE;
        for(Integer m: lcntSet) {
            //System.out.printf("%d ", m);
            BigInteger M = BigInteger.valueOf(m);
            M = M.divide(P.gcd(M));
            P = P.multiply(M);
        }
        P = P.mod(BIG);
        long p = P.longValue();
        return p;
    }

    Set<Integer> lcntSet = new TreeSet<Integer>();

    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] x = new int[Q];
        int[] y = new int[Q];
        for(int i = 0; i < Q; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            //log.printf("%d %d\n", x[i], y[i]);
        }

        init(N);

        S = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            S[i] = i;
        }

        // cnt別loop数
        int[] lcnt = new int[N + 1];
        lcnt[1] = N;

        long[] pp = new long[100];
        long p = 1;
        for(int q = 0; q < Q; q++) {
            if (true) {
                swap(all[x[q]], all[y[q]], lcnt);
                //change = 1;
            }
            else {
                loop(x[q], y[q], lcnt);
                int t = S[x[q]];
                S[x[q]] = S[y[q]];
                S[y[q]] = t;
            }

            if (change != 0) {
                //p = calcLcm(N, lcnt, pp);
                //p = calcLcm2big(N, lcnt);  // 2倍で12->22なので ここでほとんどかかっている
                p = calcLcm3set(lcntSet);  //  5倍で16->17 なのでここは0に近い
            }
            result.printf("%d\n", p);
        }

        sc.close();
        return false;
    }

    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();

        instance.systemin.close();
    }


}


