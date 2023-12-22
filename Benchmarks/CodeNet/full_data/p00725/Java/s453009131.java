import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0&&h==0) break;
			int[][] map = new int[h+2][w+2];
			for(int s=0;s<h+2;s++){
				for(int t=0;t<w+2;t++){
					map[s][t] = -1;
				}
			}
			int startx=0;
			int starty=0;
			for(int s=1;s<h+1;s++){
				for(int t=1;t<w+1;t++){
					map[s][t] = sc.nextInt();
					if(map[s][t]==2){
						startx = s;
						starty = t;
					}
				}
			}
			pr.println(curl(1,map,startx,starty,h,w,-1));
		}
		pr.flush();
		sc.close();
	}

	private static int curl(int i, int[][] map, int startx, int starty ,int h, int w,int e) {
		if(i==11) return -1;
		int[] dx = new int[]{-1,0,0,1};
		int[] dy = new int[]{0,-1,1,0};
		int min = 11;
		for(int k=0;k<4;k++){
			//if(k==3-e) continue;
			int[][] maptmp = new int[h+2][w+2];
			for(int s=0;s<h+2;s++){
				for(int t=0;t<w+2;t++){
					maptmp[s][t] = map[s][t];
				}
			}
			int x = startx;
			int y = starty;
			maptmp[x][y]=0;
			if(maptmp[x+dx[k]][y+dy[k]]!=1&& maptmp[x+dx[k]][y+dy[k]]!=-1){
				while(maptmp[x][y]==0){
					x+=dx[k];
					y+=dy[k];
				}
				if(maptmp[x][y]==3){
					return i;
				}
				if(maptmp[x][y]==1){
					maptmp[x][y]=0;
					maptmp[x-dx[k]][y-dy[k]]=2;
					int tmp = curl(i+1,maptmp,x-dx[k],y-dy[k],h,w,k);
					if(tmp<min && tmp>0){
						min = tmp; 
					}
				}
			}
		}
		if(min==11) min = -1;
		return min;
	}
}