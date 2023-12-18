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
		int[] p = new int[N+1];
		for(int i=2;i<=N;i++) {
			TreeMap<Long,Long> map = primeFactorize(i);
			for(long key:map.keySet()) {
				if(key==1) {
					continue;
				}
				long val=map.get(key);
				p[(int)key]+=val;
			}
		}
		long ans = 1;
		for(int i=0;i<=N;i++) {
			if(p[i]!=0) {
				ans*=(p[i]+1);
				ans%=MOD;

			}
		}
		pw.println(ans);

	}

	public static TreeMap<Long, Long> primeFactorize(long N) {
		TreeMap<Long, Long> map = new TreeMap<>();
		for (long i = 2; i * i <= N; i++) {
			long k = 0;
			while (N % i == 0) {
				k++;
				N /= i;
			}
			if(k!=0) {
				map.put(i, k);
			}
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

