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
    int idx = 0;
    long s = 0L;
    for (int i=0;i<n-1;i++) {
      s += a[i];
      if (2L*s < a[i+1]) idx = i+1;
    }
    System.out.println(n-idx);
  }
}