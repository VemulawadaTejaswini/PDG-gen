import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static final int MOD = 1000000007;
	static class State{
		int r;
		int b;
		public State(int r , int b) {
			this.r = r;
			this.b = b;
		}
		@Override
		public int hashCode() {
			return r + 100000 * b;
		}
		@Override
		public String toString() {
			return r + " "+ b;
		}
		@Override
		public boolean equals(Object obj) {
			State s2 = (State) obj;
			return this.r == s2.r && this.b == s2.b;
		}
	}
	static void add(Map<State, Integer> map , State s , int v){
		if(map.containsKey(s)){
			int vold = map.get(s);
			map.put(s, (vold + v) % MOD);
		}else{
			map.put(s, v);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		Map<State, Integer> dp = new HashMap<State, Integer>();
		dp.put(new State(0 , 0), 1);
		for(int i = 0 ; i < N ; ++i){
			int Ai = A[i];
			Map<State, Integer> next = new HashMap<State, Integer>();
			for(State s : dp.keySet()){
//				System.out.println(s.r+" "+s.b);
				int v = dp.get(s);
				if(s.r == Ai){
					add(next, new State(s.r + 1, s.b) , v);
				}
				if(s.b == Ai){
					add(next, new State(s.r , s.b + 1) , v);					
				}
				int g = i - s.r - s.b;
				if(g == Ai){
					add(next, new State(s.r , s.b) , v);										
				}
			}
			dp = next;
//			System.out.println(dp);
//			System.out.println(i+" "+dp.size());
		}
		long S = 0;
		for(State s : dp.keySet()){
			S = (S + dp.get(s)) % MOD;
		}
		System.out.println(S);
	}
}
