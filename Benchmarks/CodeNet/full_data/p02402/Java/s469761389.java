import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long min = 1000000;
		long max = -1000000;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < n; i++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
			sum += a[i];
		}
		System.out.println(min + " " + max + " " + sum);
		sc.close();
	}
}
