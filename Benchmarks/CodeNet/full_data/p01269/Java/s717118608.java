import java.util.*;

public class Main {
	final int INF = 1 << 24;
	private void doit(){
		Scanner sc = new Scanner (System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			if(n == 0 && m == 0 && l == 0) break;
			int [][] pass = new int[n][n];
			int [][] money = new int[n][n];
			for(int i=0; i < n; i++){
				Arrays.fill(pass[i], INF);
				Arrays.fill(money[i], INF);
			}
			for(int i = 0;i < m; i++){
				int from = sc.nextInt() - 1;
				int to = sc.nextInt() -1 ;
				int dis = sc.nextInt();
				int num = sc.nextInt();
				pass[from][to] = num;
				pass[to][from] = num;
				money[from][to] = dis;
				money[to][from] = dis;
			}
			PriorityQueue<C> open = new PriorityQueue<C>();
			open.add(new C(0,l,0));
			int [][] close = new int[n][l+1];
			for(int i=0; i < n; i++){
				for(int j = 0; j < l + 1; j++){
					close[i][j] = INF;
				}
			}
			Arrays.fill(close[0],INF);
			int ans = INF;
			while(! open.isEmpty()){
				C now = open.poll();
				int from = now.now;
				//goal
				if(from == n-1){
					ans = Math.min(ans, now.num);
					continue;
				}
				for(int i= 0; i < n; i++){
					if(pass[from][i] == INF){
						continue;
					}
					//use
					int nextnum = now.num + pass[from][i];
					if(now.money >= money[from][i]){
						int nextmoney = now.money - money[from][i];
						if(close[i][nextmoney] <= now.num) continue;
						open.add(new C(i, nextmoney, now.num));
						close[i][nextmoney] = now.num;
					}
					//not use
					if(close[i][now.money] <= nextnum) continue;
					open.add(new C(i, now.money, nextnum));
					close[i][now.money] = nextnum; 
				}
			}
			//System.out.print("ANS= ");
			System.out.println(ans);
		}
	}
	
	private class C implements Comparable<C>{
		int now,money,num;
		
		public C(int now, int money, int num) {
			this.now = now;
			this.money = money;
			this.num = num;
		}

		public int compareTo(C o) {
			if(num < o.num) return -1;
			if(num > o.num) return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}