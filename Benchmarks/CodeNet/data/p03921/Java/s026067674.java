import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Unionfind uf=new Unionfind(n+m);
		for(int i = 0; i<n; i++){
			int k = sc.nextInt();
			for(int j = 0; j<k; j++){
				int l = sc.nextInt()-1;
				uf.unite(n+l,i);
			}
		}
		if(uf.size(0)==n+m){
			System.out.println("YES");
		}else{
			
			System.out.println("NO");
		}
	}
	static class Unionfind{
		int[] parent;
		int[] size;
		public Unionfind(int n){
			this.parent=new int[n];
			this.size=new int[n];
			for(int i = 0; i<n; i++){
				parent[i]=i;
				size[i]=1;
			}
		}
		public int root(int t){
			if(parent[t]==t){
				return t;
			}else{
				return parent[t]=root(parent[t]);
			}
		}
		public void unite(int x,int y){
			if(same(x,y)){
				return;
			}
			int xroot = root(x);
			int yroot = root(y);
			parent[yroot]=xroot;
			size[xroot]+=yroot;
		}
		public boolean same(int x,int y){
			return root(x)==root(y);
		}
		public int size(int x){
			return size[root(x)];
		}
	}
}
