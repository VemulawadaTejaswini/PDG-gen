import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int mod = s.length();
		long ans = 0;
		for (int i = 0; i < t.length(); i++) {
			int tmp = s.indexOf(t.charAt(i));
			if (tmp == -1) {
				ans = -1;
				break;
			} else {
				if (s.indexOf(t.charAt(i), (int) ans % mod) != -1) {
					tmp = s.indexOf(t.charAt(i), (int) ans % mod);
				}
				if (tmp + 1 <= ans % mod) {
					ans = mod * ((ans + mod - 1) / mod) + tmp + 1;
				} else {
					ans = mod * (ans / mod) + tmp + 1;
				}
			}
		}
		System.out.println(ans);
	}
}
