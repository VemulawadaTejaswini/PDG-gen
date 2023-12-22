import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	
	long pow(long a,long n) {
		return n!=0?pow(a*a,n/2)*(n%2==1?a:1):1;
	}
	
	int[] f(long a) {
		int[] ret=new int[2];
		while (a%2==0) {
			ret[0]++;
			a/=2;
		}
		while (a%5==0) {
			ret[1]++;
			a/=5;
		}
		ret[0]=Math.min(ret[0], 9);
		ret[1]=Math.min(ret[1], 9);
		return ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long[][][][] cnt=new long[10][10][10][10];
		for (int i=0;i<N;++i) {
			String str=sc.next();
			String[] strs=str.split("\\.");
			int c=strs.length==1?0:strs[1].length();
			long A=Long.valueOf(strs[0]+(strs.length==1?"":strs[1]));
			long num=A;
			long den=pow(10,c);
			long gcd=gcd(num,den);
			num/=gcd;
			den/=gcd;
			int[] p=f(num);
			int[] q=f(den);
			cnt[p[0]][p[1]][q[0]][q[1]]++;
		}
		
		long ans=0;
		for (int i=0;i<10;++i) {
			for (int j=0;j<10;++j) {
				for (int k=0;k<10;++k) {
					for (int l=0;l<10;++l) {
						if (cnt[i][j][k][l]==0) continue;
						for (int i2=k;i2<10;++i2) {
							for (int j2=l;j2<10;++j2) {
								for (int k2=0;k2<=i;++k2) {
									for (int l2=0;l2<=j;++l2) {
										if (cnt[i2][j2][k2][l2]==0) continue;
										if (i==i2&&j==j2&&k==k2&&l==l2) continue;
										ans+=cnt[i][j][k][l]*cnt[i2][j2][k2][l2];
									}
								}
							}
						}
					}
				}
			}
		}
		
		ans/=2;
		for (int i=0;i<10;++i) {
			for (int j=0;j<10;++j) {
				long d=cnt[i][j][0][0];
				if (d==0) continue;
				ans+=d*(d-1)/2;
			}
		}
		
		System.out.println(ans);
		
	}	
	
	

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

}
