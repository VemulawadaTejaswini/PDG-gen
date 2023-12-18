import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class UnionFindTree {
	    private int[] parent;    //親ノード
	    private int[] rank;      //高さ or 次数
	    public UnionFindTree(int size) {
	        parent = new int[size];
	        rank = new int[size];
	        for (int i = 0; i < size; i++) {
	            makeSet(i);
	        }
	    }
	    public void makeSet(int x) {
	        parent[x] = x;
	        rank[x] = 0;
	    }
	    public void union(int x, int y) {
	        final int xRoot = find(x);
	        final int yRoot = find(y);
	        if (rank[xRoot] > rank[yRoot]) {
	            parent[yRoot] = xRoot;        //x の木に結合
	        }
	        else if(rank[xRoot] < rank[yRoot]) {
	            parent[xRoot] = yRoot;        //y の木に結合
	        }
	        else if (xRoot != yRoot) {        //同じ高さで根が違うとき
	            parent[yRoot] = xRoot;        //x の木に結合
	            rank[xRoot]++;                //x の木の高さを加算
	        }
	    }
	    public int find(int x) {
	        if (x != parent[x]) {    //根でないとき
	            parent[x] = find(parent[x]);    //直接、根に繋ぐ(経路圧縮)
	        }
	        return parent[x];
	    }
	    public boolean same(int x, int y) {
	        return find(x) == find(y);
	    }
	}
	static class Node{
		List<Integer> adj;
		public Node() {
			adj = new ArrayList<Integer>();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		Node connects[] = new Node[N];
		Node blocks[] = new Node[N];
		for(int i = 0 ; i < N ; ++i){
			connects[i] = new Node();
			blocks[i] = new Node();
		}
		UnionFindTree uf = new UnionFindTree(N);
		for(int i = 0 ; i < M ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			uf.union(a, b);
			connects[a].adj.add(b);
			connects[b].adj.add(a);
		}
		for(int i = 0 ; i < K ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			blocks[a].adj.add(b);
			blocks[b].adj.add(a);			
		}
		int groupSize[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			groupSize[uf.find(i)]++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N ; ++i){
			int gs = groupSize[uf.find(i)];
			gs = gs - 1 - connects[i].adj.size();
			for(int b : blocks[i].adj){
				if(uf.find(i) == uf.find(b)){
					gs--;
				}
			}
			if(sb.length() > 0){
				sb.append(' ');
			}
			sb.append(gs);
//			System.out.println(i+" "+gs);
		}
		System.out.println(sb);
	}
}
