import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long max = 0;
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		max = a[n-1] - a[0];
		System.out.println(max);
	}
}
