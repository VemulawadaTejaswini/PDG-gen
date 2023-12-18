import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int ans = Integer.MAX_VALUE;
		for (int i = -100; i <= 100; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				int val = a[j] - i;
				val *= val;
				sum += val;
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
