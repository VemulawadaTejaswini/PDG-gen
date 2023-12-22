import java.awt.geom.*;
import java.util.*;
public class Main {
	String str;
	int ans, pos;
	//0352 start
	//0405 cording end
	//0406 WA
	private void doit() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			str = sc.next();
			ans = 0;
			pos = 0;
			int res = exp();
			System.out.println(res);
		}
	}

	private int exp() {
		int res = term();
		while(true){
			char op = str.charAt(pos);
			if((op == '+') || (op == '-')){
				int old = res;
				pos++;
				res = term();
				switch(op){
				case '+': 
					res = old + res;
					break;
				case '-':
					res = old - res;
					break;
				}
			}
			else{
				break;
			}
		}
		return res;
	}

	private int term() {
		int res = fact();
		while(true){
			char op = str.charAt(pos);
			if((op == '*') || (op == '/')){
				int old = res;
				pos++;
				res = fact();
				switch(op){
				case '*':
					res = old * res;
					break;
				case '/':
					res = old / res;
					break;
				}
			}
			else{
				break;
			}
		}
		return res;
	}

	private int fact() {
		if(Character.isDigit(str.charAt(pos))){
			int t = str.charAt(pos) - '0';
			pos++;
			while(Character.isDigit(str.charAt(pos))){
				t = t * 10 + (str.charAt(pos) - '0');
				pos++;
			}
			return t;
		}
		else if(str.charAt(pos) == '('){
			pos++;
			int res = exp();
			pos++;
			return res;
		}
		return 0;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}