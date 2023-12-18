import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			StringBuilder sb = new StringBuilder(scanner.next());
			int q = scanner.nextInt();
			boolean reverse = false;
			for (int i = 0; i < q; i++) {
				switch (scanner.nextInt()) {
				case 1:
					reverse = !reverse;
					break;
				case 2:
					int f = scanner.nextInt();
					String c = scanner.next();
					if (1 == f) {
						if (reverse) {
							sb.append(c);
						} else {
							sb.insert(0, c);
						}
					} else {
						if (reverse) {
							sb.insert(0, c);
						} else {
							sb.append(c);
						}
					}
				}
			}
			System.out.println((reverse ? sb.reverse() : sb).toString());
		}
	}
}
