import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		int d = in.nextInt();
		new AOJ0141().doIt();
		for(int i=1;i<d;i++){
			System.out.println();
			new AOJ0141().doIt();
		}
	}
	
	class AOJ0141{
		boolean[][] hyou;
		int[] sx = {0,1,0,-1};
		int[] sy = {-1,0,1,0};
		int x,y,n;
		int dir;
		void doIt(){
			n = in.nextInt();
			hyou = new boolean[n][n];
			x = 0;y = n-1;
			hyou[y][x] = true;
			dir = 3;//direction
			while(true){
				int nx = x+sx[dir];
				int ny = y+sy[dir];
				if(nx<0||nx>=n||ny<0||ny>=n||isEnd(nx,ny)){
					dir = (dir+1)%4;
					x = x+sx[dir];
					y = y+sy[dir];
					if(x<0||x>=n||y<0||y>=n||isEnd(x,y))break;
					hyou[y][x] = true;
					continue;
				}
				x = nx;
				y = ny;
				hyou[y][x] = true;
			}
			for(int i=0;i<n;i++){
				for(int s=0;s<n;s++)System.out.print(hyou[i][s]? "#":" ");
				System.out.println();
			}
		}
		
		boolean isEnd(int x,int y){
//			System.out.println(x+" "+y);
			int cnt = 0;
			for(int i=0;i<4;i++){
				int nx = x+sx[i];
				int ny = y+sy[i];
				if(nx<0||nx>=n||ny<0||ny>=n)continue;
				if(hyou[ny][nx])cnt++;
			}
			return cnt>1;
		}
		
	}
}