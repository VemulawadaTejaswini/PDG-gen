import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n, min = Integer.MAX_VALUE;
		n = stdin.nextInt();
		int[] A = new int[n];
		A[0] = stdin.nextInt();
		for (int i = 1; i < n; i++) {
			A[i] = A[i - 1] + stdin.nextInt();
		}
		if (n == 2) {
		min=Math.abs(A[1]-2*A[0]);
		} else {
			for (int i = 0; i < n - 1; i++) {
				if (Math.abs(A[n - 1] - 2 * A[i]) < min) {
					min = Math.abs(A[n - 1] - 2 * A[i]);
				}
			}
		}
		System.out.println(min);

	}

}
