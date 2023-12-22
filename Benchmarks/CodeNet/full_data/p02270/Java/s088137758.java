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

		int total = 0;
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = in.nextInt();
			total += w[i];
		}
		int avg = total / k;

		int max = 0;
		int tmp = 0;
		for (int i = 0; i < n; i++) {
			tmp += w[i];
			if (avg <= tmp) {
				max = Math.max(max, tmp);
				tmp = 0;
			}
		}
		out.println(max);
	}
}