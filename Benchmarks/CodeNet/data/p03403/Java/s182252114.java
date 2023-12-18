import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+1];
		for (int i=1;i<=N;i++) {
			A[i] = sc.nextInt();
		}
		int B[] = new int[N];
		for (int i=0;i<N-1;i++) {
			B[i]= Math.abs(A[i+2]-A[i]);
		}
		long sum = 0;
		for (int i=0;i<N;i++) {
			sum +=Math.abs(A[i+1]-A[i]);
		}
		sum +=Math.abs(A[N]-A[0]);
		for (int i=1;i<N;i++) {
			System.out.println(sum -Math.abs(A[i]-A[i-1])-Math.abs(A[i+1]-A[i])+B[i-1]);
		}
		System.out.println(sum -Math.abs(A[N]-A[N-1]) -Math.abs(A[N]-A[0])+Math.abs(A[N-1]-A[0]));
	}
}