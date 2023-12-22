import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Icicles
 */
public class Main {

	static final boolean BROKEN = false;
	static final boolean GROWING = true;

	static int[] icicles;
	static boolean[] growths;

	static int maxLen;
	static int count;
	static int elapse;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int l = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			icicles = new int[n];
			growths = new boolean[n];

			count = 0;
			elapse = 0;

			// read
			for (int i = 0; i < n; i++) {
				icicles[i] = Integer.parseInt(br.readLine());
			}

			// solve
			maxLen = getMaxLength();

			while (count > 0) {
				int delta = l - maxLen;
				elapse += delta;
				for (int i = 0; i < n; i++) {
					if (growths[i]) {
						if (icicles[i] == maxLen) {
							icicles[i] = 0;
							growths[i] = BROKEN;
							count--;
						} else {
							icicles[i] += delta;
						}
					}
				}
				maxLen = getMaxLength();
			}
			System.out.println(elapse);
		}

	}

	static int getMaxLength() {

		int max = 0;
		int n = icicles.length;

		if (icicles[0] > icicles[1]) {
			if (!growths[0]) {
				growths[0] = GROWING;
				count++;
			}
			if (icicles[0] > max) {
				max = icicles[0];
			}
		}

		if (n > 2) {
			for (int i = 1; i < n - 1; i++) {
				if (icicles[i] > icicles[i - 1] && icicles[i] > icicles[i + 1]) {
					if (!growths[i]) {
						growths[i] = GROWING;
						count++;
					}
					if (icicles[i] > max) {
						max = icicles[i];
					}
				}
			}
		}

		if (icicles[n - 1] > icicles[n - 2]) {
			if (!growths[n - 1]) {
				growths[n - 1] = GROWING;
				count++;
			}
			if (icicles[n - 1] > max) {
				max = icicles[n - 1];
			}
		}

		return max;

	}
}