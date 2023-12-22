import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
			print(in);
	}

	private static void print(Scanner in) {
		int i = 0, n = in.nextInt();
		while (true) {
			if (n == 1) {
				System.out.printf("%.0f\n", pow(2, i));
				break;
			}
			if ((n & 1) == 1)
				System.out.printf("%.0f ", (n & 1) * pow(2, i));
			n >>= 1;
			i++;
		}
	}
}