import java.util.*;
import java.io.*;

/**
 * @author Azuz
 * 
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
      int N = in.nextInt();
      double d = in.nextDouble();
      int ans = 0;
      for (int i = 0; i < N; ++i) {
        double x = in.nextInt();
        double y = in.nextInt();

        double dist = Math.sqrt(x*x + y*y);
        if (dist <= d) {
          ++ans;
        }
      }

      System.out.println(ans);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
