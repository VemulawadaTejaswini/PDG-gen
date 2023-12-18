import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sum = new int[201];
		sum[1] = 1;
		for (int i = 2; i <= n; i++) {
			sum[i]+= sum[i-1];
			for (int j = 1; j <= i ; j++) {
				for (int k = 1; k <= i ; k++) {
					for (int l = 1; l <= i; l++) {
						if (j == i || k == i || l ==i) {
							sum[i] += gcd(j,k,l);
						}
					}
				}
			}
		}
		System.out.println(sum[n]);
	}

	private static int gcd(int a, int b, int c) {
		int min = Math.min(a, b);
		min = Math.min(min, c);
		if (min == 1) {
			return 1;
		}

		int gys = 1;
		for (int i = min; i >= 2; i--) {
			if (a % i ==0 && b%i ==0 && c %i ==0) {
				return i;
			}
		}
		return gys;
	}
}
