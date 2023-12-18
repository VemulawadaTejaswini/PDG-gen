
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		ArrayList<ArrayList<Integer>> g0 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> g1 = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<k; i++) {
			g0.add(new ArrayList<Integer>());
			g1.add(new ArrayList<Integer>());
		}
		for(int i=1; i<k; i++) {
			g0.get(i).add((i*10)%k);
			g1.get(i).add((i+1)%k);
		}
		ArrayDeque<Integer>deq = new ArrayDeque<Integer>();
		int dist[] = new int[k];
		int INF = 1001001001;
		for(int i=0; i<k; i++) dist[i] = INF;
		dist[1]=1;
		deq.push(1);
		while(!deq.isEmpty()) {
			int u = deq.poll();
			for(int v : g0.get(u)) {
				if(dist[v]>dist[u]) {
					dist[v]=dist[u];
					deq.addFirst(v);
				}
			}
			for(int v : g1.get(u)) {
				if(dist[v]>dist[u]) {
					dist[v] = dist[u]+1;
					deq.addLast(v);
				}
			}
		}
		System.out.println(dist[0]);
		sc.close();
	}

}
