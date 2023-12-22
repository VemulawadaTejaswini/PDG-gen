
import java.util.Scanner;
public class Main {
	static char[] s;
	static int id ;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				s = sc.next().toCharArray();
				id = 0;
				System.out.println(exp());
			}
			
		}
	}
	static int exp() {
		int res = term();
		while(s[id] == '+' || s[id] == '-') {
			if(s[id] == '+') {
				id++;
				res += term();
			}else {
				id++;
				res -= term();
			}
		}
		return res;
	}
	
	static int term() {
		int res = fact();
		while(s[id] == '*' || s[id] == '/') {
			if(s[id] == '*') {
				id++;
				res *= fact();
			}else{
				id++;
				res /= fact();
			}
		}
		
		return res;
	}
	
	static int fact() {
		int res = 0;
		if(s[id] == '(') {
			id++;
			res = exp();
			id++;
		}else if(s[id] == '+') {
			id++;
			res = fact();
		}else if(s[id] == '-') {
			id++;
			res = -fact(); 
		}else {
			res = num();
		}
		return res;
	}
	
	static int num() {
		int res = 0;
		if(Character.isDigit(s[id])) {
			while('0' <= s[id] && s[id] <= '9') {
				res *= 10;
				res += s[id] - '0';
				id++;
			}
		}
		
		return res;
	}
}




