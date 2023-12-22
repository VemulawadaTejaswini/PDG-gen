import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			int w = in.nextInt();
			int h = in.nextInt();
			if(w+h==0)break;
			new AOJ1150().doIt(w, h);
		}
	}
	class AOJ1150{
		void doIt(int w,int h){
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)map[i][s] = in.next().charAt(0);

//			for(int i=0;i<h;i++){
//				for(int s=0;s<w;s++)System.out.print(map[i][s]+" ");
//				System.out.println();
//			}

			LinkedList<State> q = new LinkedList<State>();
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(map[i][s]=='S'){
				q.add(new State(s, i, 0, 0));
				q.add(new State(s, i, 0, 1));
			}

			int[][][] maps = new int[h][w][2];
			for(int i=0;i<h;i++)for(int s=0;s<w;s++){
				maps[i][s][0] = Integer.MAX_VALUE/2;
				maps[i][s][1] = Integer.MAX_VALUE/2;
			}
			int result = -1;
			while(q.size()>0){
				State now = q.remove();
				int x = now.x,y = now.y;
				if(map[y][x]=='T'){
					result = now.step;
				}else if(map[y][x]=='X'){
					continue;
				}else if(map[y][x]=='S'){
					now.step += 0;
				}else{
					now.step += Integer.parseInt(""+map[y][x]);
				}
				if(maps[y][x][now.foot]<=now.step)continue;
				maps[y][x][now.foot] = now.step;
				if(now.foot==0){//次に動かすのは右
					for(int px=1;px<=3;px++)for(int py=-2;py<=2;py++){
						int nx = px+x, ny = py+y;
						if(nx<0||nx>=w||ny<0||ny>=h)continue;
						if(Math.abs(nx-x)+Math.abs(ny-y)>3)continue;	
						q.add(new State(nx, ny, now.step, 1));
					}
				}else if(now.foot==1){//次に動かすのは左
					for(int px=-3;px<0;px++)for(int py=-2;py<=2;py++){
						int nx = px+x, ny = py+y;
						if(nx<0||nx>=w||ny<0||ny>=h)continue;
						if(Math.abs(nx-x)+Math.abs(ny-y)>3)continue;						
						q.add(new State(nx, ny, now.step, 0));
					}
				}
			}
			
//			System.out.println("right");
//			for(int i=0;i<h;i++){
//				for(int s=0;s<w;s++)System.out.printf("%10d ",maps[i][s][0]);
//				System.out.println();
//			}
//			System.out.println("\n left");
//			for(int i=0;i<h;i++){
//				for(int s=0;s<w;s++)System.out.printf("%10d ",maps[i][s][1]);
//				System.out.println();
//			}
			
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(map[i][s]=='T'){
				result = Math.min(result, Math.min(maps[i][s][0], maps[i][s][1]));
			}
			System.out.println(result);
		}
		class State{
			int x,y,step,foot;//1なら右、0で左
			public State(int x,int y,int step,int foot) {
				this.x = x;this.y = y;this.step = step;this.foot = foot;
			}
		}
	}
}