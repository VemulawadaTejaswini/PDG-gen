import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		FastReader sc = new FastReader();
		PrintWriter pw = new PrintWriter(System.out);
		int  wt = sc.nextInt();
		int sum = sc.nextInt();
		int weight[] = {2, 4};
		int value[] = {1, 1};
		boolean ans = knapsack(weight, value, wt, sum, 2);
      if(ans)
		System.out.println("Yes");
      else
        System.out.println("No");



	}
	public static boolean knapsack(int weight[], int value[], int wt, int sum, int n) {
		if (n == 0) {
			if (sum == 0 && wt == 0) {
				return true;
			}
			return false;
		} else if (sum == 0 && wt == 0) {
			return true;
		}

		else if (sum < 0 || wt < 0)
			return false;

		boolean ans = knapsack(weight, value, wt - 1, sum - weight[n - 1], n) || knapsack(weight, value, wt - 1, sum - weight[n - 1], n - 1) || knapsack(weight, value, wt, sum, n - 1);
		return ans;

	}
}





class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new
		                        InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException  e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}