import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		Arrays.sort(a);
		int N = a[n - 1];
		int R = 0;
		double t = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			double diff = Math.abs((double)N / 2 - a[i]);
			if (diff < t) {
				t = diff;
				R = a[i];
			}
		}
		System.out.println(N + " " + R);
	}
}