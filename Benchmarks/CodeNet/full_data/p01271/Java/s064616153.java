import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static char[][] squaresL;
	static char[][] squaresR;
	static boolean[][][][] isVisited;
	//動き方(左で言うと上下左右)
	static int[][] leftMove = {{0,1},{0,-1},{-1,0},{1,0}};
	static int[][] rightMove = {{0,1},{0,-1},{1,0},{-1,0}};
	static int H;
	static int W;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			W = sc.nextInt();
			H = sc.nextInt();

			if((W|H) == 0) {
				break;
			}
			String rawL="";
			String rawR="";

			squaresL = new char[H][W];
			squaresR = new char[H][W];

			for(int h = 0; h < H; h++) {
				rawL=sc.next();
				rawR=sc.next();
				for(int w = 0; w < W; w++) {
					squaresL[h][w] = rawL.charAt(w);
					squaresR[h][w] = rawR.charAt(w);
				}
			}

			int initLh =0;
			int initLw=0;
			int initRh=0;
			int initRw=0;
			for(int h = 0; h < H; h++) {
				for(int w = 0; w < W; w++) {
					if(squaresL[h][w]=='L') {
						initLh = h;
						initLw=w;
					}
					if(squaresR[h][w]=='R') {
						initRh=h;
						initRw=w;
					}
				}
			}

			//Rin Lenの場所セットを一括で管理する
			//左の高さ、横、右の高さ、横
			isVisited = new boolean[H][W][H][W];
			isVisited[initLh][initLw][initRh][initRw] = true;

			Queue<int[]> q = new ArrayDeque<int[]>();

			//左の高さ、横、右の高さ、横
			q.add(new int[]{initLh, initLw, initRh, initRw});

			int[] nowSquares;

			boolean isYes = false;

			while(!q.isEmpty()) {
				nowSquares = (int[]) q.poll();
				//次のステップの状態を見る
				for(int i = 0;i< 4 ; i++) {
					int[] nextSquares = getNext(nowSquares, i);
					int nextLh=nextSquares[0];
					int nextLw=nextSquares[1];
					int nextRh=nextSquares[2];
					int nextRw=nextSquares[3];

					//すでに訪れたことがあるなら無視
					if(isVisited[nextLh][nextLw][nextRh][nextRw] == true) {
						continue;
					}else if(squaresL[nextLh][nextLw]=='%' && squaresR[nextRh][nextRw] == '%'){
						//同時に扉につくならYesを出力
						isYes=true;
						break;

					}else if(squaresL[nextLh][nextLw]=='%' || squaresR[nextRh][nextRw] == '%') {
						//片方のみ先に扉につくなら無視
						continue;
					}else {
						//次のステップに進む場合、フラグを立ててキューに入れる
						isVisited[nextLh][nextLw][nextRh][nextRw] = true;
						q.add(nextSquares);
					}
				}

			}
			if(isYes) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

		}

	}

	static int[] getNext(int[] nowSquares, int idx) {
		int nowLh = nowSquares[0];
		int nowLw = nowSquares[1];
		int nowRh = nowSquares[2];
		int nowRw = nowSquares[3];

		int nextLh;
		int nextLw;
		int nextRh;
		int nextRw;

		if(nowLh + leftMove[idx][1] < 0 || nowLh + leftMove[idx][1] >= H
				|| nowLw + leftMove[idx][0] < 0 || nowLw + leftMove[idx][0] >= W) {
			//左が範囲外に出る場合
			nextLh = nowLh;
			nextLw = nowLw;
		}else {
			//左が範囲内へ動く場合
			char nextL = squaresL[nowLh + leftMove[idx][1]][nowLw + leftMove[idx][0]];

			if(nextL =='#') {
				//行き先が壁
				nextLh = nowLh;
				nextLw = nowLw;
			}else {
				//移動する
				nextLh = nowLh + leftMove[idx][1];
				nextLw = nowLw + leftMove[idx][0];
			}
		}

		if(nowRh + rightMove[idx][1] < 0 || nowRh + rightMove[idx][1] >= H
				|| nowRw + rightMove[idx][0] < 0 || nowRw + rightMove[idx][0] >= W) {
			//右が範囲外に出る場合
			nextRh = nowRh;
			nextRw = nowRw;
		}else {
			//右が範囲内へ動く場合
			char nextR = squaresR[nowRh + rightMove[idx][1]][nowRw + rightMove[idx][0]];

			if(nextR =='#') {
				//行き先が壁
				nextRh = nowRh;
				nextRw = nowRw;
			}else {
				//移動する
				nextRh = nowRh + rightMove[idx][1];
				nextRw = nowRw + rightMove[idx][0];
			}
		}

		return new int[] {nextLh, nextLw, nextRh, nextRw};
	}
}
