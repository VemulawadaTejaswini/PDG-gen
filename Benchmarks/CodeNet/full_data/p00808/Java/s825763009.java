import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

//Young, Poor and Busy
public class Main{

	int START = 60*8;
	int FINISH = 60*18;
	int INF = 1<<29;
	
	int ID;
	Map<String, Integer> ref;
	int get(String s){
		if(ref.containsKey(s))return ref.get(s);
		ref.put(s, ID);
		return ID++;
	}
	int time(String s){
		String[] t = s.split(":");
		return Integer.parseInt(t[0])*60+Integer.parseInt(t[1]);
	}
	
	int[][] dist;
	
	class E implements Comparable<E>{
		int s, t, leave, arrive, cost;
		public E(int s, int t, int leave, int arrive, int cost) {
			this.s = s;
			this.t = t;
			this.leave = leave;
			this.arrive = arrive;
			this.cost = cost;
		}
		public int compareTo(E o) {
			return arrive-o.arrive;
		}
	}
	
	int dijkstra(int start, int arrive, int goal){
		dist = new int[ID][FINISH+1];
		for(int[]a:dist)Arrays.fill(a, INF);
		dist[start][arrive] = 0;
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(ID, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return dist[o1[0]][o1[1]]-dist[o2[0]][o2[1]];
			}
		});
		q.add(new int[]{start, arrive});
		while(!q.isEmpty()){
			int[] a = q.poll();
			int v = a[0];
			int t = a[1];
			if(FINISH<t)continue;
			if(v==goal)return dist[goal][t];
			for(E e:l[v]){
				if(FINISH<e.arrive||e.leave<t)continue;
				int w = dist[v][t] + e.cost;
				if(w<dist[e.t][e.arrive]){
					dist[e.t][e.arrive] = w;
					q.add(new int[]{e.t, e.arrive});
					for(int j=e.arrive;j<=FINISH;j++)dist[e.t][j] = Math.min(dist[e.t][j], dist[e.t][e.arrive]);
				}
			}
		}
		return INF;
	}
	
	List<E>[] l;
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int m = sc.nextInt();
			if(m==0)break;
			ID = 0; ref = new HashMap<String, Integer>();
			get("Hakodate"); get("Tokyo");
			E[] e = new E[m+2];
			l = new ArrayList[100];
			for(int i=0;i<100;i++)l[i]=new ArrayList<E>();
			for(int i=0;i<m;i++){
				int s = get(sc.next());
				int a = time(sc.next());
				int t = get(sc.next());
				int b = time(sc.next());
				int c = sc.nextInt();
				e[i] = new E(s, t, a, b, c);
				l[s].add(e[i]);
			}
			e[m] = new E(0, 0, START, START, 0);
			e[m+1] = new E(1,1,START,START, 0);
			Arrays.sort(e);
			int[][] go1 = new int[ID][FINISH+1];
			for(int[]a:go1)Arrays.fill(a, INF);
			for(int j=START;j<=FINISH;j++)go1[0][j]=0;
			int[][] go2 = new int[ID][FINISH+1];
			for(int[]a:go2)Arrays.fill(a, INF);
			for(int j=START;j<=FINISH;j++)go2[1][j]=0;
			for(E r:e){
				if(r.arrive>FINISH)break;
				go1[r.t][r.arrive] = Math.min(go1[r.t][r.arrive], go1[r.s][r.leave]+r.cost);
				go2[r.t][r.arrive] = Math.min(go2[r.t][r.arrive], go2[r.s][r.leave]+r.cost);
				for(int j=r.arrive;j<=FINISH;j++){
					go1[r.t][j] = Math.min(go1[r.t][j], go1[r.t][r.arrive]);
					go2[r.t][j] = Math.min(go2[r.t][j], go2[r.t][r.arrive]);
				}
			}
			int min = INF;
			for(E r:e){
				if(FINISH<r.arrive||FINISH<r.arrive+30)continue;
				int res = go1[r.t][r.arrive] + go2[r.t][r.arrive];
				if(INF<res)continue;
//				System.out.println("RES:"+res+" "+go1[r.t][r.arrive]+" "+go2[r.t][r.arrive]);
				res += dijkstra(r.t, r.arrive+30, 0) + dijkstra(r.t, r.arrive+30, 1);
				min = Math.min(min, res);
			}
			System.out.println(min==INF?0:min);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}