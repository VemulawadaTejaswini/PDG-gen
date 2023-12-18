import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 1; i <= n; i++){
            map.put(sc.nextInt(),i);
        }
        UnionFindTree uft = new UnionFindTree(n+1);
        for(int i = 0; i < m; i++){
            uft.union(sc.nextInt(),sc.nextInt());
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(uft.same(i,map.get(i))) ans++;
        }
        System.out.println(ans);
    }
}

class UnionFindTree {
	int[] parent;
	int[] rank;
	int[] size;
	
	public UnionFindTree(int size) {
		this.parent = new int[size];
		this.rank = new int[size];
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
	
	public void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		
		if (rank[xRoot] > rank[yRoot]) { 
			parent[yRoot] = xRoot;
			size[xRoot] += size[yRoot];
		} else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
			size[yRoot] += size[xRoot];
		} else if (xRoot != yRoot){
			parent[yRoot] = xRoot;
			size[xRoot] += size[yRoot];
			rank[xRoot]++; 
		}
	}
	
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}
	
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}

	public int size(int x) {
		return size[find(x)];
	}
}