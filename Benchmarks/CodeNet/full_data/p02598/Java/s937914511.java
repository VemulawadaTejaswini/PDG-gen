import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
                solve();
            }
        }, "1", 1 << 26).start();
	}
	static void solve () {
		FastReader fr =new FastReader();	PrintWriter op =new PrintWriter(System.out);
 
 		int n =fr.nextInt() ,k =fr.nextInt() ,a[] =new int[n] ,i ,dm ,l ,r ,mid ,ans =0 ;
 		long j ;

 		r =0 ;	l =1 ;

 		for (i =0 ; i<n ;++i) {
 			a[i] =fr.nextInt() ;	r =Math.max(r , a[i]) ;
 		}

 		while (l <= r) {
 			mid =(l+r)/2 ;	j =0 ;

 			for (i =0 ; i<n ; ++i) {
 				dm =a[i]/mid + (a[i]%mid == 0 ? 0 : 1) ;

 				j += (dm - 1) ;
 			}
 			//System.out.println(j) ;
 			if (j > k)
 				l =mid + 1 ;
 			else {
 				ans =mid ;

 				r =mid-1 ;
 			}
 		}

 		op.println(ans) ;

		op.flush();	op.close(); 
	}
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br =new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st==null || (!st.hasMoreElements())) 
			{
				try
				{
					st =new StringTokenizer(br.readLine());
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
			}
			return st.nextToken();
		}

		String nextLine() {
			String str ="";

			try
			{
				str =br.readLine();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}

			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next()) ;
		}
	}
}