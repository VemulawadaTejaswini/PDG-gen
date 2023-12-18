import java.util.*;

public class Main {

	static int N, M, K;
	
	void run() {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	M = sc.nextInt();
    	K = sc.nextInt();

    	//
    	// グラフ作成 i=0は使用しないのでN+1作成する
    	// Adjacency list representation 
    	// 0.05(s) 可読性悪
    	//
    	List<List<Integer>> graph_friends = new ArrayList<List<Integer>>();
    	List<List<Integer>> graph_block = new ArrayList<List<Integer>>();
    	for (int i=0; i<N+1; i++) {
    		graph_friends.add(new ArrayList<Integer>());
    		graph_block.add(new ArrayList<Integer>());
    	}
    	
    	
    	UnionFind fr = new UnionFind(N+1);
    	// 友達入力、UnionFindの計算
    	for (int i=0; i<M; i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	graph_friends.get(a).add(b);
        	graph_friends.get(b).add(a);
        	fr.unite(a, b); // FindTree作成
    	}
    	//System.out.println(graph_friends);

    	// ブロック入力
    	for (int i=0; i<K; i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	graph_block.get(a).add(b);
        	graph_block.get(b).add(a);
    	}
    	//System.out.println(graph_block);

    	//
    	// Find Tree
    	//
    	for(int i=0; i<N+1; i++){
    		
    		List<Integer> known_list =  new ArrayList<Integer>();
    		for(int j=0; j<N+1; j++){
    			if(fr.same(i, j)){
    				known_list.add(j);
    			}
    		}
        	// known_listから友達とブロックを引く
        	known_list.removeAll(graph_friends.get(i));
        	known_list.removeAll(graph_block.get(i));
        	if(i == 0){
        		continue;
        	}
           	System.out.print(known_list.size() - 1 + (i!=N ? " ":""));
    	}
   	
    	sc.close();
	}

	public class UnionFind {
        int[] parents, sizes;
 
        UnionFind(int n) {
            parents = new int[n];
            sizes = new int[n];
            for(int i = 0; i < n; i++) {
                parents[i] = i;
                sizes[i] = 1;
            }
        }
 
        public int find(int x) {
            if (x == parents[x]) return x;
            return parents[x] = find(parents[x]);
        }
 
        public void unite(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return;
            if (parents[x] < parents[y]) {
                int temp = x;
                x = y;
                y = temp;
            }
            parents[y] = x;
        }
 
        public boolean same(int x, int y) {
            return find(x) == find(y);
        }
 
        public int size(int x) {
            return sizes[find(x)];
        }
        
     }
	
    public static void main(String[] args) {
        new Main().run();
    }
}