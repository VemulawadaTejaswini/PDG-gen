
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();
		Integer d = sc.nextInt();
		Integer count = 0;

		for (Integer i = 0; i < n; i++) {
			Long x = sc.nextLong();
			Long y = sc.nextLong();

			Long z = x * x + y * y;
			if (z < 0) {
				z *= -1;
			}

			Double distance = Math.sqrt(z);

			if (distance <= d) {
				count++;
			}

		}

		System.out.println(count);

	}

}