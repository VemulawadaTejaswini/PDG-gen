
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int n;
	int m;
	int q;
	int a[];
	int b[];
	int c[];
	int d[];
	int num[];
	long ans = 0;
	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		q=sc.nextInt();
		a = new int[q];
		b = new int[q];
		c = new int[q];
		d = new int[q];
		num = new int[n+1];
		for(int i=0; i<q; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
			d[i]=sc.nextInt();
		}
		calc(1, 1);
		System.out.println(ans);
		sc.close();
	}

	private void calc(int cnt, int min) {
		if(cnt>n) {
			ans =Math.max(ans, a());
			return;
		}
		for(int i=min; i<=m; i++) {
			num[cnt]=i;
			calc(cnt+1, i);
		}
	}

	private long a() {
		long ret = 0;
		for(int i=0; i<q; i++) {
			if(num[b[i]]-num[a[i]]==c[i]) {
				ret += d[i];
			}
		}
		return ret;
	}
}