import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void solve() {
		int n=s.nextInt();
		finaltime=s.nextInt();
		time_taken=new int[n];
		del= new int[n];
		for(int i =0;i<n;i++) {
			time_taken[i]=s.nextInt();
			del[i]=s.nextInt();
		}
		out.println(DP_solution());
	}
	
	
	public static int[] time_taken;
	public static int[] del;
	public static int finaltime;
 	public static long finalans =0;
	
 	
 	
 	
	public static long DP_solution() {
		int n=time_taken.length;
		long[][][] dp = new long[finaltime+1][n+1][2];
		for(int i = 0;i<=finaltime;i++) {
			for(int j=0;j<=n;j++) {
				dp[i][j][0]=-1;
				dp[i][j][1]=-1;
			}
		}
		dp[0][0][0]=0;
		for(int i=0;i<n;i++) {//object
			for(int j=0;j<2;j++) {//last
				for(int k= 0;k<finaltime;k++) {//time
					int curr_time=time_taken[i];
					int curr_del=del[i];
					if(dp[k][i][j]!=-1) {
						if(k+curr_time<finaltime) {
							dp[k+curr_time][i+1][j]=Long.max(dp[k+curr_time][i+1][j],dp[k][i][j]+curr_del);
						}
						dp[k][i+1][j]=Long.max(dp[k][i+1][j],dp[k][i][j]);
						if(j==0) {
							dp[k][i+1][1]=Long.max(dp[k][i][j]+curr_del,dp[k][i+1][1]);
						}
					}
				}
			}
		}
		long max= 0;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<=finaltime;k++) {
					max= Long.max(max,dp[k][i][j]);
				}
			}
		}
		return max;
	}
	
 	
// 	public static void Recur(int time,int pos ,boolean last,long ans) {
//		int n=time_taken.length;
//		if(pos == n) {
//			finalans=Long.max(ans, finalans);
//			return;
//		}
//		int curr_time=time_taken[pos];
//		int curr_del=del[pos];
//		if(last) {
//			if(time+curr_time<finaltime) {
//				Recur(time+curr_time,pos+1,last,ans+curr_del);
//			}
//			Recur(time,pos+1,last,ans);
//		}else {
//			if(time+curr_time<finaltime) {
//				Recur(time+curr_time,pos+1,last,ans+curr_del);
//			}
//			Recur(time,pos+1,last,ans);
//			Recur(time,pos+1,!last,ans+curr_del);
//			
//		}
	//}
	
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
