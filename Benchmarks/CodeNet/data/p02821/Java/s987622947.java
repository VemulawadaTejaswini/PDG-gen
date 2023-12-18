import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long m=sc.nextLong();
		double[] a=new double[n];
		long[] sum=new long[n+1];
		for(int i=0; i<n; i++){
			a[i]=sc.nextDouble();
		}
		Arrays.sort(a);
		sum[n-1]=(long)a[n-1];
		for(int i=n-2; i>=0; i--){
			sum[i]=sum[i+1]+(long)a[i];
		}
		long left=0;
		long right=200001;
		while(right-left>1){
			long mid=(left+right)/2;
			long count=0;
			for(int i=0; i<n; i++){
				int index=-Arrays.binarySearch(a,mid-a[i]-0.5)-1;
				count+=n-index;
			}
			if(count>=m){
				left=mid;
			}else{
				right=mid;
			}
		}
		long ans=0;
		for(int i=0; i<n; i++){
			int index=-Arrays.binarySearch(a,left-a[i]+0.5)-1;
			m-=n-index;
			ans+=a[i]*(n-index)+sum[index];
		}
		System.out.println(ans+m*left);
	}
}
