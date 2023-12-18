import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int r = sc.nextInt();

		int min = 9999;

		for (int i = l; i < r; i++) {
			for (int j = i + 1; j <= r; j++) {
				int num = (i * j) % 2019;
				if (min > num) {
					min = num;
				}
			}
		}

		System.out.println(min);

	}

}
