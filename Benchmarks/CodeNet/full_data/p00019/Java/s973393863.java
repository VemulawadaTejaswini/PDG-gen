import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		try {
			n = new Scanner(System.in).nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		System.out.println(fractal(n));
	}

	static int fractal(int n) {
		if (n > 1)
			return n * fractal(n - 1);
		else
			return 1;
	}

}