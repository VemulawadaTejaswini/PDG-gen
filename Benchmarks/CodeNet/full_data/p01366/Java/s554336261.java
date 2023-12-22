import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			HashMap<Integer,HashMap<Integer,Point>> map = new HashMap<Integer,HashMap<Integer,Point>>();

			for(int i=0;i<m;i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				Point cost = new Point(sc.nextInt(), sc.nextInt());

				if(!map.containsKey(a)) map.put(a,new HashMap<Integer,Point>());
				if(!map.containsKey(b)) map.put(b,new HashMap<Integer,Point>());
				map.get(a).put(b,cost);
				map.get(b).put(a,cost);
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			open.add(new State(0,0,0,0));

			int rem = n;
			int[] minDists = new int[n];
			int[] minCosts = new int[n];
			Arrays.fill(minCosts,Integer.MAX_VALUE);

			while(!open.isEmpty()){
				State st = open.poll();
				int cost = Integer.MAX_VALUE;
				if(st.before != st.id) cost = map.get(st.before).get(st.id).y;
				if(minDists[st.id] == st.dist && minCosts[st.id] > cost) minCosts[st.id] = cost;
				if(closed.contains(st)) continue;
				closed.add(st);

				minDists[st.id] = st.dist;
				minCosts[st.id] = cost;

				if(!map.containsKey(st.id)) continue;
				for(int to : map.get(st.id).keySet()){
					Point p = map.get(st.id).get(to);
					open.add(new State(to,st.id,st.dist+p.x,st.cost+p.y));
				}
			}

			int ans = 0;
			for(int i=0;i<n;i++){
				if(minCosts[i] != Integer.MAX_VALUE){
					ans += minCosts[i];
				}
			}

			System.out.println(ans);
		}
	}
}
/*
class Edge implements Comparable<Edge>{
	int from,to,dist,cost;

	Edge(int from,int to,int dist,int cost){
		this.from = from;
		this.to = to;
		this.dist = dist;
		this.cost = cost;
	}
}
*/
class State implements Comparable<State>{
	int id,before,dist,cost;

	State(int id,int before,int dist,int cost){
		this.id = id;
		this.before = before;
		this.dist = dist;
		this.cost = cost;
	}

	public int compareTo(State st){
		if(dist != st.dist) return dist - st.dist;
		return cost - st.cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return id == st.id;
	}

	public int hashCode(){
		return id;
	}
}