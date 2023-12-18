import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long mod=1000000007;
		long g=1;
		long[] a=new long[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
			g=g*a[i]/gcd(g,a[i]);
		}
		long sum=0;
		for(int i=0; i<n; i++){
			sum+=g/a[i];
			sum%=mod;
		}
		System.out.println(sum);
	}
	private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
		long tmp=m;
		while(n!=0){
			m=n;
			n=tmp%n;
		}
    return m;
}
}
