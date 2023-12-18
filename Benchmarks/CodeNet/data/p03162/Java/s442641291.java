import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int n = Integer.valueOf(stdin.nextLine());
		List<List<Integer>> action = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			
			action.add(Arrays.stream(stdin.nextLine().split(" ", 3)).map(Integer::valueOf)
					.collect(Collectors.toList()));
		}

		int[][] dp = new int[n][3];
		for (int i = 0; i < 3; i++) {
			dp[0][i] = action.get(0).get(i);
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				dp[i][j] = Math.max(dp[i - 1][(j + 1) % 3] + action.get(i).get(j),
						dp[i - 1][(j + 2) % 3] + action.get(i).get(j));
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 3; i++) {
			max = Math.max(max, dp[n - 1][i]);
		}

		System.out.println(max);

		stdin.close();
	}

}
