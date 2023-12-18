import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int left = 1, right = N;
		for(int i = 0; i < M; i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			left = Math.max(left, L);
			right = Math.min(right, R);
		}
		sc.close();
		// System.out.println(left + " <= " + right);
		System.out.println(left <= right ? right - left + 1 : 0);
	}
}