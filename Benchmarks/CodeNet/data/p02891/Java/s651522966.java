import java.util.Scanner;

public class Main {

	static int conti = 0;
	static int fl = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.next().toCharArray();
		int n = Integer.parseInt(sc.next());
		calcConti(c);

		System.out.println((long) conti * n + fl);

	}

	static void calcConti(char[] c) {
		int count = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
				i++;
			}
		}
		conti = count;
		if (c[0] == c[c.length - 1] && conti != c.length) {
			fl = 2;
			for (int i = 0; i < c.length - 1; i++) {
				if (c[i] == c[i + 1]) {
					fl++;
				} else {
					break;
				}
			}
			for (int i = c.length - 1; i > 1; i--) {
				if (c[i] == c[i - 1]) {
					fl++;
				} else {
					break;
				}
			}
		}
		if (fl % 2 == 0 && fl != 0) {
			fl = 1;
		} else {
			fl = 0;
		}
	}

}
