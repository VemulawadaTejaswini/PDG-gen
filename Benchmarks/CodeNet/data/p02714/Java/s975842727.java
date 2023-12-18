import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String S = in.readLine();
		
		long[] amt = new long[6];
		
		/*
		 *  0 R
		 *  1 G
		 *  2 B
		 *  
		 *  3 RG
		 *  4 RB
		 *  5 GB
		 */
		
		long sum = 0;
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			
			if (c == 'R') {
				amt[0]++;
				amt[3] += amt[1];
				amt[4] += amt[2];
				
				sum += amt[5];
			}else if (c == 'G') {
				amt[1]++;
				amt[3] += amt[0];
				amt[5] += amt[2];
				
				sum += amt[4];
			}else {
				amt[2]++;
				amt[4] += amt[0];
				amt[5] += amt[1];
				
				sum += amt[3];
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= Math.min(i, N-1-i); j++) {
				char c1 = S.charAt(i-j);
				char c2 = S.charAt(i);
				char c3 = S.charAt(i+j);
				if (c1 != c2 && c1 != c3 && c2 != c3)
					sum--;
			}
		}
		
		System.out.println(sum);
	}
}
