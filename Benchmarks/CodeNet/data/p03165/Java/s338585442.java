import java.util.*;
import java.io.*;
public class Main {
	
	static Integer[][] memo;
	static char[] x;
	static char[] y;
	static StringBuilder sb;
  public static void main(String args[]) throws IOException {
	  
	  Scanner sc=new Scanner(System.in);
		  
		  x=sc.next().toCharArray();
		  y=sc.next().toCharArray();
		  
		  memo=new Integer[x.length][y.length];
		  sb=new StringBuilder("");
		  dp(0,0);
		  trace(0,0);
		  System.out.println(sb);
		  
  }
  
  public static void trace(int i,int j) {
	  
	  if(i==x.length||j==y.length) {
		  return;
	  }
	  
	  if(dp(i,j)==1+dp(i+1,j+1)&&x[i]==y[j]) {
		  sb.append(x[i]);
		  trace(i+1,j+1);
	  }else {
		  int w=dp(i+1,j);
		  int q=dp(i,j+1);
		  if(w>=q) {
			  trace(i+1,j);
		  }else {
			  trace(i,j+1);
		  }
	  }
	  
  }
  
  public static int dp(int i,int j) {
	  
	  if(i==x.length||j==y.length) {
		  return 0;
	  }
	  
	  if(memo[i][j]!=null) {
		  return memo[i][j];
	  }
	  
	  if(x[i]==y[j]) {
		  return memo[i][j]=1+dp(i+1,j+1);
	  }
	  
	  int lol=dp(i+1,j);
	  int lel=dp(i,j+1);
	  if(lol>=lel) {
		  return memo[i][j]=lol;
	  }else {
		  return memo[i][j]=lel;
	  }
  }
  static class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream s) {
		br = new BufferedReader(new InputStreamReader(s));
	}

	public Scanner(FileReader f) {
		br = new BufferedReader(f);
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public double nextDouble() throws IOException {
		String x = next();
		StringBuilder sb = new StringBuilder("0");
		double res = 0, f = 1;
		boolean dec = false, neg = false;
		int start = 0;
		if (x.charAt(0) == '-') {
			neg = true;
			start++;
		}
		for (int i = start; i < x.length(); i++)
			if (x.charAt(i) == '.') {
				res = Long.parseLong(sb.toString());
				sb = new StringBuilder("0");
				dec = true;
			} else {
				sb.append(x.charAt(i));
				if (dec)
					f *= 10;
			}
		res += Long.parseLong(sb.toString()) / f;
		return res * (neg ? -1 : 1);
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

}
}
