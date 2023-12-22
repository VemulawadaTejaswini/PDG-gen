import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int r = 0;
		for (int i=0;i<k;i++) {
			r += a[i];
		}
		System.out.println(r);
	}
}
