import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	static int[] arr;
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String[] wrods = br.readLine().split(" ");
		arr = new int[wrods.length];
		BigInteger t = BigInteger.ONE;
		for (int i = 0; i < N; i++) {
			arr[i ] = Integer.parseInt(wrods[i ]);
			BigInteger tmp = BigInteger.valueOf(arr[i]);
			BigInteger A = t.gcd(tmp);
			t = t.multiply( tmp ).divide(A);
		}
		BigInteger sum = BigInteger.ZERO;
		for(int i=0;i<N;i++) {
			BigInteger s  = t.divide(BigInteger.valueOf(arr[i]));
			sum = s.add(sum);
		}
		System.out.println(sum.mod(BigInteger.valueOf(1000000007)).longValue());
		br.close();
	}
}