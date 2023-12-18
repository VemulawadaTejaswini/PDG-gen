import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if(q == 1) {
				sb.reverse();
			} else {
				int q2 = sc.nextInt();
				if(q2 == 1) {
					sb.insert(0, sc.next());
				} else {
					sb.append(sc.next());
				}
			}
		}
		System.out.println(sb.toString());
	}
}
