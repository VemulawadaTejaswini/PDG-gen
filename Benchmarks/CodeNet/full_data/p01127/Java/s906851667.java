import java.util.*;
public class Main {
	static int h;
	static int w;
	static char[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int z = 0; z < n; z++) {
			h = sc.nextInt();
			w = sc.nextInt();
			map = new char[h][w];
			for(int i = 0; i < h; i++) {
				map[i] = sc.next().toCharArray();
			}
			IN:while(!clear()) {
				for(int i = 0; i < h; i++) {
					for(int j = 0; j < w; j++) {
						if(map[i][j] != '.') {
							if(isRect(i,j)) {
								remove(i,j);
								continue IN;
							}
						}
					}
				}
				break;
			}
			
			System.out.println((clear())?"SAFE":"SUSPICIOUS");
			
		}
	}
	public static void remove(int a, int b) {
		char t = map[a][b];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(map[i][j] == t) {
					map[i][j] = '0';
				}
			}
		}
	}
	
	public static boolean isRect(int a, int b) {
		char c = map[a][b];
		char[][] map = new char[h][w];
		
		for(int k = a; k < h; k++) {
			IN:for(int l = b; l < w; l++) {
				for(int i = 0; i < h; i++) {
					map[i] = Arrays.copyOf(Main.map[i],w);
				}
				for(int i = a; i <= k; i++) {
					for(int j = b; j <= l; j++) {
						if(c == '0' && map[i][j] != c) {
							c = map[i][j];
						}
						if(map[i][j] == c) {
							map[i][j] = '0';
						}
						if(map[i][j] != c && map[i][j] != '0') continue IN;
					}
				}
				for(int i = 0; i < h; i++) {
					for(int j = 0; j < w; j++) {
						if(map[i][j] == c) continue IN;
					}
				}
				Main.map[a][b] = c;
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean clear() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(map[i][j] != '.' && map[i][j] != '0') return false;
			}
		}
		return true;
	}
}