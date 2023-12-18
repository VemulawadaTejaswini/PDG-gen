import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		sc.close();

		for(int i = 1;i <= K;i++) {
			long combi1 = combi(N-K+1,i);
			long combi2 = combi(K-1,i-1);
			System.out.println(combi1*combi2);
		}
	}

	private static long combi(long i,long j) {
		if(j==0) {
			return 1;
		}
		return i * combi(i-1,j-1) / j %1_000_000_007;
	}
}