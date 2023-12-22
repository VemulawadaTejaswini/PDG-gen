import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
	static int X;
	static int Y;
	static int N;
	
	static HashMap<Integer,Integer> BK;
	
	static int[][] S;
	
	static boolean NA;
	static boolean OK;
	
	static int[][] now;
	static int[][] ans;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			X = sc.nextInt();
			Y = sc.nextInt();
			N = sc.nextInt();
			if(X == 0 && Y == 0 && N == 0) break;
			BK = new HashMap<Integer,Integer>();
			for(int i = 0; i < N; i++) {
				BK.put(sc.nextInt(), sc.nextInt());
			}
			S = new int[Y][X];
			NA = false;
			OK = false;
			now = new int[Y][X];
			ans = new int[Y][X];
			for(int i = 0; i < Y; i++) {
				for(int j = 0; j < X; j++) {
					S[i][j] = sc.nextInt();
				}
			}
			solv(0,0);
			if(NA || !OK) {
				System.out.println("NA");
				continue;
			}
			for(int i = 0; i < Y; i++ ) {
				System.out.print(ans[i][0]);
				for(int j = 1; j < X; j++) {
					System.out.print(" " + ans[i][j]);
				}
				System.out.println();
			}
		}
	}
	static void solv(int y, int x) {
		if(NA) {
			return;
		}
		if(x == X) {
			solv(y+1,0);
			return;
		}
		if(y == Y) {
			if(OK) {
				NA = true;
				OK = false;
				return;
			}
			if(!OK && !NA) {
				OK = true;
				for(int i = 0; i < Y; i++) {
					ans[i] = Arrays.copyOf(now[i], now[i].length);
				}
				return;
			}
			return;
		}
		if(S[y][x] == 0) {
			solv(y,x+1);
			return;
		}
		for(int i = 1; i <= BK.get(S[y][x]); i++) {
			if(BK.get(S[y][x]) % i != 0) continue;
			for(int j = -(BK.get(S[y][x])/i)+1; j <= 0; j++) { //???????????? x
				IN:for(int k = -i + 1; k <= 0; k++) { //???????????? y
					for(int l = 0; l < i; l++) {
						for(int m = 0; m < BK.get(S[y][x]) / i; m++) {
							int tox = m + j + x;
							int toy = l + k + y;
							if(tox < 0 || toy < 0 || tox >= X || toy >= Y) continue IN;
							if(now[toy][tox] != 0 || (S[toy][tox] != S[y][x] && S[toy][tox] != 0)) continue IN;
						}
					}
					for(int l = 0; l < i; l++) {
						for(int m = 0; m < BK.get(S[y][x]) / i; m++) {
							int tox = m + j + x;
							int toy = l + k + y;
							now[toy][tox] = S[y][x];
						}
					}
					solv(y,x+1);
					for(int l = 0; l < i; l++) {
						for(int m = 0; m < BK.get(S[y][x]) / i; m++) {
							int tox = m + j + x;
							int toy = l + k + y;
							now[toy][tox] = 0;
						}
					}

				}
			}
		}

	}
	
}