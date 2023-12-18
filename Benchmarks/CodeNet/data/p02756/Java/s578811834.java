import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int q = scanner.nextInt();

		boolean normal = true;
		boolean f;
		String c;
		for (int i = 0 ; i < q; i++) {
			if (scanner.nextInt() == 2) {
				f = scanner.nextInt() == 1;
				c = scanner.next();
				if (normal == f)
					s = c + s;
				else
					s += c;
			} else
				normal = !normal;
		}

		if (!normal)
			s = new StringBuilder(s).reverse().toString();

		System.out.println(s);
	}

}
