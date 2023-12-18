import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Edge{
	int edge;
	int weight;

	Edge(int a ,int b){
		this.edge = a;
		this.weight = b;
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<List<Edge>> edge = new ArrayList<>();

		for(int i = 0 ; i < N ; ++i){
			edge.add(new ArrayList<>());
		}

		for(int i = 1 ; i < N ; ++i){
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt();

			edge.get(u).add(new Edge(v,w));
			edge.get(v).add(new Edge(u,w));

		}

		sc.close();

		int[] colors = new int[N];
		Arrays.fill(colors, -1);
		colors[0] = 0;

		Queue<Integer> queue = new ArrayDeque<>();

		queue.add(0);

		while(!queue.isEmpty()){
			int tmp = queue.poll();
			for(Edge i : edge.get(tmp)){
				//System.out.println(tmp + " " + i.edge + " " + i.weight);
				if(colors[i.edge] >= 0){
					continue;
				}
				//colors[i.edge] = colors[tmp] ^ (i.weight & 1);
				if(i.weight%2 == 0){
					colors[i.edge] = colors[tmp];
				}
				else{
					if(colors[tmp] == 0){
						colors[i.edge] = 1;
					}
					else{
						colors[i.edge] = 0;
					}
				}

				//System.out.println(colors[i.edge]);
				queue.add(i.edge);
			}
		}

		for(int i = 0 ; i < N ; ++i){
			System.out.println(colors[i]);
		}
	}
}
