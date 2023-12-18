import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * http://abc032.contest.atcoder.jp/tasks/abc032_d
 * ナップサック問題
 */
public class Main {

	static int N;
	static long[] a;
	static long[] b;
	static Map<String,Long> dp = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		final long W = sc.nextLong();
		a = new long[N];
		b = new long[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();	
		long ans = dfs(0,W);
		System.out.println(ans);
	}

	static long dfs(int n, long w) {
      	//System.out.println("AGE"+n+" "+w);
		if (dp.get(getKey(n,w))!=null) {
			return dp.get(getKey(n,w));
		}
		long res;
		if (n==N) {
			res=0;
		}else if(w<b[n]) {
			res = dfs(n+1, w);
		}else{
			res = Math.max( dfs(n+1, w), dfs(n+1, w-b[n])+a[n]);
		}
		dp.put(getKey(n,w), res);
		return res;
	}
	
	static String getKey(int n, long w){
		return String.format("%d.%d", n,w);
	}
	
}
