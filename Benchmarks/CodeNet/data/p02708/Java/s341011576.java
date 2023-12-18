import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		long sum[]=new long[N+2];
		long ans=0;
		for(int i=2;i<N+2;i++){
			sum[i]=sum[i-1]+i;
		}
		for(int i=K;i<N+2;i++){
			ans+=(sum[N+1]-sum[N+1-i]-sum[i])%1000000007;
			ans%=1000000007;
		}
		System.out.println(ans+1);
	}
}
