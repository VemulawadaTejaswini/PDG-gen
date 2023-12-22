import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] p = new int[10][10]; //x,y
		while(stdIn.hasNext()) {
			String tmp = stdIn.nextLine();
			String[] k = tmp.split(",");
			int x = Integer.parseInt(k[0]);
			int y = Integer.parseInt(k[1]);
			int size = Integer.parseInt(k[2]);
			
			if(size >= 1) {
				if(check(x,y)) {
					p[x][y]++;
				}
				if(check(x+1,y)) {
					p[x+1][y]++;
				}
				if(check(x-1,y)) {
					p[x-1][y]++;
				}
				if(check(x,y+1)) {
					p[x][y+1]++;
				}
				if(check(x,y-1)) {
					p[x][y-1]++;
				}
			}
			if(size >= 2) {
				if(check(x+1,y+1)) {
					p[x+1][y+1]++;
				}
				if(check(x-1,y-1)) {
					p[x-1][y-1]++;
				}
				if(check(x+1,y-1)) {
					p[x+1][y-1]++;
				}
				if(check(x-1,y+1)) {
					p[x-1][y+1]++;
				}
			}
			if(size >= 3) {
				if(check(x+2,y)) {
					p[x+2][y]++;
				}
				if(check(x-2,y)) {
					p[x-2][y]++;
				}
				if(check(x,y+2)) {
					p[x][y+2]++;
				}
				if(check(x,y-2)) {
					p[x][y-2]++;
				}
			}
		}
		int whiteCounter = 0;
		int max = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(p[i][j] > max) {
					max = p[i][j];
				}
				if(p[i][j] == 0) {
					whiteCounter++;
				}
			}
		}
		System.out.println(whiteCounter+"\n"+max);
	}
	static boolean check(int x, int y) {
		if(x < 0 || x > 9 || y < 0 || y > 9) {
			return false;
		}
		return true;
	}
}