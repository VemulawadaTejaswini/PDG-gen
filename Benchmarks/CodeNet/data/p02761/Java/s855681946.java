import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int target[] = new int[N];
		Arrays.fill(target, 0);
		int M = sc.nextInt();

		int s[] = new int[M];
		int c[] = new int[M];

		for (int i = 0; i < M; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
			target[s[i] - 1] = c[i];
		}

		if (target[0] == 0) {
			System.out.println("-1");
		} else {
			for (int i = 0; i < N; i++) {
				System.out.print(target[i]);
			}
			System.out.println();
		}

	}
}