import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		String[] oct = new String[] { "0", "1", "2", "3", "5", "7", "8", "9" };

		String s;
		StringBuilder sb;
		while (!(line = br.readLine()).equals("0")) {
			s = Integer.toOctalString(Integer.parseInt(line));
			sb = new StringBuilder();
			for (char c : s.toCharArray()) {
				sb.append(oct[c - '0']);
			}
			System.out.println(sb.toString());
		}
	}
}