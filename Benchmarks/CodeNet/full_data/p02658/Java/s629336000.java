import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	static int N;
	static long[] A;
	static long MAX = (long) 1e18;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String[] word = br.readLine().split("\\s+");
		A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = Long.valueOf(word[i]);
		}
		Arrays.sort(A);
		BigInteger res = BigInteger.ONE;
		for (int i = 0; i < N; i++) {
			res = res.multiply(BigInteger.valueOf(A[i]));
			if ( res.compareTo(BigInteger.valueOf(MAX) ) > 0 ){
				System.out.println(-1);
				br.close();
				return;
			}

		}
		System.out.println(res);
		br.close();
	}

}
