
import java.io.*;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
import static java.lang.Character.*;

class AOJ2010 {
	int points, ace;
	boolean hasTenPointsCard;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); sc.nextLine();
		while(N-- > 0) {
			char[] s = sc.nextLine().toCharArray();
			char[] t = sc.nextLine().toCharArray();
			ace = 0;
			points = 0;
			hasTenPointsCard = false;
			for(int i = 0; i < s.length; i += 2)
				point(s[i]);

			boolean bust = false;
			boolean bj = false;
			for(int i = 0;; i += 2) {
				if(points == 21 && ace == 1 && hasTenPointsCard) {
					bj = true;
					break;
				}
				if(i == t.length || points > 16 && ace == 0)
					break;

				point(t[i]);

				if(points > 21) {
					bust = true;
					break;
				}
			}
			System.out.println(bj ? "blackjack" : bust ? "bust" : points);
		}
	}
	void point(char c) {
		if(isDigit(c))
			points += c - '0';
		else if(c == 'A') {
			points += 11;
			ace++;
		}
		else {
			points += 10;
			hasTenPointsCard = true;
		}
		while(ace > 0 && points > 21) {
			ace--;
			points -= 10;
		}
	}
}

public class Main {
	public static void main(String... args) {
		new AOJ2010().run();
	}

	public static void debug(Object... os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}

class Scanner {
	final java.util.Scanner sc;

	public double nextDouble() {
		return Double.parseDouble(sc.next());
	}

	public Scanner(java.io.InputStream is) {
		this.sc = new java.util.Scanner(is);
	}

	public boolean hasNext() {
		return sc.hasNext();
	}

	public String next() {
		return sc.next();
	}

	public int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public String nextLine() {
		return sc.nextLine();
	}

	public long nextLong() {
		return Long.parseLong(sc.next());
	}
}