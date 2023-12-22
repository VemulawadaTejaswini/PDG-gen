import java.util.*;
import java.io.*;

public class Main{


	int h,w;
	void solve(){

		Scanner cin = new Scanner(System.in);
		while(true)
		{
			w = cin.nextInt();
			h = cin.nextInt();
			if(w==0) break;
			String[] board = new String[h];
			for(int i=0;i<h;i++) board[i] = cin.next();
			boolean[][] white = new boolean[h][w];
			boolean[][] black = new boolean[h][w];

			int[] vx = new int[]{0,1,0,-1};
			int[] vy = new int[]{1,0,-1,0};

			for(int turn = 0; turn< h*w ;turn++){
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						int y = i; int x = j;
						if(board[i].charAt(j)!='.') continue;
						for(int k=0;k<4;k++){
							int ny = y + vy[k];
							int nx = x + vx[k];
							if(!ok(ny,nx)) continue;
							if(board[ny].charAt(nx)=='B') black[y][x] = true;
							if(board[ny].charAt(nx)=='W') white[y][x] = true;
							if(black[ny][nx]) black[y][x] = true;
							if(white[ny][nx]) white[y][x] = true;
						}
					}
				}
			}

			int bnum = 0;
			int wnum = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(board[i].charAt(j)!='.') continue;
					if(white[i][j] && !black[i][j]) wnum++;
					if(!white[i][j] && black[i][j]) bnum++;
				}
			}
			System.out.println(bnum + " " + wnum);
		}
	}

	boolean ok(int y, int x){
		return y>=0 && x>=0 && y<h && x<w;
	}


	public static void main(String[] args){
		new Main().solve();
	}
}