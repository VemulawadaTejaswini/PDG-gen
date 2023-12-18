import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int T1 = 1;
		final int T2 = 2;

		final int F1 = 1;
		final int F2 = 2;

		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s);

		int q = sc.nextInt();

		for(int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if(t == T1) {
				sb.reverse();
			} else if(t == T2) {
				int f = sc.nextInt();
				String c = sc.next();
				if(f == F1) {
					sb.insert(0, c);
				} else if(f == F2) {
					sb.append(c);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
