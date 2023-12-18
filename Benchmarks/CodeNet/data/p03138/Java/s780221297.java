import java.io.*;

class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long k = sc.nextLong();
		int K = (int)k;
		long A[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}

		long B[] = new long[K+1];
		for (int i=0;i<K+1;i++) {
			B[i] = f(i,N,A);
		}
		Arrays.sort(B);
		System.out.println(B[K]);

		int a=3;
		int b=1;
/*
		String D = Integer.toBinaryString(a);
		System.out.println(D);

		String B = Integer.toBinaryString(b);
		System.out.println(B);
*/
		int c = a^b;

	}

	static long f(long X,int N,long[] A) {
		long sum = 0;
		for (int i=0;i<N;i++) {
			sum += X^A[i];
		}
		return sum;
	}
}