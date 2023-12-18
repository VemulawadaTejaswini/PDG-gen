
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0; i<n; i++) a[i]=sc.nextInt();
		for(int i=0; i<n; i++) b[i]=sc.nextInt();
		long ans = 0;
		for(int k=0; k<29; k++) {
			int am[] = new int[n];
			int bm[] = new int[n];
			int t = 1<<(k+1);
			for(int i=0; i<n; i++) {
				am[i]=a[i]%t;
				bm[i]=b[i]%t;
			}
			Arrays.sort(am);
			int cnt = 0;
			t>>=1;
			for(int i=0; i<n; i++) {
				cnt += lowerBound(am, 2*t - bm[i]) - lowerBound(am, t - bm[i]);
				cnt += lowerBound(am, 4*t - bm[i]) - lowerBound(am, 3*t - bm[i]);
			}
			if(cnt % 2 != 0) {
				ans |= (1<<k);
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private int lowerBound(int a[], int v) {
		int l=-1;
		int r=a.length;
		while(l+1<r) {
			int m = (l+r)/2;
			if(a[m]<v) {
				l=m;
			}else {
				r=m;
			}
		}
		return r;
	}
}
