import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		loop:for( long i=A[0]; i>0; i-- ){
			for( int k=0; k<N; k++ ){
				if( A[k]%i!=0 ){
					break;
				}
				if( k==N-1 ){
					System.out.println(i);
					break loop;
				}
			}
		}
	}
}
