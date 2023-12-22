import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String S = input.nextLine();
		long cnt = 0;
		for (int i = 0; i < S.length(); i++) {
			for (int j = i+3; j <= S.length(); j++) {
				BigInteger test = new BigInteger(S.substring(i,j));
				test = test.mod(new BigInteger("2019"));
				if (test.intValue() == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}