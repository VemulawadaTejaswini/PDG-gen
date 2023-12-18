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
		for(int i = 0; i<5; i++){
			if(i==0){
				ans+=Math.ceil((double)n/a[i]);
				continue;
			}
			if(i!=0 && a[i-1]<=a[i]){
				ans++;
				continue;
			}
			ans+=(a[0]%n+a[i-1]-a[i])>a[i]?2:1;
			if(min==a[i]){
				ans+=4-i;
				break;
			}
		}
		System.out.println(ans);
	}
}
