import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			String t = sc.next();

			int a = Integer.parseInt(t.substring(0, 1));
			int b = Integer.parseInt(t.substring(1, 2));
			int c = Integer.parseInt(t.substring(2, 3));

			System.out.println(a + b + c);
		}
	}
}
