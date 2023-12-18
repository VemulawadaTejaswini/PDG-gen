import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		int Q = nextInt();
		String S = nextString();
		char[] c = S.toCharArray();
		int[] a = new int[N];
		a[0]=0;
		for(int i=1;i<N;i++){
			if(c[i-1]=='A'&&c[i]=='C'){
				a[i]=1;
			}else{
				a[i]=0;
			}
		}
		int[] b = new int[N];
		b[0]=0;
		for(int i=1;i<N;i++){
			b[i]=b[i-1]+a[i];
		}


		for(int i=0;i<Q;i++){
			int l=nextInt();
			int r=nextInt();
			System.out.println(b[r-1]-b[l-1]);
		}

	}

	public static long[] disassemblyAlph(String s) {
		long[] alph = new long['z' - 'a' + 1];
		Arrays.fill(alph, 0);
		for (int i = 0; i < s.length(); i++) {
			alph[s.charAt(i) - 'a']++;
		}
		return alph;
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