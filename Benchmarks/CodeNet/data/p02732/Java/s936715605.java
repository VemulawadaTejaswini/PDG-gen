import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] A;
	int[] c;
	
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		c = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt() - 1;
			c[A[i]]++;
		}
		
		long s = 0;
		for (int i = 0; i < N; i++) {
			s += (long)c[i]*(c[i]-1)/2;
		}
		
		for (int k = 0; k < N; k++)
			System.out.println( s - c[A[k]] + 1 );
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
