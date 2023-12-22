import java.io.*;

public class Main {
    static double INF = 10000000.0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            String[] temp = line.split(" ");
            int w = Integer.parseInt(temp[0]);
            int[] r = new int[temp.length - 1];
            for (int i = 0; i < r.length; i++) {
                r[i] = Integer.parseInt(temp[i + 1]);
            }
            
            int n = r.length;
            double[][] dp = new double[1 << n][n];
            for (int i = 0;  i < (1 << n); i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = INF;
                }
            }

            dp[(1 << n) - 1][0] = 0.0;
            for (int s = (1 << n) - 2; s >= 0; s--) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (((s >> j) & 1) == 0) {
                            dp[s][i] = Math.min(dp[s][i], dp[s | (1 << j)][j] +  2 * Math.sqrt(r[i] * r[j]));
                        }
                    }
                }
            }
            
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (dp[0][j] <= w) {
                    flag = true;
                }
            }
            System.out.println((flag) ? "OK" : "NA");
        }
    }
}