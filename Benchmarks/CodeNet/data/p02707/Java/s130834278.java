import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long[] A = new long[2*10^5];
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		for(long i = 0;i<N-1;i++) {
			long number = scn.nextLong();
			for(long j = 1;j<N+1;j++) {
				if(number == j) {
					A[(int) j] += 1;
				}
			}
		}
		for(long i = 1;i<N+1;i++) {
			System.out.println(A[(int) i]);
		}

	}

}
