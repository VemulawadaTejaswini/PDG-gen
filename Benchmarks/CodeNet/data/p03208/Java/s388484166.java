import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] h = new long[N];
		for( int i=0; i<N; i++ ){
			h[i] = sc.nextLong();
		}
		Arrays.sort(h);
		long minium = 1000000000L;
		for( int i=0; i<=N-K; i++ ){
			long ans = h[i-1+K] - h[i];
			minium = Math.min(ans,minium); 
		}
		System.out.println(minium);
	}
}
