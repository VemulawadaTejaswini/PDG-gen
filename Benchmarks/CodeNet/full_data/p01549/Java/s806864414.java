import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.ArithmeticException;

import static java.lang.Integer.parseInt;

/**
 * Zero Division Checker
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		Map<String, Mono> vars = new HashMap<>();

		//
		int m = parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			words = br.readLine().split(" ");
			vars.put(
					words[0],
					main.new Mono(
							parseInt(words[1]),
							parseInt(words[2])
					)
			);
		}

		//parse
		int n = parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Exp> stack = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			String e = st.nextToken();
			if ("+-*/".contains(e)) {
				Exp a, b;
				Op op;
				b = stack.pop();
				a = stack.pop();
				switch (e) {
					case "+":
						op = main.new Add();
						break;
					case "-":
						op = main.new Subtract();
						break;
					case "*":
						op = main.new Multiply();
						break;
					case "/":
						op = main.new Divide();
						break;
					default:
						op = null;
						stack.push(main.new Bin(a, b, op));
				}
			} else {
				if (vars.containsKey(e)) {
					stack.push(vars.get(e));
				} else {
					stack.push(main.new Mono(parseInt(e)));
				}
			}
		}

		//solve
		Exp exp = stack.pop();
		try {
			exp.eval();
			System.out.println("correct");
		} catch (ArithmeticException e) {
			System.out.println("error");
		}
	}

	//Operator
	interface Op {
		int eval(int a, int b);
	}

	class Add implements Op {
		@Override
		public int eval(int a, int b) {
			return (a + b) % 256;
		}
	}

	class Subtract implements Op {
		@Override
		public int eval(int a, int b) {
			return (a - b + 256) % 256;
		}
	}

	class Multiply implements Op {
		@Override
		public int eval(int a, int b) {
			return (a * b) % 256;
		}
	}

	class Divide implements Op {
		@Override
		public int eval(int a, int b) {
			return (a / b) % 256;
		}
	}

	//
	interface Exp {
		Exp eval();

		int lb();

		int ub();
	}

	class Mono implements Exp {
		int lb, ub;

		Mono(int lb) {
			this(lb, lb);
		}

		Mono(int lb, int ub) {
			this.lb = lb;
			this.ub = ub;
		}

		public Mono eval() {
			return this;
		}

		public int lb() {
			return lb;
		}

		public int ub() {
			return ub;
		}
	}

	class Bin implements Exp {
		int lb = 256, ub = -1;
		Exp a, b;
		Op op;

		Bin(Exp a, Exp b, Op op) {
			this.a = a;
			this.b = b;
			this.op = op;
		}

		public Exp eval() {

			if (a instanceof Bin) a.eval();
			if (b instanceof Bin) b.eval();

			int alb = a.lb(), aub = a.ub();
			int blb = b.lb(), bub = b.ub();

			for (int i = alb; i <= aub; i++) {
				for (int j = blb; j <= bub; j++) {
					int r = op.eval(i, j);
					lb = Math.min(lb, r);
					ub = Math.max(ub, r);
				}
			}
			return new Mono(lb, ub);
		}

		public int lb() {
			return lb;
		}

		public int ub() {
			return ub;
		}
	}
}