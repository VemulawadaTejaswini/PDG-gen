import java.util.Scanner;
public class Main {
	static int N;
	static int K;
	static long[] max;
	static long[] min;
	public static long calc(int i) {
		if(i==K) {
			for(int j=0;j<i;j++) {
				max[i-K]+=N-j;
				min[i-K]+=j;
			}
			return max[i-K]-min[i-K]+1;
			}
		else{
			max[i-K]=max[i-K-1]+(N+1-i);
			min[i-K]=min[i-K-1]+i-1;
		return max[i-K]-min[i-K]+1;
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		max=new long[N+2-K];
		min=new long[N+2-K];
		max[0]=0;
		min[0]=0;
		long ans=0;
		for(int i=K;i<=N+1;i++) {
			ans+=calc(i);
			ans%=1000000007;
		}
		System.out.println(ans);
	}
}
