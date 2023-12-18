import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] T = new long[N];
		for( int i=0; i<N; i++ ){
			T[i] = sc.nextLong();
		}
		Arrays.sort(T);
		long max = 0;
		loop:for( long i=1; i<=1000000000000000000L/T[N-1]; i++ ){
			max = T[N-1]*i;
			for( int k=0; k<N; k++ ){
				if( max%T[k]!=0 ){
					break;
				}
				if( k==N-1 ){
					System.out.println(max);
					break loop;
				}
			}
		}
	}
}
