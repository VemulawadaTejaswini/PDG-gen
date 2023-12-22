import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		int[] A = new int[N];
		long[] sumA = new long[N+1];
		sumA[0] = 0;
		int A_max = 0;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			sumA[i+1] = sumA[i] + A[i];

			if(sumA[i+1] <= K) {
				A_max = i+1;
			}
		}

		int[] B = new int[M];
		long[] sumB = new long[M+1];
		sumB[0] = 0;
		int B_max = 0;
		for(int i=0; i<M; i++) {
			B[i] = sc.nextInt();
			sumB[i+1] = sumB[i] + B[i];

			if(sumB[i+1] <= K) {
				B_max = i+1;
			}
		}

		if(A_max >= B_max) {
			int max = A_max;
			int A_count = A_max;
			int B_count = 0;

			while(B_count < B_max && sumA[A_count] + sumB[B_count+1] <= K) {
				B_count++;
			}

			max += B_count;

//			System.out.println(A_count + "," + B_count);

			while(A_count > 0 && B_count < B_max && sumA[A_count-1] + sumB[B_count+1] <= K) {
				A_count--;
				B_count++;

				while(B_count < B_max && sumA[A_count] + sumB[B_count+1] <= K) {
					B_count++;
				}

//				System.out.println(A_count + "," + B_count);
				max = Math.max(max, A_count+B_count);
			}

			System.out.println(max);
		}else {
			int max = B_max;
			int A_count = 0;
			int B_count = B_max;

			while(A_count < A_max && sumA[A_count+1] + sumB[B_count] <= K) {
				A_count++;
			}

			max += A_count;

//			System.out.println(A_count + "," + B_count);

			while(B_count > 0 && A_count < A_max && sumA[A_count+1] + sumB[B_count-1] <= K) {
				B_count--;
				A_count++;

				while(A_count < A_max && sumA[A_count+1] + sumB[B_count] <= K) {
					A_count++;
				}

//				System.out.println(A_count + "," + B_count);
				max = Math.max(max, A_count+B_count);
			}

			System.out.println(max);
		}
	}

}
