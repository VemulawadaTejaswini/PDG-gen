import java.util.*;
public class Main {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, temp;
		try {
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.err.println("不正な入力");
			System.exit(1);
		}
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}