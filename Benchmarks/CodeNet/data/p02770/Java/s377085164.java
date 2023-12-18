import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int k = scanner.nextInt();
    int q = scanner.nextInt();
    int[] d = new int[k];
    long dsum = 0;
    for (int i = 0; i < k; i++) {
      d[i] = scanner.nextInt();
      dsum += d[i];
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < q; i++) {
      int n = scanner.nextInt() - 1;
      int x = scanner.nextInt();
      int m = scanner.nextInt();
      long l = lcm(dsum, m) / dsum * k;
      long cnt = 0;
      long a = x % m;
      for (int j = 0; j < l; j++) {
        long b = a + d[j % k] % m;
        if (b >= m) b-= m;
        if (b > a) cnt++;
        a = b;
      }
      cnt = cnt * (n / l);
      for (int j = 0; j < n % l; j++) {
        long b = a + d[j % k] % m;
        if (b >= m) b-= m;
        if (b > a) cnt++;
        a = b;
      }
      sb.append(cnt).append('\n');
    }
    System.out.print(sb.toString());
  }

  static long lcm(long i, long j) {
    return i / gcd(i, j) * j;
  }

  static long gcd(long i, long j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      long r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
