
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long sum = 0;
		int count = 0;
		while (n-- > 0) {
			sum += scanner.nextLong();
			count++;
		}
		System.out.println(sum / count);
	}
}