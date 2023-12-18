import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner in = new Scanner(System.in);
		final int a = in.nextInt(), b = in.nextInt();
		System.out.println((int) (Math.pow(100, a) * b));
	}
}
