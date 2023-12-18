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
		int[] b = nextInts();
		int[] f = new int[N+1];
		Arrays.fill(f, 0);

		for(int i=0;i<b.length;i++){
			f[b[i]]++;
		}

		LinkedList<Integer> ans = new LinkedList<>();
		resolv(b,f,1,ans);
		if(ans.size()==0){
			System.out.println(-1);
			return;
		}
		System.out.println(ans);
	}

	public static boolean resolv(int[] b , int[] elem ,int idx,LinkedList<Integer> ans){
		if(idx==b.length+1){

			return true;
		}
		for(int j=1;j<=idx;j++){
			if(elem[j]!=0){
				elem[j]--;
				ans.add(j-1,j);
				if(resolv(b,elem,idx+1,ans)){
					return true;
				}
				ans.remove(j-1);
				elem[j]++;
			}
		}
		return false;

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