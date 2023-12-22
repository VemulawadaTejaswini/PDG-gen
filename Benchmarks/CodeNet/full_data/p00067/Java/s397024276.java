import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static boolean[][] map;
	static boolean[][] check;
	static int island ;
	public static void main(String[] args) {
		while(scan.hasNext()) {
			map = new boolean[12][12];
			check = new boolean[12][12];
			island = 0;
			for(int i = 0; i < 12; i++) {
				int count = 0;
				for( String s : scan.nextLine().split("",0)) {
					if(s.equals("1")) {
						map[i][count] = true;
					}
					else {
						map[i][count] = false;
					}
					count++;
				}
			}
			for(int i = 0; i < 12 ; i++) {
				for(int u = 0; u < 12; u++) {
					if(map[i][u] && !check[i][u]) {
						fun(i,u);
					}
				}
			}
			System.out.println(island);
		}
	}

	static void fun(int x, int y) {
		flag(x,y);
		island++;
	}

	static void flag(int x, int y) {
		check[x][y] = true;
	
		if(y + 1 < 12 && map[x][y+1] && !check[x][y+1]) {
			flag(x,y+1);
		}
		if(x + 1 < 12 && map[x+1][y] && !check[x+1][y]) {
			flag(x+1,y);
		}
		if(y - 1 > -1 && map[x][y-1] && !check[x][y-1]) {
			flag(x,y-1);
		}
		if(x - 1 > -1 && map[x-1][y] && !check[x-1][y]) {
			flag(x-1,y);
		} 			
	}
}