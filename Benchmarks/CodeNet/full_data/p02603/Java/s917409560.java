import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int x = 1000;
		int c = 0;
		for (int i = 0; i < N - 1; i++) {
			if (A[i] < A[i + 1] && x / A[i] > 0) {
				c += x / A[i];
				x -= c * A[i];
			} else if (A[i] > A[i + 1]) {
				x += c * A[i];
				c = 0;
			}
		}
		x += c * A[N - 1];
		c = 0;
		System.out.println(x);
	}

}