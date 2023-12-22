import java.util.*;
import java.awt.Point;

public class Main{
	static int ans, w, h;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,1,-1};
	static int[][] map;

	//S[©, ÇÉ½Á½ç»Ì|CgðÔ·
	//ÇÉ ½Á½êÅà, }bvÌÇðhèÂÔ³·ÉÔ·
	//OÉoÄsÁ½çnullðÔ·
	static Point nextPosition(Point p,int d){
		Point res = new Point(p.x, p.y); //ßèl
		while(true){
			Point pp = new Point(res.x + dx[d], res.y + dy[d]);
			if(pp.x < 0 || pp.x >= w || pp.y < 0 || pp.y >= h) return null;
			if(map[pp.y][pp.x] == 1) return res;
			else if(map[pp.y][pp.x] == 3) return pp;
			res = pp;
		}
	}

	static void solve(Point p,int cost){
		if(cost >= 10) return;
		for(int i=0;i<4;i++){
			Point pp = new Point(p.x + dx[i], p.y + dy[i]); //×Ì}X
			if(pp.x < 0 || pp.x >= w || pp.y < 0 || pp.y >= h || map[pp.y][pp.x] == 1) continue;
			Point np = nextPosition(p,i);
			if(np == null) continue;
			else if(map[np.y][np.x] == 3){
				ans = Math.min(ans,cost+1);
				return;
			}
			else{
				map[np.y + dy[i]][np.x + dx[i]] = 0;
				solve(np,cost+1);
				map[np.y + dy[i]][np.x + dx[i]] = 1;
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;

			map = new int[h][w];
			Point sp = null;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
					if(map[i][j] == 2){
						sp = new Point(j,i);
					}
				}
			}

			ans = 11;
			solve(sp,0);
			System.out.println(ans==11 ? -1 : ans);
		}
	}
}