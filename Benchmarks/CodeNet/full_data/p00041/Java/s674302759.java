import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			List<Integer> ints = new ArrayList<>();
			ints.add(in.nextInt());
			ints.add(in.nextInt());
			ints.add(in.nextInt());
			ints.add(in.nextInt());
			if(ints.get(0) == 0) return;
			System.out.println(solve(ints, 0, 0,0, ""));
		}
	}

	/**
	 * http://dai1741.github.io/maximum-algo-2012/docs/parsing/
	 */
	static class Calc {
		int i;
		String s;
		private static final Map<String, Integer> opPriority = new HashMap<String, Integer>() {
			{
				put("+", 2);
				put("-", 2);
				put("*", 3);
				put("(", 3);
				put(")", 3);
			}
		};

		public boolean isOperator(String token) {
			return opPriority.containsKey(token);
		}

		public int calc(String exp) throws Exception {
			i=0;
			s = exp;
			return expr();
		}

		public int expr() throws Exception {
			int val = term();
			while(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
				char op = s.charAt(i);
				i++;
				int val2 = term();
				if (op == '+') val += val2;
				else val -= val2;
			}
			return val;
		}

		public int term() throws Exception {
			int val = factor();
			while(i < s.length() && s.charAt(i) == '*') {
				char op = s.charAt(i);
				i++;
				int val2 = factor();
				val *= val2;
			}
			return val;
		}

		public int factor() throws Exception {
			if(Character.isDigit(s.charAt(i))) {
				return number();
			}

			if(s.charAt(i) != '(') {
				new Exception();
			}
			i++;
			int ret = expr();
			if(s.charAt(i) != ')') {
				new Exception();
			}
			i++;
			return ret;
		}

		public int number() throws Exception {
			int n = Integer.parseInt(""+s.charAt(i));
			i++;
			while(i < s.length() && Character.isDigit(s.charAt(i))) {
				n = n * 10 + Integer.parseInt(""+s.charAt(i));
				i++;
			}
			return n;
		}
	};

	public static String solve(List<Integer> ints, int used, int lb, int rb, String exp) {
		String ret = "0";
		String ret2;
		if(lb+rb >= 6) return "0";
		if(used == 15) {
			while(lb > rb) {
				exp+=")";
				rb++;
			}
			try {
				if(new Calc().calc(exp) == 10) return exp;
				else return "0";
			} catch (Exception e) {
				return "0";
			}
		}
		if(lb <= 2) {
			ret2 = solve(ints, used, lb + 1, rb, exp + "(");
			if(ret2.equals(ret) == false) return ret2;
		}
		for(int i=0;i<ints.size();i++) {
			if ( (used & (int)Math.pow(2, i)) == 0 &&
					(exp.length() <= 0 ||
					!Character.isDigit(exp.charAt(exp.length() - 1)) && exp.charAt(exp.length()-1) != ')')) {
				int buf = used | (int)Math.pow(2, i);
				ret2 = solve(ints, buf, lb,rb, exp + ints.get(i));
				if(ret2.equals(ret) == false) return ret2;
			}
		}
		char prev = exp.length() <= 0 ? '(' : exp.charAt(exp.length()-1);
		if(!(prev == '(' || prev == '+' || prev == '-' || prev == '*')) {
			ret2 = solve(ints, used, lb, rb, exp + "+");
			if(ret2.equals(ret) == false) return ret2;
			ret2 = solve(ints, used, lb, rb, exp + "-");
			if(ret2.equals(ret) == false) return ret2;
			ret2 = solve(ints, used, lb, rb, exp + "*");
			if(ret2.equals(ret) == false) return ret2;
		}
		if(lb > rb && (exp.length() <= 0 || Character.isDigit(exp.charAt(exp.length()-1)))) {
			ret2 = solve(ints, used, lb, rb + 1, exp + ")");
			if(ret2.equals(ret) == false) return ret2;
		}
		return ret;
	}
}