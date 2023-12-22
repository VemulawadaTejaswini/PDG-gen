import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        boolean[][] g = new boolean[8][8];
        boolean[] r = new boolean[8];
        boolean[] c = new boolean[8];
        boolean[] m = new boolean[15];
        boolean[] p = new boolean[15];
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            g[x][y] = true;
            r[x] = true;
            c[y] = true;
            m[x-y+7] = true;
            p[x+y] = true;
        }
        g = dfs(g,r,c,m,p,8-k);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                sb.append(g[i][j] ? "Q" : ".");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

    private static boolean[][] dfs(boolean[][] g, boolean[] r, boolean[] c, boolean[] m, boolean[] p, int i) {
        if(i == 0)return g;
        for (int j = 0; j < 8; j++) {
            if(r[j])continue;
            for (int k = 0; k < 8; k++) {
                if(c[k] || m[j-k+7] || p[j+k])continue;
                g[j][k] = true;
                r[j] = true;
                c[k] = true;
                m[j-k+7] = true;
                p[j+k] = true;
                boolean[][] t = dfs(g,r,c,m,p,i-1);
                if(t != null) return t;
                g[j][k] = false;
                r[j] = false;
                c[k] = false;
                m[j-k+7] = false;
                p[j+k] = false;
            }
        }
        return null;
    }

}

