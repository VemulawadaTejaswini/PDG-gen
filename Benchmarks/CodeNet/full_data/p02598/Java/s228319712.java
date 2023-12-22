import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  static int n, ans;
  static long k;
  static List<Integer> a;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    k = Long.parseLong(in[1]);

    in = br.readLine().split(" ");
    a = Arrays.stream(in).map(Integer::parseInt).collect(Collectors.toList());

    br.close();

    ans = 0;

    out.println(binary_search(k));

    out.flush();
  }

  static long binary_search(long key) {
    int left = 1;
    int right = Integer.MAX_VALUE;

    while (right - left > 1) {
      int mid = left + (right - left) / 2;

      if (isOK(mid, key)) right = mid;
      else left = mid;
    }

    return right;
  }

  static boolean isOK(int mid, long key) {

    long divCnt = 0;

    for (int i = 0; i < n; i++) {
      divCnt += a.get(i) / mid + (a.get(i) % mid == 0 ? -1 : 0);
    }

    return divCnt <= key;
  }
}
