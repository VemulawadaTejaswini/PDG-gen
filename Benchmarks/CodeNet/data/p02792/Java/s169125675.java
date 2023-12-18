import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ans = 0;
		int n = (int) Math.floor(Math.log10(N));
		int na = 0, nc = N;
		while (nc > 0) {
			na = nc;
			nc /= 10;
		}
		for (int i = 1; i <= N; i++) {
			int b = i % 10;
			if (b == 0)
				continue;
			int c = i;
			int a = 0;
			while (c > 0) {
				a = c;
				c /= 10;
			}
			if (a == b)
				ans++;
			for (int j = 1; j < n; j++) {
				ans += Math.pow(10, j - 1);
			}
			if (b < na) {
				ans += Math.pow(10, n - 1);
			} else if (b == na) {
				int buf = b * (int)Math.pow(10, n) + a;
				int v = N-buf;
				if(v < 0)continue;
				v /=10;
				ans += v+1;
			}
		}
		System.out.println(ans);
	}

}
