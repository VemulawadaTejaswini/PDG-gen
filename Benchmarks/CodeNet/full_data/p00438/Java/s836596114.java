import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a == 0 && b == 0) break;
			int[][] ary = new int[a][b];
			ary[0][0] = 1;
			int N = sc.nextInt();
			for(int i = 0; i < N; i++) {
				ary[sc.nextInt() - 1][sc.nextInt() - 1] = -1;
			}
			
			for(int y = 0; y < b; y++) {
				for(int x = 0; x < a; x++) {
					if(x == 0 && y == 0) continue;
					if(ary[x][y] == -1) continue;
					else if(y == 0 && ary[x - 1][y] != -1) {
						ary[x][y] = ary[x - 1][y];
					}
					else if(x == 0 && ary[x][y - 1] != -1) {
						ary[x][y] = ary[x][y - 1];
					} else {
						if(ary[x][y - 1] != -1) ary[x][y] += ary[x][y - 1];
						if(ary[x - 1][y] != -1) ary[x][y] += ary[x - 1][y];
					}
				}
			}
			System.out.println(ary[a - 1][b - 1]);
		}
	}
}