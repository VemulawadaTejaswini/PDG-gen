import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Point{
	int x, y, id;
	public Point(int X, int Y, int i) {
		x = X; y = Y; id = i;
	}
}
class edge implements Comparable <edge>{
	int from; int to; int cost;
	public edge(int x,int y,int c){
		this.from=x; this.to=y; this.cost=c;
	}
	public int compareTo(edge o) {
		return this.cost-o.cost;
	}
}
class UnionFind{
	int[] par;
	UnionFind(int n){
		par=new int[n];
		for(int i=0;i<n;i++)par[i]=i;
	}
	public int find(int x){
		if(par[x]==x)return x;
		return par[x]=find(par[x]);
	}
	public Boolean same(int x,int y){
		return find(x)==find(y);
	}
	public void unite(int x,int y){
		if(find(x)==find(y))return;
		par[find(x)]=find(y);
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Point[] p = new Point[N];
		for(int i = 0; i < N; i++) p[i] = new Point(sc.nextInt(), sc.nextInt(), i);
		edge[] edges = new edge[2 * N - 2];
		/* sorting in x-axis */
		Arrays.sort(p, new Comparator<Point>() {
			public int compare(Point o1, Point o2) {
				return o1.x - o2.x;
			}
		});
		/* draw edge */
		for(int i = 0; i < N - 1; i++) {
			edges[i] = new edge(p[i].id, p[i + 1].id, Math.min(Math.abs(p[i].x - p[i + 1].x), Math.abs(p[i].y - p[i + 1].y)));
		}
		/* sorting in y-axis */
		Arrays.sort(p, new Comparator<Point>() {
			public int compare(Point o1, Point o2) {
				return o1.y - o2.y;
			}
		});
		/* draw edge */
		for(int j = 0; j < N - 1; j++){
			edges[j + N - 1] = new edge(p[j].id, p[j + 1].id, Math.min(Math.abs(p[j].x - p[j + 1].x), Math.abs(p[j].y - p[j + 1].y)));
		}
		Arrays.sort(edges);
		UnionFind uf = new UnionFind(N);
		long sum = 0;
		for(int i = 0; i < edges.length; i++) {
			if(!uf.same(edges[i].from, edges[i].to)) {
				sum += (long)edges[i].cost;
				uf.unite(edges[i].from, edges[i].to);
			}
		}
		System.out.println(sum);
	}
}