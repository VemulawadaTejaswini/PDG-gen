import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] W = new int[N+1];
		int total = 0;
		for ( int i = 1; i <= N; i++ ) {
			W[i] = in.nextInt();
			total += W[i];
		}

		int s1 = 0;
		int s2 = total;
		int diff = Integer.MAX_VALUE;
		for ( int t = 1; t < N; t++ ) {
			s1 += W[t];
			s2 -= W[t];
			if ( diff > Math.abs(s1 - s2) ) diff = Math.abs(s1 - s2);
		}
		System.out.println(diff);
		in.close();
	}
}