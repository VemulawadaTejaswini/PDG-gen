import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		solution(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solution(String[] args) throws Exception{
		int H = nextInt();
		int W = nextInt();
		char[][] c = new char[H+2][W+2];
		Arrays.fill(c[0], '-');
		Arrays.fill(c[H+1], '-');
		for(int i=1;i<=H;i++){
			c[i]=("-"+nextString()+"-").toCharArray();
		}

		//4方向の場合はx[i+around[n]][k+around[n+1]]n<4,8方向はn<8でループ
		int[] around = { -1, 0, 1, 0, -1, 1, 1, -1, -1 };
		for(int h=1;h<=H;h++){
			for(int w = 1;w<=W;w++){
				if(c[h][w]=='#'){
					boolean flg = false;
					for(int i=0;i<4;i++){
						if(c[h+around[i]][w+around[i+1]]=='#'){
							flg=true;
							break;
						}
					}
					if(flg==false){
						pw.println("No");
						return ;
					}
				}
			}
		}
		pw.println("Yes");

	}

	public static void dfs(int n,int cnt,ArrayList<Integer>[] tree,int parent,int[] set){
		if(n!=parent&&tree[n].size()==1){
			set[n]=cnt;
			return;
		}
		for(int x:tree[n]){
			if(x==parent){
				continue;
			}
			dfs(x,cnt+1,tree,n,set);
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

