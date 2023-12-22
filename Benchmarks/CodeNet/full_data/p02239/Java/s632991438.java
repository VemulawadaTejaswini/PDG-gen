import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static Node[] nodes;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt();
		nodes = new Node[V];

		int node_id,tmp_num,tmp;

		//エッジ情報取得
		for(int loop = 0; loop < V; loop++){

			node_id = sc.nextInt();
			node_id--;

			nodes[node_id] = new Node();

			tmp_num = sc.nextInt();
			nodes[node_id].num_edge = tmp_num;

			for(int a = 0; a < tmp_num; a++){
				tmp = sc.nextInt();
				tmp--;
				nodes[node_id].list.add(tmp);
			}
		}

		int[] min_dist = new int[V];

		for(int i = 1; i < V; i++){
			min_dist[i] = BIG_NUM;
		}
		min_dist[0] = 0;

		Queue<Info> Q = new ArrayDeque<Info>();
		Q.add(new Info(0,0));

		int next_node,next_cost;

		while(!Q.isEmpty()){

			for(int i = 0; i < nodes[Q.peek().node_id].num_edge; i++){

				next_node = nodes[Q.peek().node_id].list.get(i);
				next_cost = Q.peek().sum_cost+1;

				if(min_dist[next_node] > next_cost){
					min_dist[next_node] = next_cost;
					Q.add(new Info(next_node,next_cost));
				}
			}
			Q.poll();
		}

		for(int i = 0; i < V; i++){
			if(min_dist[i] == BIG_NUM){
				min_dist[i] = -1;
			}
		}

		for(int i = 0; i < V; i++){
			System.out.println(Integer.toString(i+1)+" "+Integer.toString(min_dist[i]));
		}
	}
}


class Node{

	public int num_edge;
	public ArrayList<Integer> list;

	Node(){
		list = new ArrayList<Integer>();
	}
}


class Info{

	public int node_id;
	public int sum_cost;

	Info(int arg_node_id,int arg_sum_cost){
		node_id = arg_node_id;
		sum_cost = arg_sum_cost;
	}
}
