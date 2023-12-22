import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if(n==0) break;

			int[][] t = new int[n][n];
			for(int i=0;i<m;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				t[a][b] = t[b][a] = c;
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			int[] closed = new int[n];
			Arrays.fill(closed,Integer.MAX_VALUE);
			open.add(new State(0,0,new ArrayList<Integer>()));
			ArrayList<ArrayList<Integer>> passes = new ArrayList<ArrayList<Integer>>();

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed[st.id] < st.cost) continue;
				closed[st.id] = st.cost;

				if(st.id == n-1){
					passes.add(st.pass);
					continue;
				}

				for(int i=0;i<n;i++){
					if(t[st.id][i] > 0){
						ArrayList<Integer> tmp = new ArrayList<Integer>(st.pass);
						tmp.add(i);
						open.add(new State(i,st.cost+t[st.id][i],tmp));
					}
				}
			}

			double per = 1.0 / passes.size();
			double[] ans = new double[n];
			ans[0] = 1.0;
			for(ArrayList<Integer> al : passes){
				for(int id : al){
					ans[id] += per;
				}
			}

			for(int i=0;i<p;i++){
				System.out.printf("%.8f\n",ans[sc.nextInt()]);
			}
			System.out.println();
		}
	}
}

class State implements Comparable<State>{
	int id,cost;
	ArrayList<Integer> pass;

	State(int id,int cost,ArrayList<Integer> pass){
		this.id = id;
		this.cost = cost;
		this.pass = pass;
	}

	public int compareTo(State st){
		return cost - st.cost;
	}
}