import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static String[] symbol = {"0","1","+","-","*","(",")"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int dots = 0;
		ArrayList<Integer> doti = new ArrayList<Integer>();
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i) == '.') {
				dots ++;
				doti.add(i);
			}
		}
		int[] p = new int[dots];
		
		int ans = -1;
		while(true) {
			String exp = new String(s);
			for(int i=0;i<dots;i++) {
				String a = exp.substring(0,doti.get(i));
				String b = exp.substring(doti.get(i)+1,exp.length());
				exp = a + symbol[p[i]] + b;
			}
			
			index = 0;
			int n = expression(exp);
			
			boolean next = true;
			if (dots == 0) {
				next = false;
			}
			for(int i=0;i<p.length;i++) {
				if (p[i]<6) {
					p[i]++;
					break;
				}else{
					if(i<p.length-1) {
						p[i] = 0;
					}else{
						next = false;
						break;
					}
				}
			}
			if (!next) {
				break;
			}
			
			ans = Math.max(ans,n);
		}
		System.out.println(ans);
	}
	
	public static int index = 0;
	public static int expression(String s) {
		return expression(s, false);
	}
	public static int expression(String s,boolean needconnective) {
		int n = term(s);
		boolean connective = false;
		while(index < s.length()) {
			if (s.charAt(index) == '+') {
				index++;
				if (index < s.length()) {
					n += number(s);
				}else{
					n = -1;
				}
				connective = true;
			}else if(s.charAt(index) == '-') {
				index++;
				if (index < s.length()) {
					n -= number(s);
				}else{
					n = -1;
				}
				connective = true;
			}else{
				break;
			}
			if (!(0 <= n && n < 2<<10)) {
				n = -1;
			}
		}
		if (needconnective && !connective) {
			return -1;
		}
		return n;
	}
	public static int term(String s) {
		int n = number(s);
		while(index < s.length()) {
			if (s.charAt(index) == '*') {
				index++;
				if (index < s.length()) {
					n *= number(s);
				}else{
					n = -1;
				}
			}else{
				break;
			}
			if (!(0 <= n && n < 2<<10)) {
				n = -1;
			}
		}
		return n;
	}
	public static int number(String s) {
		if (index >= s.length()) {
			return -1;
		}
		if (s.charAt(index) == '(') {
			index++;
			int n = expression(s,true);
			if (index >= s.length() || s.charAt(index) != ')') {
				return -1;
			}else{
				return n;
			}
		}
		char c0 = s.charAt(index);
		if (c0 != '0' && c0 != '1') {
			return -1;
		}
		int n = 0;
		while(index < s.length()) {
			char c = s.charAt(index);
			if (c == '0' || c == '1') {
				n*=2;
				n += c - '0';
				index++;
			}else{
				break;
			}
		}
		return n;
	}
}