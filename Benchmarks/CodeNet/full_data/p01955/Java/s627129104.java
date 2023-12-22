
import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2855 Permutation Period
 *    2018/02/20
 */
public class Main {

    Item[] all;
    Set<Integer> lcntSet = new TreeSet<Integer>();

    int change;

    private final static int JOIN_NUM = 80;
    private final static int SPLIT_NUM = JOIN_NUM * 8;

    class Item {
        int num;      // 1-
        int groupNum; // このグループのItem数
        Item next;
        Item nextG;
        Item prevG;

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
            g0.prevG.organize();
            if (g1.nextG != null) {
                g1.organize();
                g1.prevG.organize();
            }

            int lnumAfter = lnum0 + lnum1;
            if (--lcnt[lnum0] == 0) { change |= 2; lcntSet.remove(lnum0); }
            if (--lcnt[lnum1] == 0) { change |= 2; lcntSet.remove(lnum1); }
            if (lnumAfter > 1 && ++lcnt[lnumAfter     ] == 1) { change |= 1; lcntSet.add(lnumAfter); }
        }
        else {
            Item t;
            // 分割
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
                if (--lcnt[lnum0] == 0) { change |= 2; lcntSet.remove(lnum0); }
                if (lnum0After > 1 && ++lcnt[lnum0After     ] == 1) { change |= 1; lcntSet.add(lnum0After); }
                if (lnum1After > 1 && ++lcnt[lnum1After     ] == 1) { change |= 1; lcntSet.add(lnum1After); }
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
                int lnum0After = p0.getLoopNum();
                int lnum1After = p1.getLoopNum();
                int lnum0 = lnum0After + lnum1After;
                if (--lcnt[lnum0] == 0) { change |= 2; lcntSet.remove(lnum0); }
                if (lnum0After > 1 && ++lcnt[lnum0After     ] == 1) { change |= 1; lcntSet.add(lnum0After); }
                if (lnum1After > 1 && ++lcnt[lnum1After     ] == 1) { change |= 1; lcntSet.add(lnum1After); }
            }
        }
    }

    void init(int N) {
        all = new Item[N + 1];
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

    BigInteger BIG = BigInteger.valueOf(1000000007);

    long calcLcm3set(Set<Integer> lcntSet) {
        BigInteger P = BigInteger.ONE;
        for(Integer m: lcntSet) {
            BigInteger M = BigInteger.valueOf(m);
            M = M.divide(P.gcd(M));
            P = P.multiply(M);
        }
        P = P.mod(BIG);
        long p = P.longValue();
        return p;
    }


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] x = new int[Q];
        int[] y = new int[Q];
        for(int i = 0; i < Q; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        init(N);

        int[] lcnt = new int[N + 1];
        lcnt[1] = N;

        long p = 1;
        for(int q = 0; q < Q; q++) {
            swap(all[x[q]], all[y[q]], lcnt);
            if (change != 0) {
                p = calcLcm3set(lcntSet);
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


