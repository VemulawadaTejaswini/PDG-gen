import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] A = new String[N];
		String[] B = new String[N];
		String[] C = new String[N - 1];
		A = br.readLine().split(" ");
		B = br.readLine().split(" ");
		C = br.readLine().split(" ");

		int result = 0;
		int code = 0;

		for (int i = 0; i < N; i++) {
			code = Integer.parseInt(A[0]);
			result += Integer.parseInt(B[code]);
			result += Integer.parseInt(C[code - 1]);
		}

		System.out.println(result);

	}

}
