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

		long[][] x = new long[map.size()][2];
		int idx=0;
		for(long key : map.keySet()) {
			long val = map.get(key);
			x[idx][0]=key;
			x[idx][1]=val;
			idx++;
		}
		pw.println(dfs(1,1,0,x));
	}

	public static int dfs(long A , long B ,int idx ,long[][] lst) {
		if(idx==lst.length-1&&lst[idx][1]==0) {
			return A<B?String.valueOf(B).length():String.valueOf(A).length();
		}
		if(lst[idx][1]==0) {
			idx++;
		}

		lst[idx][1]--;
		int ans = Math.min(dfs(A*lst[idx][0],B,idx,lst),dfs(A,B*lst[idx][0],idx,lst));
		lst[idx][1]++;
		return ans ;
	}

	public static TreeMap<Long, Long> primeFactorize(long N) {
		TreeMap<Long, Long> map = new TreeMap<>(Comparator.comparing(Long::longValue,Comparator.reverseOrder()));
		for (long i = 2; i * i <= N; i++) {
			long k = 0;
			while (N % i == 0) {
				k++;
				N /= i;
			}
			if(k!=0)
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

