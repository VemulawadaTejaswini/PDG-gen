import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int h[] = new int[n + 1];
		int answer[] = new int[n + 1];

		Arrays.fill(answer, 1);
		answer[0] = 0;

		for (int i = 1; i <= n; i++) {
			h[i] = sc.nextInt();
		}

		for (int i = 1; i <= m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (h[a] <= h[b]) {
				answer[a] = -1;
//				System.out.println(a);
			}
			if (h[b] <= h[a]) {
				answer[b] = -1;
//				System.out.println(a);
			}
		}

		int sum = 0;
		for (int i : answer) {
			if (i == 1) sum++;
		}
		System.out.println(sum);

		sc.close();
	}

}
