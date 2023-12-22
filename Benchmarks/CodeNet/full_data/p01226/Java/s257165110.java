import java.util.*;
import java.util.Map.Entry;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {	
	static char[] tank = new char[] {'^','>','v','<'};
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {-1,0,1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int TIME = 0; TIME < t; TIME++) {
			if(TIME != 0) 			System.out.println();
			int h = sc.nextInt();
			int w = sc.nextInt();
			char[][] map = new char[h][w];
			for(int i = 0; i < h; i++) {
				map[i] = sc.next().toCharArray();
			}
			int n = sc.nextInt();
			char[] cmd = new char[n];
			cmd = sc.next().toCharArray();
			int x = 0;
			int y = 0;
			int d = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j] == '^') {
						x = j;
						y = i;
						d = 0;
						continue;
					}
					else if(map[i][j] == '>') {
						x = j;
						y = i;
						d = 1;
						continue;
					}
					else if(map[i][j] == 'v') {
						x = j;
						y = i;
						d = 2;
						continue;
					}
					else if(map[i][j] == '<') {
						x = j;
						y = i;
						d = 3;
						continue;
					}
				}
			}
			for(int i = 0; i < n; i++) {
				char CMD = cmd[i];
				if(CMD == 'U') {
					dChange(map,y,x,0);
					d = 0;
					boolean check = rangeCheck(map,y-1,x);
					boolean change = false;
					if(check) change = move(map,y,x,0);
					if(change) {
						y = y + vy[d];
						x = x + vx[d]; 
					}
				}
				if(CMD == 'D') {
					dChange(map,y,x,2);
					d = 2;
					boolean check = rangeCheck(map,y+1,x);
					boolean change = false;
					if(check) change = move(map,y,x,2);
					if(change) {
						y = y + vy[d];
						x = x + vx[d]; 
					}
				}
				if(CMD == 'R') {
					dChange(map,y,x,1);
					d = 1;
					boolean check = rangeCheck(map,y,x+1);
					boolean change = false;
					if(check) change = move(map,y,x,1);
					if(change) {
						y = y + vy[d];
						x = x + vx[d]; 
					}
				}
				if(CMD == 'L') {
					dChange(map,y,x,3);
					d = 3;
					boolean check = rangeCheck(map,y,x-1);
					boolean change = false;
					if(check) change = move(map,y,x,3);
					if(change) {
						y = y + vy[d];
						x = x + vx[d]; 
					}
				}
				if(CMD == 'S') {
					shot(map,y,x,d);
				}
			}
			for(int i = 0; i < h; i++) {
				System.out.println(String.valueOf(map[i]));
			}
		}
	}
	static void dChange(char[][] map, int y, int x, int d) {
		map[y][x] = tank[d];
	}
	static boolean rangeCheck(char[][] map, int y, int x) {
		if(y < 0 || x < 0 || y >= map.length || x >= map[y].length) return false;
		return true;
	}
	static boolean move(char[][] map ,int y, int x, int d) {
		int ty = y + vy[d];
		int tx = x + vx[d];
		if(map[ty][tx] == '.') {
			map[y][x] = '.';
			map[ty][tx] = tank[d];
			return true;
		}
		return false;
	}
	static void shot(char[][] map, int y, int x, int d) {
		int Y = y + vy[d];
		int X = x + vx[d];
		while(true) {
			if(!rangeCheck(map,Y,X)) {
				break;
			}
			if(map[Y][X] == '*') {
				map[Y][X] = '.';
				break;
			}
			if(map[Y][X] == '#') {
				break;
			}
			Y = Y + vy[d];
			X = X + vx[d];
		}
	}
	
 }