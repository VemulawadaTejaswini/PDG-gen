import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		StringBuilder sb = new StringBuilder("");

		for(int i = 0; i < text.length(); i++) {
			sb.append("x");
		}
		System.out.println(sb);

	}
}