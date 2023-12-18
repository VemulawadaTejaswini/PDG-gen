import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		int M = nextInt();
		int Q = nextInt();

		int[][] x = new int[Q][];
		for(int i=0;i<Q;i++){
			x[i]=nextInts();
		}



		ArrayList<int[]> list = new ArrayList<>();
		test(0,0,M,new int[10],list);

		long ans = 0;
		for(int[] p:list){
			long tmp=0;
			for(int i=0;i<Q;i++){
				if(p[x[i][1]-1]-p[x[i][0]-1]==x[i][2]){
					tmp+=x[i][3];
				}
			}
			ans=Math.max(ans, tmp);
		}
		System.out.println(ans);
	}

	public static void test(int rank ,int now ,int max, int[] ans,ArrayList<int[]> list){
		if(rank == ans.length){
			list.add(Arrays.copyOf(ans, ans.length));
			return;
		}
		for(int i=0;i<max;i++){
			if(i>=now){
				ans[rank]=i;
				test(rank+1,i,max,ans,list);
			}
		}
	}

	public static String[] toStringArray(String s) {
		String[] tmp = new String[s.length()];
		char[] c = s.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = String.valueOf(c[i]);
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
