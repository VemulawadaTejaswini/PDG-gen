// 61706535

import java.io.*;
import java.util.*;

public class Main {	
	public static class Parser {
		private final String str;
		private long ans;
		private int idx = 0;
		private final char[] ex012 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		private class InvalidExpressionException extends Exception {
			InvalidExpressionException(int idx) {
				super("around input[" + idx + "] : " + "Invalid expression");
			}
		}
		Parser(String str) {
			this.str = str + "$";
			try {
				this.ans = expr();
				if(this.str.charAt(idx) != '$') {
					throw new InvalidExpressionException(idx);
				}
			}
			catch(ArithmeticException e) {
				System.out.println("around input[" + idx + "] : " + e.getMessage());
				throw new IllegalStateException();
			}
			catch(InvalidExpressionException e) {
				System.out.println(e.getMessage());
				throw new IllegalStateException();
			}
		}
		long answer() {
			return this.ans;
		}
		long expr() throws InvalidExpressionException {
			long ret = term();
			while(true) {
				char c = str.charAt(idx);
				if(c == '$') {
					return ret;
				} else if(c == '+') {
					check('+');
					ret = Math.addExact(ret, term());
				} else if(c == '-') {
					check('-');
					ret = Math.subtractExact(ret, term());
				} else {
					return ret;
				}
			}
		}
		long term() throws InvalidExpressionException {
			long ret = fact();
			while(true) {
				char c = str.charAt(idx);
				if(c == '*') {
					check('*');
					ret = Math.multiplyExact(ret, fact());
				} else if(c == '/') {
					check('/');
					ret /= fact();
				} else {
					return ret;
				}
			}
		}
		long fact() throws InvalidExpressionException {
			char c = str.charAt(idx);
			if(c == '(') {
				check('(');
				long ret = expr();
				check(')');
				return ret;
			} else {
				return numb();
			}
		}
		long numb() throws InvalidExpressionException {
			long ret = 0;
			boolean flag = false;
			while(true) {
				char c = str.charAt(idx);
				if('0' <= c && c <= '9') {
					flag = true;
					ret = Math.multiplyExact(ret, 10);
					// ret *= 10;
					ret = Math.addExact(ret, Character.getNumericValue(c));
					// ret += Character.getNumericValue(c);
					check(ex012);
				} else {
					if(!flag) {
						throw new InvalidExpressionException(idx);
					}
					return ret;
				}
			}
		}
		void check(char expected) throws InvalidExpressionException  {
			char[] ex = {expected};
			check(ex);
		}
		void check(char[] expected) throws InvalidExpressionException {
			char got = str.charAt(idx);
			for(char c : expected){
				if(got == c) {
					idx++;
					return;
				}
			}
			throw new InvalidExpressionException(idx);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n > 0) {
			n--;
			String str = scan.next();
			str = str.substring(0, str.length() - 1);
			try {
				Parser parse = new Parser(str);
				System.out.println(parse.answer());
			}
			catch(IllegalStateException e) {}
			finally {
				continue;
			}
		}
	}
}

