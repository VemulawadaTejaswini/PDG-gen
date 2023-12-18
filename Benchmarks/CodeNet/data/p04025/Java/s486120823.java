import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		int min = 100, max = -100;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		int center1 = (max - min) / 2 + min;
		int center2 = center1 + 1;
		int ans1 = 0;
		int ans2 = 0;
		for (int i = 0; i < n; i++) {
			ans1 += (int) Math.pow(a[i] - center1, 2);
			ans2 += (int) Math.pow(a[i] - center2, 2);
		}
		System.out.println(Math.min(ans1, ans2));
	}
}