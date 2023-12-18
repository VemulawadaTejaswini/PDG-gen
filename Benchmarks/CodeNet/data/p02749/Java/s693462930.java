import java.util.*;

public class Main {
    static List<Integer>[] to; // 頂点iの隣接リスト
    static int ycount;
    static int rcount;
    static int bcount;
    static int n;
    static int[] color;
    static boolean ok;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        color = new int[n];
        ok = true;
        
        // 隣接リストの作成
        to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n - 1; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            to[p].add(q);
            to[q].add(p);
        }
        
        dfs(0, -1, 1, 2, 0);
        
        if (!ok) {
            System.out.println(-1);
        }
        
        // System.out.println(ycount);
        // System.out.println(rcount);
        // System.out.println(bcount);
        
        int max = Math.max(ycount, rcount);
        max = Math.max(max, bcount);
        int min = Math.min(ycount, rcount);
        min = Math.min(min, bcount);
        
        if (max - min > 1) {
            System.out.println(-1);
            return;
        }
        
        boolean flag = false;
        int nowy = 3;
        int nowr = 1;
        int nowb = 2;
        
        for (int i = 0; i < n; i++) {
            if (color[i] == 0) {
                System.out.print(nowy);
                nowy += 3;
            } else if (color[i] == 1) {
                System.out.print(nowr);
                nowr += 3;
            } else {
                System.out.print(nowb);
                nowb += 3;
            }
            
            if (i < n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
    
    // 頂点pと隣接する点に自分の値+距離を配る
    public static void dfs(int p, int par, int ggcol, int gcol, int pcol) {
        if (ggcol == 0 && gcol == 1 && pcol == 2) {
            rcount++;
            color[p] = 1;
        } else if (ggcol == 1 && gcol == 2 && pcol == 1) {
            bcount++;
            color[p] = 2;
        } else if (ggcol == 2 && gcol == 1 && pcol == 2) {
            ycount++;
            color[p] = 0;
        } else if (ggcol == 1 && gcol == 2 && pcol == 0) {
            ycount++;
            color[p] = 0;
        } else if (ggcol == 2 && gcol == 0 && pcol == 0) {
            rcount++;
            color[p] = 1;
        } else if (ggcol == 0 && gcol == 0 && pcol == 1) {
            bcount++;
            color[p] = 2;
        } else {
            ok = false;
        }
        
        for (Integer q : to[p]) {
            if (q == par) continue;
            dfs(q, p, gcol, pcol, color[p]);
        }
    }
}