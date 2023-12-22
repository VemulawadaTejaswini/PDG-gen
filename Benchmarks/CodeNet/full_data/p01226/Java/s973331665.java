import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Map map;
	static ArrayList<String> print = new ArrayList<String>();

	enum TileType {
		Field("."), Brick("*"), Iron("#"), Water("-");
		String str;

		TileType(String str) {
			this.str = str;
		}
	}

	enum TankState {
		Up("^", 0, -1), Down("v", 0, 1), Right(">", 1, 0), Left("<", -1, 0);
		String str;
		int x;
		int y;

		TankState(String str, int x, int y) {
			this.str = str;
			this.x = x;
			this.y = y;
		}
	}

	enum ActionType {
		U, D, L, R, S;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dataSetsCount=Integer.parseInt(sc.nextLine());
		for(int count=0;count<dataSetsCount;count++) {

			String[] input = sc.nextLine().split("[\\s]+");
			map = new Map(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
			input = new String[map.height];
			for (int i = 0; i < map.height; i++) {
				input[i] = sc.nextLine();
			}
			map.InputMapDate(input);

			int actionCount = Integer.parseInt(sc.nextLine());
			String[] actionLine = sc.nextLine().split("");
			for (int i = 0; i < actionCount; i++) {
				ExecuteAction(ActionType.valueOf(actionLine[i]));
			}

			map.Print();
			if(count<=dataSetsCount-1)print.add("\n");
		}
		for(String str:print) {
			System.out.print(str);
		}

	}

	static void ExecuteAction(ActionType action) {
		Tank tank = map.tank;
		Tile tile;
		switch (action) {
		case U:
			tile =map.getTile(tank.X, tank.Y - 1);
			if (tile!=null && tile.Type == TileType.Field) {
				tank.Y -= 1;
			}
			tank.State = TankState.Up;
			break;
		case D:
			tile =map.getTile(tank.X, tank.Y + 1);
			if (tile!=null && tile.Type == TileType.Field) {
				tank.Y += 1;
			}
			tank.State = TankState.Down;
			break;
		case L:
			tile =map.getTile(tank.X-1, tank.Y);
			if (tile!=null && tile.Type == TileType.Field) {
				tank.X -= 1;
			}
			tank.State = TankState.Left;
			break;
		case R:
			tile =map.getTile(tank.X+1, tank.Y);
			if (tile!=null && tile.Type == TileType.Field) {
				tank.X += 1;
			}
			tank.State = TankState.Right;
			break;
		case S:
			int x = tank.X ;
			int y = tank.Y ;
			tile = map.getTile(x, y);
			while (tile != null &&( tile.Type == TileType.Field || tile.Type == TileType.Water)) {
				x += tank.State.x;
				y += tank.State.y;
				tile = map.getTile(x, y);
			}
			if (tile != null && tile.Type == TileType.Brick) {
				tile.Type = TileType.Field;
				map.setTile(x, y, tile);

			}

		}
		map.tank = tank;
	}

	static class Map {
		ArrayList<Tile> tileList = new ArrayList<Tile>();

		int[][] coordinate;
		int height;
		int width;
		Tank tank;

		Map(int height, int width) {
			coordinate = new int[height][width];
			this.height = height;
			this.width = width;
		}

		Tile getTile(int x, int y) {
			for (Tile t : tileList) {
				if (t.X == x && t.Y == y) {
					return t;
				}
			}
			return null;
		}

		void setTile(int x, int y, Tile tile) {
			int i = 0;
			for (Tile t : tileList) {

				if (t.X == x && t.Y == y) {
					tileList.set(i, tile);
				}
				i++;
			}
		}

		void InputMapDate(String[] str) {
			for (int y = 0; y < height; y++) {
				String[] line = str[y].split("");
				for (int x = 0; x < width; x++) {

					for (TileType tt : TileType.values()) {
						if (tt.str.equals(line[x])) {
							tileList.add(new Tile(x, y, tt));
						} else {
							for (TankState ts : TankState.values()) {
								if (ts.str.equals(line[x])) {
									this.tank = new Tank(x, y, ts);
									tileList.add(new Tile(x, y, TileType.Field));
								}
							}
						}
					}
				}
			}
		}

		void Print() {
			
			for (int y = 0; y < height; y++) {
				String str="";
				for (int x = 0; x < width; x++) {
					if (tank.Y == y && tank.X == x) {
						str+=tank.State.str;
					} else {
						Tile t = getTile(x, y);
						str+=t.Type.str;
					}
				}
				str+="\n";
				print.add(str);
			}
		}
	}

	static class Tile {
		TileType Type;
		int X;
		int Y;

		Tile(int x, int y, TileType type) {
			this.X = x;
			this.Y = y;
			this.Type = type;
		}
	}

	static class Tank {
		TankState State;
		int X;
		int Y;

		Tank(int x, int y, TankState state) {
			this.X = x;
			this.Y = y;
			this.State = state;
		}
	}

}

