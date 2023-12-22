
import java.util.*;
public class Main {
	//1240 start
	//1300 cording end
	//1303 sample matched MLE
	//1309 modified change  boolean []  to StringBuilder MLE
	//1316 modi close MLE
	//1322 modi add sort process
	int INF = 1 << 24;
	
	class C implements Comparable<C>{
		int now1, now2, cost;
		StringBuilder used;

		public C(int now1, int now2, int cost, StringBuilder used) {
			this.now1 = now1;
			this.now2 = now2;
			this.cost = cost;
			this.used = used;
		}

		@Override
		public int compareTo(C o) {
			if(this.cost < o.cost) return -1;
			if(this.cost > o.cost) return 1;
			return 0;
		}
	}
	
	//S is initial of sort !!!
	class S implements Comparable<S>{
		int start, end, cost;

		public S(int start, int end, int cost) {
			this.start = start;
			this.end = end;
			this.cost = cost;
		}

		@Override
		public int compareTo(S o) {
			if(this.end < o.end) return -1;
			if(this.end > o.end) return 1;
			return 0;
		}
		
	}

	
	private void doit(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			S [] data = new S[n];
			for(int i = 0; i < n; i++){
				data[i] = new S(sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(data);
			int [] start = new int[n];
			int [] end = new int[n];
			int [] cost = new int[n];
			for(int i = 0; i < n; i++){
				start[i] = data[i].start;
				end[i] = data[i].end;
				cost[i] = data[i].cost;
			}
			
			PriorityQueue<C> open = new PriorityQueue<Main.C>();
			StringBuilder startused = new StringBuilder();
			for(int i = 0; i < n; i++){
				startused.append("0");
			}
			
			open.add(new C(0, 0, 0,startused));
			int [][] close = new int[366][366];
			int ans = -1;
			int len = 366;
			while(! open.isEmpty()){
				C now = open.poll();
				ans = Math.max(ans, now.cost);
				for(int i = 0; i < n; i++){
					if(now.used.charAt(i) == '1') continue;
					
					if(now.now1 < start[i]){
						int nextnow = end[i];
						int nextcost = now.cost + cost[i];
						if(close[nextnow][now.now2] >= nextcost){
							continue;
						}
						
						StringBuilder next = new StringBuilder(now.used.toString());
						next.setCharAt(i, '1');
						open.add(new C(nextnow, now.now2, nextcost, next));
						//close[nextnow][now.now2] = nextcost;
						for(int j = nextnow ; j < len; j++){
							for(int k = 0 ; k < len; k++){
								close[j][k] = Math.max(close[j][k], nextcost);
							}
						}
					}
					else if(now.now2 < start[i]){
						int nextnow = end[i];
						int nextcost = now.cost + cost[i];
						if(close[now.now1][nextnow] >= nextcost){
							continue;
						}
						StringBuilder next = new StringBuilder(now.used.toString());
						next.setCharAt(i, '1');
						open.add(new C(now.now1, nextnow, nextcost, next));
						//close[now.now1][nextnow] = nextcost;
						for(int j = 0 ; j < len; j++){
							for(int k = nextcost ; k < len; k++){
								close[j][k] = Math.max(close[j][k], nextcost);
							}
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}