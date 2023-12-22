import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

//Long Distance Taxi
public class Main{

	class R{
		int id;
		Set<E> adj;
		public R(int id) {
			this.id = id;
			adj = new HashSet<E>();
		}
	}
	class E{
		int t, d;
		public E(int t, int d) {
			this.t = t;
			this.d = d;
		}
	}

	R[] town;
	int ID, INF = 1<<29;
	long M = 10000, MM = 100000000;
	Map<String, R> ref;
	R get(String s){
		if(ref.containsKey(s))return ref.get(s);
		R r = new R(ID);
		ref.put(s, r);
		return town[ID++] = r;
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt(), cap = sc.nextInt();
			if((n|m|cap)==0)break;
			ref = new HashMap<String, R>();
			ID = 0;
			town = new R[2*n];
			R src = get(sc.next()), dest = get(sc.next());
			while(n--!=0){
				R s = get(sc.next()), t = get(sc.next());
				int d = sc.nextInt();
				s.adj.add(new E(t.id, d));
				t.adj.add(new E(s.id, d));
			}
			boolean[] gas = new boolean[ID];
			while(m--!=0){
				R r = get(sc.next());
				gas[r.id] = true;
			}
			int[] min = new int[ID];
			int[] rec = new int[ID];
			int[] best = new int[ID];
			Arrays.fill(min, INF);
			Arrays.fill(rec, INF);
			Arrays.fill(best, INF);
			best[src.id] = 0;
			min[src.id] = 0;
			rec[src.id] = 0;
			PriorityQueue<Long> q = new PriorityQueue<Long>(ID, new Comparator<Long>() {
				public int compare(Long o1, Long o2) {
					return (int) Math.signum((o1%M)-(o2%M));
				}
			});
			q.add(src.id*MM);
			int res = INF;
			while(!q.isEmpty()){
				long a = q.poll();
				int v = (int) (a/MM), c = (int) ((a%MM)/M), time = (int) (a%M);
				if(v==dest.id){
					res = Math.min(res, time);
				}
				for(E e:town[v].adj){
					int w = time + e.d;
					if(10*cap<c+e.d||min[e.t]<c+e.d)continue;
					if(gas[e.t]){
						if(0<min[e.t]){
							rec[e.t] = w;
							min[e.t] = 0;
							best[e.t] = Math.min(best[e.t], w);
							q.add(e.t*MM+w);
						}
						else if(0==min[e.t]&&w<rec[e.t]){
							rec[e.t] = w;
							best[e.t] = Math.min(best[e.t], w);
							q.add(e.t*MM+w);
						}
						else if(w<best[e.t]){
							best[e.t] = Math.min(best[e.t], w);
							q.add(e.t*MM+w);
						}
					}
					else{
						if(c+e.d<min[e.t]){
							rec[e.t] = w;
							best[e.t] = Math.min(best[e.t], w);
							min[e.t] = c+e.d;
							q.add(e.t*MM+(c+e.d)*M+w);
						}
						else if(c+e.d==min[e.t]&&w<rec[e.t]){
							best[e.t] = Math.min(best[e.t], w);
							rec[e.t] = w;
							q.add(e.t*MM+(c+e.d)*M+w);
						}
						else if(w<best[e.t]){
							best[e.t] = w;
							q.add(e.t*MM+(c+e.d)*M+w);
						}
					}
				}
			}
			System.out.println(res==INF?-1:res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}