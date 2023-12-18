import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] a = new int[N][N];
		for (int i = 0; i < N; i++) {
			int A = in.nextInt();
			int[] tmp = new int[N];
			Arrays.fill(tmp, -1);
			tmp[i] = 1;
			for (int j = 0; j < A; j++) {
				tmp[in.nextInt() - 1] = in.nextInt();
			}
			a[i] = tmp;
		}
		int ans = 0;
		for (int i = 0; i < (1 << N); i++) {
			int[] tmp = new int[N];
			for (int j = 0; j < N; j++) {
				if ((i >> j & 1) == 1) {
					tmp[j] = 1;
				}
			}
			boolean isOk = true;
			int count = 0;
			for (int j = 0; j < N; j++) {
				if (tmp[j] == 1) {
					count++;
					for (int j2 = 0; j2 < N; j2++) {
						if (a[j][j2] == -1) {
							continue;
						}
						if (a[j][j2] != tmp[j2]) {
							isOk = false;
						}
					}
				}
			}
			if (isOk) {
				ans = Math.max(ans, count);
			}
			count = 0;
		}
		System.out.println(ans);
		in.close();
	}
}