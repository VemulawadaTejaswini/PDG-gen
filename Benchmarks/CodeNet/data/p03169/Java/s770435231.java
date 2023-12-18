import java.util.*;
import java.math.*;
import java.nio.IntBuffer;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    int K = 3;
    int[] c = new int[K + 1];
    for (int i = 0; i < N; i++) c[a[i]]++;

    Map<IntBuffer, Double> map = new HashMap<>();
    double ans = f(map, c);
    System.out.println(ans);
  }

  private static double f(Map<IntBuffer, Double> map, int[] c) {
    IntBuffer key = IntBuffer.wrap(c);
    if (map.containsKey(key)) return map.get(key).doubleValue();

    double fsum = 0;
    int csum = 0;
    for (int i = c.length - 1; 0 < i; i--) {
      if (c[i] == 0) continue;
      c[i]--;
      c[i - 1]++;
      double f = f(map, c);
      c[i - 1]--;
      c[i]++;
      fsum += f * c[i];
      csum += c[i];
    }
    if (csum == 0) return 0d;
    double ans = (fsum + c[0] + csum) / csum;
    map.put(IntBuffer.wrap(c.clone()), ans);
    return ans;
  }
}