import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long MOD = (long)Math.pow(10, 9) + 7;
    int n = sc.nextInt();
    long[] m0 = new long[60];
    long[] m1 = new long[60];
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      for(int j = 0; j < 60; j++) {
        if((a % 2) == 0) {
          m0[j]++;
        } else {
          m1[j]++;
        }
        a /= 2;
      }
    }
    long ans = 0;
    for(int i = 0; i < 60; i++) {
      long t = (m0[i] * m1[i]) % MOD;
      t = (t * (long)Math.pow(2, i)) % MOD;
      ans = (ans + t) % MOD;
    }
    System.out.println(ans);
  }
}