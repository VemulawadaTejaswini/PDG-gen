import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int num = Integer.parseInt(W.split(" ")[0]);

		String Y = in.readLine();
		int[] n = new int[num];
		int[] match = new int[num];

		for (int i = 0; i < num; i++) {
			n[i] = Integer.parseInt(Y.split(" ")[i]);
		}

		for (int j = 0; j < num; j++) {
			if (n[0] == n[j]) {
				match[0]++;
			}
		}
		match[0]--;

		int sum = match[0];

		for (int i = 1; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (n[i] == n[j]) {
					if (j < i) {
						match[i] = match[j] + 1;
						break;
					} else {
						match[i]++;
					}
				}
			}
			match[i]--;
			sum += match[i];
		}


		sum /= 2;

		for (int i = 0; i < num; i++) {
			System.out.println(sum - match[i]);
		}

	}

}