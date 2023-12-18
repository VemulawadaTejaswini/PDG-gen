import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		StringBuilder output=new StringBuilder("");
		PrintWriter out=new PrintWriter(System.out);
		int n,m;
		n=Reader.nextInt();m=Reader.nextInt();
		int[] degree=new int[n+1];
		ArrayList<Integer>[] graph=new ArrayList[n+1];
		for(int i=0;i<=n;i++) graph[i]=new ArrayList<Integer>();
		for(int i=0;i<m;i++) {
			int a,b;
			a=Reader.nextInt();b=Reader.nextInt();
			graph[b].add(a);
			degree[a]++;
		}
		int[] dp=new int[n+1];
		int[] vis=new int[n+1];
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			if(degree[i]==0) {
				vis[i]=1;
				dp[i]=0;
				q.add(i);
			}
		}
		int ans=1;
		while(q.size()!=0) {
			int a=q.poll();
			for(int i:graph[a]) {
				dp[i]=Math.max(dp[i], 1+dp[a]);
				if(vis[i]==0) {
					vis[i]=1;
					q.add(i);
				}
				ans=Math.max(ans, dp[i]);
			}
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
