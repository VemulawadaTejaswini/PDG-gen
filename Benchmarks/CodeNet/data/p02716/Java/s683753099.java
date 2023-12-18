import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;

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
 
 		ArrayList<HashMap<Integer , Long>> ah =new ArrayList<>() ;
 		int n =fr.nextInt() ,i ,j ;	long a[] =new long[n] ,dm ;
 		for (i =0 ; i<n ; ++i)	{	a[i] =fr.nextLong() ;	ah.add(new HashMap<Integer , Long>()) ;		}
 		ah.get(n-1).put(0,0l) ;	ah.get(n-1).put(1,a[n-1]) ;
 		ah.get(n-2).put(0,0l) ;	ah.get(n-2).put(1 , Math.max(a[n-2] , a[n-1])) ;
 		for (i =3 ; i<=n ; ++i) {
 			j =i/2 ;	ah.get(n-i).put(0,0l) ;
 			dm =a[n-i] + ah.get(n-i+2).get(j-1) ;	dm =Math.max(dm , ah.get(n-i+1).get(j)) ;
 			ah.get(n-i).put(j , dm) ;
 			if (i%2==1) {
 				++j ;	dm =a[n-i] + ah.get(n-i+2).get(j-1) ;	ah.get(n-i).put(j,dm) ;
 			}
 		}
		op.println(ah.get(0).get(n/2)) ;	op.flush();	op.close();
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