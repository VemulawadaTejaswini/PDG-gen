import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n=sc.nextInt(), m=sc.nextInt();
			if(n==0 && m==0) break;

			int[][] moneyMap = new int[m+1][m+1];
			int[][] timeMap = new int[m+1][m+1];

			while(n-- > 0){
				int a=sc.nextInt(), b=sc.nextInt();
				moneyMap[a][b] = moneyMap[b][a] = sc.nextInt();
				timeMap[a][b] = timeMap[b][a] = sc.nextInt();
			}

			int k = sc.nextInt();
			while(k-- > 0){
				int p=sc.nextInt(), q=sc.nextInt(), r=sc.nextInt();
				System.out.println(r==0 ? minCost(p,q,moneyMap) : minCost(p,q,timeMap));
			}
		}
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
		int cost;
		int n;

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
			return n;
		}
	}
}