import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		init(n);

		int p[] = new int[n];
		for(int i=0; i<n; i++) {
			p[i]=sc.nextInt();
			p[i]--;
		}
		for(int i=0; i<m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			x--;y--;
			unite(x,y);
		}
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(same(p[i], i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

	int p[];
	int rank[];
	private void init(int n) {
		p = new int[n];
		rank = new int[n];
		for(int i=0; i<n; i++) {
			p[i]=i;
			rank[i]=0;
		}
	}
	private boolean same(int x, int y) {
		return find(x)==find(y);
	}
	private int find(int x) {
		if(p[x]==x) return x;
		return p[x] = find(p[x]);
	}

	private boolean link(int x, int y) {
		if(x==y) return false;
		if(rank[x] < rank[y]) {
			p[x]=y;
		}else {
			p[y]=x;
			if(rank[x]==rank[y]) {
				rank[y]++;
			}
		}
		return true;
	}

	private boolean unite(int x, int y) {
		return link(find(x), find(y));
	}
}
