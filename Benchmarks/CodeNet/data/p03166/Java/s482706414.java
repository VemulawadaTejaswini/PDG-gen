import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final int INF = Integer.MAX_VALUE;
	public static int[][] sideArray;
	public static int[] dp;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int vertexCount = scan.nextInt();
		int sideCount = scan.nextInt();

		sideArray = new int[sideCount][2];

		for (int i = 0; i < sideCount; i++) {

			sideArray[i][0] = scan.nextInt();
			sideArray[i][1] = scan.nextInt();
		}

		// 各頂点から始めた場合の最長の長さを記録する
		dp = new int[vertexCount];
		Arrays.fill(dp, INF);

		for (int i = 0; i < vertexCount; i++) {

			calculationMaxLength(i);
		}

		int answer = Arrays.stream(dp).max().getAsInt();
		System.out.println(answer);
	}

	public static int calculationMaxLength(int vertexNumber) {

		int dpNumber = dp[vertexNumber];

		if (dpNumber != INF) {
			return dpNumber;
		}

		int result = 0;

		for (int[] side : sideArray) {

			if (side[0] - 1 == vertexNumber) {

				int maxLength = calculationMaxLength(side[1] - 1) + 1;
				result = Math.max(result, maxLength);
			}
		}

		dp[vertexNumber] = result;
		return result;
	}
}
