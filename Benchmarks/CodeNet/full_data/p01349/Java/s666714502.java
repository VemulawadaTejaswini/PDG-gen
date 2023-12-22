import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static char[][] map;
	static int h;
	static int w;
	static int n;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		h = stdIn.nextInt();
		w = stdIn.nextInt();
		n = stdIn.nextInt();
		map = new char[h][w];
		for(int i = 0; i < h; i++) {
			String tmp = stdIn.next();
			for(int j = 0; j < w; j++) {
				map[i][j] = tmp.charAt(j);
			}
		}
		System.out.println((solv())?"YES":"NO");
	}
	static char[][] Tmap;
	static boolean[][] isE;
	public static boolean solv() {
		Tmap = new char[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 1; j < w; j++) {
				isE = new boolean[h][w];
				for(int k = 0; k < map.length; k++) {
					Tmap[k] = Arrays.copyOf(map[k], map[k].length);
				}
				swap(i,j,i,j-1);
				if(start()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void swap(int Fy, int Fx, int Ty, int Tx) {
		char tmp = Tmap[Fy][Fx];
		boolean t = isE[Fy][Fx];
		Tmap[Fy][Fx] = Tmap[Ty][Tx];
		isE[Fy][Fx] = isE[Ty][Tx];
		Tmap[Ty][Tx] = tmp;
		isE[Ty][Tx] = t;
	}
	
	public static boolean start() {
		while(true) {
			if(!fall() && !erase()) {
				return (isAllC())?true:false;
			}
			isE = new boolean[h][w];
			while(fall()) {
			}
			
			Erase();
			
		}
	}
	
	public static boolean fall() {
		boolean isC = false;
		for(int i = 0; i  < h-1; i++) {
			for(int j = 0; j < w; j++) {
				erase();
				if(Tmap[i+1][j] == '.' && Tmap[i][j] != '.') {
					erase();
					swap(i,j,i+1,j);
					erase();
					isC = true;
				}
			}
		}
		return isC;
	}
	
	public static boolean erase() {
		boolean isC = false;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(Tmap[i][j] == '.') continue;
				char o = Tmap[i][j];
				boolean X = false;
				boolean Y = false;
				for(int k = j+1; k < w; k++) {
					if(Tmap[i][k] != o) break;
					if(k - j + 1 == n) {
						X = true;
						break;
					}
				}
				for(int k = i+1; k < h; k++) {
					
					if(Tmap[k][j] != o) break;
					
					if(k - i +1 == n) {
						Y = true;
						break;
					}
				}
				
				if(X) {
					for(int k = j+1; k < w; k++) {
						if(Tmap[i][k] != o) break;
						isE[i][k] = true;
					}
				}
				if(Y) {
					for(int k = i+1; k < h; k++) {
						if(Tmap[k][j] != o) break;
						isE[k][j] = true;
					}
				}
				if(X || Y) {
					isE[i][j] = true;
					isC = true;
				}
			}
		}
		return isC;
	}
	
	public static void Erase() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(isE[i][j]) {
					Tmap[i][j] = '.';
				}
			}
		}
	}
	
	public static boolean isAllC() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(Tmap[i][j] != '.') return false;
			}
		}
		return true;
	}
}