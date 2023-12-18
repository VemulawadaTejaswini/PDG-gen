import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int max = 0;

		int sum = 0;

		for (int i = 0; i < n; i++) {

			int l = sc.nextInt();

			if (l > max) {
				max = l;
			}

			sum += l;

		}

		sum -= max;

		if (sum <= max) {

			System.out.println("No");

		} else {

			System.out.println("Yes");
		}


		sc.close();
	}

}
