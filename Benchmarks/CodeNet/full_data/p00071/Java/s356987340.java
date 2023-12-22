import java.util.*;
import java.awt.geom.*;
public class Main {
	int [][] data;
	int n = 8;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		int count = 1;
		while(dataset-- > 0){
			data = new int[8][8];
			for(int i = 0; i < n; i++){
				String s = sc.next();
				for(int j = 0; j < 8; j++){
					data[i][j] = s.charAt(j) - '0';
				}
			}
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;

			dfs(x,y);

			System.out.printf("Data %d:\n", count++);
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					System.out.print(data[i][j]);
				}
				System.out.println();
			}
		}
	}

	private void dfs(int x, int y) {
		data[y][x] = 0;

		for(int i = -3; i <= 3; i++){
			if(isOK(x + i, y) && data[y][x + i] == 1){
				dfs(x + i,y);
			}
		}
		for(int i = -3; i <= 3; i++){
			if(isOK(x, y+i) && data[y+i][x] == 1){
				dfs(x,y+i);
			}
		}

	}

	private boolean isOK(int x, int y) {
		if(0 <= x && x < n && 0 <= y && y < n){
			return true;
		}
		return false;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}