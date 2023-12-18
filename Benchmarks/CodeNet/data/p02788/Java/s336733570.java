import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long d = sc.nextLong();
		long a = sc.nextLong();
		pair[] p = new pair[(int)n];
		for (int i = 0; i < n; i++) {
			p[i] = new pair(sc.nextLong(), sc.nextLong());
		}
		Arrays.sort(p, new Comparator<pair>() {
			public int compare(pair p1, pair p2) {
				return p1.x>p2.x?1:-1;
			}
		});
		long now = 0;
		long max = 0;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			long times = p[i].h%a==0?p[i].h/a:p[i].h/a+1;
			if(i==0)max = times;
			if(p[i].x > now+2*d) {
				ans += max;
				now = p[i].x;
			}else {
				if(times>max) {
					ans += max;
					max = times-max;
					now = p[i].x;
				}else if(i == n-1)ans += max;

			}
		}
		//System.out.println(p[2].x);
		System.out.println(ans);
		sc.close();
	}
	public static class pair{
		long x;
		long h;
		pair(long x, long h){
			this.x = x;
			this.h = h;
		}
	}
}