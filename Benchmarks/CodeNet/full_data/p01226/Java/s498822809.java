package BattleTown;

public class BattleTown {
	
	public static void main(String args[]){
		
	}

}

class tank {

	// 戦車の位置
	private String[][] position = null;
	// 戦車の向き
	private String situation = null;

	// セッター
	public void setPosition(String[][] p) {
		position = p;
	}

	public void setSituation(String s) {
		situation = s;
	}

	// ゲッター
	public String[][] getPosition() {
		return position;
	}

	public String getSituation() {
		return situation;
	}

	// 上向きに移動
	public void up() {
		position = position;
	}

}

class map {

	// 現在のマップ
	String[][] map = null;

	// マップを作る
	public void createMap(int height_i, int width_i, String m) {
		map[height_i][width_i] = m;
	}

	// 砲弾によるマップ変更 現在位置 向き
	public void shuttGun(String[][] p,String s){
		//左向き
		if(s.equals("<")){
			//
			for(int i =0; i < p[0].length;i++){
				if(map[p.][p.-1].equals("*") || map[p.][p.-1].equals("#")){
					break;
				}
			}
		}
		//右向き
		if(s.equals(">")){
			
		}
		//上向き
		if(s.equals("^")){
			
		}
		//下向き
		if(s.equals("v")){
			
		}
		
	}

	// 戦車の移動によるマップ変更 現在位置 向き
	public void move_tank(String[][] p, String s) {
		
	}

	// セッター
	public void setMap(int height, int width) {
		map = new String[height][width];
	}

	// ゲッター
	public String[][] getMap() {
		return map;
	}

}