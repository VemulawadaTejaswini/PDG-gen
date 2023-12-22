import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = -1000000000;
		int min = 1000000000;
		long total = 0;

		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
			total += a[i];
		}
		System.out.println(min + " " + max + " " + total);
	}
}