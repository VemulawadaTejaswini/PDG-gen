import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	static List[] arLs;
	static boolean[] visited;
	static int[] dist;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arLs = new List[n];
		visited = new boolean[n];
		dist = new int[n];
		for (int i=0;i<n;i++) {
			dist[i] = -1;
		}
		for (int i=0;i<n;i++) {
			List<Integer> ls = new ArrayList<Integer>();
			scan.nextInt();
			int np = scan.nextInt();
			for (int j=0;j<np;j++) {
				ls.add(scan.nextInt()-1);
			}
			arLs[i] = ls;
		}
		
		Queue q = new LinkedList();
		q.add(0);
		dist[0] = 0;
		while (!q.isEmpty()) {
			int now = (Integer) q.poll();
			for (int i=0;i<arLs[now].size();i++) {
				int next = (Integer) arLs[now].get(i);
				if (visited[next]) continue;
				visited[next] = true;
				dist[next] = dist[now]+1;
				q.add(next);
			}
		}
		for (int i=0;i<dist.length;i++) {
			System.out.println((i+1)+" "+dist[i]);
		}
	}
}