
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt() * 100;
			int b = sc.nextInt() * 100;
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();

			int w = 0;
			int s = 0;
			int t = 0;

			float mw = (float)f * 100 / (100 + e);
			float ms = (float)f * e / (100 + e);

			do {
				if (b < mw - w) {
					w += b;
					t += b;
				} else if(a <= mw - w) {
					w += a;
					t += a;
				} else {
					break;
				}
			} while (w < mw);

			do {
				if (d < ms - s) {
					s += d;
					t += d;
				} else if (c <= ms - s) {
					s += c;
					t += c;
				} else {
					break;
				}
			} while(s < ms);
			System.out.println(t + " " + s);
		}
	}
}
