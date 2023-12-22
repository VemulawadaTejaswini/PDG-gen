import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static long x, k, d, ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    x = Long.parseLong(in[0]);
    k = Long.parseLong(in[1]);
    d = Long.parseLong(in[2]);

    br.close();

    if (in[1].length() + in[2].length() > 17) {
      long p = x % d;
      boolean is_even = ((x / d) % 2 == 0);
      if ((k - x / d) % 2 == 0) {
        ans = p;
      } else {
        if (p < 0) {
          ans = p + d;
        } else {
          ans = p - d;
        }
      }
    } else if (Math.abs(x) <= k * d) {
      long p = x % d;
      boolean is_even = ((x / d) % 2 == 0);
      if ((k - x / d) % 2 == 0) {
        ans = p;
      } else {
        if (p < 0) {
          ans = p + d;
        } else {
          ans = p - d;
        }
      }
    } else {
      ans = Math.abs(x) - k * d;
    }

    out.println(Math.abs(ans));

    out.flush();
  }
}
