import java.util.Scanner;

public class Main {

	private static final long MOD = (long)Math.pow(10, 9) + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		for(int i = 1;i <= K;i++) {
			long combi1 = combination(N-K+1,i);
			long combi2 = combination(K-1,i-1);
			System.out.println(combi1*combi2%MOD);
		}
	}

	public static long combination(int i,int j) {
		if(j==0) {
			return 1;
		}
		return combination(i-1,j-1) * i / j %MOD;
	}
}