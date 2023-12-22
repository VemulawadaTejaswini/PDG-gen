import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			char[] word = line.toCharArray();
			int N = Integer.parseInt(br.readLine());
			int count = 0;

			outer1:
			for (int i = 0; i < N; i++) {
				char[] ring = br.readLine().toCharArray();
				outer2:
				for (int j = 0; j < ring.length + word.length; j++) {
					if (ring[j % ring.length] == word[0]) {
						for (int k = 1; k < word.length; k++) {
							if (word[k] != ring[(j + k) % ring.length]) {
								j += k;
								continue outer2;
							}
						}
						count++;
						continue outer1;
					}
				}
			}
			System.out.println(count);
		}
	}
}