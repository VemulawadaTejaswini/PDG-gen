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
 
 		long n =fr.nextLong() ,m =fr.nextLong() ,k =fr.nextLong() ,md =998244353l ,ans =0l ;
 		long fct[] =new long[(int)(n+1)] ,i ,j ,o ,p ;	fct[0] =1l ;	
 		
 		for (i =1 ; i<=n ; ++i)	fct[(int)i] =(fct[(int)(i-1)] * i)%md ;
 		
 		for (i =0 ; i<=k ; ++i) {
 			j =pow (m-1 , n-1l-i , md) ;	j =(j * m)%md ;
 			
 			p =fct[(int)(n-1)] ;	o =(fct[(int)i] * fct[(int)(n-1-i)])%md ;
 			o =pow (o , md-2l , md) ;	p =(p * o)%md ;

 			j =(j * p)%md ;	ans =(ans + j)%md ;
 		}
		op.println(ans) ;	op.flush();	op.close();
	}
	static long pow (long b , long e , long md) {
		if (e==0l)	return 1l;
		if (e==1l)	return b;
		long dm =pow(b,e/2l,md) ;	dm =(dm * dm)%md ;
		if ((e&1l)==1l)	{	dm =(b * dm)%md ;	}
		return dm ;
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