import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String Array[] = new String[N];
		BigInteger A[] = new BigInteger[N];
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("0");
		BigInteger m = new BigInteger("1000000007");
		int n = 1;
		
		for(int i = 0; i < N; i++) {
			Array[i] = in.next();
			A[i] = new BigInteger(Array[i]);
		}
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j < N - n; j++) {
				a = A[i].multiply(A[j + n]);
				b = b.add(a);
			}
			n++;
		}
		
		System.out.println(b.remainder(m));
	}
}
