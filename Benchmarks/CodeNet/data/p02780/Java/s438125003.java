import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		int max = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i < k - 1) {
				sum += a[i];
				continue;
			}

			sum += a[i];
			max = Math.max(max, max);
			sum -= a[i - k + 1];
		}
		System.out.println((max - k) * 0.5 + k);
	}

}
