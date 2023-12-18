import java.util.*;
import java.io.*;
public class Main {
	static Long [][] memo;
	static long [] value,cost;
	static int n , h;
  public static void main(String[] args) throws IOException,InterruptedException{
	Scanner sc =new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out);
	 n =sc.nextInt();h=sc.nextInt();
	 memo =new Long[n+1][h+1];
	 cost=new long [n+1];
	 value=new long [n+1];
	 for (int i =0;i<n;++i) {
		 cost[i]=sc.nextInt();
		 value[i]=sc.nextInt();
	 }
	 pw.println(dp(0, h));	
	pw.flush();
	}
  public static long dp (int index ,long width) {
	  if (index==n)
		  return 0;
	  if (width<0)
		  return -(int)1e9;
	  if (memo[(int)index][(int)width]!=null)
		  return memo[(int)index][(int)width];
	  long ans =0;
	  if (width-cost[(int)index]<0)
		  ans =dp(index+1,width);
	  else
		  ans =Math.max(dp(index+1, width), dp(index+1, width-cost[index])+value[index]);
	  return memo[(int)index][(int)width]=ans;
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