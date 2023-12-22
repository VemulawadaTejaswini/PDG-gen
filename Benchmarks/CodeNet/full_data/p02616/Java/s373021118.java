import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Number implements Comparable<Number>{
		long x;
		long absx;
		public Number(long v) {
			x = v;
			absx = Math.abs(v);
		}
		@Override
		public int compareTo(Number o) {
			return Long.compare(absx, o.absx);
		}
		@Override
		public String toString() {
			return x + " " + absx;
		}
	}
	static final long MOD = 1000000007;
	static long solve(long A[], int K){
		List<Number> ns = new ArrayList<Number>();
		for(long a : A){
			ns.add(new Number(a));
		}
		Collections.sort(ns);
		Collections.reverse(ns);
		int sign = 1;
		long ret = 1;
		int last_neg = 0;
		for(int i = 0 ; i < K ; ++i){
			Number n = ns.get(i);
			ret = (ret * n.absx) % MOD;
			if(n.x > 0){
			}else if(n.x == 0){
				sign = 0;
			}else{
				sign = - sign;
				last_neg = i;
			}
		}
		if(sign > 0){
			return ret;
		}
		if(sign == 0){
			return 0;
		}
		int find_pos = -1;
		for(int i = K ; i < ns.size() ; ++i){
			Number n = ns.get(i);
			if(n.x >= 0){
				find_pos = i;
				break;
			}
		}
		if(find_pos >= 0){
			ret = ns.get(find_pos).x;
			sign = 1;
			for(int i = 0 ; i < K ; ++i){
				if(i == last_neg){
					continue;
				}
				Number n = ns.get(i);
				ret = (ret * n.absx) % MOD;
				if(n.x > 0){
				}else if(n.x == 0){
					sign = 0;
				}else{
					sign = - sign;
					last_neg = i;
				}
			}
			return ret;
		}
		// どうやっても正の数にならない場合
		Collections.sort(ns);
		ret = 1;
		for(int i = 0 ; i < K ; ++i){
			ret = (ret * ns.get(i).absx) % MOD;
		}
		return MOD - ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
		}
		System.out.println(solve(A, K));
	}
}
