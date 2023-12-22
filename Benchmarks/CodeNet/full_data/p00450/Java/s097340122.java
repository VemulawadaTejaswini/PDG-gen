import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int n;
		int a[];
		int count;

		n = Integer.valueOf(br.readLine());
		while (n != 0) {
			a = new int[n];
			count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.valueOf(br.readLine());
				if (i % 2 == 1) {
					f(a, i);
				}
			}
			for (int i = 0; i < n; i++) {
				count += a[i];
			}
			System.out.println(n - count);
			n = Integer.valueOf(br.readLine());
		}
	}

	public static void f(int a[], int n) {
		for (int i = n - 1; 0 <= i; i--) {
			if (a[i] == a[n]) {
				break;
			}
			a[i] = a[n];
		}
	}
}