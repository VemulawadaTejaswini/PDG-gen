import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	ArrayList<ArrayList<Integer>>g = new ArrayList<>();
	boolean used[];
	int n;
	int ans;
	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<>());
		}
		used = new boolean[n];
		for(int i=0; i<m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--;
			b--;
			g.get(a).add(b);
			g.get(b).add(a);
		}
		used[0]=true;
		dfs(0, 1);
		System.out.println(ans);
		sc.close();
	}

	private void dfs(int u, int cnt) {
		for(int i=0; i<g.get(u).size(); i++) {
			int v = g.get(u).get(i);
			if(! used[v]) {
				used[v]=true;
				dfs(v, cnt+1);
				used[v]=false;
			}
		}
		if(cnt == n) {
			ans++;
		}
	}
}
