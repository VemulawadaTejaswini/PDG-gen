import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        WeightedUnionFind wuf = new WeightedUnionFind(n);
        for(int i = 0; i < m; i++){
            if(!wuf.union(sc.nextInt()-1,sc.nextInt()-1,sc.nextLong())){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

class WeightedUnionFind{
    int[] parent;
    int[] rank;
    long[] weight;

    public WeightedUnionFind(int size) {
		this.parent = new int[size];
		this.rank = new int[size];
        this.weight = new long[size];
		
		for (int i = 0; i < size; i++) {
			makeSet(i);
		}
	}
	
	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0;
	}

    public boolean union(int x, int y, long w) {
        w += getWeight(x);
        w -= getWeight(y);
		int xRoot = find(x);
		int yRoot = find(y);
        if(xRoot == yRoot){
            return getDistance(xRoot,yRoot) == w;
        } else if (rank[xRoot] > rank[yRoot]) { 
			parent[yRoot] = xRoot;
            weight[yRoot] = w;
		} else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
            weight[xRoot] = -w;
		} else if (xRoot != yRoot){
			parent[yRoot] = xRoot;
			rank[xRoot]++; 
            weight[yRoot] = w;
		}
        return true;
	}
	
	public int find(int i) {
        int p = parent[i];
        if(p == i){
            return i;
        }else{
            int root = find(p);
            weight[i] += weight[root];
            return parent[i] = root;
        }
	}

    public long getWeight(int i){
        find(i);
        return weight[i];
    }

     public long getDistance(int x, int y) {
        return getWeight(y) - getWeight(x);
    }
	
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
}
