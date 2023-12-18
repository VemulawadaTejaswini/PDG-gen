import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		final int first_range = sc.nextInt(), second_range = sc.nextInt();
		int result = 0;
		for (int a = 1; a <= first_range; a++) {
			for (int b = 1; b <= first_range; b++) {
				if (a % b >= second_range) result++;
			}
		}
		System.out.println(result);
	}
}