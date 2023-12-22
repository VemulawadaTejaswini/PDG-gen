import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0207();
	}
	
	class AOJ0207{
		int w,h;
		int sx,sy,gx,gy;
		int[][] map;
		
		void makeBoead(int bx,int by,int muki,int color){
			if(muki==0){//横
				for(int i=0;i<2;i++)for(int s=0;s<4;s++)map[by+i][bx+s]=color;
			}else if(muki==1){
				for(int i=0;i<4;i++)for(int s=0;s<2;s++)map[by+i][bx+s]=color;
			}
		}
		
		void print(){
			for(int i=1;i<=h;i++){
				for(int s=0;s<w;s++)System.out.print(map[i][s]);
				System.out.println();
			}
		}
		
		public AOJ0207() {
			while(true){
				w = in.nextInt();
				h = in.nextInt();
				if(w==0&&h==0)break;
				map = new int[h+1][w+1];
				sx = in.nextInt(); sy = in.nextInt();
				gx = in.nextInt(); gy = in.nextInt();
				int n = in.nextInt();
				for(int i=0;i<n;i++){
					int color = in.nextInt();
					int muki = in.nextInt();
					int bx = in.nextInt();
					int by = in.nextInt();
					makeBoead(bx, by, muki, color);
				}
//				print();
				LinkedList<Integer> list = new LinkedList<Integer>();
				list.add(sx);list.add(sy);
				boolean sw = false;//flg
				int[] gox = {1,0,-1,0};
				int[] goy = {0,1,0,-1};
				int target_c = map[sy][sx];
				while(list.size()>0){
					int x = list.remove();
					int y = list.remove();
					if(x==gx&&y==gy){
						sw=true;
						break;
					}
					for(int i=0;i<4;i++){
						int nx = x+gox[i];
						int ny = y+goy[i];
						if(nx<0||nx>w||ny<0||ny>h)continue;
						if(map[ny][nx]!=target_c)continue;
						map[ny][nx] = -1;
						list.add(nx);list.add(ny);
					}
				}
				System.out.println(sw? "OK":"NG");
			}
		}
	}
}