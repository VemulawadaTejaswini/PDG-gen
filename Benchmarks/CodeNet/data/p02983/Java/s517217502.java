import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int r = sc.nextInt();

		int min = 2018;
		for (int i = l; i < r; i++) {
			for (int j = l + 1; j <= r; j++) {
				int tmp = i * j % 2019;
				if (tmp < min) {
					min = tmp;
				}
			}
		}

		System.out.println(min);

		sc.close();
	}
}
