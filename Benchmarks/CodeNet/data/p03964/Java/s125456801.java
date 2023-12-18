import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		long x = t[0], y = a[0];
		for(int i = 1 ; i < n ; i++) {
			long min = Math.max((x + t[i] - 1) / t[i], (y + a[i] - 1) / a[i]);
			x = t[i] * min;
			y = a[i] * min;
		}
		System.out.println(x + y);
	}
}
