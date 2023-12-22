
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)break;
			else calc();
			
		}
	}
	public void calc(){
		map = new int[h][w];
		goal = new int[2];
		start = new int[2];
		ans = 11;
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				int k = sc.nextInt();
				map[i][j] = k;
				if(k == 2) {
					start[0] = i; 
					start[1] = j;
				}
				else if(k == 3) {
					goal[0] = i; 
					goal[1] = j;
				}
			}
		}
		
		iter(start[0], start[1], 1);
		if(ans == 11) System.out.println(-1);
		else System.out.println(ans);
	}
	
	int[][] map;
	int[] goal;
	int[] start;
	int ans;
	int w;
	int h;
	
	public void iter(int nh, int nw, int count){
		if(count > 10) return;
		else if(ans < count) return;
		else{
			int[] x = { 0, 1, 0, -1};
			int[] y = { 1, 0, -1, 0};
			
			for(int i = 0; i < 4; i++){
				int xx = x[i];
				int yy = y[i];
				
				int nx = nh;
				int ny = nw;
				
				int sh = -1;
				int sw = -1;
				
				int t = 0;
				while(true){
					int nextX = nx + xx;
					int nextY = ny + yy;
					
					if(nextX < 0 || nextX >= h || nextY < 0 || nextY >= w){
						t = -1;
						break;
					}
					if(map[nextX][nextY] == 1){
						sh = nextX;
						sw = nextY;
						map[sh][sw] = 0;
						break;
					}
					else if(map[nextX][nextY] == 3){
						nx = nextX;
						ny = nextY;
						break;
					}
					else{
						nx = nextX;
						ny = nextY;
					}
				}
				
				if(map[nx][ny] == 3){
					if(count < ans)	ans = count;
				}
				else if(t == 0 && !(nx == nh && ny == nw)){
					iter(nx, ny, count+ 1);
				}
				
				if(sh != -1){
					map[sh][sw] = 1;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new Main().run();
	}
}