import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		int m;
		String line;

		while ((!(line = br.readLine()).equals("-"))) {
			sb = new StringBuilder(line);
			m = Integer.parseInt(br.readLine());
			for (int i = 0; i < m; i++) {
				int h = Integer.parseInt(br.readLine());
				sb.append(sb.substring(0, h));
				sb.delete(0, h);
			}
			System.out.println(sb.toString());
		}
	}
}