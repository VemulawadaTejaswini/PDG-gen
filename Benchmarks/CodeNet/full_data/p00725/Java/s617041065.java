import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0)break;
			else calc(w, h);
			
		}
	}
	public void calc(int w, int h){
		int[][] map = new int[h][w];
		int[] goal = new int[2];
		int ans = -1;
		
		ArrayList<int[][]> mapList = new ArrayList<int[][]>();
		ArrayList<int[]> placeList = new ArrayList<int[]>();
		ArrayList<Integer> turnList = new ArrayList<Integer>();
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				int k = sc.nextInt();
				map[i][j] = k;
				if(k == 2) {
					placeList.add(new int[]{i, j});
				}
				else if(k == 3) {
					goal[0] = i; 
					goal[1] = j;
				}
			}
		}
		mapList.add(map);
		turnList.add(0);
		
		int[] x = { 0, 1, 0, -1};
		int[] y = { 1, 0, -1, 0};
				
		while(placeList.size() != 0){
			int[] nowPlace = placeList.get(0);
			int[][] nowMap = mapList.get(0);
			int nowTurn = turnList.get(0);
			placeList.remove(0);
			mapList.remove(0);
			turnList.remove(0);
			
			if(nowTurn == 10) continue;
			
			for(int i = 0; i < 4; i++){
				int[][] nextMap = new int[h][w];
				for(int a = 0; a < h; a++){
					for(int b = 0; b < w; b++){
						nextMap[a][b] = nowMap[a][b];
					}
				}
				
				int nx = x[i];
				int ny = y[i];
				
				int[] next = move(nextMap, nowPlace, nx, ny, h, w);
				if(next[0] == -1 && next[1] == -1) continue;
				else if(next[0] == goal[0] && next[1] == goal[1]) {
					if(ans == -1 || nowTurn + 1 < ans) 
						ans = nowTurn + 1;
				}
				else {
					placeList.add(next);
					mapList.add(nextMap);
					turnList.add(nowTurn + 1);
				}
			}
		}
		System.out.println(ans);
	}
	
	public int[] move(int[][] map, int[] now, int x, int y, int h, int w){
		int[] ans = new int[2];
		ans[0] = now[0];
		ans[1] = now[1];
		while(true){
			int nY = ans[0] + y;
			int nX = ans[1] + x;
			
			if(nY < 0 || nY >= h || nX < 0 || nX >= w){
				ans[0] = -1; ans[1] = -1;
				break;
			}
			else if(map[nY][nX] == 1){
				if(now[0] == ans[0] && now[1] == ans[1]){
					ans[0] = -1; ans[1] = -1;
				}
				else{
					map[nY][nX] = 0;
				}
				break;
			}
			else if(map[nY][nX] == 3){
				ans[0] = nY; ans[1] = nX;
				break;
			}
			else {
				ans[0] = nY; ans[1] = nX;
			}
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		new Main().run();
	}
}