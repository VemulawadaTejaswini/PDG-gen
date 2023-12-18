import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    long ans;
    if(N > M){
      long tmp = N;
      N = M;
      M = tmp;
    }
    if(N == 1){
      if(M == 1) ans = 1;
      else ans = M - 2;
    }else{
      ans = (N-2) * (M - 2);
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
  
}