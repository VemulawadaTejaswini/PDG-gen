import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static String[] numlist = {"3", "5", "7"};
	public static void main(String[] args) {
		long ans = dfs(0);
		System.out.println(ans);
	}

	static long dfs(long s) {
		if (s > N) return 0;
		int ret;
		if (is753(s)) ret = 1; else ret = 0;
		for (String num : numlist) {
			String next = Long.toString(s) + num;
			ret += dfs(Long.parseLong(next));
		}
		return ret;
	}

	static boolean is753(long s) {
		String sStr = Long.toString(s);
		for (String num : numlist) {
			if (!sStr.contains(num)) return false;
		}
		return true;
	}
}
