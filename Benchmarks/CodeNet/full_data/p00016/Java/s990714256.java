import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		double x, y;
		String st;
		int tmp;

		a = 0;
		b = 0;
		x = 0.0;
		y = 0.0;
		tmp = 0;
		st = sc.next();
		for (int i = 0; i < st.length(); i++) {
			a *= 10;
			a += st.charAt(i) - '0';
			if (st.charAt(i + 1) == ',') {
				if (st.charAt(i + 2) != '-') {
					for (int j = i + 2; j < st.length(); j++) {
						b *= 10;
						b += st.charAt(j) - '0';
					}
				} else {
					for (int j = i + 3; j < st.length(); j++) {
						b *= 10;
						b -= st.charAt(j) - '0';
					}
				}
				break;
			}
		}
		while (a + b != 0) {
			x += a * Math.sin(Math.toRadians(tmp));
			y += a * Math.cos(Math.toRadians(tmp));

			st = sc.next();
			tmp += b;
			a = 0;
			b = 0;
			for (int i = 0; i < st.length(); i++) {
				a *= 10;
				a += st.charAt(i) - '0';
				if (st.charAt(i + 1) == ',') {
					if (st.charAt(i + 2) != '-') {
						for (int j = i + 2; j < st.length(); j++) {
							b *= 10;
							b += st.charAt(j) - '0';
						}
					} else {
						for (int j = i + 3; j < st.length(); j++) {
							b *= 10;
							b -= st.charAt(j) - '0';
						}
					}
					break;
				}
			}
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}