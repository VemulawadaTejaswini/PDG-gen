import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N+1];
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextLong();
		}
		A[N] = 1000000001L;
		Arrays.sort(A);
		int ans = 0;
		int count = 1;
		for( int i=1; i<=N; i++ ){
			if( A[i]==A[i-1] ){
				count++;
			}
			if( A[i]!=A[i-1] ){
				if( count%2!=0 ){
					ans++;
				}
				count = 1;
			}
		}
		System.out.println(ans);
	}
}
