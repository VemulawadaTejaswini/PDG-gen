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
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<Integer>());
		}
		for(int i=0; i<n-1; i++) {
			int a = sc.nextInt(); a--;
			int b = sc.nextInt(); b--;
			g.get(a).add(b);
			g.get(b).add(a);
		}

		int d[][] = new int[2][n];
		bfs(g, d[0], 0);
		bfs(g, d[1], n-1);

		int fcnt=0;
		int scnt=0;
		for(int i=0; i<n; i++) {
			if(d[0][i]<=d[1][i]) {
				fcnt++;
			}else {
				scnt++;
			}
		}
		if(fcnt>scnt) {
			System.out.println("Fennec");
		}else {
			System.out.println("Snuke");
		}
		sc.close();
	}

	private void bfs(ArrayList<ArrayList<Integer>> g, int d[], int root) {
		boolean used[] = new boolean[g.size()];
		d[root]=0;
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(root);
		used[root]=true;
		while(!q.isEmpty()) {
			int s = q.poll();
			for(int t : g.get(s)) {
				if(used[t]) continue;
				used[t]=true;
				d[t] = d[s]+1;
				q.add(t);
			}
		}
	}
}

