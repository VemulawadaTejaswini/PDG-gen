

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		// ex : This is a pen.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// input sample
		int[] cntAlpha = new int[26];
		char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] firstInput = new char[' '];
		String str;

		// break condition
		while ((str = br.readLine()) != null) {

			firstInput =str.toCharArray(); // Error

			for (int i = 0; i < firstInput.length; i++) {
				// ex : This is a pen.
				// split the Alpha
				if (firstInput[i] == 'a' || firstInput[i] == 'A') {
					cntAlpha[0]++;
					continue;
				} else if (firstInput[i] == 'b' || firstInput[i] == 'B') {
					cntAlpha[1]++;
					continue;
				} else if (firstInput[i] == 'c' || firstInput[i] == 'C') {
					cntAlpha[2]++;
					continue;
				} else if (firstInput[i] == 'd' || firstInput[i] == 'D') {
					cntAlpha[3]++;
					continue;
				} else if (firstInput[i] == 'e' || firstInput[i] == 'E') {
					cntAlpha[4]++;
					continue;
				} else if (firstInput[i] == 'f' || firstInput[i] == 'F') {
					cntAlpha[5]++;
					continue;
				} else if (firstInput[i] == 'g' || firstInput[i] == 'G') {
					cntAlpha[6]++;
					continue;
				} else if (firstInput[i] == 'h' || firstInput[i] == 'H') {
					cntAlpha[7]++;
					continue;
				} else if (firstInput[i] == 'i' || firstInput[i] == 'I') {
					cntAlpha[8]++;
					continue;
				} else if (firstInput[i] == 'j' || firstInput[i] == 'J') {
					cntAlpha[9]++;
					continue;
				} else if (firstInput[i] == 'k' || firstInput[i] == 'K') {
					cntAlpha[10]++;
					continue;
				} else if (firstInput[i] == 'l' || firstInput[i] == 'L') {
					cntAlpha[11]++;
					continue;
				} else if (firstInput[i] == 'm' || firstInput[i] == 'M') {
					cntAlpha[12]++;
					continue;
				} else if (firstInput[i] == 'n' || firstInput[i] == 'N') {
					cntAlpha[13]++;
					continue;
				} else if (firstInput[i] == 'o' || firstInput[i] == 'O') {
					cntAlpha[14]++;
					continue;
				} else if (firstInput[i] == 'p' || firstInput[i] == 'P') {
					cntAlpha[15]++;
					continue;
				} else if (firstInput[i] == 'q' || firstInput[i] == 'Q') {
					cntAlpha[16]++;
					continue;
				} else if (firstInput[i] == 'r' || firstInput[i] == 'R') {
					cntAlpha[17]++;
					continue;
				} else if (firstInput[i] == 's' || firstInput[i] == 'S') {
					cntAlpha[18]++;
					continue;
				} else if (firstInput[i] == 't' || firstInput[i] == 'T') {
					cntAlpha[19]++;
					continue;
				} else if (firstInput[i] == 'u' || firstInput[i] == 'U') {
					cntAlpha[20]++;
					continue;
				} else if (firstInput[i] == 'v' || firstInput[i] == 'V') {
					cntAlpha[21]++;
					continue;
				} else if (firstInput[i] == 'w' || firstInput[i] == 'W') {
					cntAlpha[22]++;
					continue;
				} else if (firstInput[i] == 'x' || firstInput[i] == 'X') {
					cntAlpha[23]++;
					continue;
				} else if (firstInput[i] == 'y' || firstInput[i] == 'Y') {
					cntAlpha[24]++;
					continue;
				} else if (firstInput[i] == 'z' || firstInput[i] == 'Z') {
					cntAlpha[25]++;
					continue;
				}
			}
		}
			for (int i = 0; i < cntAlpha.length; i++)
				System.out.println(alpha[i] + " : " + cntAlpha[i]);
	}
}