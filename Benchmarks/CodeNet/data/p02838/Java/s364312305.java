import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long MOD = (long)Math.pow(10, 9) + 7;
    int n = sc.nextInt();
    long[][] rui = new long[60][2];
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      for(int j = 0; j < 60; j++) {
        rui[j][(int)(a % 2)]++;
        a /= 2;
      }
    }
    long ans = 0;
    for(int i = 0; i < 60; i++) {
      long t = (long)Math.pow(2, i) % MOD;
      t = (t * rui[i][0]) % MOD;
      t = (t * rui[i][1]) % MOD;
      ans = (ans + t) % MOD;
    }
    System.out.println(ans);
  }
}