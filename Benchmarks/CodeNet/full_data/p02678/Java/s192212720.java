import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Perform BFS from 2...N then use those values to print

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		boolean bad = false;
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		int[] dp = new int[N+1]; //Shortest length path to 1 for vertex i
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			graph[A].add(B);
			graph[B].add(A);
		}
		int[] shortest = new int[N+1];
		for (int i = 2; i <= N; i++) {
			shortest[i] = BFS(graph,i);
			if (shortest[i]==Integer.MAX_VALUE) {
				bad=true;
				break;
			} 
		}
		if (bad) System.out.println("No");
		else {
			System.out.println("Yes");
			for (int i = 2; i <= N; i++) {
				int len = Integer.MAX_VALUE;
				int ans = -1;
				for (int adj = 0; adj < graph[i].size(); adj++) {
					int neighbour = graph[i].get(adj);
					if (shortest[neighbour]<len) {
						len=shortest[neighbour];
						ans=neighbour;
					}
				}
				System.out.println(ans);
			}
		}
	}
	public static int BFS(ArrayList<Integer>[] graph,int START) {
		if (START==1) return 1;
		boolean[] vis = new boolean[graph.length];
		vis[START]=true;
		Queue<Integer> cur = new LinkedList<Integer>();
		cur.add(START);
		int ans = 1;
		while (!cur.isEmpty()) {
			int size = cur.size();
			for (int check = 0; check<size;check++) {
				int curSTART = cur.poll();
				for (int i = 0; i < graph[curSTART].size(); i++) {
					if (graph[curSTART].get(i)==1) return ans;
					if (!vis[graph[curSTART].get(i)]) {
						cur.add(graph[curSTART].get(i));
						vis[graph[curSTART].get(i)]=true;
					}
				}
			}
			ans++;
		}
		return Integer.MAX_VALUE;
	}
}