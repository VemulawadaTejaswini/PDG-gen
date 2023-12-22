
import java.util.*;
public class Main {
static int mod=(int)1e9+7;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
}
//int dp[]=new int[];
int sum=0;

for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++) {
//		if(dp[a[i]*a[j]]!=0) {
//			sum=(sum+dp[a[i]*a[j]])%mod;
//			System.out.println(-1);
//		}else {
		sum+=(a[i]*a[j])%mod;
//		dp[a[i]*a[j]]=(a[i]*a[j])%mod;
		}
	}

System.out.println(sum);


	}
}