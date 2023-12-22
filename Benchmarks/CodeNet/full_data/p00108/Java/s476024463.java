import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	int[] ope(int[] s) {

		int[] ret = new int[s.length];

		for (int i = 0; i < s.length; i++) {

			for (int j = 0; j < s.length; j++) {

				if (s[i] == s[j]) {

					ret[i]++;

				}

			}

		}

		return ret;

	}



	boolean equ(int[] a, int[] b) {

		int i = a.length;

		for (int j = 0; j < i; j++) {

			if (a[j] != b[j])

				return false;

		}

		return true;

	}

	String p(int[]a){

		String r = "";

		for(int i:a){

			r += " "+i;

		}

		return r.trim();

	}

	void run() {

		for (;;) {

			int n = sc.nextInt();

			if (n == 0) {

				break;

			}

			int[] s = new int[n];

			for (int i = 0; i < n; i++) {

				s[i] = sc.nextInt();

			}

			int[] pre = s.clone();

			int[] now = ope(s);

			int t = 0;

			for (; !equ(pre, now);) {

				t++;

				pre = now.clone();

				now = ope(pre);

			}

			System.out.println(t);

			System.out.println(p(now));

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}