import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   	public int maxHappiness(int[][] plan) {
        int n = plan.length;
        int[][] memo = new int[n][3];
        for (int[] row: memo) {
            Arrays.fill(row, -1);
        }
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result = Math.max(result, dfs(plan, 0, i, memo));
        }
		return result;
	}
	private int dfs(int[][] plan, int day, int prevActivity, int[][] memo) {
		int n = plan.length;
		if (day == n) {
			return 0;
		}
        if (memo[day][prevActivity] != -1) {
            return memo[day][prevActivity];
        }
		int maxHappiness = 0;
		for (int i = 0; i < plan[day].length; i++) {
			if (i == prevActivity) {
				continue;
			}
			int currHappiness = plan[day][i] + dfs(plan, day + 1, i, memo);
			maxHappiness = Math.max(maxHappiness, currHappiness);
		}
		return memo[day][prevActivity] = maxHappiness;
	}

    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
          	int[][] plan = new int[n][3];
            for (int i = 0; i < n; i++) {
                String[] split = br.readLine().split(" ");
                for (int j = 0; j < 3; j++) {
                    plan[i][j] = Integer.parseInt(split[j]);
                }
            }
          	Main app = new Main();
            int result = app.maxHappiness(plan);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
