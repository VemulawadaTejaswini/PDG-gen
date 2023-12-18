import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://abc060.contest.atcoder.jp/tasks/arc073_b
 */
public class Main {

	static long[] v;
	static long[] w;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		v = new long[N];
		w = new long[N];
		for(int i=0; i<N; i++){
			w[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}
		sc.close();

		long ans = dfs(0,W);
		
		System.out.println(ans);

	}

	static Map<String,Long> dp = new HashMap<>();
	private static long dfs(int n, long cw){
		
		if(n>=w.length){
			return 0;
		}
		
		Long res = dp.get(getKey(n,cw));
		if(res!=null){
			return res;
		}
		
		if(cw-w[n]>=0){
			res = Math.max(dfs(n+1, cw-w[n])+v[n], dfs(n+1, cw));
		}else{
			res = dfs(n+1, cw);
		}
		
		dp.put(getKey(n,cw), res);
		return res;
	}
	
	static String getKey(int n, long w){
		return n+"."+w;
	}
	
	

}