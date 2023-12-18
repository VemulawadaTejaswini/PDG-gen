import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		StringBuilder output=new StringBuilder("");
		PrintWriter out=new PrintWriter(System.out);
		String s=Reader.next();
		String t=Reader.next();
		int[][][] dp=new int[s.length()+1][t.length()+1][2];
		//Stack<Character> stk=new Stack<Character>();
		for(int i=1;i<=s.length();i++) {
			for(int j=1;j<=t.length();j++) {
				char a=s.charAt(i-1);char b=t.charAt(j-1);
				int l1=0,l2=0,l3=0;
				if(a==b) l1= 1+dp[i-1][j-1][0];
				else l1=dp[i-1][j-1][0];
				l2=dp[i-1][j][0];
				l3=dp[i][j-1][0];
				if(l1>=l2) {
					if(l1>=l3) {
						dp[i][j][0]=l1;
						dp[i][j][1]=3;
						//if(a==b) dp[i][j][2]=1;
					}
					else {
						dp[i][j][0]=l3;
						dp[i][j][1]=1;
					}
				}
				else {
					if(l2>=l3) {
						dp[i][j][0]=l2;
						dp[i][j][1]=2;
					}
					else {
						dp[i][j][0]=l3;
						dp[i][j][1]=1;
					}
				}
				
			}
		}
		int i=s.length(),j=t.length();
		while(i>0 && j>0) {
			if(dp[i][j][1]==3) {
				if(s.charAt(i-1)==t.charAt(j-1))
					output.append(s.charAt(i-1));
				i--;
				j--;
			}
			else if(dp[i][j][1]==1) {
				j--;
			}
			else i--;
		}
		output.reverse();
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
