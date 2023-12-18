import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int q = scanner.nextInt();

		boolean normal = true;
		boolean f;
		String c;
		for (int i = 0, t; i < q; i++) {
			t = scanner.nextInt();
			switch (t) {
			case 1:
				normal = !normal;
				break;
			case 2:
				f = scanner.nextInt() == 1;
				c = scanner.next();
				if (normal == f)
					s = c + s;
				else
					s += c;
			}
		}

		if (!normal)
			s = new StringBuilder(s).reverse().toString();

		System.out.println(s);
	}

}
