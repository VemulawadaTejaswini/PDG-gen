import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException,InterruptedException{
	Scanner sc =new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out);
	int n =sc.nextInt(),wei=sc.nextInt();
	long[] cost =new long [n+1],value =new long [n+1];
	for (int i=1;i<=n;++i) {
		cost[i]=sc.nextInt();value[i]=sc.nextInt();
	}
	long [][]memo =new long [n+1][wei+1];
	for (int i=1;i<=n;++i) {
		for (int j =0;j<=wei;++j) {
			if (j>=cost[i])
				memo[i][j]=Math.max(memo[i-1][j], value[i]+memo[i-1][(int) (j-cost[i])]);
			else
				memo[i][j]=memo[i-1][j];
		}
	}
	//System.out.println(Arrays.deepToString(memo));
	pw.println(memo[n][wei]);
	pw.flush();
	}
  static class Scanner {
		StringTokenizer stringTokenizer;
		BufferedReader bfBufferedReader;
		public Scanner(InputStream system) {
			bfBufferedReader=new BufferedReader(new InputStreamReader( system));
		}
		 public Scanner(String file) throws Exception {
	            bfBufferedReader = new BufferedReader(new FileReader( file));
	        }			 
	        public String next() throws IOException {
	            while (stringTokenizer == null || !stringTokenizer.hasMoreTokens())
	                stringTokenizer = new StringTokenizer( bfBufferedReader.readLine());
	            return stringTokenizer.nextToken();
	        }
	 
	        public String nextLine() throws IOException {
	            return bfBufferedReader.readLine();
	        }
	 
	        public int nextInt() throws IOException {
	            return Integer.parseInt(next());
	        }
	 
	        public double nextDouble() throws IOException {
	            return Double.parseDouble(next());
	        }
	 
	        public char nextChar() throws IOException {
	            return next().charAt(0);
	        }
	 
	        public Long nextLong() throws IOException {
	            return Long.parseLong(next());
	        }
	 
	        public boolean ready() throws IOException {
	            return bfBufferedReader.ready();
	        }
	 
	        public void waitForInput() throws InterruptedException {
	            Thread.sleep(3000);
	        }
  }
  }