import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int s[] = new int[N];
    int sum = 0;
    for(int i=0; i<N; i++){
      s[i] = sc.nextInt();
      sum += s[i];
    }
    int ans = 0;
    if(sum % 10 != 0) ans = sum;
    else{
      Arrays.sort(s);
      for(int i=0; i<N; i++){
        if(s[i] % 10 != 0){
          ans = sum - s[i];
          break;
        }
        if(i == N-1) ans = 0;
      }
      
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}