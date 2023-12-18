import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		long count = 0;
		for (int i = k; i <= n + 1; i++) {
			long min = 0;
			long max = 0;
			for (int j = 1; j <= i; j++) {
				min += (j - 1);
				max += (n - j + 1);
			}
			count += (max - min + 1);
			if (count > 1_000_000_007) {
				count = count % 1_000_000_007;
			}
		}
		System.out.println(count);
	}

}
