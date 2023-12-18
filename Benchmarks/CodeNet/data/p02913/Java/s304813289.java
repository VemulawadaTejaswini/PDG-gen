import java.util.*;
import java.lang.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		Map<Integer, Integer> h = new HashMap<>();
		int B = 100000007;
		for (int len = s.length - 1; len >= 1; len--) {
			h.clear();
			int t = 1;
			int current = 0;
			for (int i = 0; i < len; i++) {
				t *= B;
				current = (current * B) + s[i];
			}
			h.put(current, len - 1);
			for (int i = 0; i + len < s.length; i++) {
				current = current * B + s[i + len] - s[i] * t;
				if (h.containsKey(current) && h.get(current) <= i) {
					System.out.println(len);
					return;
				}
				h.put(current, i + len - 1);
			}
		}

		System.out.println(0);
	}
}
