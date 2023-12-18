import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private static final long MOD = (long)Math.pow(10, 9) + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		for(int i = 1;i <= K;i++) {
			BigInteger combi1 = new BigInteger(String.valueOf(combination(N-K+1,i)));
			BigInteger combi2 = new BigInteger(String.valueOf(combination(K-1,i-1)));
			System.out.println(Long.parseLong(combi1.toString())
					*Long.parseLong(combi2.toString())%MOD);
		}
	}

	public static long combination(int i,int j) {
		if(j==0) {
			return 1;
		}
		BigInteger k = new BigInteger(String.valueOf(combination(i-1,j-1)));
		return  Long.parseLong(k.toString())* i / j %MOD;
	}
}