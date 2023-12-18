import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		int n=s.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) a[i]=s.nextInt();
		
		long sum[]=new long[n];
		sum[0]=a[0];
		
		long res=0;
		
		for(int i=1;i<n;i++) {
			sum[i]=a[i]+sum[i-1];
			if(sum[i-1]>0) {
				long t=-sum[i-1]-1;
				if(a[i]>t){
					res+=a[i]-t;
					a[i]=t;
				}
			}else {
				long t=-sum[i-1]+1;
				if(a[i]<t){
					res+=t-a[i];
					a[i]=t;
				}
			}
			sum[i]=a[i]+sum[i-1];
			
			//System.out.println(sum[i]);
		}
		
		//System.out.println(Arrays.toString(a));
		System.out.println(res);
	}
	
	
	static final boolean checkRev(long a,long b) {
		return (a<0&0<b)||(b<0&&0<a);
	}
}
