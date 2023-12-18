import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] A = new int[N+1];
		for (int i = 0; i < N; i++) {
			A[i] = reader.nextInt();
		}
		A[N] = 0;
		for (int i = 0; i < N; i++) {
			int current = 0;
			int ans = 0;
			for (int j = 0; j <= N; j++) {
				if (i != j) {
					ans += Math.abs(current - A[j]);
					current = A[j];
				}
			}
			System.out.println(ans);
		}
	}
}

