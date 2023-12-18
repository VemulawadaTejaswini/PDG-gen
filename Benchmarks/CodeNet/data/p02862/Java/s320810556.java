import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    long ans = 0;
    int tmpx = x;
    int tmpy = y;
    if((x % 3 == 0 && y % 3 == 0) || (x % 3 == 1 && y % 3 == 2) || (x % 3 == 2 && y % 3 == 1)) {
      int count = 0;
      while(tmpx > 0 && tmpy > 0) {
        if(tmpx >= tmpy) {
          count++;
          tmpx -= 2;
          tmpy -= 1;
        } else {
          tmpx -= 1;
          tmpy -= 2;
        }
      }
      if(tmpx == 0 && tmpy == 0) ans = nCk((x + y) / 3, count, 1000000007);
    }
    System.out.println(ans);
  }

  public static long nCk(int n, int k, long p) {
    long factorial = 1;
    k = Math.min(k, n - k);
    //k!(mod p)の逆元をmodPowを用いて計算
    for(int i = 2; i <= k; i++) {
      factorial = (factorial * i) % p;
    }
    factorial = modPow(factorial, p-2, p);
    //n(n-1)...(n-k+1) (mod p)の計算
    for(int i = n - k + 1; i <= n; i++) {
      factorial = (factorial * i) % p;
    }
    return factorial;
  }

  public static long modPow(long a, long b, long p) {
    long power = 1;
    while(b > 0) {
      if((1 & b) == 1) power = (power * a) % p;
      a = (a * a) % p;
      b = b >> 1;
    }
    return power;
  }
}
