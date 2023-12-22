import java.util.*;
import java.io.*;

class Main {

	static final int INF = Integer.MAX_VALUE/2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] str = line.split(" ");

		int V = Integer.parseInt(str[0]);
		int E = Integer.parseInt(str[1]);
		int r = Integer.parseInt(str[2]);

		PriorityQueue<Edge> pQue = new PriorityQueue<Edge>(11,COMPARATOR);

		for (int i=0; i<E; i++) {
			line = br.readLine();
			str = line.split(" ");
			int s = Integer.parseInt(str[0]);
			int t = Integer.parseInt(str[1]);
			int d = Integer.parseInt(str[2]);
			Edge edge = new Edge(s,t,d);
			pQue.add(edge);
		}

		List<List<Edge>> Ed = new ArrayList<List<Edge>>();
		int count = 0;

		while (pQue.size() != 0) {
			List<Edge> list = new ArrayList<Edge>();
			while (pQue.peek().from == count) {
				list.add(pQue.poll());
				if (pQue.size() == 0)
					break;
			}
			Ed.add(list);
			count++;
		}

		boolean[] flag = new boolean[V];
		flag[r] = true;

		int[] d = new int[V];
		Arrays.fill(d,INF);
		d[r] = 0;

		int now = r;
		count = 0;

		while (true) {
			List list = Ed.get(now);
			for (int i=0; i<list.size(); i++) {
				Edge edge = (Edge)list.get(i);
				if (!flag[edge.to])
					d[edge.to] = Math.min(d[edge.to],d[now]+edge.cost);
				count++;
			}

			if (count == E)
				break;

			int min = INF;
			for (int i=0; i<V; i++) {
				if (!flag[i] && d[i]<min){
					min = d[i];
					now = i;
				}
			}
			flag[now] = true;
		}

		for (int i=0; i<V; i++) {
			System.out.println((d[i]==INF?"INF":d[i]));
		}

		br.close();
	}

	static class Edge {
		int from;
		int to;
		int cost;

		Edge(int from,int to,int cost){
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}

	public static final Comparator<Edge> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<Edge>{
		public int compare(Edge x,Edge y){
			return (x.from > y.from) ? 1 : ((x.from == y.from) ? 0 : -1);
		}
	}
}