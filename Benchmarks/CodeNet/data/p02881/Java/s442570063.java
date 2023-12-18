import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long A = scanner.nextLong();
		scanner.close();
		long min = A - 1;
		for (long i = A / 2; i >= A; i--) {
			if (A % i == 0) {
				long tmp = A / i;
				if (i + tmp - 2 < min) {
					min = i + tmp - 2;
					break;
				}
			}
		}
		System.out.println(min);

	}
}