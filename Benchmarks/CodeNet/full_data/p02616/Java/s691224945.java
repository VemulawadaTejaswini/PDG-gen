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
		int last_pos = -1;
		int last_neg = -1;
		for(int i = 0 ; i < K ; ++i){
			Number n = ns.get(i);
			ret = (ret * n.absx) % MOD;
			if(n.x > 0){
				last_pos = i;
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
		// last_neg >= 0
		int first_pos = -1;
		int first_neg = -1;
		for(int i = K ; i < ns.size() ; ++i){
			Number n = ns.get(i);
			if(n.x >= 0 && first_pos < 0){
				first_pos = i;
			}else if(n.x < 0 && first_neg < 0){
				first_neg = i;
			}
		}
		if(last_pos >= 0){
			if(first_pos >= 0 && first_neg >= 0){
				if(ns.get(first_pos).absx * ns.get(last_pos).absx >= ns.get(first_neg).absx * ns.get(last_neg).absx){
					ret = ns.get(first_pos).x;
					sign = 1;
					for(int i = 0 ; i < K ; ++i){
						if(i == last_neg){
							continue;
						}
						Number n = ns.get(i);
						ret = (ret * n.absx) % MOD;
					}
					return ret;					
				}else{
					ret = ns.get(first_neg).absx;
					sign = 1;
					for(int i = 0 ; i < K ; ++i){
						if(i == last_pos){
							continue;
						}
						Number n = ns.get(i);
						ret = (ret * n.absx) % MOD;
					}
					return ret;		
				}
			}
			if(first_pos >= 0){
				ret = ns.get(first_pos).x;
				sign = 1;
				for(int i = 0 ; i < K ; ++i){
					if(i == last_neg){
						continue;
					}
					Number n = ns.get(i);
					ret = (ret * n.absx) % MOD;
				}
				return ret;				
			}
			if(first_neg >= 0){
				ret = ns.get(first_neg).absx;
				sign = 1;
				for(int i = 0 ; i < K ; ++i){
					if(i == last_pos){
						continue;
					}
					Number n = ns.get(i);
					ret = (ret * n.absx) % MOD;
				}
				return ret;				
			}
			return getNeg(ns, K);
		}
		// 前は全部マイナス , 
		if(first_pos >= 0){
			ret = ns.get(first_pos).x;
			sign = 1;
			for(int i = 0 ; i < K ; ++i){
				if(i == last_neg){
					continue;
				}
				Number n = ns.get(i);
				ret = (ret * n.absx) % MOD;
			}
			return ret;				
		}
		return getNeg(ns, K);
	}
	static long getNeg(List<Number> ns, int K){
		Collections.sort(ns);
		long ret = 1;
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
