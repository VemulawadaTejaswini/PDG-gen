import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int D = s.nextInt();
		int x = s.nextInt();

		for (int i = 1; i <= 10; i++) {
			x = r * x - D;
			System.out.println(x);
		}

	}
}