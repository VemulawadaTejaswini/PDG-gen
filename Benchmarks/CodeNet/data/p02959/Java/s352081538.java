
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N+1];
		long[] B = new long[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextLong();
		}

		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextLong();
		}


		long con =0;
		for (int i = 0; i < N; i++) {
			if (B[i] >= A[i]) {
				con += A[i];
				B[i] -= A[i];
			}else {
				con+=B[i];
				B[i] = 0;
			}

			if (B[i] >= A[i+1]) {
				con += A[i+1];
				B[i] -= A[i+1];
				A[i+1] = 0;
			}else {
				con+=B[i];
				B[i] = 0;
				A[i+1] -= B[i];
			}
		}

		System.out.println(con);
	}

}