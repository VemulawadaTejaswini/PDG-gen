import java.util.Scanner;

public class Main {

	static String s;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		n = s.length();
		long ans = dfs(0, "");
		System.out.println(ans);
	}

	public static long dfs(int i, String x) {
		if(i == n) {
			String[] split = x.split("\\+");
			long res = 0;
			for(int j = 0 ; j < split.length ; j++) {
				res += Long.valueOf(split[j]);
			}
			return res;
		}
		long ret = 0;
		ret += dfs(i + 1, x + s.charAt(i));
		if(i != 0) ret += dfs(i + 1, x + "+" + s.charAt(i));
		return ret;
	}

}
