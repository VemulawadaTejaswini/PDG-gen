import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
	int parent[];
	int prenum[];
	int lowest[];
	boolean visited[];
	int timer=0;
	int root = 1;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		parent = new int[n+1];
		prenum = new int[n+1];
		lowest = new int[n+1];
		visited =  new boolean[n+1];
		int m=sc.nextInt();
		for(int i=0; i<n+1; i++) {
			g.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			g.get(a).add(b);
			g.get(b).add(a);
		}

		dfs(root, -1);

		int cnt=0;

		for(int i=root+1; i<n+1; i++) {
			if(prenum[i]==lowest[i]) {
				cnt++;
			}
		}

		System.out.println(cnt);
		sc.close();
	}

	private void dfs(int s, int prev) {
		visited[s]=true;
		prenum[s] = lowest[s] = timer++;

		for(int t : g.get(s)) {
			if(! visited[t]) {
				parent[t]=s;
				dfs(t, s);
				lowest[s] = Math.min(lowest[s], lowest[t]);
			} else if(t != prev) {
				lowest[s] = Math.min(lowest[s], prenum[t]);
			}
		}

	}
}
