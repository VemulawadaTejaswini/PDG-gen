import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = Arrays.copyOf(a, n);
		Arrays.sort(b);
		int max1 = b[n - 1];
		int max2 = b[n - 2];
		for (int i = 0; i < n; i++) {
			if (a[i] == max1) {
				System.out.println(max2);
			} else {
				System.out.println(max1);
			}
		}
	}
}
