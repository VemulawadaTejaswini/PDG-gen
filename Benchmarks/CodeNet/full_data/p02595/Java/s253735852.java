import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static long n, d, ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);
    d = Long.parseLong(in[1]);

    ans = 0;

    for (int i = 0; i < n; i++) {
      in = br.readLine().split(" ");
      long x = Long.parseLong(in[0]);
      long y = Long.parseLong(in[1]);
      if (x * x + y * y <= d * d) {
        ans++;
      }
    }

    br.close();

    out.println(ans);

    out.flush();
  }
}
