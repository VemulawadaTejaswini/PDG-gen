import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Finite Field Calculator
public class Main{

	String s;
	int idx, mod;
	boolean ng;
	boolean[] prime;
	Map<Integer, Integer>[] inv;
	
	char get(){
		if(idx==s.length())return '$';
		return s.charAt(idx++);
	}
	
	int modinv(long y, int mod){
		if(inv[mod].containsKey(y))return inv[mod].get(y);
		int r = 0;
		for(int d=0;d<mod;d++){
			long x = y*d;
			if((x%mod)==1){
				r = d; break;
			}
		}
		inv[mod].put((int)y, r);
		return r;
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
				ope = modinv(ope, mod);
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
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = 46000;
		prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for(int i=2;i<=n;i++)if(prime[i])for(int j=i+i;j<=n;j+=i)prime[j]=false;
		inv = new HashMap[n+1];
		for(int i=2;i<=n;i++)inv[i]=new HashMap<Integer, Integer>();
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