import java.util.Scanner;

public class Main {
	/**
	 * Property Distribution 财产分配
	 * 地图由'#''*''@'三个字符,相同字符上下左右联系在一起可以
	 * 划分到一个区域中，问划分的数量
	 * 样例：H×W
	 * Sample Input
10 10
####*****@
@#@@@@#*#*
@##***@@@*
#****#*@**
##@*#@@*##
*@@@@*@@@#
***#@*@##*
*@@@*@@##@
*@*#*@##**
@****#@@#@
0 0
Output for the Sample Input
33

dfs相同字符同区域遍历一次后ans++
	 * 
	 */
	//static int ans = 0;
	static char[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();//列
		int W = sc.nextInt();//行
		while(H != 0&&W != 0) {
			int ans = 0;
			map = new char[W][H];
			for (int i = 0; i < W; i++) {//初始化
				map[i] = sc.next().toCharArray();
			}
			for (int i = 0; i < W; i++) {
				for (int j = 0; j < H; j++) {
					if(map[i][j] != '.') {
						dfs(map[i][j], i, j);
						ans++;//一次深搜划分一片区域
					}
				}
			}
			System.out.println(ans);
			H = sc.nextInt();
			W = sc.nextInt();
		}
		
	}
	
	private static void dfs(char c, int x, int y) {
		//同一区域相同字符替换'.'--
		map[x][y] = '.';
		int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};//4个方向
		for (int i = 0; i < dir.length; i++) {
			int dx = x + dir[i][0];
			int dy = y + dir[i][1];
			if(dx >= 0&&dy >= 0&&dx < map.length&&dy < map[0].length) {
				if(map[dx][dy] == c) {//相同字符划分同区
					dfs(c, dx, dy);
				}
			}
		}
		
	}

}

