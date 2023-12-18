import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");

		int A = Integer.parseInt(tmp[0]);
		int P = Integer.parseInt(tmp[1]);

		int k = A*3 + P;

		System.out.println(k/2);
	}
}
