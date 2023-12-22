import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		long C[] = new long[27];
		for (int i = 1; i <= 26; i++) {
			C[i] = sc.nextLong();
		}
		long S[][] = new long[D + 1][27];
		for (int i = 1; i <= D; i++) {
			for (int j = 1; j <= 26; j++) {
				S[i][j] = sc.nextLong();
			}
		}

		long p = 0;
		int ans[] = new int[D + 1];
		int[] d = new int[27];
		for (int i = 1; i <= D; i++) {
			long maxAns = 0;
			for (int j = 1; j <= 26; j++) {
				long _ans = 0;
				for (int k = 1; k <= 26; k++) {
					if (j == k) {
						_ans += S[i][j];
						d[j] = 0;
					} else {
						_ans -= C[k] * (d[k] + 1);
					}
				}
				if(maxAns < _ans) {
					maxAns = _ans;
					ans[i] = j;
				}
			}
			p += maxAns;
			for (int j = 1; j <= 26; j++) {
				if (ans[i] != j)
					d[j]++;
			}
		}
		for (int i = 1; i <= D; i++) {
			System.out.println(ans[i]);
		}
	}
}
