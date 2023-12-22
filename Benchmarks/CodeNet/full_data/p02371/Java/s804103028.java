import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static int V;
	public static ArrayList<Edge> G[];
	public static int DEPTH[];
	public static int PARENT[];
	public static int max_path1[];
	public static int max_path2[];
	public static int ans = -1;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		V = scanner.nextInt();

		G = new ArrayList[V];
		for(int i = 0; i < V; i++){

			G[i] = new ArrayList<Edge>();
		}
		DEPTH = new int[V];
		PARENT = new int[V];
		max_path1 = new int[V];
		max_path2 = new int[V];

		for(int loop = 0; loop < V-1; loop++){

			int from = scanner.nextInt();
			int to = scanner.nextInt();
			int cost = scanner.nextInt();

			G[from].add(new Edge(to,cost));
			G[to].add(new Edge(from,cost));
		}

		//深さの計算
		Queue<Data> Q = new ArrayDeque<Data>();
		PriorityQueue<Info> PQ = new PriorityQueue<Info>();

		DEPTH[0] = 0;
		PARENT[0] = -1;
		Q.add(new Data(0,-1));

		while(!Q.isEmpty()){

			PQ.add(new Info(Q.peek().node_id,DEPTH[Q.peek().node_id]));

			for(int i = 0; i < G[Q.peek().node_id].size(); i++){

				int child = G[Q.peek().node_id].get(i).to;
				if(child == Q.peek().parent)continue;

				DEPTH[child] = DEPTH[Q.peek().node_id]+1;
				PARENT[child] = Q.peek().node_id;
				Q.add(new Data(child,Q.peek().node_id));
			}
			Q.poll();
		}

		while(!PQ.isEmpty()){

			max_path1[PQ.peek().node_id] = 0;
			max_path2[PQ.peek().node_id] = 0;

			for(int i = 0; i < G[PQ.peek().node_id].size(); i++){

				int child = G[PQ.peek().node_id].get(i).to;
				if(child == PARENT[PQ.peek().node_id])continue;

				int tmp = G[PQ.peek().node_id].get(i).cost+max_path1[child];

				if(tmp > max_path1[PQ.peek().node_id]){

					max_path2[PQ.peek().node_id] = max_path1[PQ.peek().node_id];
					max_path1[PQ.peek().node_id] = tmp;

				}else if(tmp > max_path2[PQ.peek().node_id]){

					max_path2[PQ.peek().node_id] = tmp;
				}
			}

			ans = Math.max(ans, max_path1[PQ.peek().node_id]+max_path2[PQ.peek().node_id]);
			PQ.poll();
		}

		System.out.println(ans);
	}
}

class Data{

	public int node_id;
	public int parent;

	Data(int arg_node_id,int arg_parent){
		this.node_id = arg_node_id;
		this.parent = arg_parent;
	}
}

class Info implements Comparable<Info>{

	public int node_id;
	public int depth;

	Info(int arg_node_id,int arg_depth){
		this.node_id = arg_node_id;
		this.depth = arg_depth;
	}

	public int compareTo(Info another){
		if(this.depth > another.depth)return -1;
		if(this.depth < another.depth)return 1;
		return 0;
	}
}

class Edge{

	public int to;
	public int cost;

	Edge(int arg_to,int arg_cost){
		this.to = arg_to;
		this.cost = arg_cost;
	}
}

class UTIL{

	//String→intへ変換
	public static int getNUM(String tmp_str){

		return Integer.parseInt(tmp_str);
	}

	//文字が半角数字か判定する関数
	public static boolean isNumber(String tmp_str){

		if(tmp_str == null || tmp_str.length() == 0){

			return false;
		}

		Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
		Matcher matcher = pattern.matcher(tmp_str);
		return matcher.matches();
	}
}
