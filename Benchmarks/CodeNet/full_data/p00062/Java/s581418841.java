import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int solve (char[] c) {
		if (c.length == 1) return c[0] - '0';
		String ret = "";
		for (int i = 0; i < c.length - 1; i++)
			ret += ((c[i] - '0') + (c[i + 1] - '0')) % 10;
		return solve(ret.toCharArray());
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			System.out.println(solve(line.toCharArray()));
			line = null;
		}

	}

}