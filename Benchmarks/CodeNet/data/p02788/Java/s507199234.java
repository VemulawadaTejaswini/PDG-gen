import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		long a = sc.nextLong();
		pair[] p = new pair[n];
		for (int i = 0; i < n; i++) {
			p[i] = new pair(sc.nextLong(), sc.nextLong());
		}
		Arrays.sort(p, new Comparator<pair>() {
			public int compare(pair p1, pair p2) {
				return p1.x>p2.x?1:-1;
			}
		});
		long now = p[0].x;
		long max = div_ceil(p[0].h, a);
		long ans = 0;
		if(n > 1) {
			for (int i = 1; i < n; i++) {
				long times = div_ceil(p[i].h, a);
				if(p[i].x > now+2*d) {
					ans += max;
					now = p[i].x;
					max = times;
				}else {
					if(times > max) {
						ans += max;
						now = p[i].x;
						max = times-max;
					}
				}
			}
		}
		System.out.println(ans+max);
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
	public static long div_ceil(long a, long b) {//a/bの切り上げ
		return (a+b-1)/b;
	}
}