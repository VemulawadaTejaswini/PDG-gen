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
    int[] size;

    public WeightedUnionFind(int size) {
		this.parent = new int[size];
		this.rank = new int[size];
        this.weight = new long[size];
		this.size = new int[size];
		
		for (int i = 0; i < size; i++) {
			makeSet(i);
		}
	}
	
	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0;
		size[i] = 1;
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
			size[xRoot] += size[yRoot];
            weight[yRoot] = w;
		} else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
			size[yRoot] += size[xRoot];
            weight[xRoot] = -w;
		} else if (xRoot != yRoot){
			parent[yRoot] = xRoot;
			size[xRoot] += size[yRoot];
			rank[xRoot]++; 
            weight[yRoot] = w;
		}
        return true;
	}
	
	public int find(int i) {
		if (i != parent[i]) {
		    parent[i] = find(parent[i]);
            weight[i] += weight[parent[i]];
		}
		return parent[i];
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

	public int size(int x) {
		return size[find(x)];
	}
}
