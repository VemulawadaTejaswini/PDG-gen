import java.util.Scanner;

public class Main {

	static final int max = 100000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		long[] ha = new long[n];
		int[][] ma = new int[n][max];
		int[] mp = new int[n];
		for (int i = 0; i < n; i++) {
			ha[i] = Long.parseLong(sc.next());
		}

		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			ma[a - 1][mp[a - 1]] = b - 1;
			mp[a - 1]++;
			ma[b - 1][mp[b - 1]] = a - 1;
			mp[b - 1]++;
		}

		System.out.println(getAns(n, m, ha, ma, mp));
	}

	public static int getAns(int n, int m, long[] ha, int[][] ma, int[] mp) {
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans++;
			for (int j = 0; j < mp[i]; j++) {
				if (ha[i] <= ha[ma[i][j]]) {
					ans--;
					break;
				}
			}
		}

		return ans;
	}

}
