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
		int[] x = new int[N];
		int[] y = new int[N];

		for(int i=0;i<N;i++){
			x[i]=nextInt();
			y[i]=nextInt();
		}

		double ans = 0;

		//順列の要素
		int[] seed = new int[N];
		for(int i=0;i<N;i++){
			seed[i]=i;
		}
		boolean[] used = new boolean[seed.length];
		Arrays.fill(used, false);
		int[] result = new int[seed.length];
		//順列の作成
		perm(seed,used,0,result);

		for(int k=0;k<list.size();k++){
			int[] p = list.get(k);
			for(int i=0;i<N-1;i++){
				ans+=Math.sqrt(Math.pow(x[p[i]]-x[p[i+1]], 2)+Math.pow(y[p[i]]-y[p[i+1]], 2));
			}
		}
		System.out.printf("%.6f%n",ans/list.size());
	}


public static void perm(int[] seed,boolean[] used,int idx,int[] ans){
	if(idx>=seed.length) {
		list.add(Arrays.copyOf(ans, ans.length));
		return;
	}
	for(int i=0;i<seed.length;i++){
		if(used[i]){
			continue;
		}
		used[i]=true;
		ans[idx]=seed[i];
		perm(seed,used,idx+1,ans);
		used[i]=false;
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
