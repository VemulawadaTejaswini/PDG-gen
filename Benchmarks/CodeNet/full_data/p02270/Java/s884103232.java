import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.solv();
	}
	private void solv() {
		int n = in.nextInt();
		int k = in.nextInt();
		int[] w = new int[n];

		long total = 0;
		long max = 0;
		for (int i = 0; i < n; i++) {
			w[i] = in.nextInt();
			total += w[i];
			max = Math.max(max, w[i]);
		}

		while(max < total) {
			long m = (max + total) / 2;
			long sum = 0;
			int kId = 0;

			for(int i = 0; i < n && kId != k; i++) {
				if (sum + w[i] > m) {
					sum = w[i];
					kId++;
				} else {
					sum += w[i];
				}
			}
			if (kId != k) {
				total = m;
			} else {
				max = m + 1;
			}
		}
		out.println(max);
	}
}