import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = "+";
		String m = "-";
		String w = "/";
		String k = "*";
		String n="?";
		while (true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if (op.equals(n)) {
				break;
			}

			if (op.equals(p)) {
				System.out.println(a + b);
			} else if (op.equals(m)) {
				System.out.println(a - b);
			} else if (op.equals(w)) {
				System.out.println(a / b);
			} else if (op.equals(k)) {
				System.out.println(a * b);
			}
		}
	}
}

