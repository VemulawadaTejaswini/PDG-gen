import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PrintStream out = System.out;
		int n = Integer.parseInt(in.readLine());// 要素数n
		String[] str = new String[n];
		str = in.readLine().split(" ");
		for (int i = 1; i <= n; i += 1) {
			if (i == n) {
				sb.append(str[n - i]);
				break;
			} else {
				sb.append(str[n - i]);
				sb.append(" ");
			}
		}
		out.println(sb);
	}
}