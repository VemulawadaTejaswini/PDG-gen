import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new UF().doIt();		
	}
	
	class UF{
		class UnionFind{
			int par[]; //???
			int rank[];
			UnionFind(int n){
				rank = new int[n];
				par=new int[n];
				for(int i=0;i<n;i++)par[i]=i;
			}
			int find(int x){
				if(par[x] == x) return x;
				else return par[x] = find(par[x]);
			}
			//x??¨y????±??????????????????????
			void unite(int x,int y){
				x = find(x);
				y = find(y);
				if(x == y)return;
				if(rank[x] < rank[y]){
					par[x] = y;
				}else {
					par[y] = x;
					if(rank[x] == rank[y])rank[x]++;
				}
			}
			//x??¨y???????????????????±????????????????
			boolean same(int x,int y){
				return find(x) == find(y);
			}
		}
		void doIt() { 
			int n = sc.nextInt();
			int q = sc.nextInt();
			UnionFind uf = new UnionFind(n);
			for(int i = 0;i < q;i++){
				int com = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				if(com==0) uf.unite(x, y);
	            else{
	            	if(uf.same(x, y))System.out.println("1");
	            	else System.out.println("0");
	            }
			}
		}
	}
}