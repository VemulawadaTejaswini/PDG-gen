import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[][] x = new int[N][15];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			for (int j = 0; j < A[i]; j++) {
				int who = sc.nextInt();
				int which = sc.nextInt();
				if (which == 0) {
					x[i][who - 1] = -1;
				} else {
					x[i][who - 1] = 1;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < (1 << N); i++) {
			int maxCardi = 0;
			boolean judge = true;
			loop:for (int j = 0; j < N; j++) {
				if (((i >> (N - j - 1)) & 1) == 1) {
					maxCardi++;
					for (int k = 0; k < 15; k++) {
						if (x[j][k] == 0) {
							continue;
						}
						if (!(x[j][k] == (((i >> k) & 1) == 1 ? 1 : -1))) {
							judge = false;
							break loop;
						}
					}
				}
			}
			if (maxCardi > max && judge) {
				max = maxCardi;
			}
		}
		System.out.print(max);
	}
}
