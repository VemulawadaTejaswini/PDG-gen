import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int min = 10000000;
		int max = -10000000;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
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
