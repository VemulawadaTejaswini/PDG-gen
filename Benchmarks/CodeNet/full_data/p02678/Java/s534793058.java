import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static ArrayDeque<int[]> que = new ArrayDeque<>();
	public static boolean[] canMove ;
	public static void main(String[] args) throws Exception {
		solution(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solution(String[] args) throws Exception{

		int N = nextInt();
		int M = nextInt();
		canMove = new boolean[N+1];
		Arrays.fill(canMove, true);
		canMove[1]=false;
		ArrayList<Integer>[] list = new ArrayList[N+1];
		for(int i=0;i<list.length;i++){
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++){
			int A =nextInt();
			int B =nextInt();
			list[A].add(B);
			list[B].add(A);
		}

		int[] ans = new int[N+1];
		Arrays.fill(ans, -1);
		que.add(new int[]{1,1});
		bfs(1,1,list,ans);

		for(int i=2;i<ans.length;i++){
			if(ans[i]==-1){
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
		for(int i=2;i<ans.length;i++){
			pw.println(ans[i]);
		}


	}

	public static void bfs(int parent ,int now, ArrayList<Integer>[] list ,int[] ans){

		while(que.size()!=0){
			int[] tmp = que.poll();
			parent=tmp[1];
			now=tmp[0];

			if(canMove[now]==true){
				ans[now]=parent;
			}
			canMove[now]=false;

			if(list[now].size()==0){
				ans[now]=parent;
				return;
			}
			for(int n:list[now]){
				if(canMove[n]==true){
					que.add(new int[]{n,now});
				}
			}
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

