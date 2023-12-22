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
					game.firstMap[i][j] = sc.nextInt();
			}
			game.move();
			System.out.println(game.answer <= 10 ? game.answer : -1);
		}
	}

}
class Game{
	int answer = 11;
	int w, h;
	int[][] firstMap;
	int[] dx = new int[]{1, 0, -1, 0};
	int[] dy = new int[]{0, 1, 0, -1};
	Game(int iw, int ih){
		w = iw;
		h = ih;
		firstMap = new int[h][w];
	}
	void move(){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(firstMap[i][j] == 2)
					move(firstMap, i, j, 0);
			}
		}
	}
	void move(int[][] imap, int x, int y, int k){
		int[][] map = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				map[i][j] = imap[i][j];
			}
		}
		for(int i = 0; i < 4; i++){
			if(x+dx[i] < 0 || x+dx[i] >= h || y+dy[i] < 0 || y+dy[i] >= w)
				continue;
			if(map[x+dx[i]][y+dy[i]] != 1){
				switch(i){
				case 0:
					moveDown(map, x, y, k);
					break;
				case 1:
					moveRight(map, x, y, k);
					break;
				case 2:
					moveUp(map, x, y, k);
					break;
				case 3:
					moveLeft(map, x, y, k);
					break;
				}
			}
		}
	}
	void moveDown(int[][] map, int x, int y, int k){
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
				move(map, x, y, ++k);
				break;
			}
		}
	}
	void moveRight(int[][] map, int x, int y, int k){
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
				move(map, x, y, ++k);
				break;
			}
		}
	}
	void moveUp(int[][] map, int x, int y, int k){
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
				move(map, x, y, ++k);
				break;
			}
		}
	}
	void moveLeft(int[][] map, int x, int y, int k){
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
				move(map, x, y, ++k);
			    break;
			}
		}
	}
}