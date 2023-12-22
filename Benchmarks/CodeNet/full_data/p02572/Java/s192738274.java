import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
		}
		long[] suf = new long[n];
		suf[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--){
			suf[i]=arr[i]+suf[i+1];
		}
		long ans=0;
		long mod = 1000000007;
		for(int i=0;i<n-1;i++){
			ans= (ans+(arr[i]%mod*suf[i+1]%mod)%mod)%mod;
		}
		System.out.println(ans);
	}
}