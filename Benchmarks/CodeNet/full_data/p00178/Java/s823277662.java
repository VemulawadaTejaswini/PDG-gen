import java.util.*;
class Main {
	static boolean[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			map = new boolean[5011][5];
			for(int i = 0; i < n; i++) {
				int d = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				
				if(d == 1) {
					for(int j = 0; j < p; j++) {
						map[5010][j + q -1] = true;
					}
				}
				else {
					for(int j = 0; j < p; j++) {
						map[5010 - j][q-1] = true;
					}
				}
				while(a() || erase());

				//show();
			}
			int count = 0;
			
			for(int i = 0; i < 5011; i++) {
				for(int j = 0; j < 5; j++) {
					if(map[i][j]) count++;
				}
			}
			System.out.println(count);
		}
	}
	
	static boolean a() {
		boolean ret = false;
		for(int i = 5010; i >= 1; i--) {
			for(int j = 0; j < 5; j++) {
				if(!map[i-1][j] && map[i][j]) {
					ret = true;
					map[i][j] = false;
					map[i-1][j] = true;
				}
			}
		}
		return ret;
		
	}
	static boolean erase() {
		boolean ret = false;
		for(int i = 0; i < 5011; i++) {
			for(int j = 0; j < 5; j++) {
				if(!map[i][j]) break;
				if(j == 4) {
					ret = true;
					for(int k = 0; k < 5; k++) {
						map[i][k] = false;
					}
				}
			}
		}
		return ret;
	}
	
	static void show() {
		for(int i = 5; i >= 0; i--) {
			for(int j = 0; j < 5; j++) {
				System.out.print(" " + map[i][j]);
			}
			System.out.println();
		}
	}
}