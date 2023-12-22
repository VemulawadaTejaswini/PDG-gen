import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PrintStream out = System.out;
		int n = Integer.parseInt(in.readLine());
		if (n < 3 || Math.pow(10, 4) < n)
			throw new RuntimeException("error");
		for (int i = 1; i <= n; i += 1) {
			if (i % 3 == 0) {
				sb.append(i);
				sb.append(" ");
				continue;
			}
			if (i % 10 == 3) {
				sb.append(i);
				sb.append(" ");
				continue;
			}
		}
		out.println(sb);
	}
}