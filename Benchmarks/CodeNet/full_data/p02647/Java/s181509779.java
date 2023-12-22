import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] A = new int[N + 1];
		int[] a = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < K; i++) {
			for (int j = 1; j <= N; j++) {
				int B = 0;
				for (int k = 1; k <= N; k++) {
					double start = k - A[k] - 0.5;
					double end = k + A[k] + 0.5;
					if (j > start && j < end) {
						B++;
					}
				}
				a[j] = B;
			}
			System.arraycopy(a, 0, A, 0, a.length);
		}

		for (int i = 1; i <= N; i++) {
			if (i <= N - 1) {
				System.out.print(A[i] + " ");
			} else {
				System.out.println(A[i]);
			}

		}

	}
}