import java.util.*;
public class Main {

  public static void main (String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int[] A = new int[N+1];
    int[] B = new int[N];
    
    for (int i = 0; i <= N; i++) {
      A[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;

    int A_ = A[N];

    for (int i = N-1; 0 <= i; i--){
      A_ = A[i] + A_;
      if (A_ < B[i]) {
        count += A_;
        A_ = 0;
      } else {
        count += B[i];
        if( (A_ - B[i]) < A[i]){
          A_ = A_ - B[i];
        } else {
          A_ = A[i];
        }

      }
    }

    System.out.println(count);
 
  }

}