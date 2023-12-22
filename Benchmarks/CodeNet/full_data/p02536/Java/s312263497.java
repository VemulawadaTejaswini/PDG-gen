import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
class UnionFindTree {
	int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納	
	int[] rank; //parentと同様に、木の高さを格納
	int[] size;
	public UnionFindTree(int n) {
		this.parent = new int[n];
		this.rank = new int[n];
		this.size = new int [n];
		for (int i = 0; i < n; i++) {
			makeSet(i);
		}
	}
	
	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0; //集合の高さ
		size[i] = 1;
	}
	
	public void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		
		//xが属する木の方が大きい場合
		if (rank[xRoot] > rank[yRoot]) { 
			parent[yRoot] = xRoot; //yの親をxに更新 
			size[xRoot] += size[yRoot];
								   
		} else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
			size[yRoot] += size[xRoot];
			
		} else if (xRoot != yRoot){
			parent[yRoot] = xRoot;
			size[xRoot] += size[yRoot];
			rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
		}
	}
	
	//引数の属する木のルートのidを返す
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}
	
	//同じ木に属しているか
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
	
	//木のsize取得
	public int getsize(int i) {
		return size[find(i)];
	}
 
}
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		UnionFindTree tree = new UnionFindTree(n);
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			tree.union(a, b);
		}
		for(int i = 0 ; i < n; i++) {
			tree.find(i);
			set.add(tree.parent[i]);
		}
		System.out.println(set.size()-1);
	}
}