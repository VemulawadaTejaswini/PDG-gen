import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int X = reader.nextInt();
		int Y = reader.nextInt();
		int Z = reader.nextInt();
		int K = reader.nextInt();
		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];
//		long[] arr = new long[X * Y * Z];
		ArrayList<Long> list = new ArrayList<Long>();
		for (int i = 0; i < X; i++) {
			A[i] = reader.nextLong();
		}
		for (int i = 0; i < Y; i++) {
			B[i] = reader.nextLong();
		}
		for (int i = 0; i < Z; i++) {
			C[i] = reader.nextLong();
		}
		Arrays.sort(A);

		Arrays.sort(B);

		Arrays.sort(C);
		for (int i = 1; i <= Math.min(X, K); i++) {
			for (int j = 1; j <= Math.min(Y, K); j++) {
				for (int k = 1; k <= Math.min(Z, K); k++) {
					if (i*j*k > K) {
						break;
					}
					list.add(A[X-i] + B[Y-j] + C[Z-k]);
				}
			}
		}
		Collections.sort(list);
		int size = list.size();
		for (int i = 1; i <= K; i++) {
			System.out.println(list.get(size - i));
		}


		reader.close();
	}
}