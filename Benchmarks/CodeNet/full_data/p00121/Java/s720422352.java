package exp0121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * AIZU 0121
 */
public class Main {
	
	private Scanner in = new Scanner(System.in);
	
	private int x = 2;
	private int y = 4;
	
	private Main() {		
		while(true) {
			int[] pazzle = new int[x*y];
			for(int i=0;i<x*y;i++) {
					pazzle[i] = in.nextInt();					
			}
			
			solve(pazzle);
		}
	}
	
	final static int[][] MOVABLE_PAIRS = {
		{0,1}, {0,4}, {1,2}, {1,5},
		{2,3}, {2,6}, {3,7},
		{4,5}, {5,6}, {6,7}
	};

	public class Puzzle {
		final int[] answer = {0,1,2,3,4,5,6,7};
		// 0 1 2 3
		// 4 5 6 7
		
		final int[] state;
		final int depth;
		
		protected Puzzle (int depth, int[] state){
			this.depth = depth;
			this.state = state;
		}
		
		private boolean check() {
			for(int i=0;i<x*y;i++) {
				if(this.state[i] != answer[i]) {
						return false;
				}
			}
			return true;
		}
		
		/**
		 * 次の状態を生成する
		 * @param movablePair 動かすindexのペア
		 * @return 移動後の状態を表す配列
		 */
		protected int[] move(int[] movablePair) {
			int[] nextState = Arrays.copyOf(this.state, this.state.length);
			int tmp = nextState[movablePair[0]];
			nextState[movablePair[0]] = nextState[movablePair[1]];
			nextState[movablePair[1]] = tmp;
			return nextState;
		}
		
	}
	
	
	private void solve(int[] puzzle) {
		ArrayList<Puzzle> queue = new ArrayList<Puzzle>();
		Puzzle now = new Puzzle(0,puzzle);
		while(true) {
			// 完成したかの確認 
			if(now.check()) {
				System.out.println(now.depth);
				break;
			}
		
			// 現在の状態から1移動で生成される次の状態をすべて生成し,キューに入れる.						
			for(int[] nextMove : MOVABLE_PAIRS) {
				queue.add(new Puzzle(now.depth+1,now.move(nextMove)));
			}
			
			// キューの先頭の状態を取り出し,現在の状態を更新
			now = queue.remove(0);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main();
	}

}