
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) break;
			String[] ss = new String[m];
			for (int i = 0; i < m; i++) ss[i] = sc.next();
			solve(n, ss);
		}
	}
	
	void solve(int n, String[] ss) {
		P[] ps = new P[n];
		for (int i = 0; i < n; i++) ps[i] = new P();
		for (int i = 0; i < n; i++) {
			ps[i].next = ps[(i+1)%n];
			ps[i].prev = ps[(i-1+n)%n];
		}
		int died = 0;
		
		P current = ps[0];
		int num = 0;
		while (num < ss.length && n - died > 1) {
			String s = ss[num++];
			if (fizzbuzz(s, num)) {
				current = current.next;
			} else {
				died++;
				current.dead = true;
				current.next.prev = current.prev;
				current.prev.next = current.next;
				current = current.next;
			}
		}
		boolean first = true;
		for (int i = 0; i < n; i++) if (!ps[i].dead) {
			if (first) { first = false; } else System.out.print(" ");
			System.out.print(i+1);
		}
		System.out.println();
	}
	
	class P {
		boolean dead;
		P next;
		P prev;
	}
	
	boolean fizzbuzz(String s, int num) {
		if (num % 15 == 0) {
			return "FizzBuzz".equals(s);
		} else if (num % 3 == 0) {
			return "Fizz".equals(s);
		} else if (num % 5 == 0) {
			return "Buzz".equals(s);
		} else {
			try {
				int a = Integer.parseInt(s);
				return num == a;
			} catch (Exception e) {
				return false;
			}
		}
	}
}