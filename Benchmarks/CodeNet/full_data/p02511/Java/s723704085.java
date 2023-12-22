import java.util.*;

class A implements Runnable {
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in).useDelimiter("[\\s:]");
		for (int n = sc.nextInt(); n > 0; n = sc.nextInt()) {
			int Ln = 0, Ld = 0, Dn = 0, Dd = 0, Mn = 0, Md = 0;
			for (int i = 0; i < n; i++) {
				int h = sc.nextInt();
				int m = (-sc.nextInt() + sc.nextInt() + 60) % 60;
				if (11 <= h && h < 15) {
					Ld++;
					if (m <= 8)
						Ln++;
				}
				if (18 <= h && h < 21) {
					Dd++;
					if (m <= 8)
						Dn++;
				}
				if (21 <= h && h < 24 || h < 2) {
					Md++;
					if (m <= 8)
						Mn++;
				}
			}
			System.out.println("lunch " + format(Ln, Ld));
			System.out.println("dinner " + format(Dn, Dd));
			System.out.println("midnight " + format(Mn, Md));
		}
	}

	String format(int n, int d) {
		if (d == 0)
			return "no guest";
		return "" + (100 * n / d);
	}
}

public class Main {
	public static void main(String[] args) {
		new A().run();
	}
}