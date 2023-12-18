

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		int nReq = Reader.nextInt();
		int len = Reader.nextInt();
		int cntB[][] = new int[len][len];
		int cntW[][] = new int[len][len];
		for(int i = 0; i < nReq; i++) {
			int x = Reader.nextInt();
			int y = Reader.nextInt();
			char ch = Reader.next().charAt(0);
			int rx = (x / len) % 2;
			int ry = (y / len) % 2;
			if( (ch == 'B' && (rx + ry) % 2 == 0) ||
				(ch == 'W' && (rx + ry) % 2 == 1) ){
				cntB[x % len][y % len]++;
			}
			else if( (ch == 'W' && (rx + ry) % 2 == 0) || 
					 (ch == 'B' && (rx + ry) % 2 == 1) ){
				cntW[x % len][y % len]++;
			}
		}

		int[][] sumW = new int[len][len];
		int[][] sumB = new int[len][len];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				sumW[i][j] = (i == 0 ? 0 : sumW[i - 1][j]) + 
						(j == 0 ? 0 : sumW[i][j - 1]) - 
						( (i == 0 || j == 0) ? 0 : sumW[i - 1][j - 1]) + 
						cntW[i][j];
				sumB[i][j] = (i == 0 ? 0 : sumB[i - 1][j]) + 
						(j == 0 ? 0 : sumB[i][j - 1]) - 
						( (i == 0 || j == 0) ? 0 : sumB[i - 1][j - 1]) + 
						cntB[i][j];
			}
		}

		int ans = 0;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				int amo = 0;
				amo = (sumB[i][j] + sumB[len - 1][len - 1] - sumB[i][len - 1] - sumB[len - 1][j] + sumB[i][j]) +
						(sumW[i][len - 1] + sumW[len - 1][j] - 2 * sumW[i][j]);
				if(amo > ans)
					ans = amo;
				amo = (sumW[i][j] + sumW[len - 1][len - 1] - sumW[i][len - 1] - sumW[len - 1][j] + sumW[i][j]) +
						(sumB[i][len - 1] + sumB[len - 1][j] - 2 * sumB[i][j]);
				if(amo > ans)
					ans = amo;
			}
		}
		System.out.println(ans);
	}

}

/** Class for buffered reading int and double values */
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
    public static void main(String[] args) {
    	
    }
}