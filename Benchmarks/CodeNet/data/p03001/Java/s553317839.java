import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    double W = sc.nextInt();
    double H = sc.nextInt();
    double x = sc.nextInt();
    double y = sc.nextInt();
    double ans = W * H / 2;
    int check;
    if(x == W / 2 && y == H / 2) check = 1;
    else check = 0;
    out.println(ans + " " + check);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}