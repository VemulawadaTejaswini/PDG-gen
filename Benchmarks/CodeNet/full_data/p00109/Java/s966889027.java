import java.util.Scanner;

public class Main {
	
	static String s;
	static int cur;
	
	static boolean isdigit(char c) {
		if(c=='0' || c=='1' ||c=='2' ||c=='3' ||c=='4' ||c=='5' ||c=='6' ||c=='7' ||c=='8' ||c=='9') {
			return true;
		}
		return false;
	}
	
	static int digit() {
		assert(isdigit(s.charAt(cur)));
		int n=s.charAt(cur)-'0';
		cur++;
		return n;
	}
	
	static int number() {
		int n=digit();
		while(cur<s.length() && isdigit(s.charAt(cur))) {
			n=n*10+digit();
		}
		return n;
	}
	
	static int term() {
		int a=factor();
		while(cur<s.length() && (s.charAt(cur)=='*' || s.charAt(cur)=='/')) {
			char op=s.charAt(cur++);
			int b=factor();
			if(op=='*') {
				a*=b;
			}
			else {
				a/=b;
			}
		}
		return a;
	}
	
	static int expression() {
		int a=term();
		while(cur<s.length() && (s.charAt(cur)=='+' || s.charAt(cur)=='-')) {
			char op=s.charAt(cur++);
			int b=term();
			if(op=='+') {
				a+=b;
			}
			else {
				a-=b;
			}
		}
		return a;
	}
	
	static int factor() {
		if(s.charAt(cur)!='(') {
			return number();
		}
		cur++;
		int n=expression();
		assert(s.charAt(cur)==')');
		cur++;
		return n;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			for(int i=0; i<n; i++) {
				cur=0;
				s=sc.next();
				s=s.substring(0, s.length()-1);
				System.out.println(expression());
			}
			
			
		}
	}
}
