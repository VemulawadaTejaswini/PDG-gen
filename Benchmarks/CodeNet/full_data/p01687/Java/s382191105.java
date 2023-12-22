/**
 * D's Ambition
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line = br.readLine();

		int A, I, D, U, N, Y, X;
		A = I = D = U = N = Y = X = 0;
		char[] out = new char[line.length()];

		for (int i = 0; i < line.length(); i++) {
			char c1 = line.charAt(i);
			switch (c1) {
				case 'A':
					A++;
					break;
				case 'I':
					I++;
					break;
				case 'D':
					D++;
					break;
				case 'U':
					U++;
					break;
				case 'N':
					N++;
					break;
				case 'Y':
					Y++;
					break;
				default:
					X++;
					break;
			}
			out[i] = c1;
			//
			if (i >= 8) {
				char c2 = line.charAt(i - 8);
				switch (c2) {
					case 'A':
						A--;
						break;
					case 'I':
						I--;
						break;
					case 'D':
						D--;
						break;
					case 'U':
						U--;
						break;
					case 'N':
						N--;
						break;
					case 'Y':
						Y--;
						break;
					default:
						X--;
						break;
				}
			}
			if (i >= 7) {
				if (A == 2 && I == 1 && D == 1 && U == 1 && N == 2 && Y == 1 && X == 0) {
					for (int j = i - 7, k = 0; j <= i; j++, k++) {
						out[j] = "AIZUNYAN".charAt(k);
					}
				}
			}
		}
		System.out.println(out);
	} //end main
}