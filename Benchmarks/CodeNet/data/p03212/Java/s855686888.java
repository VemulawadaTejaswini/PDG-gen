import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static String[] numlilst = {"3","5","7"};
	public static void main(String[] args) {
		long ans = dfs(0);
		System.out.println(ans);
		sc.close();
	}
	static long dfs(long s) {
		if (s > N) {
			return 0;
		}
		int ret;
		if (is753(s)) ret = 1; else ret = 0;
		for (String nums : numlilst) {
			String hikisu = Long.toString(s) + nums;
			ret += dfs(Long.parseLong(hikisu));
		}
		return ret;
	}
	static boolean is753(long s) {
		String sStr = Long.toString(s);
		for (String nums : numlilst) {
			if (!sStr.contains(nums)) return false;
		}
		return true;
	}
}