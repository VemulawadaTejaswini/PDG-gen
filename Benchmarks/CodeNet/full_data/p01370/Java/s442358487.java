import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		AOJ2253 obj = new AOJ2253();
		while(true){
			int t = in.nextInt(),n = in.nextInt();
			if(n+t==0)break;
			obj.doIt(t,n);
		}
	}
	class AOJ2253{
		void doIt(int t,int n){
			int[][] map = new int[61][61];
			for(int i=0;i<61;i++)Arrays.fill(map[i],-1);
			boolean syougai[][] = new boolean[61][61];
			for(int i=0;i<n;i++){
				int gx = in.nextInt()+30;
				int gy = in.nextInt()+30;
				syougai[gy][gx] = true;
			}
			int sx = in.nextInt()+30,sy = in.nextInt()+30;
			LinkedList<State> q = new LinkedList<State>();
			int ax[] = {1,0,1,-1,0,-1};
			int ay[] = {0,1,1,0,-1,-1};
			q.add(new State(sx, sy, 0));
			while(q.size()>0){
				State now = q.remove();
				if(map[now.y][now.x]>0)continue;
				map[now.y][now.x] = now.step;
				if(now.step == t)continue;
				for(int i=0;i<6;i++){
					int nx = ax[i]+now.x;
					int ny = ay[i]+now.y;
					if(nx<0||nx>=61||ny<0||ny>=61)continue;
					if(syougai[ny][nx])continue;
					q.add(new State(nx, ny, now.step+1));
				}
			}
			int cnt = 0;
			for(int i=0;i<61;i++)for(int s=0;s<61;s++)if(map[i][s]>=0)cnt++;
			System.out.println(cnt);
		}
		class State{
			int x,y,step;
			public State(int x,int y,int step) {
				this.x = x;
				this.y = y;
				this.step = step;
			}
		}
	}
}