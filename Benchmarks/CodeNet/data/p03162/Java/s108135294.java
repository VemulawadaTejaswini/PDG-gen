import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		StringBuffer output=new StringBuffer("");
		PrintWriter out=new PrintWriter(System.out);
		int n=Reader.nextInt();
		int[][] happiness=new int[n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) happiness[i][j]=Reader.nextInt();
		}
		long[][] dp=new long[n][3];
		dp[0][0]=happiness[0][0];
		dp[0][1]=happiness[0][1];
		dp[0][2]=happiness[0][2];
		for(int i=1;i<n;i++) {
			dp[i][0]=happiness[i][0]+Math.max(dp[i-1][1], dp[i-1][2]);
			dp[i][1]=happiness[i][1]+Math.max(dp[i-1][0], dp[i-1][2]);
			dp[i][2]=happiness[i][2]+Math.max(dp[i-1][1], dp[i-1][0]);
		}
		long ans=0;
		for(int i=0;i<3;i++) ans=Math.max(ans, dp[n-1][i]);
		output.append(ans);
		out.write(output.toString());
		out.flush();
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
    static String nextLine() throws IOException{
    	return reader.readLine();
    }
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
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
