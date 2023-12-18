import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[n];
		Integer[] b = new Integer[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(b, Comparator.reverseOrder());
		for(int i = 0 ; i < n ; i++) {
			if(a[n - 1] > b[i]) {
				System.out.println(i + (h + a[n - 1] - 1) / a[n - 1]);
				return;
			}
			h -= b[i];
			if(h <= 0) {
				System.out.println(i + 1);
				return;
			}
			if(i == n - 1) {
				int cnt = (h + a[n - 1] - 1) / a[n - 1];
				System.out.println(n + cnt);
				return;
			}
		}
	}

}
