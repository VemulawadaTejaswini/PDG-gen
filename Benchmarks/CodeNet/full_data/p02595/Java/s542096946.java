import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) {
		 FastScanner scanner =new FastScanner();
		 PrintWriter out=new PrintWriter(System.out);
		  int n=scanner.nextInt();
		  long d=scanner.nextLong();
		  int ans=0;
		  for(int i=0;i<n;i++) {
			  long x=scanner.nextLong(),y=scanner.nextLong();
			  BigInteger bi1=BigInteger.valueOf(x*x);
			  BigInteger bi2=BigInteger.valueOf(y*y);
			  //long t1=x*x, t2=y*y;
			//  System.out.println(t1+" "+t2);
			 BigInteger bi=bi1.add(bi2);
			 // System.out.println(bi);
			 
			  //System.out.println(dis);
			 BigInteger b1=BigInteger.valueOf(d*d);
			// System.out.println(bi+" "+b1);
			  if(bi.compareTo(b1)<=0) ans++;
		  }	
		  System.out.println(ans);
			
		
	
		    	
		    }
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
}

		    
		}