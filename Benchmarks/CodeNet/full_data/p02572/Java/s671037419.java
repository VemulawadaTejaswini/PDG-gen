import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		final long M = 1000000007;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(tokens[i]);
		long sum = 0;
		for (int i = 1; i < n; i++) {
			sum += a[i];
		}
		long ans = (a[0]*sum%M)%M;
		for (int i = 1; i < n-1; i++) {
			sum -= a[i];
			ans = ((a[i]*sum%M)%M+ans)%M;
		}
		System.out.println(ans);
	}
}
