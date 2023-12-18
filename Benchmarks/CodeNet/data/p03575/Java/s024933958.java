import java.io.*;
import java.io.ObjectInputStream.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = (long)1e9+7;
	//final static long MOD = 998244353;

	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		slove(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void slove(String[] args) throws Exception{
		int N = nextInt();
		int M = nextInt();
		int[][] g = new int[N+1][N+1];
		for(int i=0;i<M;i++) {
			int a = nextInt();
			int b = nextInt();
			g[a][b]=1;
			g[b][a]=1;
		}

		int ans = 0;
		for(int i=1;i<N+1;i++) {
			for(int k=i+1;k<N+1;k++) {
				if(g[i][k]==1) {
					g[i][k]=0;
					g[k][i]=0;
					boolean[] visit = new boolean[g.length];
					Arrays.fill(visit,true);
					dfs(g,visit,1);
					for(int z=1;z<g.length;z++) {
						if(visit[z]==true) {
							ans++;
							break;
						}
					}
					g[i][k]=1;
					g[k][i]=1;
				}
			}
		}
		pw.println(ans);
	}

	public static void dfs(int[][] g ,boolean[] visit,int idx) {
		visit[idx]=false;
		for(int i=1;i<g.length;i++) {
			if(g[idx][i]==1 && visit[i]) {
				dfs(g,visit,i);
			}
		}
	}


	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}


}

