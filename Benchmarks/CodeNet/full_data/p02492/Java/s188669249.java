import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, ans = 0;
		String op;
		a = sc.nextInt();
		op = sc.next();
		b = sc.nextInt();
		while (!op.equals("?")) {
			if (op.equals("+")) {
				ans = a + b;
			}else if (op.equals("-")) {
				ans = a - b;
			}else if (op.equals("*")) {
				ans = a * b;
			}else if (op.equals("/")) {
				ans = a / b;
			}
			System.out.println(ans);
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		}
	}
}