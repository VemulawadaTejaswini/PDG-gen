import java.io.*;
import java.math.*;
import java.util.*;

public class Main { //TLE

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*for (int i = 1; i <= 100; i++) {
			System.out.println(i*2019);
		}*/
		String S = input.nextLine();
		long cnt = 0;
		for (int i = 0; i < S.length(); i++) {
			boolean found = false;
			for (int j = i+3; j <= S.length(); j++) {
				BigInteger test = new BigInteger(S.substring(i,j));
				test = test.mod(new BigInteger("2019"));
				if (test.intValue() == 0) {
					cnt++;
					found = true;
					for (int track = j+1; j < S.length(); j++) {
						if (S.charAt(track)=='0') cnt++;
						else break;
					}
				}
				if (found) break;
			}
		}
		System.out.println(cnt);
	}
}