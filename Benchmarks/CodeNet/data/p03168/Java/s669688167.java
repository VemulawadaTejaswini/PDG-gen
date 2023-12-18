import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		StringBuilder output=new StringBuilder("");
		PrintWriter out=new PrintWriter(System.out);
		int n=Reader.nextInt();
		double[] arr=new double[n+1];
		for(int i=1;i<=n;i++) arr[i]=Reader.nextDouble();
		double[][] dp=new double[n+1][n+1];
		dp[1][0]=1-arr[1];
		dp[1][1]=arr[1];
		for(int i=2;i<=n;i++) {
			dp[i][0]=(dp[i-1][0]*(1-arr[i]));
			for(int j=1;j<=i;j++) {
				dp[i][j]=dp[i-1][j]*(1-arr[i])+dp[i-1][j-1]*arr[i];
			}
		}
		double ans=0;
		for(int i=1;i<=n;i++) {
			if(i>n-i) {
				ans+=dp[n][i];
			}
		}
		output.append(ans);
		out.write(output.toString());
		out.flush();
	}

}

class DE{
	int a;
	int b;
	int c;
	DE(int aa,int ab){
		a=aa;b=ab;
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




 
 

 
