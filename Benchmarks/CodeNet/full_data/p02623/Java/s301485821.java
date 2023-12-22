import java.util.*;
 
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long K = sc.nextLong();
    long[] A = new long [N];
    long[] B = new long [M];
    for (int i = 0; i < N; i++) {
      long a = sc.nextLong();
      A[i] = a;
    }
    for (int i = 0; i < M; i++) {
      long b = sc.nextLong();
      B[i] = b;
    }
    //累積和A
    for (int i = 1; i < N; i++) 
      A[i] = A[i-1]+A[i];
    //累積和B
    for (int i = 1; i < M; i++) 
      B[i] = B[i-1]+B[i];
    
    long ans = 0;

    if (A[N-1] <= K) 
      ans = N;
    if (B[M-1] <= K)
      ans = Math.max(ans,M);

    int iPoint = 0;
    int jPoint = M;

    for (int i = 0; i < N; i++) {
      long minuites = K - A[i];
      for (int j = jPoint-1; j > -1; j--) {
        if (minuites - B[j] >= 0) {
          iPoint = i+1;
          jPoint = j+1;
          break;
        }
      }
      if (minuites <= 0)
        break;
      ans = Math.max(ans,iPoint+jPoint);
    }
    int iPoint2 = 0;
    int jPoint2 = N;

    for (int i = 0; i < M; i++) {
      long minuites = K - B[i];
      for (int j = jPoint2-1; j > -1; j--) {
        if (minuites - A[j] >= 0) {
          iPoint2 = i+1;
          jPoint2 = j+1;
          break;
        }
      }
      if (minuites <= 0)
        break;
      ans = Math.max(ans,iPoint2+jPoint2);
    }
    System.out.println(ans);
  }
} 