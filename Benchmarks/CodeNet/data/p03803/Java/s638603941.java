import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = br.readLine().split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);

		if (a == 1) {
			a += 13;
		}
		if (b == 1) {
			b += 13;
		}

		String result;
		if (a > b) {
			result = "Alice";
		} else if (a == b) {
			result = "Draw";
		} else {
			result = "Bob";
		}

		br.close();
	}
}


