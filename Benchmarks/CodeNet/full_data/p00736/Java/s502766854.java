
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
		Scanner sc = new Scanner(System.in);
		for (;;) {
			l = sc.next() + "=";
			if(l.equals(".=")) break;
			int cnt = 0;
			arg = new int[3];
			for (int p = 0; p < 3; p++) for (int q = 0; q < 3; q++) for (int r = 0; r < 3; r++) {
				this.p = 0;
				arg[0] = p;
				arg[1] = q;
				arg[2] = r;
//				debug(p, q, r, exp());
				if (exp() == 2) cnt++;
			}
			System.out.println(cnt);
		}
	}

	String l;
	int p;
	int[] arg;

	char next() {
		return l.charAt(p++);
	}

	int exp() {
		char c = next();
		if (c == '-') return not(exp());
		if (c == '(') {
			int a = exp();
			c = next();
			int b = exp();
			p++;
//			debug(a, b, c);
			if (c == '+') return add(a, b);
			return mult(a, b);
		}
		p--;
		return val();
	}

	int not(int x) {
		return 2 - x;
	}

	int mult(int x, int y) {
		return min(x, y);
	}

	int add(int x, int y) {
		return max(x, y);
	}

	int val() {
		char c = next();
		switch (c) {
		case 'P': return arg[0];
		case 'Q': return arg[1];
		case 'R': return arg[2];
		default:  return c - '0';
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}