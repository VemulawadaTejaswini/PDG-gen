
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B[] = new int[N - 1];
		for(int i = 0 ; i < N - 1 ; ++i){
			B[i] = sc.nextInt();
		}
		int A[] = new int[N];
		// B[0] >= Max(A[0] , A[1])
		// B[1] >= Max(A[1] , A[2])
		// B[2] >= Max(A[2] , A[3])		
		// A[0] = B[0]
		// A[1] = Math.min(B[0] , B[1])
		// A[2] = Math.min(B[1] , B[2])
		// A[3] = B[2]
		// 0 , 0 , 10 , 10 , 10, 23
		A[0] = B[0];
		for(int i = 1 ; i < N - 1 ; ++i){
			A[i] = Math.min(B[i - 1], B[i]);
		}
		A[N - 1] = B[N - 2];
		int S = 0;
		for(int a : A) {
			S += a;
		}
		System.out.println(S);		
	}
}
