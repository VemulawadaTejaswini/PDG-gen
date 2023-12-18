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

		int Q = nextInt();

		boolean[] flg = sleveOferatosthenes(100001);
		int[] rui = new int[flg.length];
		int sum=0;
		for(int i=0;i<flg.length;i++) {
			if(flg[i]&&flg[(i+1)/2]) {
				sum++;
			}
			rui[i]=sum;
		}

		for(int i=0;i<Q;i++) {
			int[] q = nextInts();
			int ans = rui[q[1]]-rui[q[0]-1];

			pw.println(ans);
		}

	}

	public static boolean[] sleveOferatosthenes(int n) {
		boolean[] x = new boolean[n];
		Arrays.fill(x,true);
		x[0]=false;
		x[1]=false;
		int max=(int)Math.ceil(Math.sqrt(n)+0.1);
		for(int i=2;i<max;i+=2) {
			if(!x[i]) {
				continue;
			}
			for(int k=i*i;k<n;k+=i) {
				x[k]=false;
			}
			if(i==2) {
				i--;
			}
		}
		return x;
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

