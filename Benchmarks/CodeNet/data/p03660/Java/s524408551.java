;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	ArrayList<ArrayList<Integer>> g = new ArrayList<>();
	int n;
	boolean used[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<>());
		}
		long d1[] = new long[n];
		long d2[] = new long[n];

		used = new boolean[n];
		for(int i=0; i<n-1; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--;
			b--;
			g.get(a).add(b);
			g.get(b).add(a);
		}
		Arrays.fill(used, false);
		d1[0]=0;
		dfs(0,0,d1);

		Arrays.fill(used, false);
		d2[n-1]=0;
		dfs(n-1,0,d2);

		int bc=0;
		int wc=0;
		for(int i=1; i<n-1; i++) {
			if(d1[i]<=d2[i]) {
				bc++;
			}else {
				wc++;
			}
		}
		if(bc==wc) {
			System.out.println("Snuke");
		}else if(bc<wc) {
			System.out.println("Snuke");
		}else {
			System.out.println("Fennec");
		}
		sc.close();
	}

	public void dfs(int parent, long dist, long d[]) {
		used[parent]=true;
		d[parent]=dist;
		for(int i=0; i<g.get(parent).size(); i++) {
			int t = g.get(parent).get(i);
			if(used[t]) continue;
			dfs(t, dist+1, d);
		}
	}

}
