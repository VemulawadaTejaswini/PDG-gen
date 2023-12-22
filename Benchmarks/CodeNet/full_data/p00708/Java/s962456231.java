import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n == 0) break;

			double[] x = new double[n];
			double[] y = new double[n];
			double[] z = new double[n];
			double[] r = new double[n];

			for(int i=0;i<n;i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				z[i] = sc.nextDouble();
				r[i] = sc.nextDouble();
			}

			ArrayList<ArrayList<Edge>> map = new ArrayList<ArrayList<Edge>>();
			for(int i=0;i<n;i++) map.add(new ArrayList<Edge>());

			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					double dist = Math.sqrt( Math.pow(x[j]-x[i],2) +
																	 Math.pow(y[j]-y[i],2) +
																	 Math.pow(z[j]-z[i],2));

					Edge e = new Edge(i,j,0);
					if(dist > r[i] + r[j]){
						e.cost = dist - (r[i] + r[j]);
					}
					map.get(i).add(e);
				}
			}

			System.out.printf("%.3f\n",prim(map));
		}
	}

	private static double prim(ArrayList<ArrayList<Edge>> g){
		PriorityQueue<Edge> open = new PriorityQueue<Edge>();
		HashSet<Integer> closed = new HashSet<Integer>();
		double total = 0;
		open.add(new Edge(-1,0,0));
		ArrayList<Edge> ng = new ArrayList<Edge>();

		while(closed.size() != g.size()){
			Edge st = open.poll();
			if(closed.contains(st.to)) continue;
			closed.add(st.to);
			ng.add(st);
			total += st.cost;
			for(Edge e : g.get(st.to)){
				if(!closed.contains(e.to)){
					open.add(e);
				}
			}
		}

		return total;
	}
}

class Edge implements Comparable<Edge>{
	int from,to;
	double cost;

	Edge(int from,int to,double cost){
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	public int compareTo(Edge e){
		if(cost < e.cost) return -1;
		if(cost > e.cost) return 1;
		return 0;
	}
}