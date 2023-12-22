import java.io.*;
import java.math.*;
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
		solveC(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solveA(String[] args) throws Exception{
		int[] x = nextInts();
		boolean[] flg = new boolean[6];
		Arrays.fill(flg,true);
		for(int i=0;i<5;i++) {
			flg[x[i]]=false;
		}
		for(int i=1;i<6;i++) {
			if(flg[i]) {
				pw.println(i);
				return;
			}
		}
	}
	public static void solveB(String[] args) throws Exception{
		int X = nextInt();
		int Y = nextInt();

		for(int turu=0;turu<100;turu++) {
			for(int kame=0;kame<100;kame++) {
				if(turu+kame==X&&turu*2+kame*4==Y) {
					pw.println("Yes");
					return;
				}
			}
		}
		pw.println("No");
	}
	public static void solveC(String[] args) throws Exception{
		int X = nextInt();
		int N = nextInt();

		int[] p ;
		if(N!=0) {
			p=nextInts();
		}else {
			nextString();
			p=new int[0];
		}
		boolean[] g = new boolean[102];
		Arrays.fill(g,true);
		for(int i=0;i<N;i++) {
			g[p[i]]=false;
		}
		int ans = -1;
		for(int i=0;i<=101;i++) {
			if(g[i]&&Math.abs(X-i) < Math.abs(X-ans)) {
				ans=i;
			}
		}
		pw.println(ans);


	}
	public static void solveD(String[] args) throws Exception{
		for(int i=1;i<=100;i++) {
			pw.print(i+" ");
		}
	}
	public static void solveE(String[] args) throws Exception{

	}

	public static TreeMap<Long, Long> primeFactorize(long N) {
		TreeMap<Long, Long> map = new TreeMap<>();
		for (long i = 2; i * i <= N; i++) {
			long k = 0;
			while (N % i == 0) {
				k++;
				N /= i;
			}
			map.put(i, k);
		}
		map.put(N, 1L);
		return map;
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

