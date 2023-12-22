import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		boolean[] p = new boolean[31];
		while ((line = br.readLine()) != null) {
			p[Integer.parseInt(line)] = true;
		}
		for (int i = 1; i < 31; i++) {
			if (!p[i])
				System.out.println(i);
		}
	}
}