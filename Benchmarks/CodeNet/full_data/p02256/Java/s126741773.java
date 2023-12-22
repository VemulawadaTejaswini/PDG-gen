
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int max = 1;

		for (int i = 2; i <= y; i+=2) {
			if (x % i == 0 && y % i == 0) {
				max = i;
			}
		}

		System.out.println(max);
	}

}

