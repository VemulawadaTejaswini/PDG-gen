import java.util.Scanner;
public class Main {
	static int N;
	static int K;
	public static long calc(int n) {
		long max=0;
		long min=0;
		for(int i=0;i<n;i++) {
			min+=i;
			max+=(N-i);
		}
		return max-min+1;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		long ans=0;
		for(int i=K;i<=N+1;i++) {
			ans+=calc(i);
			ans%=1000000007;
		}
		System.out.println(ans);
	}
}
