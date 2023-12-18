import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double M = sc.nextDouble();
		double[] A = new double[N];
		double total = 0;
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextDouble();
			total += A[i];
		}
		Arrays.sort(A);
		double P = total/(4*M);
		for( int i=N-1; i>=N-M; i-- ){
			if( A[i]<P ){
				System.out.println("No");
				break;
			}
			if( i==N-M ){
				System.out.println("Yes");
				break;
			}
		}
	}
}