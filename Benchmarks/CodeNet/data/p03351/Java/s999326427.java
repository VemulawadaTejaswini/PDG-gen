package atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class myramaa {
	public static void main(String args[]) throws IOException {
		Reader.init(System.in);
		int a=Reader.nextInt();
		int b=Reader.nextInt();
		int c=Reader.nextInt();
		int d=Reader.nextInt();
		if(Math.abs(a-c)<=d) {
			System.out.println("Yes");
		}
		else if(Math.abs(a-b)<=d && Math.abs(b-c)<=d) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}

