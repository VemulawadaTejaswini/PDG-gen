import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] a = new long[5];
		long min=Long.MAX_VALUE;
		for(int i = 0; i<5; i++){
			a[i]=sc.nextLong();
			if(a[i]<min){
				min=a[i];
			}
		}
		long ans=0;
		long count=n;
		for(int i = 0; i<5; i++){
			if(i==0){
				ans+=Math.ceil((double)n/a[i]);
				count=n%a[i]==0?a[i]:n%a[i];
				continue;
			}
			if(a[i-1]<=a[i]){
				ans++;
				continue;
			}
			ans+=(Math.ceil((double)(count)/a[i]))>0?Math.ceil((double)(count)/a[i]):1;
         	count=(count%a[i]+a[i-1]-a[i]);
			if(min==a[i]){
				ans+=4-i;
				break;
			}
		}
		System.out.println(ans);
	}
}
