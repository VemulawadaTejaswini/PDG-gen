import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int [] vx = {0,1,0,-1};
	int [] vy = {-1,0,1,0};
	
	int [] diax = {1, -1, -1, 1};
	int [] diay = {1, 1, -1, -1};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			int d = sc.nextInt();
			if((w|h|d) == 0) break;
			
			int wh = w * h;
			int [][] a = new int[wh][wh + 1];
			for(int i = 0; i < wh; i++){
				a[i][wh] = sc.nextInt();
			}
			
			for(int i = 0; i < wh; i++){
				a[i][i] = 1;
				for(int j = 0; j < 4; j++){
					int x = (i % w) + vx[j] * d;
					int y = (i / w) + vy[j] * d;
					if(isOK(x, y, w, h)){
						a[i][y * w + x] = 1;
					}
					
					for(int  k = 0; k < d-1; k++){
						x = x + diax[j];
						y = y + diay[j];
						if(isOK(x, y, w, h)){
							a[i][y * w + x] = 1;
						}
					}
				}
			}
			
			System.out.println(solve(a, wh) ? 1 : 0);
		}
	}
	
	private boolean solve(int[][] a, int elementSize) {
		int n = a.length;
		for(int i = 0; i < n; i++){
			int pivot = i;
			for(int j = i; j < n; j++){
				if(Math.abs(a[j][i]) > Math.abs(a[pivot][i])) pivot = j;
			}
			
			if(Math.abs(a[pivot][i]) == 0) continue;
			
			for(int j = 0; j <= n; j++){
				int temp = a[i][j];
				a[i][j] = a[pivot][j];
				a[pivot][j] = temp;
			}
			
			for(int j = 0; j < n; j++){
				if(i != j && a[j][i] != 0){
					for(int k = i; k <= n; k++){
						a[j][k] ^= a[i][k];
					}
				}
			}
		}
		
		
		for(int i = 0; i < n; i++){
			if(a[i][i] == 0 && a[i][n] != 0){
				return false;
			}
		}
		
		return true;
	}

	private boolean isOK(int x, int y, int w, int h) {
		return (0 <= x && x < w && 0 <= y && y < h);
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}