import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder out;

	void run() {
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		out = new StringBuilder();
		print(A);
		for (int i = 1; i < N; i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			print(A);
		}
		System.out.print(out);
	}

	void print(int[] A) {
		for (int i = 0; i < A.length; i++) {
			out.append((i == 0 ? "" : " ") + A[i]);
		}
		out.append("\n");
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}