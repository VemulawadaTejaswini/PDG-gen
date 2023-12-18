import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			s[i] = sort(s[i]);
		}
		HashMap<String, Long> map = new HashMap<String, Long>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(s[i])) {
				map.put(s[i], 1L);
			} else {
				map.put(s[i], map.get(s[i]) + 1);
			}
		}
		long ans = 0;
		for (String key : map.keySet()) {
			ans += map.get(key) * (map.get(key) - 1) / 2;
		}
		System.out.println(ans);
	}
	static String sort(String s) {
		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				char a = s.charAt(i);
				char b = s.charAt(j);
				if (a > b) {
					s = s.substring(0, i) + b + s.substring(i + 1, j) + a + s.substring(j + 1);
				}
			}
		}
		return s;
	}
}