import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {


		int N=nextInt();
		Pair[] pair = new Pair[N];

		for(int i=0;i<N;i++){
			pair[i]= new Pair(nextString(),nextInt(),i+1);

		}

		Comparator<Pair> comparator = Comparator.comparing(Pair::getS).thenComparing(Pair::getP,Comparator.reverseOrder());
		Arrays.sort(pair,comparator);
		for (Pair pair2 : pair) {
			System.out.println(pair2.n);
		}
	}

	public static class Pair{
		String S;
		int P;
		int n;
		Pair(String S,int P,int n){
			this.S=S;
			this.P=P;
			this.n=n;
		}

		public String getS(){
			return S;
		}
		public int getP(){
			return P;
		}

	}


	public static String[] toStringArray(String s){
		String[] tmp = new String[s.length()];
		char[] c = s.toCharArray();
		for(int i=0;i<tmp.length;i++){
			tmp[i]=String.valueOf(c[i]);
		}
		return tmp;
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
