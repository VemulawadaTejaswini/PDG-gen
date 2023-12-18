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
		int w=Reader.nextInt();
		long ans=0;
		long[][] arr=new long[n][2];
		for(int i=0;i<n;i++) {
			arr[i][0]=Reader.nextLong();arr[i][1]=Reader.nextLong();
		}
		if(w<=100000) {
		long[][] dp=new long[2][w+1];
		dp[1][(int)arr[0][0]]=dp[0][(int) arr[0][0]]=arr[0][1];
		ans=arr[0][1];
		for(int i=1;i<n;i++) {
			int now=i%2;
			int last=1-now;
			for(int j=0;j+arr[i][0]<=w;j++) {
				if(dp[last][(int) (j)]!=0 || j==0) {
				dp[now][(int) (j+arr[i][0])]=Math.max(dp[last][j]+arr[i][1], dp[last][(int)(j+arr[i][0])]);
				ans=Math.max(ans, dp[now][(int) (j+arr[i][0])]);
				}
			}
			for(int j=0;j<=w;j++) dp[last][j]=dp[now][j];
		}
		}
		else {
			for(int i=0;i<n;i++) ans+=arr[i][1];
		}
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
