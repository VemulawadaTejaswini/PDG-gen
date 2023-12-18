import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in))) {
			String[] input = reader.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			int[] X = new int[N];
			int[] Y = new int[N];
			boolean[] C = new boolean[N];
			int maxX = 0;
			int maxY = 0;
			for (int i = 0; i < N; i++) {
				input = reader.readLine().split(" ");
				X[i] = Integer.parseInt(input[0]);
				maxX = maxX < X[i] ? X[i] : maxX;
				Y[i] = Integer.parseInt(input[1]);
				maxY = maxY < Y[i] ? Y[i] : maxY;
				C[i] = "W".equals(input[2]) ? false : true;
			}
			maxX++;
			maxY++;
			Boolean[][] expect = new Boolean[maxX][maxY];
			for (int i = 0; i < N; i++) {
				expect[X[i]][Y[i]] = C[i];
			}

			boolean[][] check = new boolean[maxX + K * 2][maxY + K * 2];
			for (int i = 0; i < maxX + K * 2; i++) {
				for (int j = 0; j < maxY + K * 2; j++) {
					check[i][j] = i % (2 * K) < K && j % (2 * K) < K
							|| i % (2 * K) >= K && j % (2 * K) >= K;
				}
			}

			int max = 0;
			for (int i = 0; i < K * 2; i++) {
				for (int j = 0; j < K * 2; j++) {
					int count = count(check, i, j, expect);
					max = max < count ? count : max;
				}
			}
			System.out.println(max);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int count(boolean[][] check, int stX, int stY, Boolean[][] expect) {
		int count = 0;
		for (int i = 0; i < expect.length; i++) {
			for (int j = 0; j < expect[i].length; j++) {
				if (expect[i][j] != null && check[i + stX][j + stY] == expect[i][j]) {
					count++;
				}
			}

		}
		return count;
	}
}
