import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long first, k, d;
		first = Math.abs(stdIn.nextLong());
		k = stdIn.nextLong();
		d = stdIn.nextLong();

		if (first - d * k > 0)
			System.out.println(first - d * k);
		else if ((k - first / d) % 2 == 0)
			System.out.println(first - d * (first / d));
		else {
			if (Math.abs(first - d * (first / d + 1)) < Math.abs(first - d * (first / d)))
				System.out.println(Math.abs(first - d * (first / d + 1)));
			else if (k - first / d > 1)
				System.out.println(Math.abs(first - d * (first / d)));
			else
				System.out.println(Math.abs(first - d * (first / d + 1)));
		}
		stdIn.close();
	}
}
