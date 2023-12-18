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
		int K = nextInt();
		Long[] x = new Long[N];
		for(int i=0;i<N;i++) {
			x[i]=Long.valueOf(nextLong());
		}

		int idx =~Arrays.binarySearch(x, 0,(s1,s2)->s1.longValue()-s2.longValue()>=0?1:-1);

		int leftIdx =Math.max(0,idx-K-1);
		int rightIdx = leftIdx+K-1;

		long left=0;
		long right=0;
		long ans = Long.MAX_VALUE;
		for(;rightIdx<N;rightIdx++,leftIdx++) {
			if(x[leftIdx]<0) {
				left=Math.abs(x[leftIdx]);
			}else {
				left=0;
			}
			if(x[rightIdx]>0) {
				right=Math.abs(x[rightIdx]);
			}else {
				right=0;
			}

			if(left!=0&&right!=0) {
				if(left<right) {
					left*=2;
				}else {
					right*=2;
				}
			}
			ans=Math.min(ans, left+right);
		}



		pw.println(ans);

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

