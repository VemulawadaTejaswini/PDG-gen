import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			ArrayList<HashMap<String,Integer>> marketTmp = new ArrayList<HashMap<String,Integer>>();
			marketTmp.add(new HashMap<String,Integer>()); //ツ嘉づ個閉ェ(ツ渉、ツ品ツづ債づ按つオ)
			for(int i=1;i<=n;i++){
				int k = sc.nextInt();
				marketTmp.add(new HashMap<String,Integer>());
				for(int j=0;j<k;j++){
					String name = sc.next();
					int value = sc.nextInt();
					marketTmp.get(i).put(name,value);
				}
			}

			int q = sc.nextInt();
			HashMap<String,Integer> list = new HashMap<String,Integer>();
			for(int i=0;i<q;i++){
				list.put(sc.next(),i);
			}

			ArrayList<HashMap<String,Integer>> market = new ArrayList<HashMap<String,Integer>>();
			market.add(new HashMap<String,Integer>()); //ツ嘉づ個閉ェ(ツ渉、ツ品ツづ債づ按つオ)
			for(int i=1;i<=n;i++){
				market.add(new HashMap<String,Integer>());
				for(String name : marketTmp.get(i).keySet()){
					if(list.get(name) != null){
						market.get(i).put(name,marketTmp.get(i).get(name));
					}
				}
			}

			int m = sc.nextInt();
			int[][] map = new int[n+1][n+1];
			for(int i=0;i<m;i++){
				int s = sc.nextInt();
				int t = sc.nextInt();
				int d = sc.nextInt();
				map[s][t] = map[t][s] = d;
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			open.add(new State(0,0,0,0));
			State ans = null;

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.id == 0 && st.bought == (1<<q)-1){
					ans = st;
					break;
				}

				for(int i=0;i<=n;i++){
					if(map[st.id][i] > 0){
						open.add(new State(i,st.bought,st.price,st.walk+map[st.id][i]));
					}
				}

				for(String name : market.get(st.id).keySet()){
					int tmp = list.get(name);
					if((st.bought & (1<<tmp))==0){
						open.add(new State(st.id,st.bought|(1<<tmp),st.price+market.get(st.id).get(name),st.walk));
					}
				}
			}

			System.out.println(ans==null ? "impossible" : (ans.price + " " + ans.walk));
		}
	}
}

class State implements Comparable<State>{
	int id,bought,price,walk;

	State(int id,int bought,int price,int walk){
		this.id = id;
		this.bought = bought;
		this.price = price;
		this.walk = walk;
	}

	public int compareTo(State st){
		if(price == st.price) return walk - st.walk;
		return price - st.price;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return id == st.id && bought == st.bought;
	}

	public int hashCode(){
		return id + bought * 100;
	}
}