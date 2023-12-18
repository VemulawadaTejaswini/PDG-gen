import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
			a[i] = a[i] * 4 * m;
		}
		sc.close();

		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= sum) {
				cnt++;
			}
		}
		if (cnt >= m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
