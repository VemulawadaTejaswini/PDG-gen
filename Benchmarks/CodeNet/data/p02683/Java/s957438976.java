import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  static int n, m, x, ans;
  // static long ans;
  static int[] dp;
  static List<Integer> c;
  static List<List<Integer>> a;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);
    x = Integer.parseInt(in[2]);

    c = new ArrayList<>();
    a = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      in = br.readLine().split(" ");
      a.add(new ArrayList<>());
      c.add(Integer.parseInt(in[0]));
      for (int j = 0; j < m; j++) {
        a.get(i).add(Integer.parseInt(in[j + 1]));
      }
    }

    br.close();

    ans = 1000000000;

    for (int bit = 0; bit < (1 << n); bit++) {
      int cost = 0;
      int[] uds = new int[m];
      for (int i = 0; i < n; i++) {
        if (((bit >> i) & 1) == 1) {
          cost += c.get(i);
          for (int j = 0; j < m; j++) {
            uds[j] += a.get(i).get(j);
          }
        }
      }

      long lessX = Arrays.stream(uds).filter(t -> t < x).count();
      if (lessX == 0) ans = Math.min(ans, cost);
    }

    out.println(ans < 1000000000 ? ans : -1);

    out.flush();
  }
}
