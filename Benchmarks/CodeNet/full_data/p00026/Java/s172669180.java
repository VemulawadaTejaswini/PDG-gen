import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static int n = 10;
	static int[][] map = new int[n][n];

	public static void main(String[] args){

		int[][] small = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
		int[][] middle = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		int[][] large = {{0, 0, 1, 0, 0}, {0, 1, 1, 1, 0},
						 {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}};
		while(scan.hasNext()){
			String[] ss = scan.nextLine().split(",");
			int x = Integer.parseInt(ss[0]);
			int y = Integer.parseInt(ss[1]);
			int s = Integer.parseInt(ss[2]);
			int[][] d;
			if(s == 1){
				d = small;
			} else if(s == 2){
				d = middle;
			} else if(s == 3){
				d = large;
			}
			int m =(int)(d.length / 2);
			for(int i = - m; i <= m; i++){
				for(int j = - m; j <= m; j++){
					if(d[i + m][j + m] == 1){
						drop(x + i, y + j);
					}
				}
			}
			int max = 0;
			int count = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					max = Math.max(max, map[i][j]);
					if(map[i][j] == 0){
						count++;
					}
				}
			}
			System.out.printf("%d\n", count);
			System.out.printf("%d\n", max);
			scan.close();
		}
	}

	public static void drop(int xx, int yy){
		if(xx < 0 || xx >= n|| yy < 0 || yy >= n){
			return;
		}
		map[xx][yy]++;
	}
}