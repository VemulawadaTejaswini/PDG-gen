import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = in.readLine().split("");
		short size = (short) str.length;
		for (int i = 1; i < size; i += 1) {
			if (str[i].matches("[a-z]")) {
				sb.append(str[i].toUpperCase());
			} else if (str[i].matches("[A-Z]")) {
				sb.append(str[i].toLowerCase());
			} else {
				sb.append(str[i]);
			}
		}
		System.out.println(sb);
	}
}