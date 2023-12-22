import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main(){
		doIt();
	}
	
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		UnionFind uf = new UnionFind(n);
		for(int i = 0; i < q; i++){
			int op = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(op ==0) uf.unite(x, y);
			else{
				int ans = 0;
				if(uf.same(x,y)){
					ans = 1;
				}
				System.out.println(ans);
			}
		}
	}
}

class UnionFind{
	int par[]; //???
	int rank[]; //??¨?????±???
	
	public UnionFind(int n){
		rank = new int[n];
		par = new int[n];
		for(int i = 0; i < n; i++){
			par[i] = i;
		}	
	}
	
	//??¨??????????±???????
	int find(int x){
		if(par[x] == x)return x;
		else return par[x] = find(par[x]);
	}
	
	//x??¨y????±??????????????????????
	void unite(int x, int y){
		x = find(x);
		y = find(y);
		if(x == y)return;
		if(rank[x] < rank[y]){
			par[x] = y;
		}else{
			par[y] = x;
			if(rank[x] == rank[y])rank[x]++;
		}
	}
	
	boolean same(int x, int y){
		return find(x) == find(y);
	}
}