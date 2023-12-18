
import java.util.Scanner;
public class Main {
	
	static int h;
	static int w;
	
	static char [][]grid;
	
	static int [][]left;
	static int [][]right;
	static int [][]up;
	static int [][]down;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h = Integer.parseInt(sc.next());
		 w = Integer.parseInt(sc.next());
		
		grid = new char [h][w];
		
		left = new int [h][w];
		right = new int [h][w];
		up = new int [h][w];
		down = new int [h][w];
		
		for(int i = 0 ;i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		
		lcnt();
		rcnt();
		ucnt();
		dcnt();
		
		int ans = 0;
		
		for(int i = 0 ;i < h ;i++) {
			for(int j = 0; j < w ;j++) {
				if(grid[i][j] == '#') {
					continue;
				}
				int temp = left[i][j] + right[i][j] + up[i][j] + down[i][j] -3;
				
				ans = Math.max(ans,temp);
			}
		}
		
		System.out.println(ans);
	

	}
	
	static void lcnt() {
		int temp = 0;
		for(int i = 0 ;i < h ;i++) {
			temp = 0;
			for(int j = 0 ;j < w ;j++) {
				if(grid[i][j] == '#') {
					temp = 0;
				}
				else {
					temp++;
					left[i][j] = temp;
				}
			}
		}
		
	}
	static void rcnt() {
		int temp = 0;
		for(int i = 0 ;i < h ;i++) {
			temp = 0;
			for(int j = w-1 ;j >= 0 ;j--) {
				if(grid[i][j] == '#') {
					temp = 0;
				}
				else {
					temp++;
					right[i][j] = temp;
				}
			}
		}
	}
	static void ucnt() {
		int temp = 0;
		for(int j = 0 ; j < w ; j++) {
			temp = 0;
			for(int i = 0 ;i < h ;i++) {
				if(grid[i][j] == '#') {
					temp = 0;
				}
				else {
					temp++;
					up[i][j] = temp;
				}
			}
		}
		
	}
	static void dcnt() {
		int temp = 0;
		for(int j = 0 ; j < w ; j++) {
			temp = 0;
			for(int i = h-1 ; i >= 0 ;i--) {
				if(grid[i][j] == '#') {
					temp = 0;
				}
				else {
					temp++;
					down[i][j] = temp;
				}
			}
		}
		
	}

}
