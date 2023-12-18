import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		
		int[] pow = new int[S.length()];
		pow[0] = 1;
		for (int i = 1; i < pow.length; i++) 
			pow[i] = (pow[i-1] * 10) % 2019;
		
		long count = 0;
		
		for (int i = S.length()-1; i >= 3; i--) {
			int rem = Integer.parseInt(S.substring(i-3, i+1)) % 2019;
			if (rem == 0) count++;
			
			for (int j = i - 4; j >= 0; j--)  {
				int dig = S.charAt(j) - '0';
				dig = (dig * pow[i-j]) % 2019;
				
				rem = (rem + dig) % 2019;
				if (rem == 0) count++;
			}
		}
		
		System.out.println(count);
	}
}