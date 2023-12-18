import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    final int MOD = 1000000007;
    long[] num = new long[n];
    for(int i = 0; i < n; i++) {
      num[i] = Long.parseLong(sc.next());
    }
    long sum = 0;
    for(int i = 0; i < n - 1; i++) {
      for(int j = i + 1; j < n; j++) {
        sum = (sum + (num[i] ^ num[j]) % MOD) % MOD;
      }
    }
    System.out.println(sum);
  }
}
