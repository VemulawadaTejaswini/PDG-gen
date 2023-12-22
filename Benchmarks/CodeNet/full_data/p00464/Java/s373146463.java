import java.util.*;
import java.math.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			if(h == 0 && w == 0 && n == 0) break;
			int[][] status = new int[h][w];
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					status[i][j] = sc.nextInt();
				}
			}
			
			int[][] dp1 = new int[h+1][w+1];
			dp1[0][0] = n-1;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
						if(status[i][j] == 1) {
							dp1[i+1][j] = dp1[i][j]/2+1;
						}
						else {
							dp1[i+1][j] = dp1[i][j]/2;
						}
						if(status[i][j] == 1) {
							dp1[i][j+1] = dp1[i][j]/2;
						}
						else {
							dp1[i][j+1] = dp1[i][j]/2 + 1;
						}
				}
			}
			int[][] dp2 = new int[h+1][w+1];
			dp2[0][0] = n;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
						if(status[i][j] == 1) {
							dp2[i+1][j] = dp2[i][j]/2+1;
						}
						else {
							dp2[i+1][j] = dp2[i][j]/2;
						}
						if(status[i][j] == 1) {
							dp2[i][j+1] = dp2[i][j]/2;
						}
						else {
							dp2[i][j+1] = dp2[i][j]/2 + 1;
						}
				}
			}
			int nowx = 0;
			int nowy = 0;
			
			while(nowx != w && nowy != h) {
				if(dp1[nowy+1][nowx] < dp2[nowy+1][nowx]) nowy++;
				else nowx++;
			}
			System.out.println((nowy+1) + " " + (nowx+1));
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			