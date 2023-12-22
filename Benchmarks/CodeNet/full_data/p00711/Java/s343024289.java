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
			String s;
			int x=0,y=0;
			for(int i=0; i<w; i++) {
				s = in.next();
				for (int j=0; j<h; j++) {

					if(s.charAt(j)=='#') {
						tile[i][j]=0;
					}else if(s.charAt(j)=='.') {
						tile[i][j]=1;
					}else {
						tile[i][j]=0;
						x = i;
						y = j;
					}

				}
			}
			System.out.println(canMove(x,y));

		}

	}

	static int canMove (int a, int b) {

		int m = 0;
		tile[a][b] = 0;

		if(a>0)if(tile[a-1][b]==1)m+=canMove(a-1,b);
		if(a<w-1)if(tile[a+1][b]==1)m+=canMove(a+1,b);
		if(b>0)if(tile[a][b-1]==1)m+=canMove(a,b-1);
		if(b<h-1)if(tile[a][b+1]==1)m+=canMove(a,b+1);

		return m++;

	}
}

