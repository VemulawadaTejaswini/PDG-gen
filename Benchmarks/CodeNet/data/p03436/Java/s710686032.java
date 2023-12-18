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
		char[][] s = new char[H+2][W+2];
		Arrays.fill(s[0],'#');
		Arrays.fill(s[H+1],'#');
		for(int i=1;i<=H;i++) {
			s[i]=("#"+nextString()+"#").toCharArray();
		}

		//白石の数
		int cnt=0;
		int[][] c = new int[H+2][W+2];
		for(int h=0;h<s.length;h++) {
			for(int w=0;w<s[0].length;w++) {
				if(s[h][w]=='.') {
					cnt++;
					c[h][w]=0;
				}else {
					c[h][w]=-1;
				}
			}
		}

		ArrayDeque<int[]> q = new ArrayDeque<int[]>();
		//4方向の場合はx[i+around[n]][k+around[n+1]]n<4,8方向はn<8でループ
		int[] around = { -1, 0, 1, 0, -1, 1, 1, -1, -1 };

		q.push(new int[] {1,1});
		while(!q.isEmpty()) {
			int[] p = q.poll();
			if(p[0]==W&&p[1]==H) {
				pw.println(cnt-c[H][W]-1);
				return ;
			}

			for(int n=0;n<4;n++) {
				int nextX=p[0]+around[n];
				int nextY=p[1]+around[n+1];
				if(c[nextY][nextX]==0) {
					q.offer(new int[] {nextX,nextY});
					c[nextY][nextX]=c[p[1]][p[0]]+1;
				}
			}
		}
		pw.println(-1);
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

