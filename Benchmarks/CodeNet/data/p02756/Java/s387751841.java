import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		StringBuffer sb = new StringBuffer();

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		sb.append(s);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int q = scan.nextInt();
			if (q == 1) {
				sb.reverse();
			} else {
				int f = scan.nextInt();
				String c = scan.next();
				if (f == 1) {
					sb.insert(0, c);
				} else {
					sb.append(c);
				}
			}
		}

		System.out.println(sb.toString());
		scan.close();
	}
}