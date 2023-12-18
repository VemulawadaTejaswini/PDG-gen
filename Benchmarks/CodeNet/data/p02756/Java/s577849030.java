package abc.abc158.d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int q = scanner.nextInt();

		String before = "";
		String after = "";

		boolean normal = true;
		boolean f;
		String c;
		for (int i = 0; i < q; i++) {
			if (scanner.nextInt() == 2) {
				f = scanner.nextInt() == 1;
				c = scanner.next();
				if (normal == f)
					before += c;
				else
					after += c;
			} else
				normal = !normal;
		}

		if (normal)
			System.out.println(new StringBuilder(before).reverse().toString() + s + after);
		else
			System.out.println(new StringBuilder(s + after) + before);

	}

}
