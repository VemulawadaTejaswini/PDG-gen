
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Node{
		List<Integer> adj;
		public Node() {
			adj = new ArrayList<Integer>();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Node vs[] = new Node[N * 3];
		for(int i = 0 ; i < N ; ++i){
			vs[i] = new Node();
			vs[i + N] = new Node();
			vs[i + 2 * N] = new Node();
		}
		for(int i = 0 ; i < M ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			vs[a].adj.add(b + N);
			vs[a + N].adj.add(b + 2 * N);
			vs[a + 2 * N].adj.add(b);
		}
		int S = sc.nextInt() - 1;
		int T = sc.nextInt() - 1;
		int dist[] = new int[vs.length];
		Arrays.fill(dist, -1);
		dist[S] = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(S);
		while(!q.isEmpty()){
			int cur = q.poll();
			int cd = dist[cur];
			for(int a : vs[cur].adj){
				if(dist[a] < 0){
					dist[a] = cd + 1;
					q.add(a);
				}
			}
		}
		if(dist[T] >= 0){
			System.out.println(dist[T] / 3);			
		}else{
			System.out.println(dist[T]);			
		}
	}
}
