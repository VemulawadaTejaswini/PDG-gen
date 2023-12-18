import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[] s = br.readLine().toCharArray();
			int ans = s[0] + s[1] + s[2] - 3 * '0';
			System.out.println(ans);
		}
	}
}
