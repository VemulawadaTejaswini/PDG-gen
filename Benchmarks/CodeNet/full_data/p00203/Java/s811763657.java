import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0203();
	}
	
	
	class AOJ0203{
		int x,y;
		int[][] map;
		
		int bfs(int sx,int sy,int before_x){
//			System.out.println(sx+" "+sy+ " "+before_x);
			int result = 0;
			if(sy==y)return 1;
			if(map[sy][sx]==1)return 0;
			if(map[sy][sx]==2){
				if(before_x!=sx)return 0;
				int nx = sx,ny = sy+2;
				if(nx<0||nx>=x||ny<0||ny>y)return 0;
				return bfs(nx,ny,sx);
			}else if(map[sy][sx]==0){
				for(int i=-1;i<=1;i++){
					int nx = sx+i;
					int ny = sy+1;
//					System.out.println(nx+" "+ny);
					if(nx<0||nx>=x||ny<0||ny>y)continue;
					if(sy!=y-1)result += bfs(nx,ny,sx);
					else if(sy==y-1)return bfs(nx,ny,sx);
				}
			}
			return result;
		}
		
		
		public AOJ0203() {
			while(true){
				x = in.nextInt();
				y = in.nextInt();
				map = new int[y+1][x];
				for(int i=0;i<y;i++)for(int s=0;s<x;s++)map[i][s] = in.nextInt();
				int result = 0;
				for(int i=0;i<x;i++)result += bfs(i,0,-1);
				System.out.println(result);
			}
		}
	}
}