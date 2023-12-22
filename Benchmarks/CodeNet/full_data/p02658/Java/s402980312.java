import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] list = new int[n];

		long max = 1000000000000000000l;
		long sum = 1L;

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {

			max /= list[i];

			if (max == 0) {
				System.out.println("-1");
				return;
			}

			sum *= list[i];
			sc.close();
		}

		System.out.println(sum);
	}
}