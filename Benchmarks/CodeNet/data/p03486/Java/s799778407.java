import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		sc.close();
		char c1[] = s.toCharArray(), c2[] = t.toCharArray();

		for (int i = 1; i < s.length(); i++) {
			if (c1[i - 1] > c1[i]) {
				char cc = 'a';
				cc = c1[i - 1];
				c1[i - 1] = c1[i];
				c1[i] = cc;
			}
		}

		for (int i = 1; i < t.length(); i++) {
			if (c2[i - 1] < c2[i]) {
				char cc = 'a';
				cc = c2[i - 1];
				c2[i - 1] = c2[i];
				c2[i] = cc;
			}
		}

		String ss = new String(c1), tt = new String(c2);
		if (ss.compareTo(tt) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
