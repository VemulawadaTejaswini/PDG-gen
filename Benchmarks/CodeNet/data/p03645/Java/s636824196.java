import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] s = new int[N + M];
		int[] g = new int[N + M];
		String ans = "IMPOSSIBLE";
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 1) {
				s[i] = b;
			} else if (a == N) {
				g[i] = b;
			}
			if (b == 1) {
				s[i] = a;
			} else if (b == N) {
				g[i] = a;
			}
		}
		
		Arrays.sort(s);
		Arrays.sort(g);
		
		loop1:
		for (int i : s) {
			for (int j : g) {
				if (i != 0 && j != 0 && i == j) {
					ans = "POSSIBLE";
					break loop1;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}