import java.io.*;
import java.text.DecimalFormat;
import java.util.*;  
public class Main {
	static String s,t;
	static Integer memo[][];
	static PrintWriter pw;
	public static void trace(int i, int j)
	{
		if(i==s.length()||j==t.length())return;
		if(s.charAt(i)==t.charAt(j) && dp(i, j)==1 + dp(i+1, j+1))
		{
			pw.print(s.charAt(i)); trace(i+1, j+1);
		}
		else if(dp(i, j)==dp(i+1, j))
		{
			trace(i+1, j);
		}
		else if(dp(i, j)==dp(i, j+1))
		{
			trace(i, j+1);
		}
		else if(dp(i, j)==dp(i+1, j+1))
		{
			trace(i+1, j+1);
		}
	}
	public static int dp(int i, int j)
	{
		if(i==s.length()||j==t.length())return 0;
		if(memo[i][j]!=null)return memo[i][j];
		return memo[i][j]=s.charAt(i)==t.charAt(j)? Math.max(1 + dp(i+1, j+1), Math.max(dp(i+1, j), Math.max(dp(i, j+1),dp(i+1, j+1)))): Math.max(dp(i+1, j), Math.max(dp(i, j+1),dp(i+1, j+1)));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(System.out);
		s= br.readLine(); t= br.readLine();
		memo = new Integer[s.length()][t.length()];
		dp(0,0);
		trace(0, 0);
		pw.close();
	}
}