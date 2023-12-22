import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max = -1000000000;
		int min = 100000000;
		long sum = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a > max) {
				max = a;
			}
			if (a < min) {
				min = a;
			}
			sum = sum + a;
		}
		System.out.println(min + " " + max + " " + sum);
	}

}

