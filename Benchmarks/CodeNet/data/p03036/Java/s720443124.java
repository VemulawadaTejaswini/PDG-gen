import java.util.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int D = sc.nextInt();
    int x = sc.nextInt();
    for(int i=0; i<10; i++){
      x = r * x - D;
      System.out.println(x);
    }
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}