import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);

	private void doit(){
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0)break;
			int [][] data = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					data[i][j] = sc.nextInt();
				}
			}
			int [][] pic = new int[m][m];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					pic[i][j] = sc.nextInt();
				}
			}
			
			int [][][] pics = rotate(pic);
			
			int x = 1 << 24, y = 1 << 24;
			for(int i = 0; i < n - m + 1; i++){
				for(int j = 0; j < n - m + 1; j++){
					for(int dir = 0; dir < 4; dir++){
						if(check(data, pics[dir], i, j)){
							int [] res = find(pics[dir]);
							res[0] += j;
							res[1] += i;
							
							if(res[1] < y){
								y = res[1];
								x = res[0];
							}
							else if(res[1] == y && res[0] < x){
								y = res[1];
								x = res[0];
							}
						}
					}
				}
			}
			if(x == 1 << 24){
				System.out.println("NA");
			}
			else{
				System.out.println(x + " " + y);
			}
		}
	}
	
	private int[] find(int[][] pic) {
		int m = pic.length;
		int [] res = new int[2];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < m; j++){
				if(pic[i][j] != -1){
					res[0] = j + 1;
					res[1] = i + 1;
					return res;
				}
			}
		}
		return null;
	}

	private boolean check(int[][] data, int[][] pic, int y, int x) {
		int m = pic.length;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < m; j++){
				if(pic[i][j] == -1) continue;
				if(pic[i][j] != data[i + y][j + x]){
					return false;
				}
			}
		}
		return true;
	}
	
	private int[][][] rotate(int [][] data){
		int n = data.length;
		int [][][] mlist = new int[4][n][n];
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < n; j++){
				mlist[0][i][j] = data[i][j];
			}
		}
		for(int  i = 1 ; i < 4; i++){
			for(int y = 0 ; y < n; y++){
				for(int x = 0; x < n; x++){
					mlist[i][x][n- y - 1] = mlist[i-1][y][x];
				}
			}
		}
		return mlist;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}