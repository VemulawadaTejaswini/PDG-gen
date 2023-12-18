import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] s = new int[m];
		int[] p = new int[m];

		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int a = sc.nextInt();
				s[i] += Math.pow(2, a - 1);
			}
		}

		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
		}

		int N = (int) Math.pow(2, n);

		int ans = 0;

		for (int i = 0; i < N; i++) {
			int flag = 1;
			for (int j = 0; j < m; j++) {
				int count = i & s[j];
				int bits = 0;
				while (count != 0) {
					if ((count & 1) == 1) {
						bits++;
					}
					count = count >>> 1;
				}
				if (bits % 2 != p[j]) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}