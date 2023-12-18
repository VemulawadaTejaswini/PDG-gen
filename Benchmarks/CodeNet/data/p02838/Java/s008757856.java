
import java.util.Scanner;

class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}
		long sum = 0;
		long MOD = 1000000007;
		
		for(int i = 0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				sum += A[i]^A[j];
			}
		} 
		
		System.out.println(sum%MOD);
                
	}


}



