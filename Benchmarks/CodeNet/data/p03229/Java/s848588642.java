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
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=nextInt();
		}
		Arrays.sort(A);
		int[] a = new int[N];
		int k = N-1;
		for(int i=1;i<N;i+=2) {
			a[i]=A[k];
			k--;
		}
		a[0]=A[k];
		k=0;
		for(int i=2;i<N;i+=2) {
			a[i]=A[k];
			k++;
		}
		int ans=0;
		for(int i=1;i<N;i++) {
			ans+=Math.abs(a[i-1]-a[i]);
		}
		int ans2=0;
		ans2+=Math.abs(a[0]-a[N-1]);
		for(int i=1;i<N-1;i++) {
			ans2+=Math.abs(a[i+1]-a[i]);
		}
		pw.println(Math.max(ans,ans2));

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

