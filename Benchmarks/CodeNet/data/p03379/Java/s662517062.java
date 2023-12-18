
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] A = new int[N];
		int[] sorted = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = reader.nextInt();
			sorted[i] = A[i];
		}
		Arrays.sort(sorted);
		int center1 = sorted[N/2 - 1];
		int center2 = sorted[N/2];

		for (int i = 0; i < N; i++) {
			if (A[i] >= center2) {
				System.out.println(center1);
			} else {
				System.out.println(center2);
			}
		}
		reader.close();
	}
}

