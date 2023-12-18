import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static int dp[] = new int[100100];
	static ArrayList<ArrayList<Integer>> edge = new ArrayList<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		for (int i = 0; i < N; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]) - 1;
			int y = Integer.parseInt(str[1]) - 1;
			edge.get(x).add(y);
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, rec(i));
		}
		System.out.println(max + 1);
	}

	static int rec(int v) {
		if (dp[v] != 0)
			return dp[v];

		int max = 0;
		for (int i : edge.get(v)) {
			max = Math.max(dp[i] + 1, max);
		}
		return dp[v] = max;
	}
}
