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
 		
 		int i =fr.nextInt() ,j =fr.nextInt() ;	double a =i*i ,b =j*j ;
 		
 		int h =fr.nextInt() ,m =fr.nextInt() ;
 		double H =h*30.0 + (m*30.0)/60.0 ,M =m*6.0 ,ang =Math.abs (H-M);
 		//System.out.println(H) ;
 		
 		ang =Math.min(ang , 360.0-ang) ;	double rad =Math.PI/180.0 ;	rad *= ang ;
 		//System.out.println(Math.cos(rad)) ;
 		double c = a + b - (2.0*i*j*Math.cos(rad)) ;	c =Math.sqrt(c) ;
		op.println(c) ;	op.flush();	op.close();
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