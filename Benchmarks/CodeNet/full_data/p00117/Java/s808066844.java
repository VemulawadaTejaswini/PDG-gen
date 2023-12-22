import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt(), m=sc.nextInt();
		int[][] map = new int[n+1][n+1];

		for(int i=0;i<m;i++){
			String[] s = sc.next().split(",");
			int a=Integer.parseInt(s[0]), b=Integer.parseInt(s[1]);
			map[a][b] = Integer.parseInt(s[2]);
			map[b][a] = Integer.parseInt(s[3]);
		}

		String[] s = sc.next().split(",");
		int x1=Integer.parseInt(s[0]), x2=Integer.parseInt(s[1]);
		int ans = Integer.parseInt(s[2]) - Integer.parseInt(s[3]);

		ans -= minCost(x1,x2,map);
		ans -= minCost(x2,x1,map);

		System.out.println(ans);
	}

	static int minCost(int s,int g,int[][] map){
		Queue<State> open = new PriorityQueue<State>();
		Set<State> closed = new HashSet<State>();

		State st = new State(0,s);
		open.add(st);

		State ans = null;
		while(!open.isEmpty()){
			st = open.poll();
			if(closed.contains(st)) continue;
			closed.add(st);
			if(st.n == g){
				ans = st;
				break;
			}
			open.addAll(st.nexts(map));
		}

		return ans.cost;
	}

	static class State implements Comparable<State>{
		int cost, n;

		State(int cost,int n){
			this.cost = cost;
			this.n = n;
		}

		List<State> nexts(int[][] map){
			List<State> sts = new ArrayList<State>();
			for(int i=1;i<map.length;i++){
				if(n == i) continue;
				if(map[n][i] > 0) sts.add(new State(cost+map[n][i],i));
			}
			return sts;
		}

		public int compareTo(State st){
			return cost - st.cost;
		}

		public boolean equals(Object o){
			State st = (State)o;
			return this.n == st.n;
		}

		public int hashCode(){
			return this.n;
		}
	}
}