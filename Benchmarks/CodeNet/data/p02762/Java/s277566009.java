import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        UnionFindTree utf = new UnionFindTree(n);
        int[] friends = new int[n];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            utf.union(a,b);
            friends[a]++;
            friends[b]++;
        }
        int[] remains = new int[n];
        for(int i = 0; i < n; i++){
            remains[i] = utf.size(i)-friends[i]-1;
        }
        for(int i = 0; i < k; i++){
            int c = sc.nextInt()-1;
            int d = sc.nextInt()-1;
            if(utf.same(c,d)){
                remains[c]--;
                remains[d]--;
            }
        }
        for(int i = 0; i < n; i++){
            if(i == n-1) System.out.println(remains[i]);
            else System.out.print(remains[i] + " ");
            
        }
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