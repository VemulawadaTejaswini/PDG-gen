import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt();
		int E = sc.nextInt();

		Edge edge[] = new Edge[E];

		int from,to,weight;

		for(int i = 0; i < E; i++){

			from = sc.nextInt();
			to = sc.nextInt();
			weight = sc.nextInt();

			edge[i] = new Edge(from,to,weight);
		}

		Arrays.sort(edge);

		UnionFind UF = new UnionFind(V);
		UF.init();

		int ans = 0;
		for(int i = 0; i < E; i++){
			if(UF.is_same(edge[i].from,edge[i].to))continue;

			UF.unite(edge[i].from, edge[i].to);
			ans += edge[i].weight;
		}

		System.out.println(ans);
	}
}

class Edge implements Comparable<Edge>{

	public int from;
	public int to;
	public int weight;

	Edge(int arg_from,int arg_to,int arg_weight){
		from = arg_from;
		to = arg_to;
		weight = arg_weight;
	}

	public int compareTo(Edge arg){
		if(this.weight < arg.weight)return -1;
		if(this.weight > arg.weight)return 1;
		return 0;
	}
}

class UnionFind{
	private int boss[];
	private int height[];
	private int size;

	UnionFind(int size){
		boss = new int[size];
		height = new int[size];
		this.size = size;
	}

	public void init(){
		for(int i = 0; i < size; i++){
			boss[i] = i;
			height[i] = 0;
		}
	}

	public int get_boss(int id){
		if(boss[id] == id)return id; //自分が代表なら、自分の値を返す
		else{
			return boss[id] = get_boss(boss[id]); //代表でないなら、自分が所属する組織の代表を返しつつ、経路圧縮
		}
	}

	public boolean is_same(int x,int y){
		return get_boss(x) == get_boss(y);
	}

	void unite(int x,int y){
		int boss_x = get_boss(x);
		int boss_y = get_boss(y);

		//既に同じグループなら何もしない
		if(boss_x == boss_y)return;

		//高さが高い方に吸収する
		if(height[x] > height[y]){

			boss[boss_y] = boss_x;

		}else if(height[x] < height[y]){

			boss[boss_x] = boss_y;

		}else{ //height[x] == height[y]

			boss[boss_y] = boss_x;
			height[x]++;
		}
	}
}


