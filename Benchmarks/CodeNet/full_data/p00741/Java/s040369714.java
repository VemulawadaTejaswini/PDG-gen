import java.util.Scanner;
public class Main {
	public static final int[] dx = {-1,-1,-1,0,0,1,1,1};
	public static final int[] dy = {-1,0,1,-1,1,-1,0,1};
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int width = sc.nextInt();
			int height = sc.nextInt();
			if (width==0) {
				break;
			}
			int c[][] = new int[width][height];
			for(int i=0;i<width*height;i++) {
				c[i%width][i/width] = sc.nextInt();
			}

			int ans = 0;
			for(int x=0;x<width;x++) {
				for(int y=0;y<height;y++){
					if (c[x][y]==1) {
						c[x][y] = 0;
						dfs(c,x,y,width,height);
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
	public static void dfs(int[][] c,int x,int y,int w,int h) {
		for(int i=0;i<8;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx>=0 && nx<w && ny>=0 && ny<h) {
				if (c[nx][ny]==1) {
					c[nx][ny]=0;
					dfs(c,nx,ny,w,h);
				}
			}
		}
	}
}