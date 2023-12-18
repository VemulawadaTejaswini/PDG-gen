import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] edge = new int[m][2];
		for(int i = 0; i < m; i++){
		    edge[i][0] = sc.nextInt()-1;
		    edge[i][1] = sc.nextInt()-1;
		}
		
		// 計算
		int result = 0;
		UnionFind uf;
		for(int i = 0; i < m; i++){
		    uf = new UnionFind(n);
		    for(int j = 0; j < m; j++){
		        if(i == j) continue;
		        uf.union(edge[j][0], edge[j][1]);
		    }
		    if(!uf.same(edge[i][0], edge[i][1])) result++;
		}
		
		
		// 出力
		System.out.println(result);
	}
}

class UnionFind {
    int[] parent;
    int[] rank;
    
    UnionFind(int n){
        this.parent = new int[n];
        this.rank = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }
    
    public int find(int i){
        if(i == parent[i]) return i;
        parent[i] = find(parent[i]);
        return parent[i];
    }
    
    public void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);
        if(rank[xRoot] < rank[yRoot]){
            parent[xRoot] = yRoot;
        }else if(rank[xRoot] > rank[yRoot]){
            parent[yRoot] = xRoot;
        }else{
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
    
    public boolean same(int x, int y){
        return find(x) == find(y);
    }
}
