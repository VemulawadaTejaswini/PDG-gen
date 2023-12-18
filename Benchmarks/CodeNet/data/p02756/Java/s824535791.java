import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean hanten = false;
		String mae = "";
		String ato = "";
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				hanten = !hanten;
			} else {
				if (hanten) {
					sb = sb.insert(0, mae);
					sb = sb.append(ato);
					mae = "";
					ato = "";
					sb = sb.reverse();
					hanten = false;
				}
				int f = sc.nextInt();
				String c = sc.next();
				if (f == 1) {
					mae = c + mae;
					// sb = sb.insert(0, c);
				} else {
					ato = ato + c;
					// sb = sb.append(c);
				}
			}
		}
		sb = sb.insert(0, mae);
		sb = sb.append(ato);
		if (hanten) {
			sb = sb.reverse();
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
