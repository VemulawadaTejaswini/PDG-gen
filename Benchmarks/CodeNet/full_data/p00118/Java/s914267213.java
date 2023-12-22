import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0118().doIt();
	}
	
	class AOJ0118{
		int w,h;
		char[][] map;
		boolean sw[][];
		int sx[] = {1,0,-1,0};
		int sy[] = {0,1,0,-1};
		
		void print(){
			for(int i=0;i<h;i++){
				for(int s=0;s<w;s++)System.out.print(sw[i][s]? "1":"0");
				System.out.println();
			}
			System.out.println();
		}
		
		void dfs(int x,int y,char f){
			for(int i=0;i<4;i++){
				int nx = x+sx[i];
				int ny = y+sy[i];
				if(nx<0||nx>=w||ny<0||ny>=h)continue;
				if(map[ny][nx]!=f||sw[ny][nx])continue;
				sw[ny][nx] = true;
				dfs(nx,ny,f);
			}
		}
		
		int solve(){
			int result = 0;
			sw = new boolean[h][w];
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(!sw[i][s]){
//				System.out.println(s+" "+i);
				result++;
				sw[i][s] = true;
				dfs(s,i,map[i][s]);
//				print();
			}
			return result;
		}
		
		void doIt(){
			while(true){
				h = in.nextInt();
				w = in.nextInt();
				if(h==0&&w==0)break;
				map = new char[h][w];
				for(int i=0;i<h;i++)map[i] = in.next().toCharArray();
				System.out.println(solve());
			}
		}
	}
	
}