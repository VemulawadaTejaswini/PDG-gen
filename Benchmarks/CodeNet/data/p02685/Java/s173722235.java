import java.util.Scanner;

public class Main {
  static final long MOD = 998244353;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    long answer = 0;
    Combination com = new Combination(n, MOD);
    for(long i = 0; i <= k; i++){
      long temp = (long)m * com.pow(m - 1, n - i - 1) % MOD;
      temp = temp * com.c(n - 1, (int)i) % MOD;
      answer = (answer + temp) % MOD;
    }
    System.out.println(answer);
  }
}
class Combination {
  long[] factorial; //階乗
  long[] inverse; //逆元
  final long MOD;
  public Combination(int n, long mod){
    this.MOD = mod;
    factorial = new long[n + 1];
    inverse = new long[n + 1];
    factorial[0] = 1;
    inverse[0] = 1;
    for (int i = 1; i <= n; i++) {
      factorial[i] = factorial[i - 1] * i % MOD;
      inverse[i] = pow(factorial[i], MOD - 2);
    }
  }
  long p(int n, int r){
    return factorial[n] * inverse[n - r] % MOD;
  }
  long c(int n, int r){
    return factorial[n] * inverse[r] % MOD * inverse[n - r] % MOD;
  }
  long pow(long x, long n) {
    long answer = 1l;
    while (n > 0) {
      if((n & 1) == 1){
        answer = answer * x % MOD;
      }
      x = x * x % MOD;
      n >>= 1;
    }
    return answer;
  }
}