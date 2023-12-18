import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	long a;
	long b;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long h[] = new long[n];
		a=sc.nextLong();
		b=sc.nextLong();
		for(int i=0; i<n; i++) {
			h[i]=sc.nextLong();
		}
		Arrays.sort(h);
		int ans = s(h);
		System.out.println(ans);

		sc.close();
	}

	private int s(long h[]) {
		int l=-1;
		int r=2000000000;
		while(l+1<r) {
			int m=(l+r)/2;
			if(e(h, m)) {
				r=m;
			}else {
				l=m;
			}
		}
		return l+1;

	}
	private boolean e(long h[], int t) {
		int s = lb(h,b*t);
		long cnt = 0;
		//long cnt2 = 0;
		for(int i=s; i<h.length; i++) {
			cnt += ((h[i]-b*t)+(a-b-1))/(a-b);
			//cnt2 += Math.ceil(h[i]-b*t)/(a-b);
			//if(cnt != cnt2) {
			//	System.out.println("i="+i+", cnt="+cnt+", cnt2="+cnt2);
			//}
		}
		if(cnt > t) {
			return false;
		}
		return true;
	}
	private int lb(long h[], long v) {
		int l=-1;
		int r=h.length;
		while(l+1<r) {
			int m=(l+r)/2;
			if(h[m]<v) {
				l=m;
			}else {
				r=m;
			}
		}
		return l+1;
	}


}
