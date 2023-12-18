import java.util.Scanner;

public class Main {

	static String s;
	static int n;
	static char[] c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		n = s.length();
		c = s.toCharArray();
		long ans = dfs(0, "");
		System.out.println(ans);
	}

	public static long dfs(int i, String x) {
		if(i == n) {
			x = x.replace("+", "A");
			String[] a = x.split("A");
			long temp = 0;
			for(int j = 0 ; j < a.length ; j++) {
				temp += Long.valueOf(a[j]);
			}
			return temp;
		}
		long ret = 0;
		ret += dfs(i + 1, x + c[i]);
		if(i != 0) ret += dfs(i + 1, x + "+" + c[i]);
		return ret;
	}

}
