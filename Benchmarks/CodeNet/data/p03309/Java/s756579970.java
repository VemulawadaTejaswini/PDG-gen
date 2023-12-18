import java.util.Scanner;
import java.lang.Math;
class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		int max, min;
		max = min = a[0] - 1;
		for (int j = 0; j < n; j++) {
			int s = Math.abs(a[j] - j - 1);
			if (max < s)
				max = s;
			if (min > s)
				min = s;
		}
		int abs1, abs2;
		abs1 = abs2 = 0;
		int t = max;
		int p = min;
		for (int l = 0; l < n; l++) {
			abs1 = abs1 + Math.abs(a[l] - l - 1 + t);
		}
		for (int l = 0; l < n; l++) {
			abs2 = abs2 + Math.abs(a[l] - l - 1 + p);
		}
		int abs = (abs1 < abs2) ? abs1 : abs2;
		System.out.println(abs);
	}
}
