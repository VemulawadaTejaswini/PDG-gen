import java.util.*;

public class Main {
	static class Tree {
		int N;
		ArrayList<ArrayList<Integer>> node;
		public Tree(int N) {
			this.N = N;
			node = new ArrayList<>();
			for(int i=0; i<N; i++)
				node.add(new ArrayList<Integer>());
		}
		
		public void addNode(int a, int b) {
			node.get(a).add(b);
			node.get(b).add(a);
		}
		
		
		public int cut(int root, int K) {
			int L = node.get(root).size();
			int[] cost1 = new int[L];
			int sum = 0;
			for(int i=0; i<L; i++) {
				cost1[i] = getCost(root, node.get(root).get(i), K/2-1);
				sum += cost1[i];
			}
			
			if(K%2==0)
				return sum;
			
			int[] cost2 = new int[L];
			int ans = N;
			for(int i=0; i<L; i++) {
				cost2[i] = getCost(root, node.get(root).get(i), (K+1)/2-1);
				ans = Math.min(ans, sum+cost2[i]-cost1[i]);
			}
			
			return ans;
		}
		
		int getCost(int parent, int cur, int maxDepth) {
			int ans = 0;
			for(Integer i : node.get(cur)) {
				if(i==parent)
					continue;
				ans += getCost(cur, i, maxDepth-1);
			}
			return ans + (maxDepth<0 ? 1 : 0);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		Tree tree = new Tree(N);
		
		for(int i=0; i<N-1; i++)
			tree.addNode(sc.nextInt()-1, sc.nextInt()-1);
		
		int ans = N;
		for(int i=0; i<N; i++)
			ans = Math.min(ans, tree.cut(i, K));
		
		System.out.println(ans);
		sc.close();
	}
}
