import java.util.*;
public class Main { 
	static int[][] map;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int H = stdIn.nextInt();
			if(H == 0) break;
			map = new int[H][5];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < 5; j++) {
					map[i][j] = stdIn.nextInt();
				}
			}
			int ans = 0;
			while(true) {
				int x = check();
				if(x == 0) break;
				ans += x;
				remove();
				drop();
			}
			System.out.println(ans);
		}
	}
	
	public static int check() {
		int ans = 0;
		for(int i = 0; i < map.length; i++) {
			int l = 0;
			int c = 0;
			for(int j = 0; j < 5; j++) {
				if(l == map[i][j]) {
					c++;
					
				}
				else if(c >= 3){
					ans += c * l;
					c = 1;
				}
				else {
					c = 1;
				}
				
				l = map[i][j];
				
				if(j == 4 && c >= 3) {
					ans += c * l;
				}
			}
		}
		return ans;
	}
	public static void remove() {
		for(int i = 0; i < map.length; i++) {
			int l = 0;
			int c = 0;
			int s = 0;
			for(int j = 0; j < 5; j++) {
				if(l == map[i][j]) {
					c++;
				}
				else if(c >= 3){
					for(int k = s; k < c+s; k++) {
						map[i][k] = 0;
					}
					c = 1;
					s = j;
				}
				else {
					c = 1;
					s = j;
				}
				
				l = map[i][j];
				if(j == 4 && c >= 3) {
					for(int k = s; k < c+s; k++) {
						map[i][k] = 0;
					}
				}
				
				
			}
		}
	}
	public static void drop() {
		for(int i = map.length; i >= 0; i--) {
			for(int j = 0; j < 5; j++) {
				int count = i;
				while(true) {
					if(count < 2) break;
					if(map[i-1][j] == 0) {
						map[i-1][j] = map[count-2][j];
						map[count-2][j] = 0;
						count--;
					}
					else {
						break;
					}
				}
			}
		}
	}
}