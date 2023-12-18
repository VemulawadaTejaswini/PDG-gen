import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		int Q = Integer.parseInt(tokens[2]);
		int[][] ranges = new int[N][N];
		for (int i = 0; i < M; ++i) {
			tokens = in.nextLine().split(" ");
			int l = Integer.parseInt(tokens[0]);
			int r = Integer.parseInt(tokens[1]);
			ranges[l - 1][r - 1]++;
		}
		int[][] sumRanges = new int[N][N + 1];
		for (int i = 0; i < N; ++i) {
			int sum = 0;
			for (int j = 1; j <= N; ++j) {
				sum += ranges[i][j-1];
				sumRanges[i][j] = sum;
			}
		}
		int[] p = new int[Q];
		int[] q = new int[Q];
		for (int i = 0; i < Q; ++i) {
			tokens = in.nextLine().split(" ");
			p[i] = Integer.parseInt(tokens[0]);
			q[i] = Integer.parseInt(tokens[1]);
		}
		for (int i = 0; i < Q; ++i) {
			int left = p[i];
			int right = q[i];
			System.out.println(calcSimple(left, right, sumRanges));
		}
		in.close();
	}

	private static int calcSimple(int p, int q, int[][] sumRanges) {
		int result = 0;
		for (int i = p - 1; i <= q - 1; ++i) {
			result += (sumRanges[i][q ] - sumRanges[i][p - 1]);
		}
		return result;
	}
}