import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj1160().doIt();
	}
	class aoj1160{
		boolean map[][];
		int x[] = {-1,1,0,0,-1,1,-1,1};
		int y[] = {0,0,-1,1,-1,1,1,-1};
		int H,W;
		void dfs(int h,int w){
			map[h][w] = false;
			for(int i = 0;i < 8;i++){
				if(h + y[i] < H && w + x[i] < W && h + y[i] >= 0 && w + x[i] >= 0){
					if(map[h + y[i]][w + x[i]] == true){
						dfs(h + y[i],w + x[i]);
					}
				}
			}
		}
		void doIt() {
			while (true) {
				int cnt = 0;
				W = sc.nextInt();
				H = sc.nextInt();
				if(W+H == 0)break;
				map = new boolean[H][W];
				for (int h = 0; h < H; h++) {
					for (int w = 0; w < W; w++) {
						int n = sc.nextInt();
						if (n == 1) map[h][w] = true;
						else map[h][w] = false;
					}
				}
				for (int h = 0; h < H; h++) {
					for (int w = 0; w < W; w++) {
						if (map[h][w]) {
							cnt++;
							dfs(h, w);
						}
					}
				}
				System.out.println(cnt);
			}
		}
	}
}