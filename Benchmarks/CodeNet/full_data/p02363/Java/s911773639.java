import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_V = 105;
    static final int INF = 1 << 31 - 1;
    static int V, E;
    static long [][] dp = new long[MAX_V][MAX_V];

    public static void main(String[] args) {
        init();
        read();
        solve();
        out();
    }

    static void read() {
        V = sc.nextInt();
        E = sc.nextInt();
        int s, t, d;
        for (int i = 0; i < E; i++) {
            s = sc.nextInt();
            t = sc.nextInt();
            d = sc.nextInt();
            dp[s][t] = d;
        }
    }

    static void init() {
        for (int i = 0; i < MAX_V; i++) {
            for (int j = 0; j < MAX_V; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = INF;
                }
            }
        }
    }

    static void solve() {
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
            }
        }
    }

    static void out() {
        String s = "";
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i == j && dp[i][j] < 0) {
                    System.out.println("NEGATIVE CYCLE");
                    return;
                }

                if (dp[i][j] == INF) {
                    s += "INF ";
                } else {
                    s += String.format("%d ", dp[i][j]);
                }
            }
            s = s.trim() + "\n";
        }
        System.out.print(s);
    }
}