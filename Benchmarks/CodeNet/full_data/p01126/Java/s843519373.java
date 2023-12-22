//package aoj2001;

import java.util.*;
import java.lang.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main (String args[]) {
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int a = scan.nextInt();
			if (n != 0) {
				solve(n, m, a);
			}
		}
	}

	static void solve(int n, int m, int a) {
		int[][] amida = new int[n+1][1001];
		int height = 1;
		for (int i = 0; i < m; i++) {
			int h = scan.nextInt();
			int p = scan.nextInt();
			int q = scan.nextInt();
			amida[p][h] = q;
			amida[q][h] = p;
			if (height < h) {
				height = h;
			}
		}

		for (int i = height; i >= 0; i--) {
			//System.out.println(amida[a][i]);
			if (amida[a][i] != 0) {
				a = amida[a][i];
			}
			//System.out.println(a);
		}
		System.out.println(a);
	}
}