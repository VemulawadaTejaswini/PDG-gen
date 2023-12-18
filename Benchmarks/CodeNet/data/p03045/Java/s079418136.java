
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	ArrayList<ArrayList<Integer>> g = new ArrayList<>();
	boolean used[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		for(int i=0; i<N; i++) {
			g.add(new ArrayList<Integer>());
		}
		used = new boolean[N];
		for(int i=0; i<M; i++) {
			int x=sc.nextInt(); x--;
			int y=sc.nextInt(); y--;
			int z=sc.nextInt();
			g.get(x).add(y);
			g.get(y).add(x);
		}
		int cnt=0;
		for(int i=0; i<N; i++) {
			if(!used[i]) {
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

	public void dfs(int r) {
		ArrayDeque<Integer> s = new ArrayDeque<Integer>();
		s.add(r);
		used[r]=true;
		while(!s.isEmpty()) {
			int u = s.pop();
			for(int i=0; i<g.get(u).size(); i++) {
				int v = g.get(u).get(i);
				if(used[v]) continue;
				s.push(v);
				used[v]=true;
			}
		}
	}
}
