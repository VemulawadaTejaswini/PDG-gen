import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
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
			byte[] puzzle = new byte[x*y];
			for(int i=0;i<x*y;i++) {
					puzzle[i] = in.nextByte();					
			}
			
			solve(puzzle);
		}
	}
	
	// [0の座標番号][2~3個の交換候補の座標]
	final static int[][] MOVABLE_PAIRS = {
		{1,4}, {0,2,4}, {1,3,6}, {2,7},
		{0,5}, {1,4,6}, {2,5,7}, {3,6}
	};
	
	boolean[] isVisit = new boolean[876543210+1];

	public class Puzzle {
		final byte[] answer = {0,1,2,3,4,5,6,7};
		// 0 1 2 3
		// 4 5 6 7
		
		final byte[] state;
		final int depth;
		final Puzzle parent;

		final int movablePiecePoint;
		
		protected Puzzle (int depth, byte[] state, Puzzle parent){
			this.depth = depth;
			this.state = state;
			this.parent = parent;
			
			int tmp = 0;
			for(int i=0;i<x*y;i++) {
				if(state[i]==0) {
					tmp = i;
					break;
				}
			}
			this.movablePiecePoint = tmp;
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
		 * @param point1,point2 交換するピースの位置番号
		 * @return 移動後の状態を表す配列
		 */
		protected byte[] move(int point1, int point2) {
			byte[] nextState = Arrays.copyOf(this.state, x*y);
			byte tmp = nextState[point1];
			nextState[point1] = nextState[point2];
			nextState[point2] = tmp;
			return nextState;
		}
		
		protected int visit(){
			int index = 0;
			for(int i=0;i<x*y;i++) {
				index += (Math.pow(10, i+1.0)*state[i]);
			}
			return index;
		}
		
		public String toString() {
			StringBuilder str = new StringBuilder("");
			for(byte n : state) {
				str.append(n);
			}
			return str.toString();
		}
	}
	
	private void solve(byte[] puzzle) {
		Deque<Puzzle> queue = new ArrayDeque<Puzzle>();
		queue.add(new Puzzle(0, puzzle, null));
		Puzzle now;
		while(queue.size()>0) {
			// キューの先頭の状態を取り出し,現在の状態を更新
			now = queue.poll();

			// 完成したかの確認 (キューが空なら打ち切り) 
			if(now.check()) {
				System.out.println(now.depth);
				
				break;
			}
			int index = now.visit();
			if(!isVisit[index]) { // 現在の状態が未生成の場合のみ,次の状態を生成する.
				// 現在の状態から1移動で生成される次の状態をすべて生成し,キューに入れる.						
				for(int nextMove : MOVABLE_PAIRS[now.movablePiecePoint]) {
					Puzzle next = new Puzzle(now.depth+1, now.move(now.movablePiecePoint,nextMove), now);
					queue.add(next);
				}
			}
			isVisit[now.visit()] = true;			
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}