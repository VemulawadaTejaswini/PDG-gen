import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int[] A = new int[N];
      for(int i=0; i<N; i++){
        A[i] = scan.nextInt();
      }
      int Q = scan.nextInt();
      int[] B = new int[Q];
      int[] C = new int[Q];
      
      for(int i=0; i<Q; i++){
        B[i] = scan.nextInt();
        C[i] = scan.nextInt();
      }
      for(int i=0; i<Q; i++){
        for(int j=0; j<N; j++){
          if(A[j] == B[i])
            A[j] = C[i];
        }
        long result = 0;
        for(int j=0; j<N; j++){
          result += A[j];
        }
        System.out.println(result);
      }
    }
}    