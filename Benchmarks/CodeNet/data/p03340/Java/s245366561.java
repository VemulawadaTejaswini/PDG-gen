import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N + 1];
		int[][] memo = new int[N + 1][N + 1];
		for (int i = 1; i < A.length; i++) {
			A[i] = scan.nextInt();
		}
		int count = 0;
		for (int r = 1; r <= N; r++) {
			for (int l = 1; l <= r; l++) {
				//System.out.println("r:" + r + ", l:" + l);
				if (left(r, l, A) == right(r, l, A)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static int left(int r, int l, int[] A) {
		int result = 0;
		for (int i = l; i <= r; i++) {
			result ^= A[i];
		}
		return result;
	}

	public static int right(int r, int l, int[] A) {
		int result = 0;
		for (int i = l; i <= r; i++) {
			result += A[i];
		}
		return result;
	}
}