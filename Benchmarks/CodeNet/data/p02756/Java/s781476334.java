import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		boolean reverse = false;
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int q = scan.nextInt();
			if (q == 1) {
				reverse = !reverse;
			} else {
				int f = scan.nextInt();
				String c = scan.next();
				if (f == 1) {
					if (!reverse) {
						sb1.insert(0, c);
					} else {
						sb2.append(c);
					}
				} else {
					if (!reverse) {
						sb2.append(c);
					} else {
						sb1.insert(0, c);
					}
				}
			}
		}

		StringBuffer sb = new StringBuffer();
		sb.append(sb1);
		sb.append(s);
		sb.append(sb2);
		if (reverse) {
			sb.reverse();
		}

		System.out.println(sb.toString());
		scan.close();
	}
}