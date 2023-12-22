import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int h, w;
	int[][] map;
	int kaki = 1;
	int ringo = 2;
	int mikan = 3;
	int[] x = {-1, 0, 1, 0};
	int[] y = {0, 1, 0, -1};
	public void run(){
		while(true){
		h = sc.nextInt();
		w = sc.nextInt();
		if(h == 0 && w == 0) break;
		map = new int[h][w];
		for(int i = 0; i < h; i++){
			String line = sc.next();
			for(int j = 0; j < w; j++){
				char s = line.charAt(j);
				if(s == '@') map[i][j] = ringo;
				else if(s == '#') map[i][j] = kaki;
				else map[i][j] = mikan;
			}
		}
		solve();
		}
	}
	public void solve(){
		int ans = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(map[i][j] != 0){
					ans++;
					dfs(i, j);
				}
			}
		}
		System.out.println(ans);
	}
	
	public void dfs(int i, int j){
		int t = map[i][j];
		map[i][j] = 0;
		for(int k = 0; k < 4; k++){
			int ni = i+x[k];
			int nj = j+y[k];
			
			if(ni >= 0 && ni < h && nj >= 0 && nj < w){
				if(map[ni][nj] == t){
					dfs(ni, nj);
				}
			}
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }	
}