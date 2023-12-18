import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] x = new int[M];
		int[] y = new int[M];
		for (int i = 0; i < M; i++) {
			x[i] = sc.nextInt() - 1;
			y[i] = sc.nextInt() - 1;
		}

		boolean[] red = new boolean[N];
		int[] num = new int[N];
		Arrays.fill(red, false);
		red[0] = true;
		Arrays.fill(num, 1);

		for (int i = 0; i < M; i++) {
			num[x[i]] -= 1;
			num[y[i]] += 1;
			if (red[x[i]]) {
				red[y[i]] = true;
				if (num[x[i]] <= 0) {
					red[x[i]] = false;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (red[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
