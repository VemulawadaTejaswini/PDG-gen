import java.util.HashMap;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	long mod = 998244353;

	void run() {
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int s = 0;
		for(int i = 0; i < n; i ++) {
			a[i] = sc.nextInt();
			s += a[i];
		}
		
		boolean[] contains = new boolean[s+1];

		contains[0] = true;
		for(int i =0 ; i < n ; i ++) {
			for(int j = 0 ; j <= s - a[i]; j++) {
				if(contains[j]) {
					contains[j+a[i]] = true;
				}
			}
		}
		
		
		long ans = 0;
		for(int r = 1; r <= s/3; r++) {
			if(!contains[r]) {
				continue;
			}
			for(int g = Math.max(r, s/2 - r + 1) ; g <= s - g - r  ; g++  ) {
				if(!contains[g]) {
					continue;
				}				
				int b = s - g - r;

				if(!contains[b]) {
					continue;
				}

				long c = calc(r,g,b,0,a,s) ;
				
				if(r == b) {
					
				}else if(r == g || b==g) {
					c*=3;
				}else {
					c*=6;
				}
				ans += c;
				ans = ans % mod;
			}
		}
		
		System.out.println(ans);
		
		
	}
	HashMap<String,Long> map = new HashMap<String,Long>();

	long calc(int rr, int gg,int bb,int i, int[] a, int s){
		int r = Math.min(bb,Math.min(rr, gg));
		int b = Math.max(bb,Math.max(rr, gg));
		int g = s - r-b;

		String key = r+"_"+g+"_"+b+"_"+i;
		if(map.containsKey(key)) {
			return map.get(key);
		}
		if(i == a.length) {
			if(r==0 && g==0 && b==0) {
				return 1;
			}else {
				return 0;
			}
		}
		
		long count = 0;

		if(r >= a[i]) {
			count += calc(r-a[i], g, b,i+1,a,s-a[i]);
		}
		if(g >= a[i]) {
			count += calc(r, g-a[i], b,i+1,a,s-a[i]);
		}
		if(b >= a[i]) {
			count += calc(r, g, b-a[i],i+1,a,s-a[i]);
		}
		count %= mod;

		map.put(key,count);
		return count;
	}
}
