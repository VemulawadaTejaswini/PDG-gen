import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int q = Integer.parseInt(s[1]);

		String acgt = br.readLine();

		for (int j = 0; j < q; j++) {

			String[] lr = br.readLine().split(" ");
			int l = Integer.parseInt(lr[0]);
			int r = Integer.parseInt(lr[1]);
			String substr = acgt.substring(l - 1, r);
			coreProc(substr.toCharArray());
		}
	}

	private static void coreProc(char[] cArray) {
		int numAc = 0;

		for (int i = 0; i < cArray.length - 1; i++) {
			if (cArray[i] != 'A') {
				continue;
			}
			if (cArray[++i] == 'C') {
				numAc++;
			}
		}
		System.out.println(numAc);
	}
}
