import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer count[] = new Integer[N+1];
    Arrays.fill(count, 0);
    for(int i=0; i<N; i++){
      int A = sc.nextInt();
      count[A]++;
    }
    Arrays.sort(count, Comparator.reverseOrder());
    int ans = 0;
    for(int i=K; count[i]>0; i++){
      ans += count[i];
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}