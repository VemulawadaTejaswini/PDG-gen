import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int W,H,startx,starty,goalx,goaly,N,baseC;
	private boolean flag = false;
	private int[][] F;
	private int[][] vec = {{-1,0},{0,1},{1,0},{0,-1}};
	private boolean[][] State;
	private Stack<Integer[]> stack;

	public void mainrun() {

		scan = new Scanner(System.in);

		while(true) {
			W = scan.nextInt();
			H = scan.nextInt();

			if(W == 0 || H == 0) {
				break;
			}

			F = new int[H + 2][W + 2];
			State = new boolean[H + 2][W + 2];

			for(int i = 0;i < H + 2 ;i++) {
				Arrays.fill(F[i],0);
				Arrays.fill(State[i], false);
			}

			startx = scan.nextInt();
			starty = scan.nextInt();

			goalx = scan.nextInt();
			goaly = scan.nextInt();

			N = scan.nextInt();

			stack = new Stack<>();

			flag = false;

			for(int i = 0;i < N ;i++) {
				int c = scan.nextInt();
				int d = scan.nextInt();
				int x = scan.nextInt();
				int y = scan.nextInt();

				for(int j = y;j < y + (d == 0 ? 2 : 4);j++ ) {
					for(int k = x;k < x + (d == 1 ? 2 : 4);k++) {
						F[j][k] = c;
					}
				}
			}

			baseC = F[starty][startx];

			State[starty][startx] = true;
			stack.push(new Integer[] {startx,starty});
			move();


			System.out.println(flag ? "OK" : "NG");
		}
		scan.close();
	}

	private void move() {

		while(!stack.empty()) {

			Integer[] point = stack.pop();
			int x = point[0];
			int y = point[1];

			if(x == goalx && y == goaly || flag) {
				flag = true;
				return;
			}

			for(int i = 0;i < 4;i++) {

				int nx = x + vec[i][1];
				int ny = y + vec[i][0];

				if( nx == 0 || nx == W + 1 || ny == 0 || ny == H + 1) {
					continue;
				}

				if(F[ny][nx] == baseC && !State[ny][nx]) {
					State[ny][nx] = true;
					stack.push(new Integer[] {nx,ny});
				}
			}
		}
	}
}

class Data{
	int x;
	int y;
	public Data(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
