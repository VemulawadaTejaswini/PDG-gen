import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] map = new int[1000000];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if (a[i] > N + 1) continue;
			map[a[i] + N - i]++;
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (N - a[i] - i >= 0 && N - a[i] - i < 1000000) {
				ans += map[N - a[i] - i];
			}
			if (a[i] <= N + 1) {
				map[a[i] + N - i]--;
			}
		}
		System.out.println(ans);
	}
}
