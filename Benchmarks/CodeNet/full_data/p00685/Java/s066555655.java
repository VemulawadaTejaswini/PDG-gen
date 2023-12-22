import java.util.*;
public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){		
		new AOJ1103();
	}
	
	class AOJ1103{
		Relative relative[];
		public AOJ1103() {
			while(true){
				relative = new Relative[4];
				boolean sw=false;
				for(int i=0;i<4;i++){
					int a = in.nextInt();
					if(a>=4){
						sw=true;break;
					}
					int b = in.nextInt();
					relative[i]=new Relative(a,b);
				}
				if(sw)break;
				int[][] map = new int[4][4];for(int i=0;i<4;i++)Arrays.fill(map[i],-1);
				System.out.println(bfs(map,0)/40300);
			}
		}
		
		
		void test(int[][] map){
			int[][] map2 = map.clone();
			map2[0][0]=1;
		}
		void print(int[][] map){
			for(int i=0;i<4;i++){
				for(int s=0;s<4;s++)System.out.print(map[i][s]+" ");
				System.out.println();
			}
		}
		
		int bfs(int[][] map,int num){
//			System.out.println(num);
//			print(map);
			int result=0;
			boolean sw=true;
			for(int i=0;i<4;i++)for(int s=0;s<4;s++)if(map[i][s]==-1)sw=false;
			if(sw)return 1;
			for(int x=0;x<4;x++)for(int y=0;y<4;y++)if(map[y][x]==-1){
				for(int s=0;s<4;s++){
					int nx=x+relative[s].x;
					int ny=y+relative[s].y;
					if(nx<0||nx>=4||ny<0||ny>=4)continue;
					if(map[ny][nx]!=-1)continue;
					map[y][x]=num;map[ny][nx]=num;
					result+=bfs(map,num+1);
					map[y][x]=-1;map[ny][nx]=-1;
				}
			}
			return result;
		}
		
		class Relative{
			int x,y;
			public Relative(int x,int y) {
				this.x = x;
				this.y = y;
			}
		}
	}
	
}