import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int N = in.nextInt();

            int dp[][] = new int[N+1][H+1];
            for (int i = 0; i < N; i++) {
                for (int w = 0; w <= H; w++) {
                    dp[i][w] = 1000000000;
                }
            }
            for (int i = 0; i <= N; i++) {
                dp[i][0] = 0;
            }

            List<Integer> damageList = new ArrayList<>();
            List<Integer> mpList = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                damageList.add(in.nextInt());
                mpList.add(in.nextInt());
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= H; j++) {
                    if (j < damageList.get(i)) {
                        dp[i + 1][j] = Math.min(dp[i][j], mpList.get(i));
                    }
                    else {
                        dp[i + 1][j] = Math.min(dp[i][j], dp[i + 1][j - damageList.get(i)] + mpList.get(i));
                    }
                }
            }
            out.println(dp[N][H]);
        }
    }
}