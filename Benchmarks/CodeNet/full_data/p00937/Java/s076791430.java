import java.util.*;


public class Main {
	class Node{
		int idx;
		boolean reach;
		ArrayList<Node> next;
		public Node(int idx){
			next = new ArrayList<>();
			this.idx = idx;
		}
	}
	
	
	int N;
	int M;
	int[] ABC;
	Node[] nodes;
	int[] memo1;
	int[][] memo2;
	
	public int dfs2(Node current, int len){
		if(len == 0){
			return dfs(current);
		}else{
			if(memo2[current.idx][len] != -1){
				return memo2[current.idx][len];
			}
			int ans = 2 * N;
			for(Node nn : current.next){
				ans = Math.min(ans, dfs2(nn, len - 1));
			}
			return memo2[current.idx][len] = ans;
		}
	}
	
	public int dfs(Node current){
		if(current.idx >= N - 1) return 0;
		if(current.reach) return 2 * N;
		current.reach = true;
		if(memo1[current.idx] == -1){
			int ans = 0;
			for(int j = 0; j < 3; j++){
				ans = Math.max(ans, dfs2(current, ABC[j]));
			}
			ans++;
			memo1[current.idx] = ans; 
		}
		current.reach = false;
		return memo1[current.idx];
	}
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		ABC = new int[3];
		for(int i = 0; i < 3; i++){
			ABC[i] = sc.nextInt();
		}
		nodes = new Node[N];
		for(int i = 0; i < N; i++){
			nodes[i] = new Node(i);
		}
		for(int i = 0; i < M; i++){
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			nodes[u].next.add(nodes[v]);
		}
		
		memo1 = new int[N];
		memo2 = new int[N][200];
		for(int i = 0; i < N; i++){
			memo1[i] = -1;
			for(int j = 0; j < 200; j++){
				memo2[i][j] = -1;
			}
		}
		
		int ans = dfs(nodes[0]);
		if(ans >= 2 * N){
			System.out.println("IMPOSSIBLE");
		}else{
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}

}