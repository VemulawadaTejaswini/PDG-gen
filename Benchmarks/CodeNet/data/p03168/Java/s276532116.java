import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            String[] split = br.readLine().split(" ");
            int n = split.length;
            double[] prob = new double[n];
            for (int i = 0; i < n; i++) {
               prob[i] = Double.parseDouble(split[i]); 
            }
            double[] dp = new double[n + 1];
            dp[0] = 1.0;
            for (int i = 1; i <= n; i++) {
                for (int j = n; j >= 0; j--) {
                    double p = 0.0;
                    if (j == 0) {
                        p += dp[j]*(1 - prob[i - 1]);
                    } else {
                        p += dp[j - 1]*prob[i - 1] + dp[j]*(1 - prob[i - 1]);
                    }
                    dp[j] = p;
                }
            }
            double result = 0.0;
            for (int i = (n + 1) / 2 ; i <= n; i++) {
                result += dp[i];
            }
            /*for(double[] row: dp) {
                for (Double d: row) {
                    System.out.print(String.format("%.2f ", d == null ? 0.0 : d));
                }
                System.out.println();
            }*/
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
