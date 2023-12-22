import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] p = new int[n];
			long[] c = new long[n];
			int[] next = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				next[i] = p[i];
			}
			for (int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
			}
			long max = Long.MIN_VALUE;
			long[] score = new long[n];
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < n; j++) {
					int nxt = p[next[j] - 1];
					next[j] = nxt;
					score[j] += c[nxt - 1];
					max = Math.max(max, score[j]);
				}
			}
			System.out.print(max);
		}
	}
}