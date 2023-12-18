
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();

		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];

		for (int i = 0; i < X; i++) {
			A[i] = sc.nextLong();
		}

		for (int i = 0; i < Y; i++) {
			B[i] = sc.nextLong();
		}

		for (int i = 0; i < Z; i++) {
			C[i] = sc.nextLong();
		}

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		int index = 0;
		long[] ab = new long[X * Y];
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				ab[index] = A[i] + B[j];
				index++;
			}
		}

		Arrays.sort(ab);
		long[] abc = new long[Math.min(X * Y * Z, 3000)];
		index = 0;
		for (int i = 0; i < Math.min(X * Y, 3000); i++) {
			for (int j = 0; j < Z; j++) {
				abc[index] = ab[X * Y - 1 - i] + C[Z - 1 - j];
				index++;
			}
		}
		Arrays.sort(abc);
		for (int i = 0; i < K; i++) {
			System.out.println(abc[abc.length - 1 - i]);
		}
	}
}
