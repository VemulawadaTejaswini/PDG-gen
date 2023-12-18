import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int A[] = new int[N];
    for(int i=0; i<N; i++) A[i] = sc.nextInt();
    int i = N - 1;
    while(i >= 0){
      out.print(A[i] + " ");
      i -= 2;
    }
    if(N % 2 == 0) i = 0;
    else i = 1;
    while(i < N){
      out.print(A[i] + " ");
      i += 2;
    }
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}