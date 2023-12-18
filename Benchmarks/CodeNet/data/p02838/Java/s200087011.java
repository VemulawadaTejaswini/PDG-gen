import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextLong();
    }
    sc.close();
    
    long ans = 0;
    for (int i = 0; i < 60; i++) {
      int c0 = 0;
      int c1 = 0;
      for (int j = 0; j < N; j++) {
        if ((A[j] >> i) % 2 == 0) {
          c0++;
        } else {
          c1++;
        }
      }
      ans += c0 * c1 * (long) Math.pow(2, i);
      ans %= 1000000007;
    }
    System.out.println(ans);
  }
}
