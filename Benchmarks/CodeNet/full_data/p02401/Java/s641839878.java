import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while (true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if ("+".equals(op)) {
				ln(a + b);
			} else if ("-".equals(op)) {
				ln(a - b);
			} else if ("*".equals(op)) {
				ln(a * b);
			} else if ("/".equals(op)) {
				ln(String.format("%.8f", (double) a / b));
			} else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}