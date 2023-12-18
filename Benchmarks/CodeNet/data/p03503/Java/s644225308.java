import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] F = new int[N][10];
		int[] cnt = new int[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				F[i][j] = sc.nextInt();
				if (F[i][j] == 1)
					cnt[i]++;
			}
		}
		int[][] P = new int[N][11];
		int[] max = new int[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 11; j++) {
				P[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			max[i] = P[i][1];
			for (int j = 1; j <= cnt[i]; j++) {
				if (max[i] < P[i][j])
					max[i] = P[i][j];
			}
		}
		Arrays.sort(max);
		if (max[N - 1] <= 0) {
			System.out.println(max[N - 1]);
			return;
		}
		int sum = 0;
		int ans = 0;
		for (int i = N - 1; i >= 0; i--) {
			sum += max[i];
			if (sum <= ans)
				break;
			ans += max[i];
		}
		System.out.println(ans);
	}

}