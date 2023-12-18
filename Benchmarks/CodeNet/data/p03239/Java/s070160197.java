

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int T = Integer.parseInt(scan.next());
		int[] c = new int[N];
		int[] t = new int[N];
		for (int i = 0; i < N; i++) {
			c[i] = Integer.parseInt(scan.next());
			t[i] = Integer.parseInt(scan.next());
		}
		int min = 0;
		for (int i = 0; i < N; i++) {
			if (t[i] <= T) {
				if (min == 0) {
					min = c[i];
				} else {
					if (c[i] < min) {
						min = c[i];
					}
				}
			}
		}
		if (min == 0) {
			System.out.println("TLE");
		} else {
			System.out.println(min);
		}
	}
}
