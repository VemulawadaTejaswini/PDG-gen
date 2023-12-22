import java.util.*;
import java.awt.geom.*;

public class Main{
	
	class State implements Comparable<State>{
		int pos, step;

		public State(int pos, int step) {
			this.pos = pos;
			this.step = step;
		}

		@Override
		public int compareTo(State o) {
			return this.step - o.step;
		}
		
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(0, 0));
			int [] close = new int[n];
			int INF = 1 << 24;
			Arrays.fill(close, INF);
			close[0] = 0;
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.pos == n-1){
					ans = now.step;
					break;
				}
				for(int i = 1; i <= 6; i++){
					int npos = now.pos + i;
					while(true){
						if(npos < 0){
							npos = 0;
						}
						if(npos >= n){
							npos = n-1;
						}
						if(close[npos] <= now.step + 1)break;
						close[npos] = now.step + 1;
						if(data[npos] == 0){
							open.add(new State(npos, now.step + 1));
							break;
						}
						npos += data[npos];
					}
				}
			}
			System.out.println(ans);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}