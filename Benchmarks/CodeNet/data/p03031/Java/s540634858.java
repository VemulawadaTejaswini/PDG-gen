import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);

		boolean[][] conds = new boolean[M][N];
		for (int i = 0; i < M; ++i) {
			Arrays.fill(conds[i], false);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int k = Integer.parseInt(tokens[0]);
			for (int j = 0; j < k; ++j) {
				int index = Integer.parseInt(tokens[j + 1]);
				conds[i][index - 1] = true;
			}
		}
		int[] nums = new int[M];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < M; ++i) {
			nums[i] = Integer.parseInt(tokens[i]);
		}
		int count = 0;
		for (int v = 0; v < Math.pow(2.0, N); ++v) {
			boolean[] pattern = genSwitchPattern(v, N);
			if (check(conds, pattern, nums)) {
				++count;
			}
		}
		System.out.println(count);
		in.close();
	}

	static boolean check(boolean[][] conds, boolean[] pattern, int[] nums) {
		for (int i = 0; i < conds.length; ++i) {
			boolean checkResult = check(conds[i], pattern, nums[i]);
			if (!checkResult) {
				return false;
			}
		}
		return true;
	}

	static boolean check(boolean[] cond, boolean[] pattern, int num) {
		int count = 0;
		for (int i = 0; i < cond.length; ++i) {
			if (cond[i] && pattern[i]) {
				++count;
			}
		}
		if (count % 2 == num) {
			return true;
		} else {
			return false;
		}

	}

	static boolean[] genSwitchPattern(int v, int len) {
		boolean[] result = new boolean[len];
		Arrays.fill(result, false);
		for (int i = 0; i < len; ++i) {
			if (v % 2 != 0) {
				result[i] = true;
			}
			v /= 2;
		}
		return result;
	}

}