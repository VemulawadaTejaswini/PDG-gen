import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
			if ("?".equals(str[1])) {
				break;
			}
			if ("+".equals(str[1])) {
				sb.append(Integer.toString(a + b)).append("\n");
			}
			if ("-".equals(str[1])) {
				sb.append(Integer.toString(a - b)).append("\n");
			}
			if ("*".equals(str[1])) {
				sb.append(Integer.toString(a * b)).append("\n");
			}
			if ("/".equals(str[1])) {
				sb.append(Integer.toString(a / b)).append("\n");
			}
		}
		System.out.print(sb);

	}

}