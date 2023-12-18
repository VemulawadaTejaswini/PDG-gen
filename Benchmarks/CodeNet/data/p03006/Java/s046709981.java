import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		int combi = (n * n - n) / 2;

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}

		long[] a = new long[combi];
		long[] b = new long[combi];
		int tmp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				a[tmp] = x[i] - x[j];
				b[tmp] = y[i] - y[j];
				tmp++;
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < combi; i++) {
			int count = 0;
			for (int j = i; j < combi; j++) {
				if (a[i] == a[j] && b[i] == b[j]) {
					count++;
				}
			}
			list.add(count);
		}
		System.out.println(n - Collections.max(list));
	}
}