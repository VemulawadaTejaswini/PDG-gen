import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }

    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }

    public String nextLine() throws IOException {
        return reader.readLine();
    }
    
}

public class Main{
	public static void main(String args[]) throws IOException{
    	Reader.init();
      	int N=Reader.nextInt();
      	String S=Reader.next();
  		
      	int dp[][]=new int[N][N+1];
      	int res=0;
      	int max=N/2;
      	for(int i=N-2;i>=0;i--){
        	for(int j=N-1;j>i;j--){
            	if(S.charAt(i)==S.charAt(j)){
                	dp[i][j]=1+dp[i+1][j+1];
                }
              	else{
                	dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
                }
                if(dp[i][j]<=max){
                    res=Math.max(res, dp[i][j]);
                }
            }
        }
        
        // for(int i=0;i<N;i++){
        //     System.out.println(Arrays.toString(dp[i]));
        // }
		System.out.println(res);
    }      
}