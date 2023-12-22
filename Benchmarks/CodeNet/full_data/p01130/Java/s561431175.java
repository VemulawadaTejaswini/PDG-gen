import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n=sc.nextInt(), m=sc.nextInt(), s=sc.nextInt(), g1=sc.nextInt(), g2=sc.nextInt();
			if(n == 0) break;

			int[][] map = new int[n+1][n+1];
			while(m-- > 0){
				map[sc.nextInt()][sc.nextInt()] = sc.nextInt();
			}

			int min = Integer.MAX_VALUE;
			for(int i=1;i<=n;i++){
				int c1=minCost(i,g1,map);
				int c2=minCost(i,g2,map);
				int c3=minCost(s,i,map);

				if(c1==-1 || c2==-1 || c3==-1) continue;
				min = Math.min(min, c1+c2+c3);
			}
			System.out.println(min);
		}
	}

	public static int minCost(int s,int g,int[][] map){
		Queue<State> open = new PriorityQueue<State>();
		Set<State> closed = new HashSet<State>();

		State st = null, ans = null;
		open.add(new State(0,s));
		while(!open.isEmpty()){
			st = open.poll();
			if(closed.contains(st)) continue;
			if(st.n == g){
				ans = st;
				break;
			}
			open.addAll(st.nexts(map));
		}

		if(ans == null) return -1;
		return ans.cost;
	}
}

class State implements Comparable<State>{
	int cost,n;

	State(int cost, int n){
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
		return this.cost - st.cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return this.n == st.n;
	}
}