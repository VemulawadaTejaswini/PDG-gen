import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Map map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// データセット数の入力
		int dataSetsCount = Integer.parseInt(sc.nextLine());
		for (int count = 0; count < dataSetsCount; count++) {

			// マップの縦幅と横幅の入力
			String[] input = sc.nextLine().split("[\\s]+");
			map = new Map(Integer.parseInt(input[0]), Integer.parseInt(input[1]));

			// マップ情報の入力
			input = new String[map.height];
			for (int i = 0; i < map.height; i++) {
				input[i] = sc.nextLine();
			}
			map.InputMapDate(input);

			// 戦車の行動の入力・マップの更新
			int actionCount = Integer.parseInt(sc.nextLine());
			String[] actionLine = sc.nextLine().split("");
			for (int i = 0; i < actionCount; i++) {
				map.tank.ExecuteAction(ActionType.valueOf(actionLine[i]));
			}

			// 表示
			Print();
			// データセットの間に改行をいれる
			if (count < dataSetsCount - 1) {
				System.out.println();
			}
		}
	}

	// マップ内容の表示
	static void Print() {
		for (int y = 0; y < map.height; y++) {
			String str = "";
			for (int x = 0; x < map.width; x++) {
				// 戦車がいる場所か
				if (map.tank.Y == y && map.tank.X == x) {
					// 戦車の文字を取り出す
					str += map.tank.State.str;
				} else {
					// タイルの文字を取り出す
					Tile t = map.getTile(x, y);
					str += t.Type.str;
				}
			}
			// 出力
			System.out.println(str);
		}
	}

	// タイルの種類
	enum TileType {
		Field("."), Brick("*"), Iron("#"), Water("-");

		String str;

		TileType(String str) {
			this.str = str;
		}
	}

	// タイル
	static class Tile {
		// タイルタイプ・座標
		TileType Type;
		int X;
		int Y;

		Tile(int x, int y, TileType type) {
			this.X = x;
			this.Y = y;
			this.Type = type;
		}
	}

	// 戦車の向き
	enum TankState {
		Up("^", 0, -1), Down("v", 0, 1), Right(">", 1, 0), Left("<", -1, 0);

		// 戦車の向き・向きを表す座標
		String str;
		int X;
		int Y;

		TankState(String str, int x, int y) {
			this.str = str;
			this.X = x;
			this.Y = y;
		}
	}

	// 戦車の行動
	enum ActionType {
		U("Up"), D("Down"), L("Left"), R("Right"), S;

		// 行動後の戦車の状態
		TankState ts;

		ActionType() {
		}

		ActionType(String str) {
			this.ts = TankState.valueOf(str);
		}
	}

	// 戦車
	static class Tank {
		// 戦車の向き・戦車の座標
		TankState State;
		int X;
		int Y;

		Tank(int x, int y, TankState state) {
			this.X = x;
			this.Y = y;
			this.State = state;
		}

		// 行動の実行
		void ExecuteAction(ActionType action) {
			// Sなら砲撃、S以外は移動
			if (action == ActionType.S) {
				this.Shoot();
			} else {
				Move(action.ts);
			}
		}

		// 移動
		void Move(TankState ts) {
			// 戦車の向きを変更
			this.State = ts;
			// 戦車の向きから移動先が移動可能であるか
			if (map.MobilityCheck(this.X + ts.X, this.Y + ts.Y)) {
				this.X += ts.X;
				this.Y += ts.Y;
			}
		}

		// 砲撃
		void Shoot() {
			int x = this.X + this.State.X;
			int y = this.Y + this.State.Y;
			while (map.BombardmentProceedsCheck(x, y)) {
				x += this.State.X;
				y += this.State.Y;
			}
			map.BreakBrickTile(x, y);
		}
	}

	// マップ
	static class Map {
		// タイルリスト
		ArrayList<Tile> tileList = new ArrayList<Tile>();
		// 縦幅・横幅
		int height;
		int width;
		// 戦車
		Tank tank;

		Map(int height, int width) {
			this.height = height;
			this.width = width;
		}

		// リストからタイルを取り出す
		Tile getTile(int x, int y) {
			for (Tile t : tileList) {
				if (t.X == x && t.Y == y) {
					return t;
				}
			}
			return null;
		}

		// マップデータの入力を反映する
		void InputMapDate(String[] str) {
			for (int y = 0; y < height; y++) {
				// 入力を1文字単位に分割
				String[] line = str[y].split("");
				for (int x = 0; x < width; x++) {
					// タイルタイプへ変換
					TileType tt = TileDiscrimination(line[x]);
					if (tt != null) {
						// タイルをリストに追加
						tileList.add(new Tile(x, y, tt));
					} else {
						// タイルでないなら戦車へ変換
						TankState ts = TankDiscrimination(line[x]);
						if (ts != null) {
							this.tank = new Tank(x, y, ts);
							tileList.add(new Tile(x, y, TileType.Field));
						}
					}
				}
			}
		}

		// 1文字からタイルタイプへ
		TileType TileDiscrimination(String str) {
			for (TileType tt : TileType.values()) {
				if (tt.str.equals(str)) {
					return tt;
				}
			}
			return null;
		}

		// 1文字から戦車へ
		TankState TankDiscrimination(String str) {
			for (TankState ts : TankState.values()) {
				if (ts.str.equals(str)) {
					return ts;
				}
			}
			return null;
		}

		// 移動可能な場所であるか判定
		boolean MobilityCheck(int x, int y) {
			Tile t = getTile(x, y);
			if (t != null && t.Type == TileType.Field) {
				return true;
			} else {
				return false;
			}
		}

		// 砲弾が進むか判定
		boolean BombardmentProceedsCheck(int x, int y) {
			Tile tile = this.getTile(x, y);
			if (tile != null && (tile.Type == TileType.Field || tile.Type == TileType.Water)) {
				return true;
			} else {
				return false;
			}
		}

		// レンガの壁を壊す
		void BreakBrickTile(int x, int y) {
			int i = 0;
			for (Tile t : tileList) {
				if (t.Type == TileType.Brick && t.X == x && t.Y == y) {
					tileList.set(i, new Tile(x, y, TileType.Field));
				}
				i++;
			}
		}
	}
}

