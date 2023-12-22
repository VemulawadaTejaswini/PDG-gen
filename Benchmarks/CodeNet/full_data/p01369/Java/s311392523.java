import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		boolean[] qwerty = new boolean[127];
		for (int i = 'a'; i <= 'z'; i++) {
			if ("yuiophjklnm".indexOf(i) != -1) {
				qwerty[i] = true;
			}
		}

		while (!(line = br.readLine()).equals("#")) {
			boolean hand = qwerty[line.charAt(0)];
			int sum = 0;
			for (char c : line.substring(1).toCharArray()) {
				if (qwerty[c] != hand) {
					sum++;
					hand = qwerty[c];
				}
			}
			System.out.println(sum);
		}
	}
}