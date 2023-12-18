import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static String minS = "";
	public static void main(String[] args) throws Exception {

		int N=nextInt();
		int L=nextInt();
		String[] S = new String[N];
		for(int i=0;i<N;i++){
			S[i]=nextString();
			minS+=S[i];
		}
		Arrays.sort(S);
		//順列の要素

		boolean[] used = new boolean[S.length];
		Arrays.fill(used, false);
		String[] ans = new String[S.length];
		//順列の作成
		perm(S,used,0,ans);

		System.out.println(minS);
	}

	public static void perm(String[] seed,boolean[] used,int idx,String[] ans){
		if(idx>=seed.length) {
			String.join("",ans);
			if(minS.compareTo(String.join("",ans))>0){
				minS=String.join("",ans);
			}
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
