import java.util.*;

public class Main {
	int [] vx = {-1,0,1,0};
	int [] vy = {0,1,0,-1};
	int INF = 1 << 24;
	
	class C{
		int x,y,s;

		public C(int x, int y, int s) {
			super();
			this.x = x;
			this.y = y;
			this.s = s;
		}
		
	}
	
	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			int ww = w + w - 1;
			int hh = h + h - 1;
			//System.out.println(ww + " " + hh);
			sc.nextLine();
			int [][]  data = new int[hh][ww];
			for(int i = 0; i < hh; i++){
				String line = sc.nextLine();
				//System.out.println(line);
				String newline;
				if(i % 2 == 0){
					newline = line.replaceAll(" ", "0");
				}
				else{
					newline = line.replaceAll(" ", "1");
				}
				for(int j = 0; j < newline.length(); j++){
					int num = newline.charAt(j) - '0';
					data[i][j] = num;
				}
			}
			
//			//debug
//			for(int i =0; i < hh; i++){
//				for(int j = 0; j < ww; j++){
//					System.out.print(data[i][j]);
//				}
//				System.out.println();
//			}
			LinkedList<C> open = new LinkedList<Main.C>();
			open.add(new C(0,0,1));
			int [][] close = new int[hh][ww];
			for(int i=0; i < hh; i++){
				Arrays.fill(close[i], INF);
			}
			close[0][0] = 0;
			int ans = INF;
			while(! open.isEmpty()){
				C now = open.removeFirst();
				boolean flg = false;
				for(int i=0; i < 4; i++){
					int xx = now.x + vx[i] * 2;
					int yy = now.y + vy[i] * 2;
					if(! isOK(xx,yy, ww,hh)){
						continue;
					}
					int xxx = now.x + vx[i];
					int yyy = now.y + vy[i];
					if(data[yyy][xxx] == 1) continue;
					if(close[yy][xx] <= now.s + 1) continue;
					if(xx == ww -1 && yy == hh -1){
						ans = now.s+1;
						flg = true;
						break;
					}
					open.add(new C(xx,yy,now.s+1));
					close[yy][xx] = now.s + 1;
				}
				if(flg ) break;
			}
			System.out.println(ans == INF ? 0 : ans);
		}
		
	}
	private boolean isOK(int xx, int yy,int w, int h) {
		if(0 <= xx && xx < w && 0<= yy && yy < h){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}