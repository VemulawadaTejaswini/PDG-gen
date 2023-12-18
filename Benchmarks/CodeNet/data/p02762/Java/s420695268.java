import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int M = Integer.parseInt(s.next());
        int K = Integer.parseInt(s.next());

        boolean[][] fr = new boolean[N][N];
        boolean[][] bl = new boolean[N][N];
        
        UnionFindTree friend = new UnionFindTree(N);
        UnionFindTree block = new UnionFindTree(N);
        LinkedList<LinkedList<Integer>> candidate = new LinkedList<>();
        for(int i=0; i<N; i++){
            LinkedList<Integer> lt = new LinkedList<>();
            candidate.add(lt);
        }
        for(int i=0; i<M; i++){
            int a = Integer.parseInt(s.next());
            int b = Integer.parseInt(s.next());
            fr[a-1][b-1] = true;
            fr[b-1][a-1] = true;
            friend.union(a-1, b-1);
        }
        for(int i=0; i<K; i++){
            int c = Integer.parseInt(s.next());
            int d = Integer.parseInt(s.next());
            bl[c-1][d-1] = true;
            bl[d-1][c-1] = true;
            block.union(c-1, d-1);
        }
        s.close();

        // int[] candidate = new int[N];
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(!fr[i][j] && friend.isSame(i, j)){
                    candidate.get(i).add(j);
                }
            }
        }

        int[] result = new int[N];
        for(int i=0; i<N; i++){
            for(int j: candidate.get(i)){
                if(!block.isSame(i, j)){
                    result[i] += 1;
                    result[j] += 1;
                }
            }
            
        }
        
        for(int i=0; i<N; i++){
            System.out.println(result[i]);
        }
    }
}


class UnionFindTree{
    int[] parent;
    int[] rank;         //集合の高さ

    public UnionFindTree(int numOfnode){
        this.parent = new int[numOfnode];
        this.rank = new int[numOfnode];

        for (int i = 0; i < numOfnode; i++) {
            initialize(i);
        }
    }

    public void initialize(int i) {
        parent[i] = i;
        rank[i] = 0; 
    }

    public int find(int x){
        //return x's root
        if(parent[x] != x ){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y){
        int rootx = find(x);
        int rooty = find(y);
		//xが属する木の方が大きい場合
		if (rank[rootx] > rank[rooty]) { 
			parent[rooty] = rootx; //yの親をxに更新 
								   
		} else if(rank[rootx] < rank[rooty]) {
			parent[rootx] = rooty;
			
		} else if (rootx != rooty){
			parent[rooty] = rootx;
			rank[rootx]++; //同じ高さの木がルートの子として着くから大きさ++;
		}
    }

    public boolean isSame(int x, int y){
        return find(x) == find(y);
    }
}