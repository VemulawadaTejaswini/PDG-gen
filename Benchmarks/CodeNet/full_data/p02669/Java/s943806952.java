import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static long rec(long N , long A , long B , long C , long D , Map<Long, Long> memo){
		if(memo.containsKey(N)){
			return memo.get(N);
		}
		if(N == 0){
			return 0;
		}
		if(N == 1){
			return D;
		}
		long r5 = N / 5;
		long diff = N - r5 * 5;
		long ret = rec(r5 , A , B , C , D , memo) + D * diff + C;
		if(diff != 0){
			diff = (r5 + 1) * 5 - N;
			ret = Math.min(rec(r5 + 1 , A , B , C , D , memo) + D * diff + C , ret);
		}
		long r3 = N / 3;
		diff = N - r3 * 3;
		ret = Math.min(ret, rec(r3 , A , B , C , D , memo) + D * diff + B);
		if(diff != 0){
			diff = (r3 + 1) * 3 - N;
			ret = Math.min(ret, rec(r3 + 1 , A , B , C , D , memo) + D * diff + B);
		}
		long r2 = N / 2;
		diff = N - r2 * 2;
		ret = Math.min(ret, rec(r2 , A , B , C , D , memo) + D * diff + A);
		if(diff != 0){
			diff = (r2 + 1) * 2 - N;
			ret = Math.min(ret, rec(r2 + 1 , A , B , C , D , memo) + D * diff + A);
		}
		if(N < ret / D){
			ret = Math.min(ret, N * D);			
		}
		memo.put(N, ret);
		return ret;
	}
	static long solve(long N , long A , long B , long C , long D){
		Map<Long, Long> memo = new HashMap<Long, Long>();		
		return rec(N , A , B , C , D , memo);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int cn = 1 ; cn <= T ; ++cn){
			long N = sc.nextLong();
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			long D = sc.nextLong();
			long ret = solve(N , A , B , C , D);
			System.out.println(ret);
		}
	}
}
