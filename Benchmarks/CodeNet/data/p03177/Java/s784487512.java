import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long mod=1000000007;
	static int n;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		long k=sc.nextLong();
		long[][] a=new long[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				a[i][j]=sc.nextLong();
			}
		}
		long[][] b=new long[n][n];
		for(int i=0; i<n; i++){
			b[i][i]=1;
		}
		while(k>0){
			if((k&1)==1){
				b=mul(a,b);
			}
			k>>=1;
			a=mul(a,a);
		}
		long ans=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				ans=(ans+b[i][j])%mod;
			}
		}
		System.out.println(ans);
	}
	static long[][] mul(long[][] a,long[][] b){
		long[][] re=new long[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				for(int k=0; k<n; k++){
					re[i][j]=(re[i][j]+a[i][k]*b[k][j])%mod;
				}
			}
		}
		return re;
	}
}
