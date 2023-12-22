import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N,M;
		int x,y,ans;
		String dir;
		int dis;
		boolean[][] map;
		while((N = scn.nextInt()) != 0) {
			map = new boolean[21][21];
			for(int i = 0;i < N;i++) {
				map[scn.nextInt()][scn.nextInt()] = true;
			}
			M = scn.nextInt();
			x = 10;y = 10;ans = 0;
			for(int i = 0;i < M;i++) {
				dir = scn.next();
				dis = scn.nextInt();
				for(int j = 0;j < dis;j++) {
					switch(dir) {
					case "N":
						y++;
						break;
					case "W":
						x--;
						break;
					case "S":
						y--;
						break;
					default:
						x++;
						break;
					}
					if(map[x][y]) {
						ans++;
						map[x][y] =false;
					}
				}
			}
			System.out.println(ans == N?"Yes":"No");
		}
		scn.close();
	}
}

