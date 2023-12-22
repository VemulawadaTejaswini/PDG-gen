
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
 * 
 */
public class Main {

    private static final long MOD = (long) 1e9 + 7l;

    void solve(Scanner in, PrintWriter out) {
      int n = in.nextInt();
      long[] arr = new long[n];

      long sum = 0;
      for (int i = 0; i < n; ++i) {
        arr[i] = in.nextInt();
        sum = (sum + arr[i]) % MOD;
      }

      long ans = 0;
      for (int i = 0; i < n; ++i) {
        sum = (((sum - arr[i]) % MOD) + MOD) % MOD;
        long tmp = ((arr[i] % MOD)  * sum) % MOD;
        ans = (ans + tmp) % MOD;
      }
    
      out.println(ans);

    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
