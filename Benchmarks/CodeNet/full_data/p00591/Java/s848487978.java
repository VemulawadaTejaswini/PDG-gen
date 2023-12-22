import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[][] list = new int[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					list[i][j] = sc.nextInt();
				}
			}
			//?????§????°? ?????§?????§
			boolean[][] R = new boolean[n][n];
			boolean[][] L = new boolean[n][n];
			for(int i = 0; i < n; i++) {
				int MIN = Integer.MAX_VALUE;
				for(int j = 0; j < n; j++) {
					if(list[i][j] < MIN) {
						MIN = list[i][j];
					}
				}
				for(int j = 0; j < n; j++) {
					if(list[i][j] == MIN) {
						R[i][j] = true;
					}
				}
			}
			for(int i = 0; i < n; i++) {
				int MAX = 0;
				for(int j = 0; j < n; j++) {
					if(list[j][i] > MAX) {
						MAX = list[j][i];
					}
				}
				for(int j = 0; j < n; j++) {
					if(list[j][i] == MAX) {
						L[j][i] = true;
					}
				}
				
			}
			int id = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(L[i][j] && R[i][j] && id < list[i][j]) id = list[i][j]; 
				}
			}
			System.out.println(id);
		}
	}
 }