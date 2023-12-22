import java.io.*;
import java.math.*;
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
		solveD(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solveA(String[] args) throws Exception{
		int[] x = nextInts();
		boolean[] flg = new boolean[6];
		Arrays.fill(flg,true);
		for(int i=0;i<5;i++) {
			flg[x[i]]=false;
		}
		for(int i=1;i<6;i++) {
			if(flg[i]) {
				pw.println(i);
				return;
			}
		}
	}
	public static void solveB(String[] args) throws Exception{
		int X = nextInt();
		int Y = nextInt();

		for(int turu=0;turu<100;turu++) {
			for(int kame=0;kame<100;kame++) {
				if(turu+kame==X&&turu*2+kame*4==Y) {
					pw.println("Yes");
					return;
				}
			}
		}
		pw.println("No");
	}
	public static void solveC(String[] args) throws Exception{
		int X = nextInt();
		int N = nextInt();

		int[] p ;
		if(N!=0) {
			p=nextInts();
		}else {
			nextString();
			p=new int[0];
		}
		boolean[] g = new boolean[102];
		Arrays.fill(g,true);
		for(int i=0;i<N;i++) {
			g[p[i]]=false;
		}
		int ans = -1;
		for(int i=0;i<=101;i++) {
			if(g[i]&&Math.abs(X-i) < Math.abs(X-ans)) {
				ans=i;
			}
		}
		pw.println(ans);


	}
	public static void solveD(String[] args) throws Exception{
		int N = nextInt();

		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<N;i++) {
			int x = nextInt();
			map.put(x,map.getOrDefault(x, 0)+1);
		}
		int num=0;
		ArrayList<Integer> list = new ArrayList<Integer>(map.size());
		for(int x:map.keySet()) {
			if(map.get(x)==1) {
				list.add(x);
			}
		}

		if(list.size()==0) {
			pw.println(0);
			return;
		}
		boolean[] x = new boolean[(int)1e6+1];
		Arrays.fill(x,false);
		int n=0;
		for(int i=0;i<N;i++) {
			x[list.get(i)]=true;
			n=Math.max(n,list.get(i));
		}

		for (int i = 0; i < N; i++) {
			if (!x[list.get(i)]) {
				continue;
			}
			for (int k = list.get(i) *2; k <= n; k += list.get(i)) {
				x[k] = false;
			}
		}
		int ans = 0;
		for(int i=1;i<=n;i++) {
			if(x[i]) {
				ans++;
			}
		}



		pw.println(ans);
	}
	public static void solveE(String[] args) throws Exception{

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

