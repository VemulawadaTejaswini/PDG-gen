import java.util.*;

public class Main {

    static int n;
    static int m;
    static int q;
    static int[][] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        a = new int[q][4];
        for (int i = 0; i < q; i++) {
            a[i][0] = sc.nextInt()-1;
            a[i][1] = sc.nextInt()-1;
            a[i][2] = sc.nextInt();
            a[i][3] = sc.nextInt();
        }
        int[] b = new int[n];
        long ans = dfs(0, 1, b);
        System.out.println(ans);
        sc.close();

    }

    private static long dfs(int idx, int curmax, int[] b) {
        long ret = 0L;
        if(idx == n){
            for (int i = 0; i < q; i++) {
                int x = a[i][0], y = a[i][1], c = a[i][2], d = a[i][3];
                if(b[y] - b[x] == c) ret += d;
            }
            return ret;
        }else{
            for (int k = curmax; k <= m; k++) {
                b[idx] = k;
                long t = dfs(idx+1, Math.max(k, curmax), b);
                ret = Math.max(ret, t);
            }
        }
        return ret;
    }

}
