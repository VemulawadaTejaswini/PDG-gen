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
		int H = nextInt();
		int W = nextInt();
		char[][] s = new char[H+2][W+2];
		Arrays.fill(s[0],'#');
		Arrays.fill(s[s.length-1],'#');
		for(int i=1;i<=H;i++) {
			s[i]=("#"+nextString()+"#").toCharArray();
		}
		int[][] hv = new int[H+2][W+2];
		for(int w=1;w<W+2;w++) {
			for(int h=1;h<H+2;h++) {
				if(s[h][w]=='.') {
					hv[h][w]=hv[h-1][w]+1;
				}
			}
			for(int h=H-1;h>0;h--) {
				if(s[h][w]=='.'&&s[h+1][w]=='.') {
					hv[h][w]=hv[h+1][w];
				}
			}
		}
		int[][] wv = new int[H+2][W+2];
		for(int h=1;h<H+2;h++) {
			for(int w=1;w<W+2;w++) {
				if(s[h][w]=='.') {
					wv[h][w]=wv[h][w-1]+1;
				}
			}
			for(int w=W-1;w>0;w--) {
				if(s[h][w]=='.'&&s[h][w+1]=='.') {
					wv[h][w]=wv[h][w+1];
				}
			}
		}
		int ans = 0;
		for(int h=1;h<H+1;h++) {
			for(int w=1;w<W+1;w++) {
				ans=Math.max(ans,wv[h][w]+hv[h][w]-1);
			}
		}
		pw.println(ans);

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

