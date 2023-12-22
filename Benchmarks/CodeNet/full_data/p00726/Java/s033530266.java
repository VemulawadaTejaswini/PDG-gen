import java.util.*;

public class Main {

	String str;
	int p, n;
	char ans;
	static final int INF = 1<<30;
	static final int LONG = INF+1;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			str = in.next();
			n = in.nextInt();
			if(str.equals("0") && n==0) return ;
			ans = '0';
			solve();
			System.out.println(ans);
		}
	}

	void solve(){
		if(n == 0 && str.length()>=1 && Character.isUpperCase(str.charAt(0))){
			ans = str.charAt(0);
			return ;
		}
		p = 0;
		int len = expr();
		if(len <= n) return ;
		p = 0;
		int t = term();
		if(t <= n){
			str = str.substring(p);
			n -= t;
			solve();
			return ;
		}
		p = 0;
		num();
		if(Character.isUpperCase(str.charAt(p))){
			ans = str.charAt(p);
			return ;
		}
		else{
			p++;
			int q = p;
			int b = expr();
			n %= b;
			str = str.substring(q, p);
			solve();
			return ;
		}
	}
	
	int expr(){
		if(p==str.length() || str.charAt(p)==')') return 0;
		int r = term(), a = expr();
		if(r == LONG || a == LONG){
			return LONG;
		}
		else{
			return r + a > n+1?LONG:r+a;
		}
	}

	int term(){
		if(Character.isUpperCase(str.charAt(p))){
			p++;
			return 1;
		}
		else{
			int a = num();
			if(Character.isUpperCase(str.charAt(p))){
				p++;
				return a;
			}
			p++;
			int b = expr();
			p++;
			if( b == LONG ){
				return LONG;
			}
			else{
				return a*b;
			}
		}
		
	}
	
	int num(){
		if(p==str.length()) return INF;
		int q = p;
		char c = str.charAt(p);
		if(!Character.isDigit(c)) return INF;
		p++;
		int a = num(), b = c-'0';
		if(a==INF) return b;
		for(int i=0; i<p-q-1;i++){
			b *= 10;
		}
		return b + a;
	}

	public static void main(String args[]){
		new Main().run();
	}
}