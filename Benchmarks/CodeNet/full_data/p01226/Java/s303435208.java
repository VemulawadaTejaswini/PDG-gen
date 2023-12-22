import java.util.Scanner;

public class Main {

	// マップ

	// 戦車
	class Tank {

		char[][] map;

		int x, y; 	  // 座標
		char dir; 	  // 向いてる方角

		int bx=-1, by=-1;   // 砲弾の座標

		public Tank(int x, int y,  int dir, char[][] map) {
			this.x = x;
			this.y = y;
			this.map = map;
			if(dir == 0) this.dir = 'L';
			else if(dir == 1) this.dir = 'U';
			else if(dir == 2) this.dir = 'R';
			else if(dir == 3) this.dir = 'D';
		}

		// 命令
		// rの取りうる値: UDLR
		public void order(char r) {

			// 回転し、進めるのであれば進む
			if(r == 'U') {
				dir = 'U';
				map[y][x] = '^';
				if(isMovable(x, y-1)) {
					map[y][x] = '.';
					y -= 1;
					// マップ情報を更新する
					map[y][x] = '^';
				} else {
					// 方向転換だけ行う
					map[y][x] = '<';
				}
			} else if(r == 'D') {
				dir = 'D';
				map[y][x] = 'v';
				if(isMovable(x, y+1)) {
					map[y][x] = '.';
					y += 1;
					//					// マップ情報を更新する
					map[y][x] = 'v';
				}
			} else if(r == 'L') {
				dir = 'L';
				map[y][x] = '<';
				if(isMovable(x-1, y)) {
					map[y][x] = '.';
					x -= 1;
					map[y][x] = '<';
				}
			} else if(r == 'R') {
				dir = 'R';
				map[y][x] = '>';
				if(isMovable(x+1, y)) {
					map[y][x] = '.';
					x += 1;
					map[y][x] = '>';
				}
			} else if(r == 'S') {
				shot(dir);
			}

		}

		// 砲撃
		public void shot(char dir) {

			// 砲弾の位置初期化
			bx = x;
			by = y;

			// 方向を設定し発射
			moveBullet(dir);

		}

		// 砲弾の移動
		public void moveBullet(char dir) {

			// 移動先座標
			int toX = -1;
			int toY = -1;
			if(dir == 'L') {
				toX = bx-1;
				toY = by;
				bx -= 1;
			} else if(dir == 'U') {
				toX = bx;
				toY = by-1;
				by -= 1;
			} else if(dir == 'R') {
				toX = bx+1;
				toY = by;
				bx += 1;
			} else if(dir == 'D') {
				toX = bx;
				toY = by+1;
				by += 1;
			}

			// 指定座標に移動できれば破壊し移動する
			if(map[toY][toX] == '*') {
				// 破壊
				map[toY][toX] = '.';
				return;
			} else if(map[toY][toX] == '#') {
				return;
			} else {
				moveBullet(dir);
			}
		}

		// 指定の座標に戦車が進めるか
		public boolean isMovable(int x, int y) {

			if(map[y][x] == '.') return true;
			else return false;

		}

		// マップを表示
		public void drawMap() {
			for(int i=1; i<map.length-1; i++) {
				for(int j=1; j<map[i].length-1; j++){
					System.out.print(map[i][j]);
				}
				System.out.println("");
			}
		}

	}

	// マップから戦車の位置と向きを取得する
	// @return int[] [0]戦車のx座標, [1]戦車のy座標, [2]戦車の向き(左から時計回りに0~3)
	public int[] getTankDir(char[][] map) {

		int[] ret = new int[3];
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++){
				if(map[i][j] == '<') {
					ret[0] = j;
					ret[1] = i;
					ret[2] = 0;
				} else if(map[i][j] == '^') {
					ret[0] = j;
					ret[1] = i;
					ret[2] = 1;
				} else if(map[i][j] == '>') {
					ret[0] = j;
					ret[1] = i;
					ret[2] = 2;
				} else if(map[i][j] == 'v') {
					ret[0] = j;
					ret[1] = i;
					ret[2] = 3;
				}
			}
		}

		return ret;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// マップセットの個数入力
		int num = sc.nextInt();

		for(int n=0; n<num; n++) {

			// 地図データの入力
			int y = sc.nextInt();
			int x = sc.nextInt();

			char[][] map = new char[y+2][x+2];

			// 外を埋める
			for(int i=0; i<y+2; i++) {
				for(int j=0; j<x+2; j++) {
					if(i == 0 || i == y+1 || j == 0 || j == x+1) map[i][j] = '#';
				}
			}

			for(int i=1; i<y+1; i++) {
				String line = sc.next();
				for(int j=1; j<x+1; j++) {
					map[i][j] = line.toCharArray()[j-1];
				}
			}

			// マップを表示
			//		for(int i=1; i<y+1; i++) {
			//			for(int j=1; j<x+1; j++) {
			//				System.out.print(map[i][j]);
			//			}
			//			System.out.println("");
			//		}

			// 命令を入力
			int orderNum = sc.nextInt();
			String orders = sc.next();
			char[] orderArr = orders.toCharArray();

			Main b = new Main();

			// 戦車の初期位置と向きを取得
			int[] tankPos = b.getTankDir(map);

//			for(int i=0; i<3; i++) {
//				System.out.println(tankPos[i]);
//			}

			// 戦車を生成
			Tank t = new Main().new Tank(tankPos[0], tankPos[1], tankPos[2], map);

			// 命令を実行
			for(int i=0; i<orderNum; i++) {
				t.order(orderArr[i]);
			}


			// debug
			// 戦車の移動テスト
			//		t.rotate('L');

			// マップを再表示
			System.out.println("");
			t.drawMap();

		}

		sc.close();


	}

}

