import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		long sum=0;
		long ans=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
			sum+=a[i]-n+1;
		}
		if(sum>0){
		long l=-1;
		long r=Long.MAX_VALUE/10;
		while(r-l>1){
			long m=(l+r)/2;
			long count=0;
			for(int i=0; i<n; i++){
				count+=Math.max((a[i]-m+sum+n)/(n+1),0);
			}
			if(count<=sum){
				ans=count;
				r=m;
			}else{
				l=m;
			}
		}
		for(int i=0; i<n; i++){
			a[i]=a[i]+ans-(n+1)*((a[i]-r+ans+n)/(n+1));
		}
		}
		while(true){
			Arrays.sort(a);
			if(a[n-1]<=n-1){
				break;
			}else{
				a[n-1]-=n;
			}
			for(int i=n-2; i>=0; i--){
				a[i]++;
			}
			ans++;
		}
		System.out.println(ans);
	}
}
