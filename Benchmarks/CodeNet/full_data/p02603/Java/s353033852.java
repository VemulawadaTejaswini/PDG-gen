import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {

  static int n;
  static int[] a;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    br.close();

    long kabu = 1000 / a[0];
    long pur = 1000 % a[0];

    for (int i = 1; i < n; i++) {
      if (a[i - 1] > a[i]) {
        pur += kabu * a[i - 1];
      } else {
        pur += kabu * a[i];
      }
      kabu = pur / a[i];
      pur %= a[i];
    }

    pur += kabu * a[n - 1];

    out.println(pur);

    out.flush();
  }
}
