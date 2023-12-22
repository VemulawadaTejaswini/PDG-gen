
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		System.out.println(solve());
	}
	
	String solve() {
		Scanner sc = new Scanner(System.in);
		s = sc.next() + "="; long ans = sc.nextLong();
		long a = add();
//		debug(a);
		p = 0;
		long b = num();
		char c = next();
		while (c != '=') {
			long d = num();
			if (c == '*') b *= d;
			else b += d;
			c = next();
		}
		if (a == ans && b == ans) return "U";
		if (a == ans) return "M";
		if (b == ans) return "L";
		return "I";
	}
	
	String s; int p;
	char next() {
		return s.charAt(p++);
	}
	
	long add() {
		long a = mlt();
		char c = next();
		while (c == '+') {
			long b = mlt();
			a += b;
			c = next();
		}
		p--;
		return a;
	}
	
	long mlt() {
		long a = num();
		char c = next();
		while(c == '*') {
			long b = num();
			a *= b;
			c = next();
		}
		p--;
		return a;
	}
	
	long num(){
		return next() - '0';
	}
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}