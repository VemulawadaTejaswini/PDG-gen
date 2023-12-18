import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if (n < k) {
			System.out.println(n * x);
		} else {
			System.out.println((k * x) + ((n - k) * y));
		}
	}
}
