import java.util.Scanner;

public class Main {
	
	
	static int dx[]= {-1,0,1,0};
	static int dy[]= {0,-1,0,1};
	static final int NG=100;
	

	public static int dfs(int a, int b,int w,int h, int[][] map,int total) {
		if(total>9) {
			return NG;
		}else if(map[a][b]==3){
			return total;
		}
		int ret=NG;
		total++;
		
		for(int d=0;d<4;d++) {
			int[][] newMap=new int[h][w];
			for (int y=0;y<h;y++) {
				for (int x=0;x<w;x++) {
					newMap[y][x]=map[y][x];
				}
			}
			int y=a;
			int x=b;
			if(y+dy[d] < 0  || x+dx[d] < 0 || y+dy[d] >= h || x+dx[d] >= w) {
				continue;
			}
			if(newMap[y+dy[d]][x+dx[d]]==1){
				continue;
			}
			while(0 <= y+dy[d] && 0 <= x+dx[d] && y+dy[d] < h && x+dx[d] < w ) {
				/*if(newMap[y+dy[d]][x+dx[d]]==1) {
					break;
				}*/
				y = y+dy[d];
				x = x+dx[d];
				if(newMap[y][x] == 1) {
					newMap[y][x] = 0;
					y = y-dy[d];
					x = x-dx[d];
					int val=dfs(y,x,w,h,newMap,total);
					if(val<ret) {
						ret = val;
					}
					break;
				}else if(newMap[y][x]==3){

					return total;
				}
			}
		}
		return ret;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int w;
		int h;
		
		while(true) {
			w = in.nextInt();
			h = in.nextInt();
			if(w==0||h==0) {
				break;
			}
			int map[][] = new int[h][w];
			
			
			for(int i=0; i<h; i++) {
				for(int k=0; k<w; k++) {
					map[i][k] = in.nextInt();
				}
			}
			int total=0;
			for(int i=0; i<h;i++){
                for(int k=0; k<w;k++){
                	if(map[i][k]==2){
                		total = dfs(i,k,w,h,map,0);
                		break;
                	}
                }
			}
			if(total==NG) {
				System.out.println(-1);
			}else {
				System.out.println(total);
			}
		}
		in.close();
	}
}