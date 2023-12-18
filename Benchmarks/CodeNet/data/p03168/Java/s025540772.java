import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public double getProbability(int index, int headsRemaining, double[] prob, Double[][] memo) {
       //System.out.println(String.format("<%d,%d>", index, headsRemaining));
       int n = prob.length;
       if (index == prob.length && headsRemaining <= n/2) {
           return 1.0;
       }
       if (index == n) {
           return 0.0;
       }
       if (memo[index][headsRemaining] != null) {
           return memo[index][headsRemaining];
       }
       double res = 0.0;
       res += getProbability(index + 1, headsRemaining - 1, prob, memo) * prob[index];
       if (headsRemaining >= n/2) {
           res += getProbability(index + 1, headsRemaining, prob, memo) * (1 - prob[index]);
       }
       return memo[index][headsRemaining] = res;
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            String[] split = br.readLine().split(" ");
            int n = split.length;
            double[] prob = new double[n];
            for (int i = 0; i < n; i++) {
               prob[i] = Double.parseDouble(split[i]); 
            }
            Double[][] memo = new Double[n][n + 1];
          	Main app = new Main();
            double result = app.getProbability(0, n, prob, memo);
            /*for(Double[] row: memo) {
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
