import java.awt.Point;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().mainrun();
	}

	private Scanner scan;
	private int W,H,ans,count;

	private int[][] F;
	private int[][]	vec_a = {{-1,-1},{-1,0},{0,1},{1,0},{1,-1},{0,-1}},	//偶数列
						vec_b = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{0,-1}};	//奇数列

	private int[][] state;

	private HashMap<Integer,Boolean> stateMap;

	private Deque<Point> deque;

	private void mainrun() {

		scan = new Scanner(System.in);

		W = scan.nextInt();
		H = scan.nextInt();
		count = 0;

		deque = new LinkedList<>();

		stateMap = new HashMap<>();
		stateMap.put(0, false);

		F = new int[H + 2][W + 2];
		state = new int[H][W];
		ans = 0;

		Arrays.fill(F[0], 0);
		Arrays.fill(F[H + 1], 0);

		for(int i = 1;i < H + 1 ;i++) {
			F[i][0] = 0;
			F[i][W + 1] = 0;
			for(int j = 1;j < W + 1;j++) {
				F[i][j] = scan.nextInt();

				if(F[i][j] == 1) {
					ans++;
				}
			}
			Arrays.fill(state[i-1], 0);
		}

		for(int i = 1; i < H + 1;i++) {
			for(int j = 1;j < W + 1;j++) {
				if(F[i][j] == 0 && state[i-1][j-1] == 0) {
					count++;
					stateMap.put(count, true);

					state[i-1][j-1] = count;

					deque.add(new Point(j,i));
					Point p;

					while(!deque.isEmpty()) {
						p = deque.remove();
						putState(p.y,p.x);
					}
				}
			}
		}

		for(int i = 1; i < H + 1;i++) {
			for(int j = 1;j < W + 1;j++) {
				if(F[i][j] == 0 && stateMap.get(state[i-1][j-1])) {
					F[i][j] = 1;
					ans++;
				}
			}
		}

		ans *= 6;

		for(int i = 1; i < H + 1 ;i++) {
			for(int j = 1;j < W + 1;j++) {
				if(F[i][j] == 1) {
					ans -= aroundNum(i,j);
				}
			}
		}

		System.out.println(ans);

		scan.close();
	}

	private void putState(int y,int x) {
		int xx,yy;
		int[][] vec;

		if(y % 2 ==0) {
			vec = vec_a;
		}else {
			vec = vec_b;
		}

		for(int i = 0;i < 6;i++) {
			xx = x + vec[i][1];
			yy = y + vec[i][0];

			if(xx == 0 || yy == 0|| xx == W + 1 || yy == H + 1) {//範囲外
				stateMap.put(count, false);
				continue;
			}

			if(F[yy][xx] == 1|| state[yy-1][xx-1] != 0) {
				continue;
			}

			state[yy-1][xx-1] = count;
			deque.add(new Point(xx,yy));
		}
	}

	private int aroundNum(int y,int x) {
		int cnt = 0,xx,yy;
		int[][] vec;
		if(y % 2 == 0) {
			vec = vec_a;
		}else {
			vec = vec_b;
		}
		for(int i = 0;i < 6; i++) {
			xx = x + vec[i][1];
			yy = y + vec[i][0];
			if(F[yy][xx] == 1) {
				cnt++;
			}
		}
		return cnt;
	}
}

