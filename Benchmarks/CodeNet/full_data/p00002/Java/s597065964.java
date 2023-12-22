import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	static int Count(int x) {
		/*
		 * int y = 0; float z = (float)x; while (z >= 1.0) { y++; z = z/10; }
		 */
		int y = (int) Math.log10(x) + 1;
		return y;

	}

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			try {
				if (!scan.hasNext())
					return;
				int a = scan.nextInt();
				int b = scan.nextInt();
				int x = Count(a + b);
				System.out.println(x);
			} catch (InputMismatchException e) {
				return;
			} catch (NoSuchElementException w) {
				return;
			}
		}
	}

}