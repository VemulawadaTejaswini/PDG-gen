

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ", 0);
		int K = Integer.parseInt(s[0]);
		int S = Integer.parseInt(s[1]);
		int X, Y, Z = 0;
		int count = 0;
		for (X = 0; X <= K; X++) {
			for (Y = 0; Y <= K; Y++) {
				if (X + Y + Z == S) {
					count += 1;
					break;
				}
				for (Z = 0; Z <= K; Z++) {
					if (X + Y + Z == S) {
						count += 1;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
}