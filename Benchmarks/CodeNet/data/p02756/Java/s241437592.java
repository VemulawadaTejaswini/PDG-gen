
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean hanten = false;
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				hanten = !hanten;
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if (f == 1) {
					if (hanten) {
						sb = sb.append(c);
					} else {
						sb = sb.insert(0, c);
					}
				} else {
					if (hanten) {
						sb = sb.insert(0, c);
					} else {
						sb = sb.append(c);
					}
				}
			}
		}
		if (hanten) {
			sb = sb.reverse();
		}
		System.out.println(sb.toString());
		sc.close();
	}
}