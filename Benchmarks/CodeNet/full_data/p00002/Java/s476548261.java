import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int ans = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String readLine = in.readLine();
			if (readLine.isEmpty()) {
				break;
			}
			ans = readLine.length() - 1;
			System.out.println(ans);
		}
	}
}