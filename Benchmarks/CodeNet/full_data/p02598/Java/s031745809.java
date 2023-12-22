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
//		solveA(args);
//		solveB(args);
//		solveC(args);
//		solveD(args);
		solveE(args);
//		solveF(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solveA(String[] args) throws Exception{
		int N= nextInt();

		if(N>=30) {
			pw.println("Yes");
		}else {
			pw.println("No");
		}
	}
	public static void solveB(String[] args) throws Exception{
		int N = nextInt();
		long D = nextInt();

		int ans = 0;
		for(int i=0;i<N;i++) {
			long x = nextLong();
			long y = nextLong();
			if(x*x+y*y<=D*D) {
				ans++;
			}
		}
		pw.println(ans);
	}
	public static void solveC(String[] args) throws Exception{
		int K = nextInt();
		if(K%2==0) {
			pw.println(-1);
			return ;
		}
		HashMap<Long,Boolean> map = new HashMap<>();
		long ans = 1;
		long v=7;
		map.put(v,true);
		while(true) {
			v%=K;
			if(v==0) {
				pw.println(ans);
				return;
			}
			v*=10;
			v+=7;
			ans++;
			if(map.containsKey(v)) {
				pw.println(-1);
				return;
			}
			map.put(v,true);
		}


	}


	public static void solveD(String[] args) throws Exception{
		int N = nextInt();
		char[] c = nextString().toCharArray();

		ArrayList<Integer> rList = new ArrayList<>();
		ArrayList<Integer> wList = new ArrayList<>();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='W') {
				wList.add(i);
			}else {
				rList.add(i);
			}
		}
		int wIdx=0;
		int rIdx=rList.size()-1;
		int ans = 0;
		while(wIdx<wList.size()&&rIdx>=0) {
			if(rList.get(rIdx)<wList.get(wIdx)) {
				pw.println(ans);
				return;
			}
			wIdx++;
			rIdx--;
			ans++;
		}
		if(wIdx<wList.size()) {
			if(rIdx>=0)
				ans+=rList.size()-rIdx;
		}
		pw.println(ans);
	}


	public static void solveE(String[] args) throws Exception{
		int N = nextInt();
		int K = nextInt();
		PriorityQueue<Pair> que = new PriorityQueue<>((s1,s2)->s2.div()-s1.div());
		for(int i=0;i<N;i++) {
			que.add(new Pair(nextInt(),1));
		}

		if(que.size()==1) {
			Pair p = que.poll();
			p.num+=K;
			pw.println(p.div());
			return;
		}
		for(int i=0;i<K;i++) {
			Pair p = que.poll();
			p.num++;
			int x = que.peek().div();
			while(p.div()>=x) {
				p.num++;
				i++;
			}
			que.add(p);
		}
		pw.println(que.peek().div());
	}
	public static class Pair {
		int v;
		int num;
		public Pair(int v,int num) {
			this.v=v;
			this.num=num;
		}
		public int div() {
			return (v+num-1)/num;
		}
	}
	public static void solveF(String[] args) throws Exception{

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

