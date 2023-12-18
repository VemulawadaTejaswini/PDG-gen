import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long sum =0;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong()-i-1;
			sum +=A[i];
		}
		long re = 0;
		for (int i=0;i<N;i++) {
			re+=Math.abs(A[i]-sum/N);
		}
		long max =re;
		re=0;
		for (int i=0;i<N;i++) {
			re+=Math.abs(A[i]-sum/N+1);
		}
		if (re<max) {
			System.out.println(re);
		} else {
			System.out.println(max);
		}
	}
}