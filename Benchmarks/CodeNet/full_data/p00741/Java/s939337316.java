import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			else calc(w, h);
		}
	}
	public void calc(int w, int h){
		int[][] c = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				c[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(c[i][j] == 1){
					calc2(c, i, j);
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
	public void calc2(int[][] c, int x, int y){
		c[x][y] = 0;
		if(x > 0){
			if(c[x-1][y] == 1) calc2(c, x-1, y);
			if(y > 0 && c[x-1][y-1] == 1) calc2(c, x-1, y-1);
			if(y < c[x].length -1 && c[x-1][y+1] == 1) calc2(c, x-1, y+1);
		}
		if(x < c.length -1){
			if(c[x+1][y] == 1) calc2(c, x+1, y);
			if(y > 0 && c[x+1][y-1] == 1) calc2(c, x+1, y-1);
			if(y < c[x].length -1 && c[x+1][y+1] == 1) calc2(c, x+1, y+1);
		}
		if(y > 0 && c[x][y-1] == 1) calc2(c, x, y-1);
		if(y < c[x].length -1 && c[x][y+1] == 1) calc2(c, x, y+1);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}