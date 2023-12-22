import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = new int[n][];
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt()-1;
            int k = sc.nextInt();
            g[v] = new int[k];
            for (int j = 0; j < k; j++) {
                int u = sc.nextInt()-1;
                g[v][j] = u;
            }
        }
        int[][] a = new int[n][2];
        int t = 0;
        for (int i = 0; i < n; i++) {
            t = dfs(i, t+1, a, g);
        }
        for (int i = 0; i < n; i++) {
            int v = i+1;
            System.out.println(v + " " + a[i][0] + " " + a[i][1]);
        }
        sc.close();

    }

    private static int dfs(int v, int t, int[][] a, int[][] g) {
        if(0 < a[v][0])return t-1;
        a[v][0] = t;
        for(int nex : g[v]){
            t = dfs(nex, t+1, a, g);
        }
        a[v][1] = ++t;
        return t;
    }

}

