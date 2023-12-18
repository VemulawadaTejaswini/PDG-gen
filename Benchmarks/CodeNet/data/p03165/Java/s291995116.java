import java.util.*;
import java.io.*;
public class Main {
	
	static StringBuilder[][] memo;
	static char[] x;
	static char[] y;
  public static void main(String args[]) throws IOException {
	  
	  Scanner sc=new Scanner(System.in);
		  
		  x=sc.next().toCharArray();
		  y=sc.next().toCharArray();
		  
		  memo=new StringBuilder[x.length][y.length];
		  
		  System.out.println(dp(0,0).toString());
		  
  }
  
  public static StringBuilder dp(int i,int j) {
	  
	  if(i==x.length|j==y.length) {
		  return new StringBuilder("");
	  }
	  
	  if(memo[i][j]!=null) {
		  return memo[i][j];
	  }
	  
	  if(x[i]==y[j]) {
		  return memo[i][j]=new StringBuilder(x[i]+"").append(dp(i+1,j+1));
	  }
	  
	  StringBuilder lol=dp(i+1,j);
	  
	  StringBuilder lel=dp(i,j+1);
	  
	  if(lol.length()>=lel.length()) {
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
