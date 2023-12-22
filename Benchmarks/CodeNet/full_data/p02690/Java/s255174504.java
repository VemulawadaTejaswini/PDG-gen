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
 
 		long a =0 ,b =0 ,x =fr.nextLong() ,nm ,dn ;
o: 		for (a =0 ; a<120 ; ++a) {
 			for (b =0 ; b<a ; ++b) {
 				nm =pow (a,5) ;	dn =pow (b,5) ;
 				if (nm-dn == x)	break o ;
 				if (nm+dn == x)	{	b*=-1 ;	break o ;	}
 			}
 		}
		op.println(a+" "+b) ;	op.flush();	op.close();
	}
	static long pow (long b , long e) {
		if (e==0l)	return 1l;
		if (e==1l)	return b;
		long dm =pow(b,e/2l) ;	dm *= dm ;
		if ((e&1l)==1l)	dm *= b ;
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