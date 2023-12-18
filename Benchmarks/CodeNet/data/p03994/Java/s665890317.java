import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a') {
				continue;
			}
			int times = 'z' - c[i] + 1;
			if (k >= times) {
				c[i] = 'a';
				k -= times;
			} else {
				continue;
			}
		}
		if (k != 0) {
			k = k % 26;
			if (c[c.length - 1] + k > 122) {
				c[c.length - 1] = (char) (c[c.length - 1] + k - 26);
			} else {
				c[c.length - 1] = (char) (c[c.length - 1] + k);
			}
		}
		System.out.println(new String(c));
	}
}