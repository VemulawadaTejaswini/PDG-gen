import java.util.*;

public class Main {
	
	public static class Edge {
		
		int A;
		int B;
		
		public Edge(int A, int B) {
			this.A = A;
			this.B = B;
		}
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		@SuppressWarnings("unchecked") LinkedList<Integer>[] edges = new LinkedList[N];
		Edge[] edgeList = new Edge[M];
		long cumulativeInconvenience = 0;
		
		for (int i = 0; i < N; i++) {
			edges[i] = new LinkedList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			edges[A-1].add(B);
			edges[B-1].add(A);
			edgeList[i] = new Edge(A, B);
		}
		
		for (int i = 0; i < M; i++) {
			Edge e = edgeList[i];
			int A = e.A-1;
			int B = e.B-1;
			edges[A].remove(new Integer(e.B));
			edges[B].remove(new Integer(e.A));
			boolean[] visited = new boolean[N];
			Stack<Integer> st = new Stack<Integer>();
			st.push(A);
			visited[A] = true;
			int visitedCountA = 1;
			boolean loopFormed = false;
			while (!st.isEmpty()) {
				int currentIsland = st.pop();
				if (currentIsland == B) {
					loopFormed = true;
					break;
				}
				for (int island : edges[currentIsland]) {
					if (!visited[island-1]) {
						visited[island-1] = true;
						visitedCountA++;
						st.push(island-1);
					}
				}
			}
			
			if (!loopFormed) {
				visited = new boolean[N];
				st = new Stack<Integer>();
				st.push(B);
				visited[B] = true;
				int visitedCountB = 1;
				while (!st.isEmpty()) {
					int currentIsland = st.pop();
					for (int island : edges[currentIsland]) {
						if (!visited[island-1]) {
							visited[island-1] = true;
							visitedCountB++;
							st.push(island-1);
						}
					}
				}
				int combinedVisitedCount = visitedCountA+visitedCountB;
				long previousPairs = (combinedVisitedCount*(combinedVisitedCount-1))/2;
				long newPairs = (visitedCountA*(visitedCountA-1)+visitedCountB*(visitedCountB-1))/2;
				cumulativeInconvenience += previousPairs - newPairs;
			}
			
			System.out.println(cumulativeInconvenience);
		}
    }
  
}
