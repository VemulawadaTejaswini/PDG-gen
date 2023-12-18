import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] sum = new long[n];
    long sumb = 0;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      sum[i] = (a + b);
      sumb += b;
    }
    Arrays.sort(sum);
    long ans = ((-1) * b);
    for(int i = 1; i <= n - 1; i++) {
      if(i % 2 == 1) ans += sum[i];
    }
    System.out.println(ans);
  }
}