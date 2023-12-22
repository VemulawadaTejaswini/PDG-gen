import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();

		int cnt = 0;
		for (int i = 0; i < s.length() - 1; ++i) {
			for (int j = i + 2; j <= s.length(); ++j) {
				String p = s.substring(i, j);
				long px = Long.parseLong(p);
				if (px % 2019 == 0) {
					++cnt;
//					System.out.println(String.format("(%d,%d)", i, j));
				}
			}
		}

		System.out.println(cnt);

		r.close();
	}
}