import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {

  static int binarySearch(int x, int maxIdx){
    int left = 0; int right = maxIdx + 1;
    while(right - left > 1){
      int mid = (right + left) / 2;
      if(bsum[mid] <= x) left = mid;
      else right = mid;
    }
    return left;
  }

  static int n, m, k;
  static int[] a, b, asum, bsum;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);
    k = Integer.parseInt(in[2]);

    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();
    in = br.readLine().split(" ");
    b = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    asum = new int[n+1];
    bsum = new int[m+1];

    br.close();

    asum[0] = 0;
    for (int i = 0; i < n; i++) {
      asum[i+1] = asum[i] + a[i];
    }

    bsum[0] = 0;
    for (int i = 0; i < m; i++) {
      bsum[i+1] = bsum[i] + b[i];
    }

    long ans = 0, tmpAns = 0;

    for (int i = 0; i <= n; i++) {
      if(asum[i] > k) {
        break;
      }

      ans = Math.max(ans, i + binarySearch(k - asum[i], m));
    }

    out.println(ans);

    out.flush();

  }
}