import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String str = null;
		String rst = null;
		if (s != null) {
			str = s.substring(2);
			rst = s.substring(2, 4) + s.substring(4);
			System.out.println(str.equals(rst) ? "Yes" : "No");
		}
	}
}
