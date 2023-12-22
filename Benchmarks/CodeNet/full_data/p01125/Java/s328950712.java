import java.lang.reflect.Field;
import java.util.*;

public class Main {

	static int limit = 21;
	static int mx[] = {0,1,0,-1};
	static int my[] = {1,0,-1,0};

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			int field[][] = new int[limit][limit];
			for (int i = 0; i < limit ; i++) {
				for (int j = 0; j < limit; j++) {
					field[i][j] = 0;
				}
			}
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				field[x][y] = 1;
			}
			int nx = 10;
			int ny = 10;
			int cnt = 0;
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				String direction = in.next();
				int move = in.nextInt();
				int d = 0;
				switch (direction) {
				case "N":
					d = 0;
					break;
				case "E":
					d = 1;
					break;
				case "S":
					d = 2;
					break;
				case "W":
					d = 3;
					break;
				default:
					break;
				}
				for (int j = 0; j < move; j++) {
					nx += mx[d];
					ny += my[d];
					if(field[nx][ny]==1){
						cnt++;
						field[nx][ny] = 0;
					}
				}
			}
			if(cnt==n){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

}