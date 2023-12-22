import java.util.*;
public class Main {
	static int h;
	static int w;
	static char[][] map;
	static boolean[][] alMove;
	static int[] vy = new int[] {0,-1,0,1};
	static int[] vx = new int[] {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;
			map = new char[h][w];
			alMove = new boolean[h][w];
			for(int i = 0; i < h; i++) {
				map[i] = sc.next().toCharArray();
			}
			int i = 0;
			for(i = 0; i <= 181; i++) {
				boolean check = false;
				for(int j = 0; j < h; j++) {
					for(int k = 0; k < w; k++) {
						if(map[j][k] == 'E') {
							check = true;
							if     (rcheck(j+1,k) && (map[j+1][k] == '.' || map[j+1][k] == 'X')) {
								map[j][k] = 'S';
							}
							else if(rcheck(j,k+1) && (map[j][k+1] == '.' || map[j][k+1] == 'X')) {
								map[j][k] = 'E';
							}
							else if(rcheck(j-1,k) && (map[j-1][k] == '.' || map[j-1][k] == 'X')) {
								map[j][k] = 'N';
							}
							else if(rcheck(j,k-1) && (map[j][k-1] == '.' || map[j][k-1] == 'X')) {
								map[j][k] = 'W';
							}
						}
						else if(map[j][k] == 'N') {
							check = true;
							if     (rcheck(j,k+1) && (map[j][k+1] == '.' || map[j][k+1] == 'X')) {
								map[j][k] = 'E';
							}
							else if(rcheck(j-1,k) && (map[j-1][k] == '.' || map[j-1][k] == 'X')) {
								map[j][k] = 'N';
							}
							else if(rcheck(j,k-1) && (map[j][k-1] == '.' || map[j][k-1] == 'X')) {
								map[j][k] = 'W';
							}
							else if(rcheck(j+1,k) && (map[j+1][k] == '.' || map[j+1][k] == 'X')) {
								map[j][k] = 'S';
							}
							
						}
						else if(map[j][k] == 'W') {
							check = true;
							if     (rcheck(j-1,k) && (map[j-1][k] == '.' || map[j-1][k] == 'X')) {
								map[j][k] = 'N';
							}
							else if(rcheck(j,k-1) && (map[j][k-1] == '.' || map[j][k-1] == 'X')) {
								map[j][k] = 'W';
							}
							else if(rcheck(j+1,k) && (map[j+1][k] == '.' || map[j+1][k] == 'X')) {
								map[j][k] = 'S';
							}
							else if(rcheck(j,k+1) && (map[j][k+1] == '.' || map[j][k+1] == 'X')) {
								map[j][k] = 'E';
							}
						}
						else if(map[j][k] == 'S') {
							check = true;
							if     (rcheck(j,k-1) && (map[j][k-1] == '.' || map[j][k-1] == 'X')) {
								map[j][k] = 'W';
							}
							else if(rcheck(j+1,k) && (map[j+1][k] == '.' || map[j+1][k] == 'X')) {
								map[j][k] = 'S';
							}
							else if(rcheck(j,k+1) && (map[j][k+1] == '.' || map[j][k+1] == 'X')) {
								map[j][k] = 'E';
							}
							else if(rcheck(j-1,k) && (map[j-1][k] == '.' || map[j-1][k] == 'X')) {
								map[j][k] = 'N';
							}
						}
					}
				}
				if(!check) break;
				for(int j = 0; j < h; j++) {
					Arrays.fill(alMove[j], false);
				}
				for(int j = 0; j < h; j++) {
					for(int k = 0; k < w; k++) {
						if(map[j][k] == '.') {
							if    (rcheck(j,k+1) && !alMove[j][k] && !alMove[j][k+1] && map[j][k+1] == 'W') {
								map[j][k+1] = '.';
								map[j][k] = 'W';
								alMove[j][k] = true;
								alMove[j][k+1] = true;
							}
							else if    (rcheck(j-1,k) && !alMove[j][k] && !alMove[j-1][k] && map[j-1][k] == 'S') {
								map[j-1][k] = '.';
								map[j][k] = 'S';
								alMove[j][k] = true;
								alMove[j-1][k] = true;
							}
							else if    (rcheck(j,k-1) && !alMove[j][k] && !alMove[j][k-1] && map[j][k-1] == 'E') {
								map[j][k-1] = '.';
								map[j][k] = 'E';
								alMove[j][k] = true;
								alMove[j][k-1] = true;
							}
							else if    (rcheck(j+1,k) && !alMove[j][k] && !alMove[j+1][k] && map[j+1][k] == 'N') {
								map[j+1][k] = '.';
								map[j][k] = 'N';
								alMove[j][k] = true;
								alMove[j+1][k] = true;
							}
						}
						if(map[j][k] == 'X') {
							if(rcheck(j,k+1) && map[j][k+1] == 'W' && !alMove[j][k+1]) {
								map[j][k+1] = '.';
							}
							else if(rcheck(j-1,k) && map[j-1][k] == 'S' && !alMove[j-1][k]) {
								map[j-1][k] = '.';
							}
							else if(rcheck(j,k-1) && map[j][k-1] == 'E' && !alMove[j][k-1]) {
								map[j][k-1] = '.';
							}
							else if(rcheck(j+1,k) && map[j+1][k] == 'N' && !alMove[j+1][k]) {
								map[j+1][k] = '.';
							}
						}
					}
				}
			}
			if(i <=  180) {
				System.out.println(i);
			}
			else {
				System.out.println("NA");
			}
		}
	}
	
	public static boolean rcheck(int a, int b) {
		if(a < 0 || b < 0 || a >= h || b >= w) return false;
		return true;
	}
}