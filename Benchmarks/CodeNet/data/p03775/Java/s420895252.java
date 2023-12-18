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

		long N = nextLong();
		TreeMap<Long,Long> map = primeFactorize(N);
		long A = 1;
		long B = 1;
		for(long key : map.keySet()) {
			long val = map.get(key);
			for(long i=0;i<val;i++) {
				if(A<B) {
					A*=key;
				}else {
					B*=key;
				}
			}
		}
		if(A<B) {
			pw.println(String.valueOf(B).length());
		}else {
			pw.println(String.valueOf(A).length());
		}
	}

	public static TreeMap<Long, Long> primeFactorize(long N) {
		TreeMap<Long, Long> map = new TreeMap<>(Comparator.comparing(Long::longValue,Comparator.reverseOrder()));
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

