import java.util.*;

public class Main {
	static int[][] paper = new int[14][14];
	static int count , max;

	static void draw ( int x , int y , int paturn ) {
		x += 2;
		y += 2;
		if ( paturn >= 1 ) {
			paper[x][y]++;
			paper[x+1][y]++;
			paper[x][y+1]++;
			paper[x-1][y]++;
			paper[x][y-1]++;
		} if ( paturn >= 2 ) {
			paper[x+1][y+1]++;
			paper[x+1][y-1]++;
			paper[x-1][y+1]++;
			paper[x-1][y-1]++;
		} if ( paturn >= 3 ) {
			paper[x+2][y]++;
			paper[x-2][y]++;
			paper[x][y+2]++;
			paper[x][y-2]++;
		}
		count = 0;
		for ( int i = 2; i < 12; i++ ) {
			for ( int j = 2; j < 12; j++ ) {
				if ( paper[i][j] == 0 ) count++;
				if ( paper[i][j] > max ) max = paper[i][j];
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in).useDelimiter("\\D");
		while ( sc.hasNext() ) {
			try {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int p = sc.nextInt();
				draw(y,x,p);
			} catch ( java.util.InputMismatchException e ) {}
		}
		System.out.println(count+"\n"+max);
	}
}