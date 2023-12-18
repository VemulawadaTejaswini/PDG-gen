import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {


		long Q=nextLong();
		long H=nextLong();
		long S=nextLong();
		long D=nextLong();
		long N=nextLong()*4;

		Pair[] p = new Pair[4];
		p[0]=new Pair(Q*8,1,Q*4);
		p[1]=new Pair(H*4,2,H*4);
		p[2]=new Pair(S*2,4,S*4);
		p[3]=new Pair(D,8,D*4);

		Arrays.sort(p,Pair.getComparator());

		long ans =0;
		for(int i=0;i<4;i++){
			ans+=(N/p[i].scale)*p[i].value;
			N=N%p[i].scale;

		}

		System.out.println(ans/4);

	}

	public static class Pair {
		long L2;
		long scale;
		long value;

		Pair(long L2, long scale, long value) {
			this.L2 = L2;
			this.scale = scale;
			this.value = value;
		}



		public long getL2() {
			return L2;
		}



		public long getScale() {
			return scale;
		}



		public long getValue() {
			return value;
		}



		public static Comparator<Pair> getComparator() {
			return Comparator.comparing(Pair::getL2);
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
