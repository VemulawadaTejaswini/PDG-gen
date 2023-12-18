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
		long X = nextLong();

		long[] len= new long[51];
		long[] p = new long[51];
		len[0]=1;
		p[0]=1;
		for(int i=1;i<51;i++) {
			len[i]=len[i-1]*2+3;
			p[i]=p[i-1]*2+1;
		}
		pw.println(f(N,X,len,p));
	}

	public static long f(int N , long X,long[] len , long[] p) {
		if(N==0) {
			if(X<=0) {
				return 0;
			}else {
				return 1;
			}
		}
		else if(X<=1+len[N-1]) {
			return f(N-1,X-1,len,p);
		}else {
			return p[N-1] + 1 + f(N-1,X-2-len[N-1],len,p);
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

