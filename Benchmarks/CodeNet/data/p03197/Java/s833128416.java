import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans ^= a[i];
		}
		System.out.println(ans % 2 == 1 ? "first" : "second");
	}
}
