
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static String solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < N; i++) {
			sb.append(s.charAt(i));
			sb.append(t.charAt(i));
		}
		return sb.toString();
	}
}
