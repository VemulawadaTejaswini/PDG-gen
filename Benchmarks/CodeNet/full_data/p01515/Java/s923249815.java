import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	char[] eq;
	char[] eq1, eq2;
	boolean[] as = new boolean[11];
	boolean[] check = new boolean[11];
	
	boolean flag;
	void calc(int depth) {
		if (depth == 11) {
			boolean a, b;
			eq = eq1;
			index = 0;
			a = F();
			eq = eq2;
			index = 0;
			b = F();
//			out.println(a);
//			out.println(b);
//			out.println();
			if (a != b)
				flag = false;
		} else {
			if (flag) {
				as[depth] = false;
				calc(depth+1);
				as[depth] = true;
				calc(depth+1);
			}
		}
	}
	
	int index;
	int token;
	final int VAL = '%';
	boolean value;
	void gettoken() {
		int ch = eq[index++];
		if (ch == '+' || ch == '*' || ch == '(' || ch == ')') {
			token = ch;
			return;
		} else if (ch == '-') {
			if (eq[index] == '>') {
				index++;
				token = '>';
				return;
			} else {
				token = ch;
				return;
			}
		} else {
			token = VAL;
			switch(ch) {
			case 'T':
				value = true; break;
			case 'F':
				value = false; break;
			case 'a':
				value = as[0]; break;
			case 'b':
				value = as[1]; break;
			case 'c':
				value = as[2]; break;
			case 'd':
				value = as[3]; break;
			case 'e':
				value = as[4]; break;
			case 'f':
				value = as[5]; break;
			case 'g':
				value = as[6]; break;
			case 'h':
				value = as[7]; break;
			case 'i':
				value = as[8]; break;
			case 'j':
				value = as[9]; break;
			case 'k':
				value = as[10]; break;
			}
		}
	}
	
	boolean F() {
		boolean v, vnext;
		int savetoken;
		gettoken();
		if (token == VAL) {
			return value;
		} else if (token == '-') {
			return !F();
		} else if (token == '(') {
			v = F();
			gettoken();
			savetoken = token;
			vnext = F();
			gettoken();
			if (token != ')') out.println("err");
			if (savetoken == '+') {
				return v || vnext;
			} else if (savetoken == '*') {
				return v && vnext;
			} else if (savetoken == '>') {
				if (!v) return true;
				else return vnext;
			}
			
		}
		out.println("err");
		return false;
	}
	
	void run() {
		String s;
		StringTokenizer st;
		while (true) {
			s = sc.nextLine();
			if (s.equals("#"))
				break;
			st = new StringTokenizer(s,"=");
			eq1 = st.nextToken().toCharArray();
			eq2 = st.nextToken().toCharArray();
			flag = true;
			calc(0);
			if (flag)
				out.println("YES");
			else
				out.println("NO");
//			out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}