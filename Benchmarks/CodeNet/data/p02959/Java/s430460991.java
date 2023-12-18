import java.util.*;
 
public class Main {
  
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n+1];
    int B[] = new int[n];
    
    for(int i = 0; i <= n; i++) {
      A[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
      B[i] = sc.nextInt();
    }
    
    int count = 0;
    for(int i = 0; i < n; i++) {
      if(A[i] < B[i]) {
        count += A[i];
      } else {
        count += B[i];
      }
      int rem = B[i] - A[i];
      if(A[i+1] >= rem ) {
        count += rem;
        A[i+1] = A[i+1] - rem;
      } else {
        count += A[i+1];
        A[i+1] = 0;
      }
    }
    System.out.println(count);
  }
}