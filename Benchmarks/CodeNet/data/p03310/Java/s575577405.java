import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n+1];
		for(int i=1; i<=n; i++){
			a[i]=sc.nextLong()+a[i-1];
		}
		long ans=Long.MAX_VALUE;
		for(int i=3; i<n; i++){
			int left=1;
			int right=i-1;
			int l=0;
			int r=0;
			while(right-left>1){
				int mid=(right+left)/2;
				if(a[i-1]-a[mid-1]>a[mid-1]){
					left=mid;
				}else{
					right=mid;
				}
			}
			if(a[i-1]-a[left-1]-a[left-1]>-a[i-1]+a[right-1]+a[right-1]){
				l=right;
			}else{
				l=left;
			}
			left=i;
			right=n;
			while(right-left>1){
				int mid=(right+left)/2;
				if(a[n]-a[mid-1]>a[mid-1]-a[i-1]){
					left=mid;
				}else{
					right=mid;
				}
			}
			if(a[n]-a[left-1]-a[left-1]+a[i-1]>-a[n]+a[right-1]+a[right-1]-a[i-1]){
				r=right;
			}else{
				r=left;
			}
			long max=Math.max(Math.max(a[l-1],a[n]-a[r-1]),Math.max(a[i-1]-a[l-1],a[r-1]-a[i-1]));
			long min=Math.min(Math.min(a[l-1],a[n]-a[r-1]),Math.min(a[i-1]-a[l-1],a[r-1]-a[i-1]));
			ans=Math.min(ans,max-min);
		}
		System.out.println(ans);
	}
}
