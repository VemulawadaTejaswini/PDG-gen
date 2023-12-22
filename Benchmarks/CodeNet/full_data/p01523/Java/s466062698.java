import java.util.*;

public class Main{
	class C implements Comparable<C>{
		int s, e;

		public C(int s, int e) {
			this.s = s;
			this.e = e;
		}

		@Override
		public int compareTo(C o) {
			return this.s - o.s;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			C [] data = new C[m];
			for(int i = 0; i < m; i++){
				data[i] = new C(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(data);
			int [] dp = new int[n + 1];
			int INF = 1 << 24;
			Arrays.fill(dp, INF);
			dp[0] = 0;
			
			for(int i = 0; i < m; i++){
				int s = data[i].s;
				int e = data[i].e;
				if(dp[s-1] == INF) continue;
				for(int j = s; j <= e; j++){
					dp[j] = Math.min(dp[j], dp[s-1] + 1);
				}
			}
			System.out.println(dp[n] == INF ? "Impossible" : dp[n]);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}