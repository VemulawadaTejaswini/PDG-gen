import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static void main(String[] args) throws Exception {
		solution(args);
		if(in!=null){
			in.close();
		}
	}

	public static void solution(String[] args) throws Exception{

		int N = nextInt();
		int[][][] x = new int[N][][];
		for(int i=0;i<N;i++){
			x[i]=new int[nextInt()][];
			for(int k=0;k<x[i].length;k++){
				x[i][k]=nextInts();
			}
		}
		int ans = 0;
		for(int i=1;i<1<<N;i++){
			int[] p = new int[N];
			Arrays.fill(p, 0);
			int cnt=0;
			for(int k=0;k<N;k++){
				if((i>>k&1)==1){
					p[k]=1;
					cnt++;
				}
			}
			boolean flg = true;
			for(int k=0;k<N;k++){
				if(p[k]==1){
					for(int j=0;j<x[k].length;j++){
						if(p[x[k][j][0]-1]!=x[k][j][1]){
							flg=false;
							break;
						}
					}
				}
				if(flg==false){
					break;
				}
			}
			if(flg){
				ans=Math.max(cnt,ans);
			}
		}
		System.out.println(ans);
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
