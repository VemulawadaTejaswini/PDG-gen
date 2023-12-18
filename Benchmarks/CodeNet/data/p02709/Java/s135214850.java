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
 
 		int n =fr.nextInt() ,i ;	long vl[][] =new long[n][2] ,dp[][] =new long[n+2][n+2] ;
 		for (i =0 ; i<n ; ++i)	{	vl[i][0] =fr.nextLong() ;	vl[i][1] =i+1 ;		}
 		sort (vl,0,n-1) ;	int j ,k ,l ,r ;	long dm ,id ,sl =0 ;

 		for (i =1 ; i<=n ; ++i) {
 			j =0 ;	k =i-1 ;
 			for ( ; j<i ; ++j, --k) {
 				l =0+j ;	r =n+1-k ;	id =vl[i-1][1] ;
 				dm =vl[i-1][0] * Math.abs(l+1l - id) ;	dm += dp[l][r] ;
 				dp[l+1][r] =Math.max(dp[l+1][r] , dm) ;
 				
 				dm =vl[i-1][0] * Math.abs(r-1l - id) ;	dm += dp[l][r] ;
 				dp[l][r-1] =Math.max(dp[l][r-1] , dm) ;
 			}
 		}
 		for (i =0 ; i<=n ; ++i)	sl =Math.max(sl , dp[i][1+i]) ;	op.println(sl) ;
		op.flush();	op.close();
	}
	public static void sort(long[][] arr , int l , int u)
	{
		int m ;
 
		if(l < u){
			m =(l + u)/2 ;
 
			sort(arr , l , m);	sort(arr , m + 1 , u);
 
			merge(arr , l , m , u);
		}
	} 
	public static void merge(long[][]arr , int l , int m , int u)
	{
		long[][] low = new long[m - l + 1][2];
 
		long[][] upr = new long[u - m][2];
 
		int i ,j =0 ,k =0 ;
 
		for(i =l;i<=m;i++){
			low[i - l][0] =arr[i][0];
			low[i - l][1] =arr[i][1];
		}
 
		for(i =m + 1;i<=u;i++){
			upr[i - m - 1][0] =arr[i][0];
			upr[i - m - 1][1] =arr[i][1];
		}
 
		i =l;
 
		while((j < low.length) && (k < upr.length))
		{
			if(low[j][0] > upr[k][0])
			{
				arr[i][0] =low[j][0];
				arr[i++][1] =low[j++][1];
			}
			else
			{
				if(low[j][0] < upr[k][0])
				{
					arr[i][0] =upr[k][0];
					arr[i++][1] =upr[k++][1];
				}
				else
				{
					if(low[j][1] < upr[k][1])
					{
						arr[i][0] =low[j][0];
						arr[i++][1] =low[j++][1];
					}
					else
					{
						arr[i][0] =upr[k][0];
						arr[i++][1] =upr[k++][1];
					}
				}
			}
		}
 
		while(j < low.length)
		{
			arr[i][0] =low[j][0];
			arr[i++][1] =low[j++][1];
		}
 
		while(k < upr.length)
		{
			arr[i][0] =upr[k][0];
			arr[i++][1] =upr[k++][1];
		}
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