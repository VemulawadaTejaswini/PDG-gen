import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int ans = 0;

		int max = Math.max(A, C);
		int min = Math.min(B, D);

		if (B < C || D < A) {
			ans = 0;
		} else {
			ans = max - min;
		}

		System.out.println( Math.abs(ans) );
	}
}