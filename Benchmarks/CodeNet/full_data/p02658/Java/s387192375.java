import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		long res = 1L;
		for (int i = 0; i < N; i++) {
			if (res >= MAX/2 ) {
				res = -1;
				break;
			}
			res = res * A[i];
			if( res > MAX) {
				res = -1;
				break;
			}
		}
		System.out.println(res);
		br.close();
	}

}
