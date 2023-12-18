import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong();
		long[] a=new long[n+1];
		long[] aa=new long[n+1];
		long[] b=new long[n+1]; 
		long[] bb = new long[n+1];
		long[] x=new long[n+1];
		long[] v=new long[n+1];
		for(int i = 1; i<=n; i++){
			x[i]= sc.nextLong();
			v[i]= sc.nextLong();
		}
		long asum=0;
		for(int i = 1; i<=n; i++){
			if(v[i]-x[i]>0){
				a[i]=v[i]-x[i]+asum;
			}else{
				a[i]=a[i-1];
			}
			if(v[i]-x[i]*2>0){
				aa[i]=v[i]-x[i]*2+asum;
			}else{
				aa[i]=aa[i-1];
			}
			asum+=v[i];
		}
		long bsum=0;
		for(int i = 1; i<=n; i++){
			if(v[n+1-i]-c+x[n+1-i]>0){
				b[i]=v[n+1-i]-c+x[n+1-i]+bsum;
			}else{
				b[i]=b[i-1];
			}
			if(v[n+1-i]-(c-x[n+1-i])*2>0){
				bb[i]=v[n+1-i]-(c-x[n+1-i])*2+bsum;
			}else{
				bb[i]=bb[i-1];
			}
			bsum+=v[n+1-i];
		}
		long ans=0;
		for(int i = 0; i<=n; i++){
			ans=Math.max(ans,Math.max(a[i]+bb[n-i],aa[i]+b[n-i]));
		}
		System.out.println(ans);
	}
}
