import java.io.*;
import java.io.ObjectInputStream.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = 1000000007;
	//final static long MOD = 998244353;

	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		solutionA(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solutionA(String[] args) throws Exception{
		int H = nextInt();
		int W = nextInt();

		int[][] c = new int[10][10];
		for(int i=0;i<10;i++) {
			c[i]=nextInts();
		}
		int[][] A = new int[H][];
		for(int i=0;i<H;i++) {
			A[i]=nextInts();
		}

		int[] to = new int[10];
		Arrays.fill(to,-1);
		to[1]=0;

		boolean[] flg=new boolean[10];
		Arrays.fill(flg,true);
		for(int i=0;i<10;i++) {
			if(i!=1) {
				to[i]=dfs(i,flg,10,c,0);
			}
//			pw.println(to[i]);
//			pw.flush();

		}

		long ans = 0;
		for(int h=0;h<H;h++) {
			for(int w=0;w<W;w++) {
				if(A[h][w]!=-1) {
					ans+=to[A[h][w]];
				}
			}
		}
		pw.println(ans);
	}

	public static int dfs(int n,boolean[] flg,int remain, int[][] c ,int sum) {
		if(remain ==0) {
			return sum;
		}
		int ans=sum+c[n][1];
		for(int i=0;i<flg.length;i++) {
			if(flg[i]) {
				if(c[n][i] < c[n][1]) {
					flg[i]=false;
					ans=Math.min(ans,dfs(i,flg,remain-1,c,sum+c[n][i]));
					flg[i]=true;
				}
			}
		}
		return ans;
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

