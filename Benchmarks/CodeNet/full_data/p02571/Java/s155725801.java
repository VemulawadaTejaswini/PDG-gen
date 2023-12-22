
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
 * 
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
      char[] s = in.next().toCharArray();
      char[] t = in.next().toCharArray();
      
      int ans = Integer.MAX_VALUE;
      for (int i = 0; i + t.length <= s.length; ++i) {
        int cnt = 0;
        for (int j = 0; j < t.length; ++j) {
          if (s[i + j] != t[j]) {
            ++cnt;
          } 
        }
        ans = Math.min(ans, cnt);
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
