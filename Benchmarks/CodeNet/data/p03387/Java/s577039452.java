import java.util.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer A[] = new Integer[3];
    for(int i=0; i<A.length; i++){
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    int ans;
    ans = A[2] - A[1];
    A[0] += ans;
    int a = A[2] - A[0];
    if(a % 2 == 0) ans += a/2;
    else ans += a/2 + 2;
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}