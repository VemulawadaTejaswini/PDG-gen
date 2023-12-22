import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int w,h;
	static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[][] island;
	
	public static void main(String[] args) {
		while(read()){
			System.out.println(slove());
		}

	}
	static boolean read(){
		w = sc.nextInt();//wÌÇÝæè
		h = sc.nextInt();//hÌÇÝæè
		if(w == 0 && h == 0)
			return false;//wÆhª0ÈçfalseBÂÜèAI¹B
		
		island = new int[h+1][w+1];//Ìì¬
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				island[i][j] = sc.nextInt();//ÌÇÝÝ
			}
		}
		return true;
	}
	
	static boolean inField(int x, int y){
		return (x >= 1 && x <= w && y >= 1 && y <= h);
	}
	
	static void dfs(int x, int y){
		island[y][x] = 0;
		for(int k = 0; k < 8; k++){
			int nx = x + dx[k];
			int ny = y + dy[k];
			if(inField(nx, ny) && island[ny][nx] == 1)
				dfs(nx, ny);
		}
	}
	
	static int slove(){
		int count = 0;
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				if(island[i][j] == 1){
					count++;
					dfs(j, i);
				}
			}
		}
		
		return count;
	}
}