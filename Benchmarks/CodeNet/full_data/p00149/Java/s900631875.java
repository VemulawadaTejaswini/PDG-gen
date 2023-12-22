import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] leyes = new int[4];
		int[] reyes = new int[4];

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			double l = Double.parseDouble(line.substring(0, line.indexOf(' ')));
			double r = Double
					.parseDouble(line.substring(line.indexOf(' ') + 1));
			leyes[eyesight(l)]++;
			reyes[eyesight(r)]++;
		}
		for (int i = 3; i >= 0; i--) {
			System.out.println(leyes[i] + " " + reyes[i]);
		}
	}

	static int eyesight(double e) {
		int _e = (int) (e * 10);
		if (_e < 2) {
			return 0;
		} else if (_e < 6) {
			return 1;
		} else if (_e < 11) {
			return 2;
		} else {
			return 3;
		}
	}
}