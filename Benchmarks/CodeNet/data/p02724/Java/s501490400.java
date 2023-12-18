import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int happiness = 0;

		if (0 < (x / 500) ) {
			happiness += 1000 * (x / 500);
			x = x % 500;
		}
		if (0 < (x / 5)) {
			happiness += 5 * (x / 5);
			x = x % 5;
		}

		System.out.println(happiness);

		scan.close();
	}

}
