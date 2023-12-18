import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] nums = new long[N];
		for(int i=0;i<N;++i){
			nums[i] = sc.nextLong();
		}
		long[] sum = new long[N+1];
		sum[0] = 0;
		for(int i=1;i<=N;++i){
			sum[i] += sum[i-1] + nums[i-1];
		}
		
		long ans = 0;
		for(int i=0;i<=N;++i){
			for(int j=i+1;j<=N;++j){
				if(sum[i] == sum[j]) ans++;
			}
		}
		System.out.println(ans);
		return;
	}
}