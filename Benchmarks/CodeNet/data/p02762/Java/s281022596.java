import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[][] ab = new int[m][2];
		for(int i = 0; i < m; i++){
		    ab[i][0] = sc.nextInt()-1;
		    ab[i][1] = sc.nextInt()-1;
		}
		int[][] cd = new int[k][2];
		for(int i = 0; i < k; i++){
		    cd[i][0] = sc.nextInt()-1;
		    cd[i][1] = sc.nextInt()-1;
		}
		
		// 計算
		int[] result = new int[n];
		UnionFind uf = new UnionFind(n);
		for(int i = 0; i < m; i++){
		    uf.union(ab[i][0], ab[i][1]);
		    result[ab[i][0]]--;
		    result[ab[i][1]]--;
		}
		for(int i = 0; i < k; i++){
		    if(uf.same(cd[i][0], cd[i][1])){
		        result[cd[i][0]]--;
		        result[cd[i][1]]--;
		    } 
		}
		for(int i = 0; i < n; i++){
		    result[i] += uf.cnt(i)-1;
		}
		/*
		for(int i = 0; i < n; i++){
		    System.out.print(uf.cnt(i) +" ");
		}*/
		//System.out.println("");
		//System.out.println(Arrays.toString(uf.parent));
		//System.out.println(Arrays.toString(uf.rank));
		//System.out.println(Arrays.toString(uf.cnt));
		
		// 出力
		//System.out.println(result);
		for(int i = 0; i < n; i++){
		    System.out.print(result[i] + " ");
		}
	}
}

class UnionFind {
    int[] parent;
    int[] rank;
	int[] cnt;
    
    UnionFind(int n){
        this.parent = new int[n];
        this.rank = new int[n];
        this.cnt = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            rank[i] = 0;
            cnt[i] = 1;
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
        if(same(x, y)) return;
        if(rank[xRoot] < rank[yRoot]){
            parent[xRoot] = yRoot;
            cnt[yRoot] += cnt[xRoot];
        }else if(rank[xRoot] > rank[yRoot]){
            parent[yRoot] = xRoot;
            cnt[xRoot] += cnt[yRoot];
        }else{
            parent[yRoot] = xRoot;
            rank[xRoot]++;
            cnt[xRoot] += cnt[yRoot];
        }
    }
    
    public boolean same(int x, int y){
        return find(x) == find(y);
    }

    public int cnt(int x){
        return cnt[find(x)];
    }
}
