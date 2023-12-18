import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long X = sc.nextLong();
		long[] A = new long[N+1];
		long[] dis = new long[N];
		for( int i=1; i<=N; i++ ){
			A[i] = sc.nextLong();
		}
		A[0] = X;
		Arrays.sort(A);
		for( int i=1; i<=N; i++ ){
			dis[i-1] = A[i] - A[i-1];
		}
		Arrays.sort(dis);
		long ans = 0;
		for( long i=1; i*i<=dis[0]; i++ ){
			if( dis[0]%i==0 ){
				for( int k=0; k<N; k++ ){
					if( dis[k]%i!=0 ){
						break;
					}
					if( k==N-1 ){
						ans = i;
					}
				}
			}
		}
		for( int i=0; i<N; i++ ){
			if( dis[i]%dis[0]!=0 ){
				break;
			}
			if( i==N-1 ){
				ans = dis[0];
			}
		}
		System.out.println(ans);
	}
}
