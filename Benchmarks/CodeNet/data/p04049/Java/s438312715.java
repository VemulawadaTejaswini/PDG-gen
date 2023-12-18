import java.util.*;

public class Main {
	static class Tree {
		int N;
		int dia;
		ArrayList<ArrayList<Integer>> node;
		boolean[] valid ;
		public Tree(int N) {
			this.N = N;
			node = new ArrayList<>();
			for(int i=0; i<N; i++)
				node.add(new ArrayList<Integer>());
			valid = new boolean[N];
			Arrays.fill(valid, true);
		}
		
		public void addNode(int a, int b) {
			node.get(a).add(b);
			node.get(b).add(a);
		}
		
		public int getValidNode() {
			for(int i=0; i<N; i++)
				if(valid[i])
					return i;
			return -1;
		}
		
		public int[] getFarestLeaf(int root) {
			int[] dis = new int[N];
			Arrays.fill(dis, -1);
			
			int[] q = new int[N];
			int s=0,t=0;
			
			q[t++] = root;
			dis[root] = 0;
			int idx = 0;
			while(s<t) {
				if(s>0 && dis[q[s-1]]<dis[q[s]])
					idx = s;
				int cur = q[s++];
				for(Integer child : node.get(cur)) {
					if(dis[child]>=0 || !valid[child])
						continue;
					q[t++]=child;
					dis[child] = dis[cur]+1;
				}
			}
			dia = dis[q[t-1]];
			
			int[] ans = new int[t-idx];
			System.arraycopy(q, idx, ans, 0, t-idx);
			
			return ans;
		}
		
		public int getDia() {
			return dia;
		}
		
		public void cutLeaf(int[] leaf) {
			for(int i : leaf)
				valid[i] = false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		Tree tree = new Tree(N);
		
		for(int i=0; i<N-1; i++) {
			tree.addNode(sc.nextInt()-1, sc.nextInt()-1);
		}
		
		int ans = 0;
		
		while(true) {
			int[] leaf = tree.getFarestLeaf(tree.getValidNode());
			leaf = tree.getFarestLeaf(leaf[0]);
			int dia = tree.getDia();
			if(dia<=K)
				break;
			ans += leaf.length;
			tree.cutLeaf(leaf);
		}
		
		System.out.println(ans);
		sc.close();
	}
}
