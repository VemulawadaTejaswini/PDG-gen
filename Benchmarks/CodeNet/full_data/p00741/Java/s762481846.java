import java.util.*;
public class Main{
	static final int[][] dxy = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

	static void Islands(int h, int w, int i, int j, int[][] c){
		c[i][j] = 0;
		for(int k=0; k<8; k++){
			int ii = i + dxy[k][0];
			int jj = j + dxy[k][1];
			if(0<=ii&&0<=jj&&ii<h&&jj<w&&c[ii][jj]==1)Islands(h, w, ii, jj, c);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		while(w!=0){
			int[][] c = new int[h][w];
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					c[i][j] = sc.nextInt();
				}
			}
			int cnt = 0;
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(c[i][j]==1){
						Islands(h, w, i, j, c);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			w = sc.nextInt();
			h = sc.nextInt();
		}
	}
}
