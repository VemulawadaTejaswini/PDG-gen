import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextInt();
		long mod = 1000000007;
		long T = 1;
		for(long i = 0; i < N - 2; i ++) {
			T = (T * 10) % mod;
		}
		long S = (N * (N - 1)) % mod;
		
		System.out.println(S * T % mod);
	}
}