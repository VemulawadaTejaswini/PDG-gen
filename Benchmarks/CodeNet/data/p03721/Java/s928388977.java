import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), n=N, m=100000;
		double K = sc.nextDouble();
		double[] cnt = new double[m+1];
		while (n-->0) {
			int b = sc.nextInt(), c = sc.nextInt();
			cnt[b]+=c;
		}
		for (int ans = 1; ans<=m; ans++) {
			if (K<=cnt[ans]) {
				System.out.println(ans);
				System.exit(0);
			}
			K-=cnt[ans];
		}
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}