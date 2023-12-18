import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		UnionFind tree = new UnionFind(N);
		for(int i=0; i<M; i++) {
			int X = in.nextInt()-1;
			int Y = in.nextInt()-1;
			int Z = in.nextInt();
			tree.unit(X, Y);
		}
		System.out.println(tree.countRoots());
	}
	
	class UnionFind{
		int[] parent;
		int[] depth;
		
		public UnionFind(int eNum){
			parent = new int[eNum];
			depth = new int[eNum];
			for(int i=0;i<eNum;i++){
				parent[i] = i;
			}
		}
		
		public int getRoot(int x){
			if(parent[x]==x) return x;
			return parent[x] = getRoot(parent[x]); // press
		}
		
		public void unit(int x,int y){
			x = getRoot(x);
			y = getRoot(y);
			if(x==y) return;
			if(depth[x]<depth[y]){
				parent[x] = y;
			}else{
				parent[y] = x;
				if(depth[x]==depth[y]) depth[x]++;
			}
		}
		
		public boolean same(int x,int y){
			return getRoot(x)==getRoot(y);
		}
		
		public int countRoots() {
			int count = 0;
			for(int i=0; i<parent.length; i++) {
				if(parent[i] == i) count ++;
			}
			return count;
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}