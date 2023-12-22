import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	HashMap<String, Integer> map;
	String s;
	boolean unknown;

	void run() {
		map = new HashMap<String, Integer>();
		for (;;) {
			String s = sc.next();
			if (s.equals("END_OF_FIRST_PART")) {
				break;
			}
			int n = sc.nextInt();
			map.put(s, n);
		}
		for (;;) {
			s = sc.next();
			if (s.equals("0")) {
				break;
			}
			s += '\0';
			unknown = false;
			Result r = molecule(0);
			println(unknown ? "UNKNOWN" : r.value + "");
			debug(r.p, r.value);
		}
	}

	Result molecule(int p) {
		debug("molecule", p);
		Result r = new Result(p, 0);
		for (;;) {
			if (s.charAt(r.p) == '\0' || s.charAt(r.p) == ')') {
				return r;
			} else if (s.charAt(r.p) == '(') {
				Result r1 = molecule(r.p + 1);
				debug("MOLECULE", r1.p, r1.value);
				Result r2 = number(r1.p + 1);// skip '('
				debug("NUMBER", r2.p, r2.value);
				r.value += r1.value * r2.value;
				r.p = r2.p;
			} else {
				Result r1 = atom(r.p);
				debug("ATOM", r1.p, r1.value);
				Result r2 = number(r1.p);
				debug("NUMBER", r2.p, r2.value);
				r.value += r1.value * r2.value;
				r.p = r2.p;
			}
		}
	}

	Result atom(int p) {
		debug("atom", p);
		String atom = "";
		if (Character.isUpperCase(s.charAt(p))) {
			atom += s.charAt(p);
			p++;
			if (Character.isLowerCase(s.charAt(p))) {
				atom += s.charAt(p);
				p++;
			}
		}
		debug(atom);
		if (map.containsKey(atom)) {
			return new Result(p, map.get(atom));
		} else {
			unknown = true;
			debug("UNKNOWN", p, atom);
			return new Result(p, -1);
		}
	}

	Result number(int p) {
		debug("number", p);
		int value = 0;
		if (Character.isDigit(s.charAt(p))) {
			value = s.charAt(p) - '0';
			p++;
			if (Character.isDigit(s.charAt(p))) {
				value = value * 10 + s.charAt(p) - '0';
				p++;
			}
		} else {
			return new Result(p, 1);
		}
		return new Result(p, value);
	}

	class Result {
		int p, value;

		Result(int p, int value) {
			this.p = p;
			this.value = value;
		}
	}

	void debug(Object... os) {
		// System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}