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
	public static boolean solv() {
		Tmap = new char[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 1; j < w; j++) {
				
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
		Tmap[Fy][Fx] = Tmap[Ty][Tx];
		Tmap[Ty][Tx] = tmp;
	}
	
	public static boolean start() {
		while(true) {
			if(!fall() && !erase()) {
				return (isAllC())?true:false;
			}
		}
	}
	
	public static boolean fall() {
		boolean isC = false;
		for(int i = 0; i < h-1; i++) {
			for(int j = 0; j < w; j++) {
				if(Tmap[i+1][j] == '.' && Tmap[i][j] != '.') {
					swap(i,j,i+1,j);
					isC = true;
				}
			}
		}
		return isC;
	}
	
	public static boolean erase() {
		boolean isC = false;
		for(int i = h-1; i >= 0; i--) {
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
				for(int k = i-1; k >= 0; k--) {
					if(Tmap[k][j] != o) break;
					if(k + i - 1 == n) {
						Y = true;
						break;
					}
				}
				if(X) {
					for(int k = j+1; k < w; k++) {
						if(Tmap[i][k] != o) break;
						Tmap[i][k] = '.';
					}
				}
				if(Y) {
					for(int k = i-1; k >= 0; k--) {
						if(Tmap[k][j] != o) break;
						Tmap[k][j] = '.';
					}
				}
				if(X || Y) {
					Tmap[i][j] = '.';
					isC = true;
				}
			}
		}
		return isC;
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