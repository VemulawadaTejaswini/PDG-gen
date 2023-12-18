import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {


		int W = nextInt();
		int H = nextInt();
		int N = nextInt();
		int[] h = {0,H};
		int[] w = {0,W};
		for(int i=0;i<N;i++){
			int[] in = nextInts();
			if(in[2]==1){
				w[0]=Math.max(w[0],in[0]);
			}else if(in[2]==2){
				w[1]=Math.min(w[1],in[0]);
			}else if(in[2]==3){
				h[0]=Math.max(h[0],in[1]);
			}else{
				h[1]=Math.min(h[1],in[1]);
			}
		}



		System.out.println(Math.max((h[1]-h[0]),0)*Math.max((w[1]-w[0]),0));

	}

public static long gcd(long a, long b) {
	long x, y;
	if (a < b) {
		x = b;
		y = a;
	} else {
		x = a;
		y = b;
	}
	long r;
	while ((r = a % b) != 0) {
		a = b;
		b = r;
	}
	return b;
}

	public static String[] toStringArray(String s) {
		String[] tmp = new String[s.length()];
		char[] c = s.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = String.valueOf(c[i]);
		}
		return tmp;
	}

	public static String concatStringArray(String[] s){
		StringBuffer sb = new StringBuffer();
		for(String x:s){
			sb.append(x);
		}
		return sb.toString();
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