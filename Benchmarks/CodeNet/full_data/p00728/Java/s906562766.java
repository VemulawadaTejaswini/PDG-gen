import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n != 0) {
			int i = 0;
			int[] a = new int[n];
			for (i = 0; i <= n - 1; i++) {
				int j = s.nextInt();
				a[i] = j;

			}
			int max = 0;
			int min = 1000;
			int sum = 0;
			for (i = n - 1; i >= 0; i--) {
				if (a[i] > max) {
					max = a[i];
				} else if (a[i] < min) {
					min = a[i];
				}
				sum += a[i];
			}
			sum -= max;
			sum -= min;
			int point = sum / (n - 2);
			System.out.println(point);
			n = s.nextInt();
		}
	}
}