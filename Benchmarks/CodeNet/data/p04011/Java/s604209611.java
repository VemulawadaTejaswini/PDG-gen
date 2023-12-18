import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());

			System.out.println(n-k>0?x*k+y*(n-k):x*n);

		}
	}
}
