import java.util.*;
public class Main {	
	String[] tile;
	boolean[][] board;

	void doIt() {
		Scanner stdIn =new Scanner(System.in);

		while(stdIn.hasNext()) {
			Queue<Integer> qx = new LinkedList<Integer>();
			Queue<Integer> qy = new LinkedList<Integer>();

			int width = stdIn.nextInt();
			int height = stdIn.nextInt();
			if(width + height == 0) break;
			tile = new String[height];
			board = new boolean[height][width];
			for(int r = 0; r < height; r++) {
				tile[r] = stdIn.next();
				for(int c = 0; c < width; c++) {
					if(tile[r].charAt(c) == '@') {
						qx.add(c);
						qy.add(r);
						board[r][c] = true;
					}
				}
			}

			int[] fdx = new int[]{1, -1, 0, 0};
			int[] fdy = new int[]{0, 0, -1, 1};
			int count = 1;//既に現在地は訪れているので含めておく
			while(!qx.isEmpty()) {
				int nowx = qx.poll();
				int nowy = qy.poll();
				for(int r = 0; r < fdx.length; r++) {
					int nextx = nowx + fdx[r];
					int nexty = nowy + fdy[r];
					if(!(nextx >= 0 && nexty >= 0 && nextx < width && nexty < height)) continue;
					if(tile[nexty].charAt(nextx) != '#' && !board[nexty][nextx]) {
						qx.add(nextx);
						qy.add(nexty);
						board[nexty][nextx] = true;
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}