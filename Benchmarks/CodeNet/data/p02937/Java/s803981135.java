import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int mod = s.length();
		long ans = 0;
		TreeSet<Integer>[] index = new TreeSet[26];
		for (int i = 0; i < 26; i++) {
			index[i] = new TreeSet<>();
		}
		for (int i = 0; i < t.length(); i++) {
			TreeSet<Integer> tmp = index[t.charAt(i) - 'a'];
			if (tmp.size() == 0) {
				if (s.indexOf(t.charAt(i)) == -1) {
					ans = -1;
					break;
				} else {
					int in = 0;
					while (s.indexOf(t.charAt(i), in) != -1) {
						tmp.add(s.indexOf(t.charAt(i), in));
						in = s.indexOf(t.charAt(i), in) + 1;
					}
				}
			}
			int num;
			if (ans % mod == 0) {
				num = tmp.first();
				ans += num + 1;
			} else {
				if (tmp.ceiling((int) ans % mod) == null) {
					num = tmp.first();
				} else {
					num = tmp.ceiling((int) ans % mod);
				}
				if (num + 1 <= ans % mod) {
					ans = mod * ((ans + mod - 1) / mod) + num + 1;
				} else {
					ans = mod * (ans / mod) + num + 1;
				}
			}
		}
		System.out.println(ans);
	}
}
