import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;

import java.io.*;

public class Main {
	
	void solve(int N) {
		
		Random rand = new Random();
		rand.setSeed(System.nanoTime());
		
		final int MAX_STEP = 420;
		
		char[] as1 = "..##".toCharArray();
		char[] as2 = ".#.#".toCharArray();
		
		String s1 = "";
		String s2 = "";
		
		int[] order = {0, 1, 2, 3};
		int phase = 0;
		
		outer:
		for (int step = 0; step < MAX_STEP; step++){
			shuffle(order, rand);
			for (int i = 0; i < order.length; i++) { 
				String ns1, ns2;
				if (phase == 0) {
					ns1 = s1 + as1[order[i]];
					ns2 = s2 + as2[order[i]];
				} else {
					ns1 = as1[order[i]] + s1;
					ns2 = as2[order[i]] + s2;
				}
			
				System.out.println(ns1);
				System.out.println(ns2);
				System.out.flush();
			
				String response = sc.next();
				if (response.charAt(0) == 'T') {
					s1 = ns1;
					s2 = ns2;
					break;
				} else if (response.charAt(0) == 'F') {
					if (i + 1 == order.length) {
						phase++;
					}
				} else {
					break outer;
				}
			}
		}
		
	}
	

	void shuffle(int[] a, Random random) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int j = i + random.nextInt(n - i);
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	Scanner sc = null;
	public void run() throws Exception {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		solve(N);
		System.out.flush();
	}
}