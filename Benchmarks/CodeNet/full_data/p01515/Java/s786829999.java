import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int var;
	static char[] str;
	static int pos;

	public static void main(String[] arg) {
		while (true) {
			str = sc.next().toCharArray();
			if (str[0] == '#') break;
			pos = 0;
			Formula l = parse();
			++pos;
			Formula r = parse();
			boolean res = true;
			for (int i = 0; i < (1 << 11); ++i) {
				if (l.eval() != r.eval()) {
					res = false;
					break;
				}
			}
			System.out.println(res ? "YES" : "NO");
		}
	}

	static Formula parse() {
		char c = str[pos++];
		if (c == 'T') return new Constant(true);
		if (c == 'F') return new Constant(false);
		if ('a' <= c && c <= 'z') return new Var(c - 'a');
		if (c == '-') return new Not(parse());
		Formula l = parse();
		char op = str[pos++];
		if (op == '*') {
			Formula r = parse();
			++pos;
			return new And(l, r);
		} else if (op == '+') {
			Formula r = parse();
			++pos;
			return new Or(l, r);
		} else {
			++pos;
			Formula r = parse();
			++pos;
			return new Inc(l, r);
		}
	}

	static abstract class Formula {
		abstract boolean eval();
	}

	static class Constant extends Formula {
		boolean v;

		Constant(boolean v) {
			this.v = v;
		}

		boolean eval() {
			return this.v;
		}
	}

	static class Var extends Formula {
		int p;

		Var(int p) {
			this.p = p;
		}

		boolean eval() {
			return (var & (1 << p)) != 0;
		}
	}

	static class Not extends Formula {
		Formula f;

		Not(Formula f) {
			this.f = f;
		}

		boolean eval() {
			return !f.eval();
		}
	}

	static class And extends Formula {
		Formula left, right;

		And(Formula l, Formula r) {
			this.left = l;
			this.right = r;
		}

		boolean eval() {
			return left.eval() && right.eval();
		}
	}

	static class Or extends Formula {
		Formula left, right;

		Or(Formula l, Formula r) {
			this.left = l;
			this.right = r;
		}

		boolean eval() {
			return left.eval() || right.eval();
		}
	}

	static class Inc extends Formula {
		Formula left, right;

		Inc(Formula l, Formula r) {
			this.left = l;
			this.right = r;
		}

		boolean eval() {
			return !left.eval() || right.eval();
		}
	}

}