import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;

public class Main {
	int H, W;
	char[][] map;
	int res;
	char tmp;
	char ringo = '@', kaki = '#', mikan = '*', non = '.';
	void deback() {
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	void dfs(int y, int x) {
		if(y < 0 || x < 0 || y >= H || x >= W) return;
//		deback();
		if(tmp == map[y][x]) {
			map[y][x] = non;
			dfs(y, x+1);
			dfs(y+1, x);
			dfs(y, x-1);
			dfs(y-1, x);		
		}
	}

	void solve() {
		res = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(map[i][j] == '.') continue;
				tmp = map[i][j];
				dfs(i, j);
				res += 1;
//				deback();
			}
		}
		System.out.println(res);
	}
	void run() {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			H = scan.nextInt();
			W = scan.nextInt();
			if (H==0 && W==0) break;
			map = new char[H][];
			for(int i = 0; i < H; i++) {
				map[i] = scan.next().toCharArray();
			}
//			System.out.println(map[0][9]);
			solve();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}



