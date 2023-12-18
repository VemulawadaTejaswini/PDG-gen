import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

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
 
 		int n =fr.nextInt() ,i ,j ;	long ct[][] =new long[n+1][3] ,bct[][] =new long[n+2][3] ,dm ,ans =0 ;	
 		char s[] =fr.next().toCharArray() ;
 		HashMap<Character , Integer> hm =new HashMap<>() ;	hm.put('R',0) ;	hm.put('G',1) ;	hm.put('B',2) ;
 		for (i =1 ; i<=n ; ++i)	{	++ct[i][hm.get(s[i-1])] ;	++bct[i][hm.get(s[i-1])] ;	}
 		for (i =1 ; i<=n ; ++i) {
 			ct[i][0] += ct[i-1][0] ;	ct[i][1] += ct[i-1][1] ;	ct[i][2] += ct[i-1][2] ;
 		}
 		for (i =n ; i>0 ; --i) {
 			bct[i][0] += bct[i+1][0] ;	bct[i][1] += bct[i+1][1] ;	bct[i][2] += bct[i+1][2] ;
 		}
 		for (i =1 ; i<n ; ++i) {
 			if (s[i-1]=='R') {
 				dm =ct[i-1][1] * bct[i+1][2] ;	dm += (ct[i-1][2] * bct[i+1][1]) ;//System.out.println(dm) ;
 				for (j =1 ; i+j<=n ; ++j) {
 					if (i-j==0)	break;
 					if (s[i+j-1]=='G' && s[i-j-1]=='B')	--dm ;
 					if (s[i+j-1]=='B' && s[i-j-1]=='G')	--dm ;
 				}
 			}
 			else if (s[i-1]=='G') {
 				dm =ct[i-1][0] * bct[i+1][2] ;	dm += (ct[i-1][2] * bct[i+1][0]) ;
 				for (j =1 ; i+j<=n ; ++j) {
 					if (i-j==0)	break;
 					if (s[i+j-1]=='R' && s[i-j-1]=='B')	--dm ;
 					if (s[i+j-1]=='B' && s[i-j-1]=='R')	--dm ;
 				}
 			}
 			else {
 				dm =ct[i-1][1] * bct[i+1][0] ;	dm += (ct[i-1][0] * bct[i+1][1]) ;
 				for (j =1 ; i+j<=n ; ++j) {
 					if (i-j==0)	break;
 					if (s[i+j-1]=='G' && s[i-j-1]=='R')	--dm ;
 					if (s[i+j-1]=='R' && s[i-j-1]=='G')	--dm ;
 				}
 			}
 			ans += dm ;
 		}
		op.println(ans) ;	op.flush();	op.close();
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