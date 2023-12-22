import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int num = sc.nextInt();

			if (num == 0) {
				break;
			}
			int sum = sc.nextInt();
			int max = sum;

			for (int i = 1; i < num; i++) {
				int n = sc.nextInt();

				if (sum + n < sum) {
					sum = n;
				} else {
					sum = sum + n;
				}
				max = Math.max(max, sum);
			}
			System.out.println(max);
		}

	}

}