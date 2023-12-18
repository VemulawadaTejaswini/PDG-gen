import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    Integer t[] = new Integer[N+1];
    Integer x[] = new Integer[N+1];
    Integer y[] = new Integer[N+1];
    t[0] = 0;
    x[0] = 0;
    y[0] = 0;
    int time;
    int move;
    String ans = "Yes";
    for(int i=1; i<N+1; i++){
      t[i] = sc.nextInt();
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      time = t[i] - t[i-1];
      move = Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]);
      if(time < move || (time%2 != move%2) ){
        ans = "No";
        break;
      }
      
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}