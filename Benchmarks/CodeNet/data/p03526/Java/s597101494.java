import java.util.*;

public class Main {
	static Person[] arr;
	static long[][] dp;	//何人目、何人選択
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new Person[n];
		dp = new long[n + 1][n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = new Person(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr, new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			return p1.h + p1.p - p2.h - p2.p;
		}
		});
		for (int i = n; i >= 0; i--) {
			if (dfs(n, i) != Long.MAX_VALUE) {
				System.out.println(i);
				return;
			}
		}
	}
	
	static long dfs(int x, int y) {
		if (y > x) {
			return Long.MAX_VALUE;
		}
		if (y == 0) {
			return 0;
		}
		if (dp[x][y] != 0) {
			return dp[x][y];
		}
		long tmp = dfs(x - 1, y - 1);
		if (tmp > arr[x - 1].h) {
			tmp = Long.MAX_VALUE;
		} else {
			tmp += arr[x - 1].p;
		}
		long ans = Math.min(dfs(x - 1, y), tmp);
		dp[x][y] = ans;
		return ans;
	}
	
	static class Person {
		int h;
		int p;
		public Person(int h, int p) {
			this.h = h;
			this.p = p;
		}
	}
}
