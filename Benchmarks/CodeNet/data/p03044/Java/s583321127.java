import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int edge[][] = new int[n-1][3];
		List<int[]>[] link = new List[n];
		for(int i=0; i<n; i++) {
			link[i] = new LinkedList<int[]>();
		}
		List<int[]> used = new LinkedList<>();
		int[] color = new int[n];

		int u, v, w;
		for(int i=0; i<n-1; i++) {
			u=sc.nextInt()-1;
			v=sc.nextInt()-1;
			w=sc.nextInt()-1;
			edge[i][0]=u;
			edge[i][1]=v;
			edge[i][2]=w;
		}
		for(int i=0; i<n; i++) {
			link[edge[i][0]].add(edge[i]);
			link[edge[i][1]].add(edge[i]);
		}
		Queue<int[]> edgeq= new LinkedList<>();
		Queue<Integer> parq= new LinkedList<>();
		for(int[] l: link[0]) {
			edgeq.add(l);
			parq.add(0);
			used.add(l);
		}
		color[0]=0;
		int next;
		while(edgeq.size()!=0) {
			int[] e = edgeq.poll();
			int p = parq.poll();
			if(e[0]==p) next=e[1];
			else next=e[0];
			for(int[] l: link[next]) {
				if(used.contains(l)) continue;
				edgeq.add(l);
				parq.add(next);
				used.add(l);
			}
			color[next]=color[p]^(e[2]%2)^1;
		}
		for(int c: color)
			System.out.println(c);
	}
}
