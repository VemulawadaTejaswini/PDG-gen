import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++){
			A[i] = sc.nextInt();
		}
		int[][] S = new int[M][2];

		for(int i = 0 ; i < M ; i ++){
			S[i][0] = sc.nextInt();
			S[i][1] = sc.nextInt();
		}
		sc.close();

		int a = 0;
		for(int i = 0 ; i < M ; i++){
			a += S[i][0];
		}

		int[][] T = new int[M][2];
		T[0][0] = S[0][0];
		T[0][1] = S[0][1];
		for(int i = 1 ; i < M ; i ++){
			T[i][0] = T[i-1][0] + S[i][0];
			T[i][1] = S[i][1];
		}

		/*
		for(int i = 0 ; i < M ; i ++){
			System.out.print(T[i][0] + " ");
			System.out.println(T[i][1] + " ");
		}
	*/
		//System.out.println(a);

		int[] C = new int[a];
		for(int i = 0 ; i < M ; i ++){
			C[T[i][0]-1] = T[i][1];
		}
/*
		for(int i = 0 ; i < a ; i ++){
			System.out.println(C[i]);
		}
*/

		for(int i = a-1 ; i >= 0 ; i--){
			if(C[i] == 0){
				C[i] = C[i+1];
			}
		}

		Arrays.sort(A);
		Arrays.sort(C);

		for(int i = a-1 ; i >= 0 ; i--){
			for(int j = 0 ; j < N ; j++){
				if(C[i] > A[j]){
					A[j] = C[i];
					break;
				}
			}
		}
		long ans = 0;
		for(int i = 0 ; i < N ; i++){
			//System.out.println(A[i]);
			ans += A[i];
		}
		System.out.println(ans);
	}
}