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
		for( int i=0; i<N-1; i++ ){
			if( A[i]==A[i+1] ){
				System.out.println("NO");
				break;
			}
			if( i==N-2 ){
				System.out.println("YES");
			}
		}
	}
}