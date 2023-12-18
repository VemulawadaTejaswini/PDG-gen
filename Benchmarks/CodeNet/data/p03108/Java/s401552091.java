import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Bridge> bl = new ArrayList<Bridge>();
        int[] ans = new int[m];
        final int ANS = n*(n-1)/2;
        for(int i = 0; i < m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            Bridge br = new Bridge(a, b);
            bl.add(br);
        }
        Collections.reverse(bl);
        UnionFindTree uft = new UnionFindTree(n);
        ans[m-1] = ANS;
        for(int i = 0; i < bl.size()-1; i++){
            Bridge br = bl.get(i);
            int a = br.getA();
            int b = br.getB();
            if(!uft.same(a,b)){
                ans[m-2-i] = ans[m-1-i] - uft.getSize(a)*uft.getSize(b);
            }
            uft.union(a,b);
        }
        for(int i = 0; i < m; i++){
            System.out.println(ans[i]);
        }
    }
}

class Bridge{
    private int a;
    private int b;
    public Bridge(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
}

class UnionFindTree {
	int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納	
	int[] rank; //parentと同様に、木の高さを格納
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
		rank[i] = 0; //集合の高さ
		size[i] = 1;
	}
	
	public void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		int siz = size[parent[xRoot]] + size[parent[yRoot]]; 
		//xが属する木の方が大きい場合
		if (xRoot == yRoot){
		    return;
		}
		
		if (rank[xRoot] > rank[yRoot]) { 
			parent[yRoot] = xRoot; //yの親をxに更新 
			size[parent[yRoot]] = siz;
								   
		} else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
			size[parent[xRoot]] = siz;
			
		} else if (xRoot != yRoot){
			parent[yRoot] = xRoot;
			rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
			size[parent[yRoot]] = siz;
		}
		//System.out.println("x:" + x +"  y:" + y + "  size[x]:" + size[x] + "  size[y]:" + size[y]);
		
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
	
	public int getSize(int x){
	    return size[parent[x]];
	}
}