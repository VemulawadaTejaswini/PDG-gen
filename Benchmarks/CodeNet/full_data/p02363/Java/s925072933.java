import java.util.Arrays;
import java.util.Scanner;

// ???????????£??????????????? wf
public class Main {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int en = sc.nextInt();

        // wf ?????????
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(d[i], INF);
            d[i][i] = 0;
        }
        for (int i = 0; i < en; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int dist = sc.nextInt();
            d[s][t] = dist;
            // ????????°??????
            // d[t][s] = dist;
        }

        // wf ??????
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (d[i][k] == INF || d[k][j] == INF) {
                        continue;
                    }
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        // negative loop check
        if (hasNegativeLoopWF(d)) {
            System.out.println("NEGATIVE CYCLE");
            return;
        }
        for (int i = 0; i < n; i++) {
            String[] res = new String[n];
            for (int j = 0; j < n; j++) {
                res[j] = d[i][j] == INF ? "INF" : String.valueOf(d[i][j]);
            }
            System.out.println(String.join(" ", res));
        }
    }

    public static boolean hasNegativeLoopWF(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] < 0) {
                return true;
            }
        }
        return false;
    }
}