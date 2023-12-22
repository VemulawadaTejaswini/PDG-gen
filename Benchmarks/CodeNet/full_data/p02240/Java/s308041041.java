
import java.util.Scanner;

public class Main {
	int[][] parent;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] nrs = in.nextLine().split(" "); // nrs stands for nodes and relations
		int nodes = Integer.parseInt(nrs[0]);
		int rels = Integer.parseInt(nrs[1]);
		Main graph = new Main(nodes);
		for (int i = 0; i < nodes; i++) {
			graph.set(i);
		}
		
		for (int i = 0; i < rels; i++) {
			String[] holder = in.nextLine().split(" ");
			int num1 = Integer.parseInt(holder[0]);
			int num2 = Integer.parseInt(holder[1]);
			graph.union(num1, num2);
		}
		int q = in.nextInt();
		String lastSeen = "";
		for (int i = 0; i < q; i++) {
			
			int q1 = in.nextInt();
			int q2 = in.nextInt();
			if (graph.find(q1) == graph.find(q2)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		
	}
	
	public Main(int n) {
		// Each node will have a degree to which indicates the length of its subtree
		parent = new int[n][2];
	}
	
	
	public void set(int x) {
		parent[x] = new int[] {x, 0};
		
	}
	
	// Union function
	public void union(int x, int y) {
		int[] r1 = find(x);
		int[] r2 = find(y);
		// If r1 is the smaller tree 
		if (r1[1] < r2[1] ) {
			parent[r1[0]] = r2;			
		}
		else if (r1[1] > r2[1]) {
			parent[r2[0]] = r1;
		}
		else {
			parent[r2[0]] = r1;
			parent[r1[0]][1] += 1;
		}
	}
	
	// Find parent function
	public int[] find(int x) {
		int[] curr = parent[x];
		while(parent[curr[0]][0] != curr[0]) {
			curr = parent[curr[0]];
		}
		return curr;
	}
	
}


