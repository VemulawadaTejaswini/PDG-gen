

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		/*
		 * ?????? ???.length < 10 ?????? ??´.length < 1000
		 *
		 * T.contains " " or Enter Ti
		 *
		 * All Ti -> T.contains cnt?
		 *
		 * Example) input- W : computer
		 *
		 * T1: Nurtures computer scientists and highly-skilled computerengineers
		 * T2: who will create and exploit "knowledge" for the newera.
		 * T3: Provides an outstanding computer environment.
		 * T4: END_OF_TEXT if(t4.equl("END_OF_TEXT"))break;
		 *
		 * output- 3
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// declear variable
		String infoW = "", strT[];
		int cnt = 0;

		// input sample
		infoW = br.readLine();

		// while section
		// break condition
		while ((strT = br.readLine().split(" "))!=null) {
			// input info
			strT = br.readLine().split(" ");

			// break condition
			if (strT.equals("END_OF_TEXT")) {
				// output
				System.out.println(cnt);
				break;
			}
			for (int i = 0; i < strT.length; i++) {
				if (strT[i].contains(infoW))
					cnt++;
			}
		}
	}
}