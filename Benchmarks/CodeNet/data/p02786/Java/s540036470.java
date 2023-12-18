

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	private static BufferedReader br;
	private static StringTokenizer tokenizer;
	public static String next() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null)
                throw new IOException();
            tokenizer = new StringTokenizer(line);
        }
        return tokenizer.nextToken();
    } 
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    } 
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    } 
    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    
	public static void main(String[] args) throws IOException {		
		
		br = new BufferedReader(new InputStreamReader(System.in));
		long h = nextLong();
		long n=1,sum = 0;
		while(h>0) {
			sum += n;
			h = h/2;
			n *= 2;
		}
		System.out.println(sum);
	}
}




















