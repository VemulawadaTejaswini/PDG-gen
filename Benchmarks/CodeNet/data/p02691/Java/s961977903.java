import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		int count = 0;
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextInt();
		}
		for( int i=1; i<N; i++ ){
			for( int k=1; k<N-i; k++ ){
				if( A[k]+A[k+i]==i ){
					count++;
				}                
			}
		}
		System.out.println(count);
	}
}
