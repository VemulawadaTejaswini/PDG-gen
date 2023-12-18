
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			long result = 0;
			int before = Integer.MAX_VALUE;
			for (int i = 0; i < n - 1; i++) {
				int b = sc.nextInt();
				result += b < before ? b : before;
				before = b;
			}
			result += before;
			System.out.println(result);
		}
	}
}
