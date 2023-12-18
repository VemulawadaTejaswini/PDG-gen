import java.util.*;

public class Main {
  static final long MOD = 1000000007;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long nums[] = new long[k+1]; // 最大公約数がちょうどindexである個数
    long res = 0;
    for (int i = k; i >= 1; i--) {
      long num = modpow(k/i, n)%MOD; // 最大公約数がiの倍数である個数num
      for (int j = 2; j <= k/i; j++) { // 最大公約数がちょうど2i,3i,...である個数を除く
        num -= nums[i*j];
      }
      num %= MOD;
      if (num < 0) num += MOD;
      res += (long)i*(long)num;
      res %= MOD;
      nums[i] = num;
    }
    System.out.println(res);
    sc.close();
  }

  public static long modpow(long a, long n) {
    long res = 1;
    while (n > 0) { // nを2進数として扱う
      long tmp = n & 1; // 2進数nの現在の桁
      if (tmp > 0) res = res*a%MOD;
      a = a*a%MOD;
      n >>= 1;
    }
    return res;
  }
}