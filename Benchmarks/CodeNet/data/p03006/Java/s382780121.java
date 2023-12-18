import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int p, q, cnt, min = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					p = x[i] - x[j];
					q = y[i] - y[j];
					cnt = n;
					for (int k = 0; k < n; k++) {
						for (int l = 0; l < n; l++) {
							if (x[k] - x[l] == p && y[k] - y[l] == q) {
								cnt--;
							}
						}
					}
					min = Math.min(min, cnt);
				}
			}
		}
		System.out.println(min);
	}
}
