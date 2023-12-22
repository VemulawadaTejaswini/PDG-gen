import java.util.*;

//dpらしい…
class Main {
	Scanner sc = new Scanner(System.in);

	public boolean inmap(int x, int y) {
		return 0 <= x && x < 8 && 0 <= y && y < 8;
	}

	public void dfs(int x, int y) {
		if(inmap(x,y) && map[y][x]=='1'){
			map[y][x]='0';
			for(int[] d :dlist){
				dfs(x+d[0],y+d[1]);
			}
		}
	}

	int[][] dlist = new int[][] {
			new int[] { 1, 0 }, new int[] { 2, 0 },
			new int[] { 3, 0 }, new int[] { -1, 0 }, new int[] { -2, 0 },
			new int[] { -3, 0 },
			new int[] { 0, 1}, new int[] { 0, 2 }, new int[] { 0, 3 }
			, new int[] { 0, -1 }, new int[] { 0, -2 }, new int[] { 0, -3 }};

	char[][] map;

	public void run() {
		int size = sc.nextInt();
		for (int s = 1; s <= size; s++) {
			map = new char[8][8];
			for (int i = 0; i < 8; i++)
				map[i] = sc.next().toCharArray();
			dfs(sc.nextInt() - 1,sc.nextInt() - 1);
			ln("Data "+s+":");
			for(int y=0;y<8;y++){
				for(int x=0;x<8;x++){
					pr(map[y][x]);
				}
				ln();
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}