

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_length = 0;
		// マップの高さ
		int height = 0;
		// マップの幅
		int width = 0;
		// 各完成マップを入れる配列
		ArrayList<map> map_list = new ArrayList<map>();
		// 入力の回数
		while (sc.hasNext()) {
			input_length = sc.nextInt();
			break;
		}

		// 入力回数分ゲームをする
		for (int i = 0; i < input_length; i++) {

			// マップの高さ
			height = sc.nextInt();
			// マップの幅
			width = sc.nextInt();

			// マップのインスタンスを作る
			map map = new map();
			// 戦車のインスタンスを作る
			tank tank = new tank();
			map.setMap(height, width);

			// マップ作成
			for (int h = 0; h < height; h++) {
				// マップ一列
				String line = sc.next();
				// 一文字ずつに分解
				char[] line_char = line.toCharArray();
				//
				for (int w = 0; w < width; w++) {
					// マップを作る
					map.createMap(h, w, String.valueOf(line_char[w]));
				}
			}

			int command_number = 0;
			String command_attack = "";
			// コマンド入力回数
			while (sc.hasNext()) {
				command_number = sc.nextInt();
			}

			// コマンド回数分まわす
			for (int c = 0; i < command_number; c++) {
				while (sc.hasNext()) {
					command_attack = sc.next();
				}
				
				//砲弾発射だったら
				if(command_attack.equals("S")){
					//マップを砲弾発射用に変更
					map.shuttGun(tank.getNow_height(), tank.getNow_width(), tank.getSituation());
				}else{
					//移動の場合
					map.move_tank(tank.getNow_height(), tank.getNow_width(), tank.getSituation());
				}

			}
			// リストにできたマップを格納
			map_list.add(map);
		}
		// 結果を出力
		for (map obj : map_list) {
			obj.out_map();
			// 改行
			System.out.print("\n");
		}
	}

}

class tank {

	// 戦車の位置
	// 現在の高さ
	private int now_height = 0;
	// 現在の幅
	private int now_width = 0;

	// 戦車をあらわす記号
	public static final String[] tank_element = { "<", ">", "^", "v" };

	// 戦車の向き
	private String situation = null;

	// 現在位置と向きを探す 全体のマップの高さ
	public void searchTank(int height, int width, String[][] map) {
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {

				// 戦車がどこかにいるはず
				for (String val : tank_element) {
					if (map[h][w] == val) {
						// 戦車の位置情報と向きを入力
						now_height = h;
						now_width = w;
						situation = val;
					}
				}
			}
		}

	}

	public void setSituation(String s) {
		situation = s;
	}

	// ゲッター

	public String getSituation() {
		return situation;
	}
	public int getNow_height() {
		return now_height;
	}
	public int getNow_width() {
		return now_width;
	}

}

class map {

	// 現在のマップ
	private String[][] map = null;
	// マップの高さ
	private int height = 0;
	// マップの幅さ
	private int width = 0;

	// セッター
	public void setMap(int h, int w) {
		map = new String[h][w];
		height = h;
		width = w;
	}

	// マップを作る
	public void createMap(int height_i, int width_i, String m) {
		map[height_i][width_i] = m;
	}

	// // 砲弾によるマップ変更 現在位置 向き
	public void shuttGun(int now_h, int now_w, String s) {
		// 左向き
		if (s.equals("<")) {
			//
			for (int i = 0; i < now_w; i++) {
				// レンガ壁だったら平地に
				if (map[now_h][now_w - i].equals("*")) {
					map[now_h][now_w - i] = ".";
					break;
				}
				// 鉄壁だったら変更なし
				if (map[now_h][now_w - i].equals("#")) {
					break;
				}
			}
		}
		// 右向き
		if (s.equals(">")) {
			for (int i = 0; i < (width - 1 - now_w); i++) {
				// レンガ壁だったら平地に
				if (map[now_h][now_w + i].equals("*")) {
					map[now_h][now_w + i] = ".";
					break;
				}
				// 鉄壁だったら変更なし
				if (map[now_h][now_w + i].equals("#")) {
					break;
				}
			}

		}
		// 上向き
		if (s.equals("^")) {
			for (int i = 0; i < (height - 1 - now_h); i++) {
				// レンガ壁だったら平地に
				if (map[now_h + i][now_w].equals("*")) {
					map[now_h + i][now_w] = ".";
					break;
				}
				// 鉄壁だったら変更なし
				if (map[now_h + i][now_w].equals("#")) {
					break;
				}
			}

		}
		// 下向き
		if (s.equals("v")) {
			for (int i = 0; i < now_h; i++) {
				// レンガ壁だったら平地に
				if (map[now_h - i][now_w].equals("*")) {
					map[now_h - i][now_w] = ".";
					break;
				}
				// 鉄壁だったら変更なし
				if (map[now_h - i][now_w].equals("#")) {
					break;
				}
			}
		}

	}

	// 戦車の移動によるマップ変更 現在位置 向き
	public void move_tank(int now_h, int now_w, String s) {
		// 左向き
		if (s.equals("<")) {
			// 左のマスが平地だったら左に進む
			if (map[now_h][now_w - 1].equals(".")) {
				// 戦車を進める
				map[now_h][now_w - 1] = "<";
				// 元いた位置は平地
				map[now_h][now_w] = ".";
			}
		}
		// 右向き
		if (s.equals(">")) {
			// 左のマスが平地だったら左に進む
			if (map[now_h][now_w + 1].equals(".")) {
				// 戦車を進める
				map[now_h][now_w + 1] = ">";
				// 元いた位置は平地
				map[now_h][now_w] = ".";
			}
		}
		// 下向き
		if (s.equals("v")) {
			// 左のマスが平地だったら左に進む
			if (map[now_h - 1][now_w].equals(".")) {
				// 戦車を進める
				map[now_h - 1][now_w + 1] = "v";
				// 元いた位置は平地
				map[now_h][now_w] = ".";
			}
		}
		// 上向き
		if (s.equals("^")) {
			// 左のマスが平地だったら左に進む
			if (map[now_h + 1][now_w].equals(".")) {
				// 戦車を進める
				map[now_h + 1][now_w] = "^";
				// 元いた位置は平地
				map[now_h][now_w] = ".";
			}
		}

	}

	// マップを出力
	public void out_map() {
		for (int h = 0; h < map.length; h++) {
			for (int w = 0; w < map[0].length; w++) {
				System.out.print(map[h][w]);
			}
			System.out.print("\n");
		}
	}

	// ゲッター
	public String[][] getMap() {
		return map;
	}

}