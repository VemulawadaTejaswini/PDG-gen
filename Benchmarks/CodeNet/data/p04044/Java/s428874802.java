
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");

		int L = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);

		String[] S = new String[N];

		for (int i = 0; i < N; i++) {
			S[i] = br.readLine();
		}
		Arrays.sort(S);
		for (int i = 0; i < N; i++) {
			System.out.print(S[i]);
		}
	}

}
