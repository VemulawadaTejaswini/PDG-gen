
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		sc.close();
		int count = 0;

		for (int i = 1; i <= K; i = i + 2) {
			for (int j = 2; j <= K; j = j + 2) {
				count++;
			}
		}

		System.out.println(count);

	}
}