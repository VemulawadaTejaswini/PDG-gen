import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Scanner;

public class Main {

	private static int[][] leftupper;
	private static int[][] rightlower;
	private static int H, W, L, P;

	public static void main(String[] args) throws Exception {

		// ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		// long startCpuTime = threadMXBean.getCurrentThreadCpuTime();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		H = scan.nextInt();
		W = scan.nextInt();
		L = scan.nextInt();
		P = scan.nextInt();

		leftupper = new int[W][H];
		rightlower = new int[W][H];

		for (int x = 0; x < W; x++)
			for (int y = 0; y < H; y++) {
				leftupper[x][y] = 0;
				rightlower[x][y] = 0;
			}
		for (int i = 0; i < P; i++) {
			int y = scan.nextInt() - 1;
			int x = scan.nextInt() - 1;
			leftupper[x][y] = -1;
			rightlower[x][y] = -1;
		}
		for (int y = 0; y < H; y++) {
			int free = 0;
			for (int x = W - 1; x >= 0; x--)
				if (leftupper[x][y] == -1)
					free = 0;
				else {
					free++;
					leftupper[x][y] = free;
				}
		}
		for (int x = 0; x < W; x++) {
			int free = 0;
			for (int y = H - 1; y >= 0; y--)
				if (leftupper[x][y] == -1)
					free = 0;
				else {
					free++;
					if (leftupper[x][y] > free)
						leftupper[x][y] = free;
				}
		}
		for (int y = 0; y < H; y++) {
			int free = 0;
			for (int x = 0; x < W; x++)
				if (rightlower[x][y] == -1)
					free = 0;
				else {
					free++;
					rightlower[x][y] = free;
				}
		}
		for (int x = 0; x < W; x++) {
			int free = 0;
			for (int y = 0; y < H; y++)
				if (rightlower[x][y] == -1)
					free = 0;
				else {
					free++;
					if (rightlower[x][y] > free)
						rightlower[x][y] = free;
				}
		}

		// long st1CpuTime = threadMXBean.getCurrentThreadCpuTime();

		long result = 0;

		for (int x = 0; x < W; x++) {
			int e = Math.min(W - x, H);
			int[] fnr = new int[e];
			int[] fnl = new int[e];
			for (int i = 0; i < e; i++) {
				fnl[i] = leftupper[x + i][i];
				fnr[i] = rightlower[x + i][i];
			}
			result += countMatch(fnr, fnl, e);
		}

		for (int y = 1; y < H; y++) {
			int e = Math.min(W, H - y);
			int[] fnr = new int[e];
			int[] fnl = new int[e];
			for (int i = 0; i < e; i++) {
				fnl[i] = leftupper[i][y + i];
				fnr[i] = rightlower[i][y + i];
			}
			result += countMatch(fnr, fnl, e);

		}
		System.out.println(result);

		// long stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println((float) (st1CpuTime - startCpuTime) / 1000 / 1000
		// / 1000);
		// System.out.println((float) (stopCpuTime - st1CpuTime) / 1000 / 1000 /
		// 1000);

		System.exit(0);
	}

	private static long countMatch(int[] fnr, int[] fnl, int e) {
		int f = 0;
		for (int d = L - 1; d < e; d++) {
			int i = 0;
			int j = d;
			for (; j < e; i++, j++)
				if (fnl[i] >= L && fnr[j] >= L)
					f++;
		}
		return f;
	}

}