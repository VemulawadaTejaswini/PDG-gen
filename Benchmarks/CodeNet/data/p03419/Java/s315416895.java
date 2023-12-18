import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		long N = Integer.parseInt(tmp[0]);
		long M = Integer.parseInt(tmp[1]);
		if (N == 1 || M == 1)
			System.out.println(N * M - 2);
		else if (N == 1 && M == 1)
			System.out.println(1);
		else
			System.out.println(N * M - 2 * (N + M - 2));
	}
}
