import java.util.*;
import java.io.*;

/**
 * @author Azuz
 * 
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
      long K = in.nextInt();
      
      if (K % 2 == 0) {
        out.println(-1);
        return ;
      }

      long cur = 7 % K;
      int ans = 1;
      while (cur != 0) {
        cur = (cur * 10) % K;
        cur = (cur + 7) % K;
        ++ans;
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
