import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Equation
 */
public class Main {

	static enum OP {NOT, AND, OR, IMP}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("#")) break;

			//parse
			Var var = main.new Var();
			int max = -1;
			Exp lside = null;
			Exp rside = null;

			for (String side : line.split("=")) {
				
				Deque<OP> ops = new ArrayDeque<>();
				Deque<Exp> exps = new ArrayDeque<>();
				Deque<Character> signs = new ArrayDeque<>();

				for (int i = 0; i < side.length(); i++) {

					char c = side.charAt(i);
					boolean mono = false;

					switch (c) {
						case '(':
							signs.add(c);
							break;
						case ')': {
							OP op = ops.pollLast();
							Exp s = exps.pollLast();
							Exp f = exps.pollLast();
							exps.add(main.new Exp(op, f, s));
							signs.pollLast();
							mono = true;
						}
						break;
						case '*':
							ops.add(OP.AND);
							break;
						case '+':
							ops.add(OP.OR);
							break;
						case '-':
							if (side.charAt(i + 1) == '>') {
								ops.add(OP.IMP);
								i++;//skip '>'
							} else {
								ops.add(OP.NOT);
								signs.add(c);
							}
							break;
						default: {
							exps.add(main.new Exp(c, var));
							mono = true;
							if (c != 'T' | c != 'F') {
								max = Math.max(max, c - 'a');
							}
						}
					}
					//monominal?
					if (mono) {
						if (signs.peekLast() != null && signs.peekLast() == '-') {
							OP op = ops.pollLast();
							Exp f = exps.pollLast();
							exps.add(main.new Exp(op, f));
							signs.pollLast();
						}
					}
				}
				if (lside == null) {
					lside = exps.poll();
					exps.clear();
				} else {
					rside = exps.poll();
					exps.clear();
				}
			}

			//solve
			boolean ans = true;
			for (int i = 0; i < 1 << (max + 1); i++) {
				var.substitution(i);
				ans &= (lside.value() == rside.value());
			}
			System.out.println(ans ? "YES" : "NO");

		}//end while
	} //end main

	class Var {

		//a..k
		boolean[] values = new boolean[11];

		void substitution(int values) {
			for (int i = 0; i < this.values.length; i++) {
				if ((values & 1 << i) == 1) {
					this.values[i] = true;
				} else {
					this.values[i] = false;
				}
			}
		}

		boolean value(char name) {
			boolean ret = false;
			switch (name) {
				case 'T':
					ret = true;
					break;
				case 'F':
					ret = false;
					break;
				default:
					ret = values[name - 'a'];
			}
			return ret;
		}
	}

	class Exp {

		OP op;
		Exp f, s;
		char name;
		Var var;

		Exp(OP op, Exp f, Exp s) {
			this.op = op;
			this.f = f;//first term
			this.s = s;//second term
		}

		Exp(OP op, Exp F) {
			this.op = op;
			this.f = F;
		}

		Exp(char name, Var var) {
			this.name = name;
			this.var = var;
		}

		boolean value() {
			boolean ret = false;
			if (var != null) {
				ret = var.value(name);
			} else {
				switch (op) {
					case NOT:
						ret = !f.value();
						break;
					case AND:
						ret = f.value() && s.value();
						break;
					case OR:
						ret = f.value() || s.value();
						break;
					case IMP:
						if (!f.value() | s.value()) ret = true;
				}
			}
			return ret;
		}
	}
}