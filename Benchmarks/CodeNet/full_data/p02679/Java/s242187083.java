import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	final static long MOD = 1000000007;
	static long modpow(long n, long y){
		if(y == 0){
			return 1;
		}else if(y == 1){
			return n % MOD;
		}else{
			if(y % 2 == 0){
				long r = modpow(n , y / 2);
				return (r * r) % MOD;
			}else{
				long r = modpow(n , y / 2);
				long r2 = (r * r) % MOD;
				return (r2 * n) % MOD;				
			}
		}
	}	
	static long gcd(long a , long b){
		if(a < b)return gcd(b, a);
		if(b == 0)return a;
		return gcd(b , a % b);
	}
	static class State{
		long a;
		long b;
		State(long a , long b){
			if(a < 0){
				a = -a;
				b = -b;
			}else if(a == 0){
				b = 1;
			}
			this.a = a;
			this.b = b;
		}
		@Override
		public boolean equals(Object obj) {
			State s = (State)obj;
			return a == s.a && b == s.b;
		}
		@Override
		public int hashCode() {
			return (int)a + 31 * (int)b;
		}
		@Override
		public String toString() {
			return a + " " + b;
		}
	}
	static long solve(long A[] , long B[]){
		HashMap<State, Integer> counter = new HashMap<State, Integer>();
		long zeros = 0;
		for(int i = 0 ; i < A.length ; ++i){
			if(A[i] == 0 && B[i] == 0){
				zeros++;
				continue;
			}
			State s = new State(A[i], B[i]);
			if(!counter.containsKey(s)){
				counter.put(s, 1);
			}else{
				int v = counter.get(s);
				counter.put(s, v + 1);				
			}
		}
		Set<State> ks = new HashSet<State>(counter.keySet());
		long ret = 1;
		for(State s : ks){
			State rs = new State(- s.b , s.a);
			int c = 0;
			int r = 0;
			if(counter.containsKey(s)){
				c = counter.get(s);
				counter.remove(s);
			}
			if(counter.containsKey(rs)){
				r = counter.get(rs);
				counter.remove(rs);
			}
			long t = modpow(2, c) + modpow(2, r) - 1;
			ret = (ret * t) % MOD;
		}
		ret = (ret + zeros - 1 + MOD) % MOD;
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long g = gcd(Math.abs(a) , Math.abs(b));
			if(a == 0 && b == 0){
				A[i] = 0;
				B[i] = 0;
			}else{
				A[i] = a / g;
				B[i] = b / g;								
			}
		}	
		System.out.println(solve(A , B));
	}
}
