import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int a = sc.nextInt();
		int b = sc.nextInt();

		String u = sc.next();

		if (s.equals(u)) {
			System.out.println(a - 1);
			System.out.println(b);
		} else if (t.equals(u)) {
			System.out.println(a);
			System.out.println(b - 1);
		}

	}
}