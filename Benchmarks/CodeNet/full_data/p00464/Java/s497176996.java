import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int h = sc.nextInt();
			final int w = sc.nextInt();
			final int n = sc.nextInt();
			
			if(h == 0 && w == 0 && n == 0){
				break;
			}
			
			boolean[][] map = new boolean[h][w];
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					map[i][j] = sc.nextInt() == 1;
				}
			}
			
			int cur_x = 0;
			int cur_y = 0;
			int path = n - 1;
			
			while(cur_x != w && cur_y != h){
				//System.out.println((cur_y + 1) + " " + (cur_x + 1));
				
				if(path % 2 == 0){
					int n_x, n_y;
					n_x = cur_x + (map[cur_y][cur_x] ? 1 : 0);
					n_y = cur_y + (map[cur_y][cur_x] ? 0 : 1);
					cur_x = n_x;
					cur_y = n_y;
				}else{
					int n_x, n_y;
					n_x = cur_x + (map[cur_y][cur_x] ? 0 : 1);
					n_y = cur_y + (map[cur_y][cur_x] ? 1 : 0);
					cur_x = n_x;
					cur_y = n_y;
				}
				
				path /= 2;
			}
			
			System.out.println((cur_y + 1) + " " + (cur_x + 1));
		}
		
	}

}