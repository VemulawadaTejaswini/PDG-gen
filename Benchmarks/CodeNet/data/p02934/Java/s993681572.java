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

		double ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += 1.0 / a[i];
		}
		System.out.println(1 / ans);
	}
}
