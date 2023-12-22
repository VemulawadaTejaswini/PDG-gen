import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0030/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if (n == 0 && s == 0)
				break;
			System.out.println(solve(n, s));
		}
	}


	int solve(int N, int sum) {
		if (sum > 45)
			return 0;
	int [][][]dp = new int[N + 1][11][sum + 1];
		dp[0][0][0] = 1;
		for (int n = 0; n < N; n++) {
			for (int min = 0; min <= 9; min++)
				for (int s = 0; s <= sum; s++) {
					for(int add = min; add <= 9; add++) {
						if( s + add <= sum)
							dp[n + 1][add + 1][s + add] += dp[n][min][s];
					}
				}
			
		}
		int res = 0;
		for(int i = 0; i < 11; i++)
			res += dp[N][i][sum];
		return res;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}