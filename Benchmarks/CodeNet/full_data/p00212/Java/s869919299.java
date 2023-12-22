import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int c=sc.nextInt(), n=sc.nextInt(), m=sc.nextInt(), s=sc.nextInt(), d=sc.nextInt();
			if(c == 0) break;

			int[][] t = new int[n+1][n+1];
			while(m-- > 0){
				int a=sc.nextInt(), b=sc.nextInt(), f=sc.nextInt();
				t[a][b] = t[b][a] = f;
			}

			Queue<State> open = new PriorityQueue<State>();
			Set<State> closed = new HashSet<State>();

			State st = new State(0,s,c);
			State ans = null;

			open.add(st);
			while(!open.isEmpty()){
				st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);
				if(st.city == d){
					ans = st;
					break;
				}
				open.addAll(st.nexts(t));
			}
			System.out.println(ans.cost);
		}
	}

	public static class State implements Comparable<State>{
		int cost, city, rem;

		State(int cost, int city, int rem){
			this.cost = cost;
			this.city = city;
			this.rem = rem;
		}

		List<State> nexts(int[][] t){
			List<State> sts = new ArrayList<State>();

			for(int i=1;i<t.length;i++){
				if(t[city][i] > 0){
					if(rem > 0) sts.add(new State(cost+t[city][i]/2,i,rem-1));
					sts.add(new State(cost+t[city][i],i,rem));
				}
			}

			return sts;
		}

		public int compareTo(State st){
			return cost - st.cost;
		}

		public boolean equals(Object o){
			State st = (State)o;
			return this.city == st.city && this.rem == st.rem;
		}

		public int hashCode(){
			return city * 100 + rem;
		}
	}
}