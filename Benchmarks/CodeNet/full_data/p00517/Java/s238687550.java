import java.util.Scanner;
public class Main {
	static int x, y; //x...0 y...1
	static int ans, width, height;
	static int memory[] = new int[2]; //一時的に訪れる都市を格納
	static int diff_x = 0, diff_y = 0;
	
	//斜め上に進む必要性があるか
	static boolean UpTiltDirectionExists(int tox, int toy) {
		return(((x != width && y != height)) && (tox >= (x + 1) && toy >= (y + 1)));
	}
	
	//斜め下に進む必要性があるか
	static boolean DownTiltDirectionExists(int tox, int toy) {
		return(((x != 1 && y != 1)) && (tox <= (x - 1) && toy <= (y - 1)));
	}
	
	static void PlusTiltDirectionMove() {
		x++;
		y++;
		ans++;
	}
	
	static void MinusTiltDirectionMove() {
		x--;
		y--;
		ans++;
	}
	
	static void GoToNorthWest() {
		x--;
		y++;
		ans += 2;
	}
	
	static void GoToSouthEast() {
		x++;
		y--;
		ans += 2;
	}
	
	static void LengthOrBreathMove() {
		 if(x == memory[0]) {
			y = (diff_y > 0) ? (y + 1) : (y - 1);
			ans++;
		} else if(y == memory[1]) {
			x = (diff_x > 0) ? (x + 1) : (x - 1);
			ans++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		width = stdIn.nextInt(); //都市の幅
		height = stdIn.nextInt(); //都市の高さ
		int visit_num = stdIn.nextInt(); //訪れる都市の数
		for(int r = 0; r < visit_num; r++) {
			if(r == 0) {
				x = stdIn.nextInt(); //初期x座標
				y = stdIn.nextInt(); //初期y座標
			} else {
				for(int c = 0; c < 2; c++)
					memory[c] = stdIn.nextInt();
				diff_x = memory[0] - x; //x座標の差を求める
				diff_y = memory[1] - y; //y座標の差を求める
				if(diff_x == 0 && diff_y == 0) continue; //既に到達しているなら処理しなくてよい
				
				while(x != memory[0] || y != memory[1]) {
					diff_x = memory[0] - x; //x座標の差を更新
					diff_y = memory[1] - y; //y座標の差を更新
					if(memory[0] >= x && memory[1] >= y) {
						if(UpTiltDirectionExists(memory[0], memory[1])) {
							PlusTiltDirectionMove(); //右上へ移動
						} else {
							LengthOrBreathMove();
						}
					} else if(memory[0] >= x) {
						LengthOrBreathMove();
						if(x != memory[0] && y != memory[1])
							GoToSouthEast(); //南東へ移動
					} else if(memory[1] >= y) {
						LengthOrBreathMove();
						if(x != memory[0] && y != memory[1])
							GoToNorthWest(); //北西へ移動
					} else if(DownTiltDirectionExists(memory[0], memory[1])) {
						MinusTiltDirectionMove(); //左下へ移動
					}
					
				}
			}
		}
		System.out.println(ans);
	}
}
		