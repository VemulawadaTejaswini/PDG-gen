import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		new Curling_2_0().Main();
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
	
	class Curling_2_0{
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, -1, 0, 1};
		int h, w;
		void Main(){
			while(true) {
				w = sc.nextInt();
				h = sc.nextInt();
				if(w == 0 && h == 0) return;
				int field[][] = new int[h][w];
				int x = 0, y = 0;
				for(int i = 0; i < h; i++) {
					for(int j = 0; j < w; j++) {
						field[i][j] = sc.nextInt();
						if(field[i][j] == 2) {
							x = j; y = i;
						}
					}
				}
				int ans = search(x, y, field, 0, Integer.MAX_VALUE);
				if(ans > 10) ans = -1;
				System.out.println(ans);
			}
		}
		int search(int x, int y, int[][] f, int cnt, int min) {
			cnt++;
			if(cnt > 10) return 11;
			for(int i = 0; i < 4; i++) {
				int _x = x, _y = y;
				while(_x + dx[i] >= 0 && _x + dx[i] < w &&
						_y + dy[i] >= 0 && _y + dy[i] < h) {
					if(f[y + dy[i]][x + dx[i]] == 1) break;
					_x += dx[i];
					_y += dy[i];
					//System.out.println(i);
					if(f[_y][_x] == 3) {
						f[_y][_x] = 9;
						min = Math.min(min, cnt);
						//System.out.println(cnt);
						/*for(int k = 0; k < h; k++) {
							System.out.println(Arrays.toString(f[k]));
						}
						System.out.println();*/
						f[_y][_x] = 3;
						break;
					}
					if(f[_y][_x] == 1) {
						f[_y][_x] = 0;
						/*for(int k = 0; k < h; k++) {
							System.out.println(Arrays.toString(f[k]));
						}
						System.out.println();
						*/
						min = Math.min(min, search(_x - dx[i], _y - dy[i], f, cnt, min));
						f[_y][_x] = 1;
						break;
					}
				}
				//System.out.println((_x  - dx[i])+ " " + (_y - dy[i]));
			}
			
			//System.out.println();
			return min;
		}
	}
}

