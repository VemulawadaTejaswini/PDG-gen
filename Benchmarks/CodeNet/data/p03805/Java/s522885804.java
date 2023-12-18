import java.util.*;
class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int[][] table = new int[n+1][n+1];
        int[][] table2 = new int[n+1][n+1];

        for(int i =0;i <m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            table[a][b] = 1;
            table[b][a] = 1;
            table2[a][b] = 1;
            table2[b][a] = 1;
        }
        int cnt = 0;
        for(int i = 0; i<=n; i++) {
            if(table[1][i] == 1) {
                System.err.println(i);
                for(int j = 0; j<=n; j++) {
                    table2[1][j] = table[1][j];
                    table2[j][1] = table[j][1];
                }
                for(int j = 0; j<=n; j++) {
                    table[1][j] = 0;
                    table[j][1] = 0;
                }
                cnt += dfs(table, i, 1);
                for(int j = 0; j<=n; j++) {
                    table[1][j] = table2[1][j];
                    table[j][1] = table2[j][1];
                }
            }
        }
        System.out.println(cnt);
    }
    public static int dfs(int[][] table, int s, int depth) {
        int[][] table2 = new int[n+1][n+1];
        if(depth == n-1) return 1;
        int cnt = 0;
        for(int i = 0; i<=n; i++) {
            if(table[i][s]==1) {
                System.err.println("s: "+s+" e: "+i +" "+ (depth+1));
                for(int j = 0; j<=n; j++) {
                    table2[s][j] = table[s][j];
                    table2[j][s] = table[j][s];
                }
                for(int j = 0; j<=n; j++) {
                    table[s][j] = 0;
                    table[j][s] = 0;
                }
                cnt += dfs(table,i, depth+1);
                for(int j = 0; j<=n; j++) {
                    table[s][j] = table2[s][j];
                    table[j][s] = table2[j][s];
                }
            }
        }
        return cnt;
    }
}