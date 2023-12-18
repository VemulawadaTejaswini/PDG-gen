import java.util.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Integer A[] = new Integer[N];
    Integer D[][] = new Integer[M][2];
    for(int i=0; i<N; i++) A[i] = sc.nextInt();
    for(int i=0; i<M; i++){
      D[i][0] = sc.nextInt();
      D[i][1] = sc.nextInt();
    }
    Arrays.sort(A);
    Arrays.sort(D, (a,b) -> Integer.compare(a[1], b[1]));
    int j = 0;
    int k;
    boolean check = true;
    for(int i=M-1; i>=0; i--){
      if(check == false) break;
      k = 0;
      while(k < D[i][0]){
        if(j >= N){
          check = false;
          break;
        }
        if(A[j] < D[i][1]){
          A[j] = D[i][1];
          j++;
          k++;
        }else{
          check = false;
          break;
        }
      }
    }
    long ans = 0L;
    for(int i=0; i<N; i++){
      ans += A[i];
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}