import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    Integer A[] = new Integer[N];
    for(int i=0; i<N; i++) A[i] = sc.nextInt();
    Arrays.sort(A);
    int count = 1;
    int ans = 0;
    for(int i=1; i<N; i++){
      if(A[i] == A[i-1]){
        count++;
      }else if(count % 2 == 1){
        ans++;
        count = 1;
      }else{
        count = 1;
      }
    }
    if(count % 2 == 1) ans++;
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}