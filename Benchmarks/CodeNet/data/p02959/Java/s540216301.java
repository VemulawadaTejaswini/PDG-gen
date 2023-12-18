import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int A[] = new int[N+1];
    int B[] = new int[N];
    int Kc = 0;

    for (int i = 0; i < N+1; i++){
      A[i] = scan.nextInt();
    }

    for (int i = 0; i < N; i++){
      B[i] = scan.nextInt();
    }
    
    for(int i = 0; i < N; i++){
      if(B[i] > A[i]){
        B[i] -= A[i];
        Kc += A[i];
        if(B[i] > A[i+1]){
          Kc += A[i+1];
          A[i+1] = 0;
        } else {
          Kc += B[i];
          A[i+1] -= B[i];
        }
      } else {
        Kc += B[i];
      }
    }
    System.out.println(Kc);
  }
}