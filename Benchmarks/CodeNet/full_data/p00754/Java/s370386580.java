import java.util.Scanner;

/** AOJ_No.1173 ICPC_2011_B */
public class Main {
	public static int pos;
	public static String str;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			str = sc.nextLine();
			if(str.equals(".")) break;
			
			System.out.println(isBalanced());			
		}
	}

	public static String isBalanced() {
		pos = 0;
		
		boolean _return = true, _break = false;
		while(true) {
			char c = str.charAt(pos++);
			switch(c) {
			case '(':
				if(! (_return = paren()) ) _break = true;
				break;
			case '[':
				if(! (_return = bracket()) ) _break = true;
				break;
			case ')':
			case ']': return "no";
			default:
				if(c == '.') {
					return "yes";/* 正しい文章は必ずここを通る */
				} else {
					if(pos >= str.length()) return "no";
				}
				break;
			}
			if(_break) break;
		}
		
		if(_return)
			return "yes";/* this line is for compile */
		else
			return "no";
	}
	
	public static boolean paren() {
		if(pos >= str.length()) return false;
		
		boolean _return = true, _break = false;
		while(true) {
			char c = str.charAt(pos++);
			switch(c) {
			case '(':
				if(! (_return = paren()) ) return _return;
				break;
			case '[':
				if(! (_return = bracket()) ) return _return;
				break;
			case ')': return true;
			case ']': return false;
			default:
				if(pos >= str.length()) return false;
			}
			if(_break) break;
		}
		
		return _return;
	}
	
	public static boolean bracket() {
		if(pos >= str.length()) return false;
		
		boolean _return = true, _break = false;
		while(true) {
			char c = str.charAt(pos++);
			switch(c) {
			case '(':
				if(! (_return = paren()) ) return _return;
				break;
			case '[':
				if(! (_return = bracket()) ) return _return;
				break;
			case ')': return false;
			case ']': return true;
			default:
				if(pos >= str.length()) return false;
			}
			if(_break) break;
		}
		
		return _return;
	}
}

