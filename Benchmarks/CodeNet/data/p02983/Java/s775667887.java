import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = 2019;
		int L = sc.nextInt();
		int R = sc.nextInt();
		
		if (R - L >= M) {
			R = R % M + M;
			L = L % M;
		} else {
			R %= M;
			L %= M;
		}
		if (L > R) {
			int t = R; R = L; L = t;
		}
		int ans = M;
		for (int i = L; i <= R; i++) {
			for (int j = L + 1; j <= R; j++) {
				ans = Math.min(ans, (i * j) % M);
			}
		}
		System.out.println(ans);
	}
}
