import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = 1000000007;
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

		int N = nextInt();
		int[] h = nextInts();
		int ans = 0;
		int idx=0;
		for(int i=idx;i<N;i++) {
			if(i==0) {
				if(h[i]==0) {
					idx++;
				}else {
					break;
				}
			}else {
				if(h[i]==0||h[i-1]==0&h[i]==0) {
					idx++;
				}else {
					break;
				}
			}
		}

		while(idx!=N) {
			int min=Integer.MAX_VALUE;
			int end=N;
			for(int i=idx;i<N;i++) {
				if(h[i]!=0) {
					min=Math.min(min, h[i]);
				}else {
					end=i;
					break;
				}
			}
			for(int i=idx;i<end;i++) {
				h[i]-=min;
			}
			ans+=min;
			for(int i=idx;i<N;i++) {
				if(i==0) {
					if(h[i]==0) {
						idx++;
					}else {
						break;
					}
				}else {
					if(h[i]==0||h[i-1]==0&h[i]==0) {
						idx++;
					}else {
						break;
					}
				}
			}
			if(idx==N) {
				break;
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

