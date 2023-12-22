import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {

  static int n, ans;
  static long[] l;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    in = br.readLine().split(" ");
    l = Stream.of(in).mapToLong(Long::parseLong).toArray();

    br.close();

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (l[i] == l[j] || l[j] == l[k] || l[k] == l[i]) continue;
          if ((Math.abs(l[i] - l[j]) < l[k]) && (l[i] + l[j] > l[k])) ans++;
        }
      }
    }

    out.println(ans);

    out.flush();
  }
}
