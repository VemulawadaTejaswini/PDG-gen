import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		
		for ( int i = 0; i < N; i++ ) {
			A[i] = sc.nextInt(); 
		}
		
		Arrays.sort(A, Comparator.reverseOrder());
		
		int Alice = 0;
		int Bob = 0;
		
		for ( int i = 0; i < N; i += 2 ) {
			Alice += A[i];
		}
		
		for ( int i = 1; i < N; i += 2) {
			Bob += A[i];
		}
		System.out.println(Alice - Bob);
		
		sc.close();

	}

}