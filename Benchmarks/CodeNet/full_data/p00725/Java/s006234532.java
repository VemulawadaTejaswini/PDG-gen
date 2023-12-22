import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w, h;
		int x, y;
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)
				break;
			Game game = new Game(w, h);
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++)
					game.map[i][j] = sc.nextInt();
			}
			game.move();
			System.out.println(game.answer <= 10 ? game.answer : -1);
		}
	}

}
class Game{
	int answer = 11;
	int w, h;
	int[][] map;
	int[][][][] mapCopy;
	int[] dx = new int[]{1, 0, -1, 0};
	int[] dy = new int[]{0, 1, 0, -1};
	Game(int iw, int ih){
		w = iw;
		h = ih;
		map = new int[h][w];
		mapCopy = new int[h][w][h][w];
	}
	void reset(int x, int y){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				map[i][j] = mapCopy[x][y][i][j];
			}
		}
	}
	void copy(int x, int y){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				mapCopy[x][y][i][j] = map[i][j];
			}
		}
	}
	void move(){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(map[i][j] == 2)
					move(i, j, 0);
			}
		}
	}
	void move(int x, int y, int k){
		copy(x, y);
		for(int i = 0; i < 4; i++){
			if(x+dx[i] < 0 || x+dx[i] >= h || y+dy[i] < 0 || y+dy[i] >= w)
				continue;
			if(map[x+dx[i]][y+dy[i]] != 1){
				switch(i){
				case 0:
					reset(x, y);
					moveDown(x, y, k);
					break;
				case 1:
					reset(x, y);
					moveRight(x, y, k);
					break;
				case 2:
				reset(x, y);
					moveUp(x, y, k);
					break;
				case 3:
					reset(x, y);
					moveLeft(x, y, k);
					break;
				}
			}
		}
	}
	void moveDown(int x, int y, int k){
		while(true){
			x += dx[0];
			y += dy[0];
			if(map[x][y] == 3){
				if(++k < answer)
					answer = k;
				break;
			}
			if(x == h-1)
				break;
			if(map[x+dx[0]][y+dy[0]] == 1){
				map[x+dx[0]][y+dy[0]] = 0;
				move(x, y, ++k);
				break;
			}
		}
	}
	void moveRight(int x, int y, int k){
		while(true){
			x += dx[1];
			y += dy[1];
			if(map[x][y] == 3){
				if(++k < answer)
					answer = k;
				break;
			}
			if(y == w-1)
				break;
			if(map[x+dx[1]][y+dy[1]] == 1){
				map[x+dx[1]][y+dy[1]] = 0;
				move(x, y, ++k);
				break;
			}
		}
	}
	void moveUp(int x, int y, int k){
		while(true){
			x += dx[2];
			y += dy[2];
			if(map[x][y] == 3){
				if(++k < answer)
					answer = k;
				break;
			}
			if(x == 0)
				break;
			if(map[x+dx[2]][y+dy[2]] == 1){
				map[x+dx[2]][y+dy[2]] = 0;
				move(x, y, ++k);
				break;
			}
		}
	}
	void moveLeft(int x, int y, int k){
		while(true){
			x += dx[3];
			y += dy[3];
			if(map[x][y] == 3){
				if(++k < answer)
					answer = k;
				break;
			}
			if(y == 0)
				break;
			if(map[x+dx[3]][y+dy[3]] == 1){
				map[x+dx[3]][y+dy[3]] = 0;
				move(x, y, ++k);
			    break;
			}
		}
	}
}