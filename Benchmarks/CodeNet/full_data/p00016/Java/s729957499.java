
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer;

		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			String s1 = reader.readLine();
			String s2 = reader.readLine();
			if (s1.length() > 80 && s2.length() > 80) {
				System.out.println("overflow");
			} else {
				BigInteger b1 = new BigInteger(s1);
				BigInteger b2 = new BigInteger(s2);
				String b = String.valueOf(b1.add(b2));
				System.out.println(b.length() > 80 ? "overflow" : b);
			}
		}
	}

}