import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.next();
			if (s.equals("#")) {
				break;
			}
			if (isEquation(s)) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

	public static boolean isEquation(String s) {
		for(int i=0;i<(1<<10);i++) {
			String s2 = String.valueOf(s);
			for(int j=0;j<10;j++) {
				if ((i&(1<<j))>0) {
					s2 = s2.replaceAll(String.valueOf((char) ('a'+j)), "T");
				}else{
					s2 = s2.replaceAll(String.valueOf((char) ('a'+j)), "F");
				}
			}
			String[] exp = s2.split("=");
			if (evaluate(exp[0])!=evaluate(exp[1])) {
				return false;
			}
		}
		return true;
	}

	public static int index = 0;
	public static boolean evaluate(String s) {
		index = 0;
		boolean ret = expression(s);
		return ret;
	}

	public static boolean expression(String s) {
		char c = s.charAt(index);
		if (c == 'T' || c == 'F') {
			index++;
			return c == 'T';
		}
		if (c == '-') {
			index++;
			return !expression(s);
		}
		if (c == '(') {
			index++;
			boolean temp = term(s);
			index++;
			return temp;
		}
		return false;
	}

	public static boolean term(String s) {
		boolean first = expression(s);
		char c = s.charAt(index);
		index += c == '-' ? 2 : 1;
		boolean second = expression(s);
		if (c == '*') {
			return first && second;
		}else if(c == '+') {
			return first || second;
		}else{
			return !(first && !second);
		}
	}

}