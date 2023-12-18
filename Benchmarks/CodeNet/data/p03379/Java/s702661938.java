import java.util.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer X[] = new Integer[N];
    for(int i=0; i<N; i++){
      X[i] = sc.nextInt();
    }
    Integer Y[] = new Integer[N];
    System.arraycopy(X,0,Y,0,X.length);
    Arrays.sort(Y);
    int a = Y[N/2 - 1];
    int b = Y[N/2];
    for(int i=0; i<N; i++){
      if(X[i] <= a) System.out.println(b);
      else System.out.println(a);
    }
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}