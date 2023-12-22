import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		
		BigInteger M = new BigInteger("2019");
		long count = 0;
		
		for (int i = 0;   i < S.length(); i++)
		for (int j = i+3; j < S.length(); j++) {
			String str = S.substring(i, j+1);
			BigInteger ss = new BigInteger(str);
			
			BigInteger rem = ss.divideAndRemainder(M)[1];
			if (rem.equals(new BigInteger("0"))) count++;
		}
		
		System.out.println(count);
	}
}