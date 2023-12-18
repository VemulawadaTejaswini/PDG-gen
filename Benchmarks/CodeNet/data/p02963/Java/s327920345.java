import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long s = sc.nextLong();
        if(s <= 1000000000L){
            System.out.println("0 0 0 1 "+s+" 0");
        }else{
            long x = s%1000000000;
            long y = s/1000000000;
            System.out.println("0 0 1000000000 1 "+x+" "+y);
        }
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
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
 
    public void union(int x, int y, long w) {
        w += getWeight(x);
        w -= getWeight(y);
        int xRoot = find(x);
        int yRoot = find(y);
        if (rank[xRoot] > rank[yRoot]) { 
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
        return;
    }
	
	public int find(int i) {
	    int p = parent[i];
	    if (i != parent[i]) {
	        parent[i] = find(parent[i]);
	        weight[i] += weight[p];
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