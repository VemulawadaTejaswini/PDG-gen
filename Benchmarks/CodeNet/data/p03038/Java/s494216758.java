import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		long a[] = new long[n + 1];
		a[0] = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int b[][] = new int[2][m + 1];
		b[0][0] = 0;
		b[1][0] = 0;

		for (int i = 1; i <= m; i++) {
			b[0][i] = sc.nextInt();
			b[1][i] = sc.nextInt();
		}

Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
for (int i = 0; i < m; i++)
        map.put(b[1][i], b[0][i]);
int k = 0;
for (int key : map.keySet()) {
    b[1][k] = key;
    b[0][k++] = map.get(key);
}


		//System.out.println(b[0][m]);
		//System.out.println(b[1][m]);

		long ans = 0;
		int ahere = n;
		int bhere = m;
		for (int i = 1; i <= n; i++) {
			if (bhere >= 1) {
				if (b[1][bhere] > a[ahere]) {
					ans += b[1][bhere];
					//System.out.println("b" + b[1][bhere]);
					b[0][bhere]--;
					if (b[0][bhere] == 0) {
						bhere--;
					}
				} else {
					ans += a[ahere];
				//	System.out.println("a" + a[ahere]);
					ahere--;
				}
			} else {
				ans += a[ahere];
				//System.out.println("a" + a[ahere]);
				ahere--;
			}
		}
		System.out.println(ans);
	}
}