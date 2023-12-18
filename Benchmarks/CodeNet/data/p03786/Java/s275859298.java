import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    long[] a = new long[0];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      n = Integer.parseInt(br.readLine());
      a = Arrays.stream(br.readLine().split("\\s+"))
        .mapToLong(Long::parseLong).toArray();
    } catch (IOException e) {
      e.printStackTrace();
    }
    Arrays.sort(a);
    long s = 0L;
    for (int i=0;i<n;i++) {
      if (2L*s < a[i]) {
        s += a[i];
        continue;
      }
      System.out.println(n-i+1);
      break;
    }
  }
}