import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			int[] range_numbers = { sc.nextInt(), sc.nextInt() };
			int result = 0;
			for (int a = 1; a <= range_numbers[0]; a++) {
				for (int b = 1; b <= range_numbers[0]; b++) {
					if (a % b >= range_numbers[1]) result++;
				}
			}
			System.out.println(result);
		}
	}
}