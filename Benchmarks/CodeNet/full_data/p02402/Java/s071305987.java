import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 0;
		int max = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(sc.next());
			if (num <= min || i == 0) {
				min = num;
			}
			if (max <= num || i == 0) {
				max = num;
			}
			sum += num;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}