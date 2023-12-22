
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2855 Permutation Period
 *    2018/02/20
 */
public class Main {

    int[] lcnt;

    private static int JOIN_NUM = 100;

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
                s += String.format("%d ", p.num);
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
        void setGroupNum() {
            assert nextG != null;
            Item p = this;
            int i;
            for(i = 1;;i++) {
                p = p.next;
                if (p.nextG != null)
                    break;
            }
            groupNum = i;
        }
        
        
        // 次のグループと結合すべきとき結合する
        void join() {
            assert nextG != null;
            if (nextG != this && groupNum + nextG.groupNum < JOIN_NUM) {
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
    
    void swap(Item p0, Item p1) {
        log.printf("swap %d %d\n",  p0.num, p1.num);
        Item g0 = p0.getGroup();
        Item g1 = p1.getGroup();
        boolean merge = !g0.sameLoopG(g1);
        
        if (merge) {
            int gnum0 = g0.getLoopNum();
            int gnum1 = g1.getLoopNum();
            
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
            g0.join();
            if (g1.nextG != null)
                g1.join();
            
//            if (g0.nextG != null)
//                g0.setGroupNum();
//            if (g1.nextG != null)
//                g1.setGroupNum();
            int gnumAfter = p0.getLoopNum();
            log.printf("loopnum = (%d %d)-(%d)\n", gnum0, gnum1, gnumAfter);
            lcnt[gnum0]--;
            lcnt[gnum1]--;
            lcnt[gnumAfter]++;
            //log.printf("%s\n", p0.getGroup());
        }
        else {
            Item t;
            // 分割
            int gnum0 = g0.getLoopNum();
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
                int gnum0After = g0.getLoopNum();
                int gnum1After = p1.getLoopNum();
                log.printf("loopnum = (%d)-(%d %d)\n", gnum0, gnum0After, gnum1After);
                lcnt[gnum0]--;
                lcnt[gnum0After]++;
                lcnt[gnum1After]++;
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
                
                g0.join();
                if (g1.nextG != null)
                    g1.join();
                g0.setGroupNum();
                if (g1.nextG != null)
                    g1.setGroupNum();
                int gnum0After = p0.getLoopNum();
                int gnum1After = p1.getLoopNum();
                log.printf("loopnum = (%d)-(%d %d)\n", gnum0, gnum0After, gnum1After);
                lcnt[gnum0]--;
                lcnt[gnum0After]++;
                lcnt[gnum1After]++;
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
        
//        swap(all[1], all[2]);
//        swap(all[1], all[3]);
//        log.printf("%s\n",  all[1]);
//        swap(all[2], all[3]);
//        log.printf("%s\n",  all[1]);
//        all[1].connect(all[2]);
//        all[1].connect(all[3]);
//        all[2].connectR(all[4]);
//        System.out.printf("%s %d\n", all[1].treeToString(), all[1].getRoot().loopNum);
        
        
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
            if (--lcnt[xc] == 0) change |= 2;
            if (yc      > 1 && ++lcnt[yc     ] == 1) change |= 1;
            if (xc - yc > 1 && ++lcnt[xc - yc] == 1) change |= 1;
        }
        else { 
            p = S[y];
            for(yc = 1;; yc++) {
                if (p == y)
                    break;
                p = S[p];
            }
            // 結合
            if (xc > 1 && --lcnt[xc] == 0) change |= 2;
            if (yc > 1 && --lcnt[yc] == 0) change |= 2;
            if (++lcnt[xc + yc] == 1) change |= 1;
        }
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
            //log.printf("%d %d\n", x[i], y[i]);
        }

        init(N);
    
        S = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            S[i] = i;
        }

        // cnt別loop数
        lcnt = new int[N + 1];
        lcnt[1] = N;

        long[] pp = new long[100];
        long p = 1;
        for(int q = 0; q < Q; q++) {
            
            swap(all[x[q]], all[y[q]]);
            change = 1;
            
//            loop(x[q], y[q], lcnt);
//            int t = S[x[q]];
//            S[x[q]] = S[y[q]];
//            S[y[q]] = t;
            if (change != 0) {
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
                    }
                }
                p = 1;
                for(int j = 0; j < ppnum; j++) {
                    p = p * pp[j];
                    p = p % 1000000007;
                }
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


