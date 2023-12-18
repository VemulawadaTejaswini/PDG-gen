import java.util.Scanner;

public class Main {
	static String[] numlist = {"3", "5", "7"};
	static Scanner sc = new Scanner(System.in);
	static long N = sc.nextLong();
	public static void main(String[] args) {
		long ans = dfs(0);
		System.out.println(ans);
		sc.close();
	}

	static long dfs(long a) {
		if (a > N) return 0;
		long res;
		// aが753なら+1する
		if (is753(a)) res = 1; else res = 0;
		// 3,5,7を末尾に足し、次の木を探索する
		for (String num : numlist) {
			String next = Long.toString(a) + num;
			res += dfs(Long.parseLong(next));
		}
		return res;
	}

	static boolean is753(long s) {
		String sStr = Long.toString(s);
		for (String num : numlist) {
			if (!sStr.contains(num)) return false;
		}
		return true;
	}
}