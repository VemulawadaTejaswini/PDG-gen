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
	static char[][] TMap;
	static boolean[][] isR;
	static boolean solv() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w-1; j++) {
				TMap = new char[h][w];
				for(int k = 0; k < h; k++) {
					TMap[k] = Arrays.copyOf(map[k], map[k].length);
				}
				swapT(j,i,j+1,i);
				
				while(true) {
					isR = new boolean[h][w];
					fall();
					eC();
					boolean a = er();
					if(!a) {
						if(check()) {
							return true;
						}
						else {
							break;
						}
					}
				}
			}
		}
		return false;
	}
	public static void swapT(int x, int y, int xx, int yy) {
		char tmp = TMap[y][x];
		TMap[y][x] = TMap[yy][xx];
		TMap[yy][xx] = tmp;
	}
	public static void swapR(int x, int y, int xx, int yy) {
		boolean tmp = isR[y][x];
		isR[y][x] = isR[yy][xx];
		isR[yy][xx] = tmp;
	}
	
	static boolean eC() {
		boolean ret = false;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				//x方向
				char tmp = TMap[i][j];
				if(tmp == '.') continue;
				boolean X = true;
				for(int k = 0; k < n; k++) {
					if(j+k >= w || tmp != TMap[i][j+k]) {
						X = false;
						break;
					}
				}
				boolean Y = true;
				for(int k = 0; k < n; k++) {
					if(i + k >= h || tmp != TMap[i+k][j]) {
						Y = false;
						break;
					}
				}
				
				if(X) {
					for(int k = 0; k < n; k++) {
						isR[i][j+k] = true;
					}
					ret = true;
				}
				if(Y) {
					for(int k = 0; k < n; k++) {
						isR[i+k][j] = true;
					}
					ret = true;
				}
			}
		}
		return ret;
	}
	static void show() {
		for(int i = 0; i < w; i++) {
			System.out.print("=");
		}
		System.out.println();
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(TMap[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < w; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	static boolean fall() {
		boolean ret = false;
		while(true) {
			boolean a = false;
			for(int i = h-2; i >= 0; i--) {
				for(int j = 0; j < w; j++) {

					if(TMap[i+1][j] == '.' && TMap[i][j] != '.') {
						a = true;
						swapT(j,i+1,j,i);
						swapR(j,i+1,j,i);
					}
				}
			}
			if(!a) {
				break;
			}
			ret = true;
		}
		return ret;
	}
	static boolean er() {
		boolean ret = false;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(isR[i][j]) {
					ret = true;
					TMap[i][j] = '.';
				}
			}
		}
		return ret;
	}
	
	static boolean check() {
		for(int i = 0; i < w; i++) {
			if(TMap[h-1][i] != '.') return false;
		}
		return true;
	}
}