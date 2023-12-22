import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		if (n < 3 || Math.pow(10, 4) < n)
			throw new RuntimeException("error");
		call(n);
	}

	public static void call(int n) {
		PrintStream out = System.out;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i += 1) {
			if (i == n) {
				sb.append(i);
				break;
			}
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