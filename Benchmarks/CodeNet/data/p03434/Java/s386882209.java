import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int asum = 0;
		int bsum = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		Integer[] A = new Integer[n];
		for (int i = 0; i < n; i++) {
			A[i] = a[i];
		}
		Arrays.sort(A, Comparator.reverseOrder());
		for (int i = n-1; i >= 0; i--) {
			if (i%2==0) {
				asum += a[i];
			} else {
				bsum += a[i];
			}
		}
		System.out.println(asum-bsum);
	}
}
