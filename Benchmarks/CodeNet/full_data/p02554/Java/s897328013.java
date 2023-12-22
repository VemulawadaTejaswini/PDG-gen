import java.util.Scanner;

public class Main {
  final static long MOD = 1_000_000_007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();
    System.out.println(solve(n));
  }

  static long solve(long n){
    if(n == 1){
      return 0;
    } else if(n == 2){
      return 2;
    }
    long all = myPow(10l, n);
    long ans1 = all - myPow(9l, n);
    long ans2  = all - myPow(8l, n);
    ans1 = ans1 * 2 % MOD;
    return (ans1 + MOD - ans2) % MOD;
  }

  static long myPow(long x, long n) {
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