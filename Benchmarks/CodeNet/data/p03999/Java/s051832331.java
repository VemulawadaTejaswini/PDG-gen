import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = pow2(s.length() - 1);
		long total = 0;
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(s);
			int idx = 1;
			int value = i;
			for (int j = 0; j < s.length() - 1; j++) {
				if (value % 2 == 1) {
					sb.insert(idx, 'x');
					idx++;
				}
				idx++;
				value /= 2;
			}
			String[] arr = sb.toString().split("x");
			for (String v : arr) {
				total += Long.parseLong(v);
			}
		}
		System.out.println(total);
	}
	
	static int pow2(int len) {
		if (len == 0) {
			return 1;
		} else {
			return 2 * pow2(len - 1);
		}
	}
}
