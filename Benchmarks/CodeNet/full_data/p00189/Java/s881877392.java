import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			int[][] map = new int[10][10];

			for(int i=0;i<n;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int cost = sc.nextInt();

				map[a][b] = map[b][a] = map[a][b]==0 ? cost : Math.min(map[a][b],cost);
			}

			int ansNode = 0, ansCost = Integer.MAX_VALUE;
			for(int from=0;from<10;from++){
				int sum = 0;
				for(int to=0;to<10;to++){
					sum += minCost(from,to,map);
				}
				if(sum != 0 && (ansCost > sum || ansCost == sum && ansNode > from)){
					ansCost = sum;
					ansNode = from;
				}
			}

			System.out.println(ansNode + " " + ansCost);
		}
	}

	static int minCost(int s,int g,int[][] map){
		PriorityQueue<State> open = new PriorityQueue<State>();
		HashSet<State> closed = new HashSet<State>();
		State ans = null;
		open.add(new State(s,0));

		while(!open.isEmpty()){
			State st = open.poll();
			if(closed.contains(st)) continue;
			closed.add(st);
			if(st.n == g){
				ans = st;
				break;
			}
			open.addAll(st.nexts(map));
		}

		if(ans == null) return 0;
		else return ans.cost;
	}
}

class State implements Comparable<State>{
	int n,cost;

	State(int n,int cost){
		this.n = n;
		this.cost = cost;
	}

	List<State> nexts(int[][] map){
		List<State> sts = new ArrayList<State>();
		for(int i=0;i<map.length;i++){
			if(map[n][i] > 0){
				sts.add(new State(i,cost+map[n][i]));
			}
		}
		return sts;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return st.n == this.n;
	}

	public int hashCode(){
		return n;
	}

	public int compareTo(State st){
		return this.cost - st.cost;
	}
}