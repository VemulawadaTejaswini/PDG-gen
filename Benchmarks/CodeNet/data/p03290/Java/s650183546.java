import java.util.*;

public class Main{

	static int p[];
	static int c[];
	static int d, g;
	
	public static boolean judge(int m){
		int ans = 0, count = 0;
		for(int i = d - 1; i >= 0; --i){
			ans = 0;
			count = 0;
			for(int j = i; j >= 0; --j){
				int tmp = p[j];
				int tmpc = c[j];
				if(count + p[j] > m){
					tmp = m - count;
					tmpc = 0;
				}
				ans += 100 * (j + 1) * tmp + tmpc;
				count += p[j];
				if(count >= m)break;
			}
			if(ans >= g)return true;
		}
		return false;
	}

	public static int solve(){
		int l = 0, r = 1001, m = (r + l) / 2;
		while(l + 1 < r){
			m = (r + l) / 2;
			if(judge(m))r = m;
			else l = m;
		}
		return r;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		d = sc.nextInt();
		g = sc.nextInt();
		p = new int[d];
		c = new int[d];
		for(int i = 0; i < d; ++i){
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();
		int ans = solve();
		System.out.println(ans);
	}
}