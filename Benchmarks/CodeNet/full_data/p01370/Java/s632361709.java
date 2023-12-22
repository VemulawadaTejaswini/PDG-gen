import java.util.*;

public class Main {
	int [] vx = {0,1,1,0,-1,-1};
	int [] vy = {1,1,0,-1,-1,0};
	
	class C {
		int x,y,s;

		public C(int x, int y,int s) {
			this.x = x;
			this.y = y;
			this.s = s;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int sub = 200;
		while(true){
			int t = sc.nextInt();
			int n = sc.nextInt();
			if( t == 0 && n == 0) break;
			LinkedList<C> open = new LinkedList<Main.C>();
			
			boolean [][] close = new boolean[sub* 2+1][sub * 2+1];
			
			for(int i = 0; i < n; i++){
				int x = sc.nextInt() + sub;
				int y = sc.nextInt() + sub;
				close[y][x] = true;
			}
			int sx = sc.nextInt() + sub;
			int sy = sc.nextInt() + sub;
			close[sy][sx] = true;
			open.add(new C(sx, sy,0));
			int ans = 0;
			while(! open.isEmpty()){
				C now = open.removeFirst();
				//System.out.println(now.x + " " + now.y);
				ans++;
				if(now.s == t){
					continue;
				}
				for(int i = 0; i < 6; i++){
					int xx = now.x + vx[i];
					int yy = now.y + vy[i];
					if(close[yy][xx]) continue;
					
					open.add(new C(xx,yy,now.s+1));
					close[yy][xx] = true;
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