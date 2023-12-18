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
		int K = nextInt();

		int[][] map = new int[H][W];
		int seq=1;
		for(int h=0;h<H;h++) {
			String s = nextString();
			int n=0;
			//左から右に埋める
			for(int w=0;w<W;w++) {
				if(s.charAt(w)=='#') {
					n=seq;
					seq++;
				}
				map[h][w]=n;
			}
			//右から左に埋める
			for(int w=W-2;w>=0;w--) {
				if(map[h][w]==0) {
					map[h][w]=map[h][w+1];
				}
			}
		}
		//上から下に埋める
		for(int h=1;h<H;h++) {
			for(int w=0;w<W;w++) {
				if(map[h][w]==0) {
					map[h][w]=map[h-1][w];
				}
			}
		}
		//下から上に埋める
		for(int h=H-2;h>=0;h--) {
			for(int w=0;w<W;w++) {
				if(map[h][w]==0) {
					map[h][w]=map[h+1][w];
				}
			}
		}

		for(int h=0;h<H;h++) {
			String s = "";
			for(int w=0;w<W;w++) {
				s+=map[h][w]+" ";
			}
			pw.println(s.trim());
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

