import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  static int n;
  static long[] ans;
  static List<Integer> x, y, p;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    ans = new long[n+1];
    Arrays.fill(ans, Long.MAX_VALUE);
    x = new ArrayList<>();
    y = new ArrayList<>();
    p = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      in = br.readLine().split(" ");
      x.add(Integer.parseInt(in[0]));
      y.add(Integer.parseInt(in[1]));
      p.add(Integer.parseInt(in[2]));
    }

    br.close();

    long maxVal = 1;
    for (int i = 0; i < n; i++) {
      maxVal *= 3;
    }

    for (int i = 0; i < maxVal; i++) {
      long tmpi = i;

      List<Integer> xl = new ArrayList<>();
      List<Integer> yl = new ArrayList<>();
      xl.add(0);
      yl.add(0);

      for (int j = 0; j < n; j++) {

        if (tmpi % 3 == 1) {
          xl.add(x.get(j));
        }
        if (tmpi % 3 == 2) {
          yl.add(y.get(j));
        }

        tmpi /= 3;
      }

      int k = xl.size() + yl.size() - 2;

      long s = 0;

      for (int j = 0; j < n; j++) {
        long mins = Long.MAX_VALUE;
        for (int xx : xl){
          mins = Math.min(mins, p.get(j) * Math.abs(x.get(j) - xx));
        }
        for (int yy : yl){
          mins = Math.min(mins, p.get(j) * Math.abs(y.get(j) - yy));
        }
        s += mins;
      }

      ans[k] = Math.min(ans[k], s);
    }

    Arrays.stream(ans).forEach(out::println);

    out.flush();
  }
}
