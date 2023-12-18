import java.util.*;
public class Main {
	public static int len;
	public static int lenT;
	public static long ans[];
	public static boolean ok[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		len = s.length();
		lenT = t.length();
		StringBuilder s2 = new StringBuilder(s);
		s2.append(s);
		while(s2.length() < lenT * 2) {
			s2.append(s);
		}
		s = s2.toString();
		ans = new long[len];
		for(int i = 0; i < len; i ++) {
			ans[i] = -1;
		}
		ok = new boolean[len];
		for(int i = 0; i < len; i ++) {
			ok[i] = t.equals(s.substring(i, i + lenT));
		}

		long max = 0;
		for(int i = 0; i < len; i ++) {
			max = Math.max(max, solve(i));
		}
		System.out.println(max >= 10000000 ? -1 : max);
	}


	static long solve(int i) {
		i %= len;
		if(ans[i] == -2) {
			return 10000000;
		}else if(ans[i] == -1) {
			ans[i] = -2;
			ans[i] = (ok[i] ? (solve(i + lenT) + 1) : 0);
		}
		return ans[i];
	}
}