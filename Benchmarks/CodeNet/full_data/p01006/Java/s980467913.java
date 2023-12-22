import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 1000; i++) {
			char[] cs = in.readLine().toCharArray();
			boolean isPass = true;
			for (int n = 1; n < cs.length && isPass; n++) {
				char now = cs[n - 1];
				char next = cs[n];
				isPass &= (now != 'C' && now != 'F' && now + 1 == next)
						|| (now != 'D' && now != 'G' && now - 1 == next)
						|| ('G' > now && now + 3 == next)
						|| ('C' < now && now - 3 == next);
			}
			if (isPass) {
				System.out.println(cs);
			}

		}
	}
}