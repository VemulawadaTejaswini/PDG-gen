import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			sc.nextLine();
			if(w == 0 && h == 0) break;
			else calc(w,h);
		}
	}

	public void calc(int w, int h){
		int[][] tile = new int[w][h];
		int nowX = 0;
		int nowY = 0;
		for(int j = 0; j < h; j++){
			String line = sc.nextLine();
			for(int i = 0; i < w; i++){
				char c = line.charAt(i);
				if(c == '.') tile[i][j] = 1;
				else if(c == '@'){
					tile[i][j] = 1;
					nowX = i;
					nowY = j;
				}
			}
		}
		System.out.println(calc2(tile, tile, nowX, nowY));
	}
	public int calc2(int[][] tile, int[][] tile2, int X, int Y){
		tile2[X][Y] = 0;
 		int ue = 0;
		if(Y > 0 && tile[X][Y-1] == 1 && tile2[X][Y-1] != 0) 
			ue = calc2(tile, tile2, X, Y-1);
		int shita = 0;
		if(Y < tile[X].length - 1 && tile[X][Y+1] == 1 && tile2[X][Y+1] != 0) 
			shita = calc2(tile, tile2, X, Y+1);
		int hidari = 0;
		if(X > 0 && tile[X-1][Y] == 1 && tile2[X-1][Y] != 0)
			hidari = calc2(tile, tile2, X-1, Y);
		int migi = 0;
		if(X < tile.length - 1 && tile[X+1][Y] == 1 && tile2[X+1][Y] != 0)
			migi = calc2(tile, tile2, X+1, Y);
		
		return ue + shita + migi + hidari + 1;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}