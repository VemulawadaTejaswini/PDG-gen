import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();

		long max = 0;
		long ans =0;
		for(long i = 1; i<=N;i++) {
			long tmp = floor(A*i,B)-A*floor(i,B);
			if(max<Math.max(max, tmp)) {
				ans = i;
				max = Math.max(max, tmp);
			}
			if(100000000<N) {
				i=99999999;
			}
		}

		System.out.println(max);
	}

	private static long floor(long a,long b) {
		return a/b;

	}
}