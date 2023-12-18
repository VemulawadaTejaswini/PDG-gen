import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] s = new int[N];
		int[] g = new int[N];
		int sl = 0, gl = 0;
		String ans = "IMPOSSIBLE";
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 1) {
				s[i] = b;
				sl++;
			}
			if (a == N) {
				g[i] = b;
				gl++;
			}
			if (b == 1) {
				s[i] = a;
				sl++;
			}
			if (b == N) {
				g[i] = a;
				gl++;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (s[i] != 0 && g[j] != 0 && s[i] == g[j]) {
					ans = "POSSIBLE";
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
