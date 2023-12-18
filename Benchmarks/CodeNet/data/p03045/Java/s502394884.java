import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] ans=new boolean[n];
		Unionfind uf=new Unionfind(n);
		for(int i = 0; i<m; i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			int z = sc.nextInt();
			uf.unite(x,y);
		}
		long count=0;
		for(int i=0; i<n; i++){
			if(!ans[uf.root(i)]){
				ans[uf.root(i)]=true;
				count++;
			}
		}
		System.out.println(count);
	}
	static class Unionfind{
		int[] parent;
		public Unionfind(int n){
			this.parent=new int[n];
			for(int i = 0; i<n; i++){
				parent[i]=i;
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
		}
		public boolean same(int x,int y){
			return root(x)==root(y);
		}
	}
}
