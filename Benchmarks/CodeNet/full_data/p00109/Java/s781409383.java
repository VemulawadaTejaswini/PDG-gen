import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	enum ope {

		add, sub, mul, div;

	}



	LinkedList<String> tokenize(String str) {

		String token = "";

		LinkedList<String> ret = new LinkedList<String>();

		String sp = "+-*/()=";

		for (char c : str.toCharArray()) {

			if (Character.isDigit(c)) {

				token += c;

			} else {

				if (sp.indexOf(c) != -1) {

					if (token.length() != 0)

						ret.addLast(token);

					ret.addLast(Character.toString(c));

					token = "";

				}

			}

		}

		return ret;

	}



	class evTree {

		ope o;

		String s;

		evTree left = null;

		evTree right = null;

		int val = 0;



		int getVal() {

			if (left == null && right == null) {

				return val;

			}

			if (o == ope.add) {

				// System.out.println(left.s +" add "+ right.s);

				return left.getVal() + right.getVal();

			}

			if (o == ope.sub) {

				// System.out.println(left.s +" sub "+ right.s);

				return left.getVal() - right.getVal();

			}

			if (o == ope.mul) {

				// System.out.println(left.s +" mul "+ right.s);

				return left.getVal() * right.getVal();

			}

			// if (o == ope.div) {

			// System.out.println(left.s +" div "+ right.s);

			return left.getVal() / right.getVal();

			// }

		}



		boolean evTrimable(LinkedList<String> t) {

			if (t.getLast().equals("="))

				return true;

			return t.getFirst().equals("(") && t.getLast().equals(")");

		}



		void evTrim(LinkedList<String> t) {

			if (t.getLast().equals("=")) {

				t.removeLast();

				return;

			}

			t.removeFirst();

			t.removeLast();

			return;

		}



		String tts(LinkedList<String> t) {

			String ret = "";

			for (String s : t) {

				ret += s;

			}

			return ret;

		}



		evTree(LinkedList<String> t) {

			s = tts(t);

			if (t.size() == 1) {

				this.val = Integer.valueOf(t.get(0));

				return;

			}

			if (t.size() == 0) {

				this.val = 0;

				return;

			}

			for (; evTrimable(t);)

				evTrim(t);

			int[] p = new int[t.size()];

			int depth = 1;

			int min = 100;

			for (int i = 0; i < t.size(); i++) {

				String token = t.get(i);

				if (Character.isDigit(token.toCharArray()[0]))

					continue;

				if (token.equals("(")) {

					depth += 2;

				}

				if (token.equals(")")) {

					depth -= 2;

				}

				if (token.equals("+") || token.equals("-")) {

					p[i] = depth;

				}

				if (token.equals("*") || token.equals("/")) {

					p[i] = depth + 1;

				}

			}

			int z = 0;

			for (int i = 0; i < t.size(); i++) {

				if (p[i] == 0)

					continue;

				if (p[i] < min) {

					min = p[i];

					z = i;

				}

			}

			String token = t.get(z);

			if (token.equals("+")) {

				this.o = ope.add;

			}

			if (token.equals("-")) {

				this.o = ope.sub;

			}

			if (token.equals("*")) {

				this.o = ope.mul;

			}

			if (token.equals("/")) {

				this.o = ope.div;

			}

			LinkedList<String> tl = new LinkedList<String>(t.subList(0, z));

			this.left = new evTree(tl);

			LinkedList<String> tr = new LinkedList<String>(t.subList(z + 1,

					t.size()));

			this.right = new evTree(tr);

		}

	}



	void run() {

		int n = Integer.valueOf(sc.nextLine());

		for (; n-- > 0;) {

			LinkedList<String> token = tokenize(sc.nextLine());

			for (String t : token) {

				System.out.println(t);

			}

			System.out.println(new evTree(token).getVal());

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}