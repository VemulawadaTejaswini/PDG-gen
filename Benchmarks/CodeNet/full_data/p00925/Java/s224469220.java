import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String expr = s.nextLine();
		long answer = Long.parseLong(s.nextLine());
		long bobs = bobsAnswer(expr);
		long calc = calculate(expr);
		if (bobs == answer) {
			System.out.println(bobs == calc ? "U" : "L");
		} else {
			System.out.println(calc == answer ? "M" : "I");
		}
	}

	private static long calculate(String expr) {
		ArrayList<String> tokens = lex(expr);
		while(tokens.size() > 1) {
			boolean hasAst = false;
			for(int i = 0; i < tokens.size(); i++) {
				if (tokens.get(i).equals("*")) {
					long v = Long.parseLong(tokens.get(i-1)) * Long.parseLong(tokens.get(i+1));
					tokens.set(i, String.valueOf(v));
					tokens.remove(i+1);
					tokens.remove(i-1);
					hasAst = true;
					continue;
				}
			}
			if (hasAst) {
				continue;
			}
			long total = 0L;
			for(String token : tokens) {
				if ("+".equals(token)) {
					continue;
				}
				total += Long.parseLong(token);
			}
			return total;
		}
		return Long.parseLong(tokens.get(0));
	}

	private static ArrayList<String> lex(String expr) {
		ArrayList<String> tokens = new ArrayList<String>();
		String[] nums = expr.split("\\+|\\*");
		String[] symbol = expr.split("[0-9]+");
		for(int i = 1; i < symbol.length; i++) {
			tokens.add(nums[i-1]);
			tokens.add(symbol[i]);
		}
		tokens.add(nums[nums.length-1]);
		return tokens;
	}

	private static long bobsAnswer(String expr) {
		ArrayList<String> tokens = lex(expr);
		if (tokens.size() <= 1) {
			return Long.parseLong(tokens.get(0));
		}
		long total = Long.parseLong(tokens.get(0));
		for(int i = 1; i < tokens.size(); i+=2) {
			long next = Long.parseLong(tokens.get(i+1));
			if ("+".equals(tokens.get(i))) {
				total += next;	
			} else {
				total *= next;
			}
		}
		return total;
	}
	
}