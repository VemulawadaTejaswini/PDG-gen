import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	long mod = 1_000_000_000 + 7;
	void run() {
		int n = sc.nextInt();
		int x =  sc.nextInt();
		
		int s[] = new int[n];
		for(int i =0 ; i < n;i++) {
			s[i] = sc.nextInt();
		}
		
		Arrays.sort(s);
		
		long res = rec(s,n-1,x);
		System.out.println(res);
	}
	Map<String,Long> memo = new HashMap<String,Long>();
	
	long rec(int[] s, int t, int now){
		if(now ==0 ) {
			return 0;
		}
		String key = t+"_"+now;
		if(memo.containsKey(key)) {
			return memo.get(key);
		}
		if(t == -1) {
			return now;
		}
		long res = 0 ;
		
		if(s[t] <= now) {
			res += rec(s, t-1, now % s[t]) % mod;
			res += rec(s, t-1, now) * t%mod;
		}else {
			res += rec(s, t-1, now) * (t+1)%mod;
		}
		
		res = res%mod;
		memo.put(key,res);
		return res ;
	}
	
}