import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static final int INF = Integer.MAX_VALUE;
	public static List<Integer>[] sideArray;
	public static int[] dp;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int vertexCount = scan.nextInt();
		int sideCount = scan.nextInt();

		sideArray = new List[vertexCount];

		for (int i = 0; i < vertexCount; i++) {

			sideArray[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < sideCount; i++) {

			int start = scan.nextInt();
			int end = scan.nextInt();

			sideArray[start - 1].add(end - 1);
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

		for (Integer endVertex : sideArray[vertexNumber]) {

			int maxLength = calculationMaxLength(endVertex) + 1;
			result = Math.max(result, maxLength);
		}

		dp[vertexNumber] = result;
		return result;
	}
}
