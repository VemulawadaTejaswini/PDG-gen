import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		boolean bad = false;
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			graph[A].add(B);
			graph[B].add(A);
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int START = 2; START <= N; START++) {
			int best = -1;
			int shortestPath = Integer.MAX_VALUE;
			for (int i = 0; i < graph[START].size(); i++) {
				if (BFS(graph,graph[START].get(i))<shortestPath) {
					shortestPath=BFS(graph,graph[START].get(i));
					best = graph[START].get(i);
				}
			}
			if (shortestPath==Integer.MAX_VALUE) {
				bad=true;
				break;
			}else {
				ans.add(best);
			} 
		}
		if (bad) System.out.println("No");
		else {
			System.out.println("Yes");
			for (int i = 0; i < ans.size(); i++) {
				System.out.println(ans.get(i));
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