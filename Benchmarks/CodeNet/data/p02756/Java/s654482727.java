import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		boolean reverse = false;
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if(q == 1) {
				reverse = !reverse;
			} else {
				int q2 = sc.nextInt();
				if((!reverse && q2 == 1) || (reverse && q2 == 2)) {
					sb.insert(0, sc.next());
				} else {
					sb.append(sc.next());
				}
			}
		}
		if(reverse) sb.reverse();
		System.out.println(sb.toString());
	}
}