import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] b;
		if(m>0) {
			int[] a = new int[m];
			for (int i = 0; i < m; i++) {
				a[i] = sc.nextInt();
			}
			b = new int[m+1];
			for(int i=0;i<m+1;i++) {
				if(i==0) {
					b[i] = a[i]-1;
				}else if(i==m) {
					b[i] = n-a[i-1]-1;
				}else {
					b[i] = a[i]-2 - a[i-1];
				}
			}
		}else {
			b = new int[1];
			b[0] = n;
		}
		
		long ans=1;
		for (int i = 0; i < b.length; i++) {
			if(b[i] <0) {
				System.out.println(0);
				System.exit(0);
			}
			long msum = 0;
			long bn = b[i];
			long bp = bn;
			long bq = 0;
			while(true) {
				msum += factr(bn,bp,bq);
				msum = msum%1000000007;
				bn--;
				bp = bp-2;
				bq++;
				if(bp<0) {
					break;
				}
			}
			ans = (ans*msum)%1000000007;
			
		}
		System.out.println(ans);
	
	}
	
	static long factr(long n,long p,long q) {
		if(n==p) {
			return 1l;
		}
		long ma = Math.max(p, q);
		long mi = Math.min(p, q);
		long ret = fact(n,ma)/fact(mi,0);
		return ret;
	}
	static long fact(long n,long m) {
		if(n==m) {
			return 1l;
		}
		return (n*fact(n-1,m))%1000000007;
	}

}
