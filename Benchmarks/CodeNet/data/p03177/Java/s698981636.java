import java.util.*;
public class Main {
	public static int[][] mul(int[][] a,int[][] b,int n,int mod) {
		int[][] ret=new int[n][n];
		for (int i=0;i<n;++i)
			for (int j=0;j<n;++j)
				for (int k=0;k<n;++k)
					ret[i][j]=(ret[i][j]+(int)(1L*a[i][k]*b[k][j]%mod))%mod;
		return ret;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long K=in.nextLong();
		int[][] a=new int[n][n];
		int mod=1000000007;
		for (int i=0;i<n;++i)
			for (int j=0;j<n;++j)
				a[i][j]=in.nextInt();
		int[][] b=new int[n][n];
		for (int i=0;i<n;++i) b[i][i]=1;
		while (K>0) {
			if ((K&1)>0) b=mul(b,a,n,mod);
			K>>=1;
			a=mul(a,a,n,mod);
		}
		int res=0;
		for (int i=0;i<n;++i)
			for (int j=0;j<n;++j)
				res=(res+b[i][j])%mod;
		System.out.println(res);
	}
}