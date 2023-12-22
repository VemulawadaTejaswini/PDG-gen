import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long X = scanner.nextLong();
		long x = 100;
		long y = 0;
		long i = 1;

		while(x < X*100) {
			x *= 1.01;
			y = (long)Math.floor(x);
			if (y >= X) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}
