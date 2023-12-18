import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x=new long[n];
		long[] y=new long[m];
		long mod=1000000007;
		for(int i = 0; i<n; i++){
			x[i]= sc.nextLong();
		}
		for(int i=0; i<m; i++){
			y[i]= sc.nextLong();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		long xsum=0;
		long ysum=0;
		for(long i = 0; i<n; i++){
			xsum+=((x[(int)i]*i)%mod)-((x[(int)i]*((long)n-1-i))%mod);
			xsum%=mod;
		}
		for(long i = 0; i<m; i++){
			ysum+=((y[(int)i]*i)%mod)-((y[(int)i]*((long)m-1-i))%mod);
			ysum%=mod;
		}
		System.out.println((xsum*ysum)%mod);
	}
}
