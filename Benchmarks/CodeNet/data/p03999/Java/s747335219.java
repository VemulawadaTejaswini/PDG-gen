import java.util.Scanner;

public class Main {

	static String s;
	static long n, total = 0, count = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		n = s.length();
		long ans = dfs(0, "");
		System.out.println(ans);
	}

	public static long dfs(int x, String formula) {
		if(x == n) {
			long res = 0;
			String[] split = formula.split("\\+");
			for(int i = 0 ; i < split.length ; i++) {
				res += Long.valueOf(split[i]);
			}
			total += res;
//			System.out.println(String.format("現在の合計値：%d 現在の状態(%d,%s) %dループ目", total, x, formula, count));
			count++;
			return res;
		}
		long ret = 0;
		char c = s.charAt(x);
		if(x != 0) ret += dfs(x + 1, formula + "+" + s.charAt(x));
		ret += dfs(x + 1, formula + c);
		return ret;
	}

}
