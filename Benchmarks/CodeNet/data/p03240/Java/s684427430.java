import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = Integer.parseInt(sc.next());
    int x[] = new int[N];
    int y[] = new int[N];
    int h[] = new int[N];
    for(int i=0; i<N; i++){
      x[i] = Integer.parseInt(sc.next());
      y[i] = Integer.parseInt(sc.next());
      h[i] = Integer.parseInt(sc.next());
    }
    boolean check = true;
    for(int i=0; i<=100; i++){
      for(int w=0; w<=100; w++){
        check = true;
        int tmp = h[0] + Math.abs(x[0] - i) + Math.abs(y[0] - w);
        for(int j=1; j<N; j++){
          if(h[j] != tmp - Math.abs(x[j] - i) - Math.abs(y[j] - w) ){
            check = false;
            break;
          }
        }
        if(check == true){
          out.println(i + " " + w + " " + tmp);
          break;
        }
      }
      if(check == true) break;
    }   
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}