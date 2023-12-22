import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_1_D
 * 
 * @author Kyoro
 */
public class Main {

	int S;

	public void read() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		S = Integer.parseInt(reader.readLine());
	}

	public String solve() {
		return String.format("%d:%d:%d", S / 3600, S / 60 % 60, S % 60);
	}

	public static void main(String[] args) {
		Main main = new Main();
		try {
			main.read();
			out.println(main.solve());
		} catch (IOException e) {
			err.println(e);
		}
	}
}

