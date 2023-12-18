

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int N;
	static int K;
	static GM[]map;
	static long[]node;


	public static void main(String[]args) throws CloneNotSupportedException{
		try(Scanner scan = new Scanner(System.in)){
			N = scan.nextInt();
			map = new GM[N+1];
			node = new long[N+1];


			for(int i = 1;i<=N;i++) {
				map[i] = new GM(i);
				node[i] = Long.MAX_VALUE;
			}

			for(int i = 0;i<N-1;i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = scan.nextInt();
				map[a].are.add(new Edge(b,c));
				map[b].are.add(new Edge(a,c));
			}
			int Q = scan.nextInt();
			K = scan.nextInt();
			dijkstr();



			for(int i = 0;i<Q;i++) {
				int x = scan.nextInt();
				int y= scan.nextInt();

				long A = Math.abs(node[x]);
				long B = Math.abs(node[K]-node[y]);

				System.out.println(A+B);



			}




		}


	}

	private static void dijkstr()throws CloneNotSupportedException {
		PriorityQueue<GM>que = new PriorityQueue<GM>(Comparator.comparingLong(p->p.cost));
		que.add(map[K]);
		node[K] = 0;
		map[K].cost = 0;

		while(!que.isEmpty()) {
			GM p = que.poll();
			if(p.cost>node[p.num])continue;
			for(Edge s:p.are) {
				int to = s.to;
				long d = s.d;
				//System.out.println(to+" "+d);
				if(p.cost+d<node[to]) {
					GM pc = node[to]!=Long.MAX_VALUE?map[to].clone():map[to];
					pc.cost =  p.cost+d;
					node[to] = pc.cost;
					que.add(pc);
				}
			}
		}

	}




	private static class GM implements Cloneable{
		int num;
		long cost = Long.MAX_VALUE;
		ArrayList<Edge>are = new ArrayList<Edge>();
		GM(int nu){
			num=nu;
		}

		//cloneメソッドをオーバーライド
				@Override
			    protected GM clone() throws CloneNotSupportedException {
					 GM  node = (GM)super.clone();
			    return node;
			}

	}



	private static class Edge{
		int to;
		long d;
		Edge(int T,int D){
			to =T;d = D;
		}
	}


}
