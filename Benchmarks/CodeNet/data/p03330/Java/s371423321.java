

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		int [][]co = new int [c][c];
		
		for(int i = 0 ; i < c ;i++) {
			for(int j = 0 ; j < c ;j++) {
				co[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		int [][]grid = new int [n][n];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ;j++) {
				grid[i][j] = Integer.parseInt(sc.next())-1;
			}
		}
		int ans = 1000000000;
		for(int i = 0 ; i < c ; i++) {
			for(int j = 0 ; j < c ; j++) {
				for(int k = 0 ; k < c ; k++) {
					if(i == j || j == k || i == k) {
						continue;
					}
					int temp = 0;
					for(int nx = 0 ; nx < n ; nx++) {
						for(int ny = 0 ; ny < n ;ny++) {
							if((nx+ny)%3 == 0) {
								temp += co[grid[nx][ny]][i];
							}
							else if((nx+ny)%3 == 1) {
								temp += co[grid[nx][ny]][j];
							}
							else {
								temp += co[grid[nx][ny]][k];
							}
						}
					}
					ans = Math.min(ans,temp);
				}
			}
		}
		System.out.println(ans);
		
		
	}
}
