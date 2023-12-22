import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n=sc.nextInt(),m=sc.nextInt(),l=sc.nextInt();
			if(n==0 && m==0 && l==0) break;
			Point[][] map = new Point[n+1][n+1];

			while(m-- > 0){
				int a=sc.nextInt(),b=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt();
				map[a][b] = new Point(d,e);
				map[b][a] = new Point(d,e);
			}

			Queue<State> open = new PriorityQueue<State>();
			Set<State> closed = new HashSet<State>();

			State st = new State(0,l,1);
			open.add(st);

			State ans = null;
			while(!open.isEmpty()){
				st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);
				if(st.id == n){
					ans = st;
					break;
				}
				open.addAll(st.nexts(map));
			}
			System.out.println(st.cost);
		}
	}
}

class State implements Comparable<State>{
	int cost;
	int money;
	int id;

	State(int cost, int money, int id){
		this.cost = cost;
		this.money = money;
		this.id = id;
	}

	List<State> nexts(Point[][] map){
		List<State> sts = new ArrayList<State>();
		int n = map.length;

		for(int i=1;i<n;i++){
			if(i == id) continue;
			if(map[id][i] == null) continue;
			sts.add(new State(cost+map[id][i].y, money, i));
			if(money >= map[id][i].x)
				sts.add(new State(cost, money-map[id][i].x, i));
		}

		return sts;
	}

	public int compareTo(State st){
		return cost - st.cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return this.money==st.money && this.id==st.id;
	}

	public int hashCode(){
		return money + id;
	}
}