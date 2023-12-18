import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] c = new int [N];
		int[] t = new int[N];
		int p = 1100;
		for (int i = 0; i < N ; i++) {
			int j = i + 1;
			c[j] = sc.nextInt();
			t[j] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int j = i +1;
			if (t [j] <= T) {
				if (c[j] < p) {
					p = c[j];
				}
			}
		}
		if (p == 1100) {
			System.out.println ("TLE");
		} else {
			System.out.println(p);
		}
	}
}