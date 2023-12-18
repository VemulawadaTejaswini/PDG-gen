
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] abc = new int[3];
		abc[0] = in.nextInt();
		abc[1] = in.nextInt();
		abc[2] = in.nextInt();
		int[] ls = new int[N];
		for (int i = 0; i < N; i++) {
			ls[i] = in.nextInt();
		}

		int[] sums = new int[1 << N];
		for (int i = 0; i < sums.length; i++) {
			for (int j = 0; j < N; j++) {
				if ((i & (1 << j)) > 0) {
					sums[i] += ls[j];
				}
			}
		}

		int used = 0;
		int col = 0;
		int mp = solv(abc, sums, used, col);
		System.out.println(mp);
	}

	private static int solv(int[] abc, int[] sums, int used, int col) {
		if (abc.length == col) {
			return 0;
		}
		int minMp = 10000;
		for (int i = 1; i < sums.length; i++) {
			if ((i & used) != 0) {
				continue;
			}
			int bc = Integer.bitCount(i);
			int mp = 10 * (bc - 1) + Math.abs(abc[col] - sums[i]) + solv(abc, sums, used | i, col + 1);
			if (mp < minMp) {
				minMp = mp;
			}
		}
		return minMp;
	}
}
