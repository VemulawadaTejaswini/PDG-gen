import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		int grid[][] = new int[H+2][W+2];
		for(int i = 1; i<=H; i++) {
			String s = sc.next();
			for(int j = 1; j<=W; j++) {
				if(s.charAt(j-1) == '#') grid[i][j] = -1;
				}
		}
		for(int i = 1; i<=H; i++) {
			for(int j = 1; j<=W; j++) {
				if(grid[i][j] == -1) continue;
				int count = 0;
				if(grid[i-1][j-1] == -1) count++;
				if(grid[i-1][j] == -1) count++;
				if(grid[i-1][j+1] == -1) count++;
				if(grid[i][j+1] == -1) count++;
				if(grid[i+1][j+1] == -1) count++;
				if(grid[i+1][j] == -1) count++;
				if(grid[i+1][j-1] == -1) count++;
				if(grid[i][j-1] == -1) count++;
				grid[i][j] = count;
			}
		}
		
		for(int i = 1; i<=H; i++) {
			for(int j = 1; j<=W; j++) {
				if(grid[i][j] == -1) System.out.print('#');
				else System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}

}