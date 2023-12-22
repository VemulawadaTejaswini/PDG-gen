import java.util.Scanner;

//Finite Field Calculator
public class Main{

	String s;
	int idx, mod;
	boolean ng;
	
	char get(){
		if(idx==s.length())return '$';
		return s.charAt(idx++);
	}
	
	int[] exgcd(int x, int y){
		int r0 = x, r1 = y, a0 = 1, a1 = 0, b0 = 0, b1 = 1;
		int q1, r2, a2, b2;
		while(0 < r1){
			q1 = r0/r1;
			r2 = r0%r1;
			a2 = a0-q1*a1;
			b2 = b0-q1*b1;
			r0 = r1; r1 = r2;
			a0 = a1; a1 = a2;
			b0 = b1; b1 = b2;
		}
		return new int[]{a0, b0, r0};
	}
	
	int modInverse(int a, int m){
		int[] r = exgcd(a, m);
		return r[2]==1?(m+r[0])%m:-1;
	}
	
	int exp(){
		if(ng)return 0;
		int res = term();
		for(;;){
			char c = get();
			if(c=='+'){
				res += term();
				if(mod <= res)res-=mod;
			}
			else if(c=='-'){
				int ope = term();
				ope = mod-ope;
				res+=ope;
				if(mod <= res)res-=mod;
			}
			else break;
		}
		idx--;
		return res;
	}
	
	int term(){
		if(ng)return 0;
		int res = fact();
		for(;;){
			char c = get();
			if(c=='*'){
				res *= fact();
				res%=mod;
			}
			else if(c=='/'){
				int ope = fact();
				if(ope==0){
					ng = true; return 0;
				}
				ope = modInverse(ope, mod);
				if(ope==-1){
					ng = true; return 0;
				}
				res *= ope;
				res%=mod;
			}
			else break;
		}
		idx--;
		return res;
	}
	
	int fact(){
		if(ng)return 0;
		char c = get();
		if(c=='('){
			int res = exp();
			get();
			return res;
		}
		int res = c-'0';
		for(;;){
			c = get();
			if(!Character.isDigit(c))break;
			res = res*10 + c-'0';
		}
		idx--;
		return res;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			String[] t = sc.nextLine().split(": ");
			if("0:".equals(t[0]))break;;
			mod = Integer.parseInt(t[0]);
			s = t[1].replace(" ", "");
			idx = 0;
			ng = false;
			int res = exp();
			if(ng)System.out.println("NG");
			else System.out.printf("%s = %d (mod %d)\n", s, res, mod);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}