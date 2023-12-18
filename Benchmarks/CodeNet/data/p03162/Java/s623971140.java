
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
			Reader.init(System.in);

			int n=Reader.nextInt();
			int[] a= new int[n];
			int[] b= new int[n];
			int[] c= new int[n];

			for(int i=0; i<n; i++) {
				a[i]=Reader.nextInt();
				b[i]=Reader.nextInt();
				c[i]=Reader.nextInt();
			}
			
			int[][]dp= new int[n][3];
			
				dp[0][0]=a[0];
				dp[0][1]=b[0];
				dp[0][2]=c[0];
			
			
			for(int i=1; i<n; i++) {
				dp[i][0]=a[i]+Math.max(dp[i-1][1], dp[i-1][2]);
				dp[i][1]=b[i]+Math.max(dp[i-1][0], dp[i-1][2]);
				dp[i][2]=c[i]+Math.max(dp[i-1][0], dp[i-1][1]);
			}
			
			int ans= Math.max(Math.max(dp[n-1][0], dp[n-1][1]),dp[n-1][2]);
			System.out.println(ans);
	}
	}

	class Reader {
	    static BufferedReader reader;
	    static StringTokenizer tokenizer;
	    static void init(InputStream input) {
	        reader = new BufferedReader(
	                     new InputStreamReader(input) );
	        tokenizer = new StringTokenizer("");
	    }

	    static String next() throws IOException {
	        while ( ! tokenizer.hasMoreTokens() ) {

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
	    static long nextLong() throws IOException {
	        return Long.parseLong( next() );
	    }
	    

	}