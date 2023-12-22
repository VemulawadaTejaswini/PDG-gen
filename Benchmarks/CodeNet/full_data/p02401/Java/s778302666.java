import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String op = null;
		while (true) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			op = sc.next();
			int b = sc.nextInt();
			int ans;
			if (op.equals("?")) {
				break;
			} else {
				if (op.equals("+")) {
					ans = a + b;
				} else if (op.equals("-")) {
					ans = a - b;
				} else if (op.equals("/")) {
					if (b == 0) {
						sc.close();
					}
					ans = a / b;
				} else {
					ans = a * b;
				}
				System.out.println(ans);
			}
		}
	}
}

