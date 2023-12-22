import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Blood Group
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int[] bs = new int[4];

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(",");

			if (words[1].length() > 1) {
				bs[2]++;
			} else {
				switch (words[1].charAt(0)) {
					case 'A':
						bs[0]++;
						break;
					case 'B':
						bs[1]++;
						break;
					case 'O':
						bs[3]++;
						break;
				}
			}
		}
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}
	}
}