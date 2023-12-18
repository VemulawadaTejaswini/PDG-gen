import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		String str = null;

		if ((a + b) == (c + d)) {
			str = "Balanced";
		} else if ((a + b) < (c + d)) {
			str = "Right";
		} else {
			str = "Left";
		}

		System.out.println(str);

	}
}
