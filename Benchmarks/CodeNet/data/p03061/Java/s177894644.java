import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		BigInteger[] A = new BigInteger[N];
		BigInteger[] gcd = new BigInteger[N];
		BigInteger[] reverse = new BigInteger[N];
		for (int i = 0; i < N;i++) {
			A[i] = new BigInteger(reader.next());
			if (i > 0) {
				gcd[i] = A[i].gcd(gcd[i-1]);
			} else {
				gcd[i] = A[i];
			}
		}
		for (int i = N-1; i >=0 ;i--) {
			if (i < N-1) {
				reverse[i] = A[i].gcd(reverse[i+1]);
			} else {
				reverse[i] = A[i];
			}
		}
		long ans = Math.max(gcd[N-2].longValue(), reverse[1].longValue());
		for (int i = 1; i < N-1;i++) {
			BigInteger a = gcd[i-1].gcd(reverse[i+1]);
			ans = Math.max(a.longValue(), ans);
		}





		System.out.println(ans);
		reader.close();

	}
}



