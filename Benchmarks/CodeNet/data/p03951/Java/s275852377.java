import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		int m = Math.min(s.length() + t.length() - n, Math.min(s.length(), t.length()));

		for (int i = m; i >= 0; i--) {
			if (s.substring(s.length() - i).equals(t.substring(0, i))) {
				System.out.println(s.length() + t.length() - i);
				break;
			}
		}
	}
}
