import java.util.Scanner;

public class Main {

	static int w,h;
	static int[][] tile;

	public static void main  (String[]args) {
		Scanner in = new Scanner(System.in);

		while(true) {
			w = in.nextInt();
			h = in.nextInt();

			if(w==0 || h==0) break;
			tile = new int[w][h];

			int x=0,y=0;
			for(int i=0; i<w; i++) {
				String s = in.next();
				for (int j=0; j<h; j++) {

					if(s.charAt(j)=='#') {
						tile[i][j]=0;
					}else if(s.charAt(j)=='.') {
						tile[i][j]=1;
					}else {
						x = i;
						y = j;
					}

				}
			}
			System.out.println(canMove(x,y));

		}

	}

	static int canMove (int x, int y) {

		int m = 0;
		tile[x][y] = 0;

		if(x>0 && tile[x-1][y]==1)m+=canMove(x-1,y);
		if(x<w-1 && tile[x+1][y]==1)m+=canMove(x+1,y);
		if(y>0 && tile[x][y-1]==1)m+=canMove(x,y-1);
		if(y<h-1 && tile[x][y+1]==1)m+=canMove(x,y+1);


		return m++;

	}

}

