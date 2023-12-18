import java.util.*;

public class Main{

	static int p[];
	static int c[];
	static int d, g;
	static final int infinity = 10000;
	
	public static int solve(){
		int sum = 0, cnt = 0, ans = infinity;
		int t = 1, max = -1;
		int n = (int)Math.pow(2, d);
		for(int i = 0; i < n; ++i){
			max = 0;
			t = 1;
			cnt = 0;
			sum = 0;
			for(int j = 0; j < d; ++j){
				if((i & t) != 0){
					sum += p[j] * (j + 1) + c[j] / 100;
					cnt += p[j];
				}
				else max = j;
				t = t << 1;
			}	
			if(sum < g /100){
				int tmp = -1;
				if(max != -1)
				tmp = (g / 100 - sum) / (max + 1);
				if(tmp < 0)cnt = infinity;
				else if(tmp <= p[max] - 1)cnt += tmp;
				else cnt = infinity;
			}
			ans = Math.min(ans, cnt);
		}
		return ans;
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