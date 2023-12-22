import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/**
 * AIZU 0121
 */
public class Main {
	
	private int x = 2;
	private int y = 4;
	private boolean[] isVisit = new boolean[76543210+1];

	private Main() {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			int[] puzzle = new int[x*y];
			for(int i=0;i<x*y;i++) {
				puzzle[i] = in.nextInt();
			}
			Arrays.fill(isVisit,false);
			System.out.println(solve(puzzle));
		}
		in.close();	
	}
	
	// [0の座標番号][2~3個の交換候補の座標]
	final static int[][] MOVABLE_PAIRS = {
		{1,4}, {0,2,5}, {1,3,6}, {2,7},
		{0,5}, {1,4,6}, {2,5,7}, {3,6}
	};
	
	public class Puzzle {
		// 座標番号
		// 0 1 2 3
		// 4 5 6 7		
		final int[] state; // パズルの状態
		
		final int depth; // 深さ(操作回数)
		final Puzzle parent; // 親状態（デバッグ用）

		final int movablePiecePoint; // パズル内にある動かせるピースの座標 
		final int stateCode; // 状態で一意に決まるindex(枝狩り用)
		
		protected Puzzle (int depth, int[] state, Puzzle parent){
			this.depth = depth;
			this.state = state;
			this.parent = parent;
			
			// 0(動かせるピース)の座標を探索
			int tmp = 0;
			for(int i=0;i<x*y;i++) {
				if(state[i]==0) {
					tmp = i;
					break;
				}
			}
			this.movablePiecePoint = tmp;
			
			// 状態コードの計算
			int index = 0;
			for(int i=0;i<x*y;i++) {
				index += (Math.pow(10, i)*state[i]);
			}
			this.stateCode = index;
		}
		
		/**
		 * 完成形になったかのチェック
		 * @return 完成していればtrue
		 */
		private boolean check() {
			for(int i=0;i<x*y;i++) {
				if(this.state[i] != i) {
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
		protected int[] move(int point1, int point2) {
			int[] nextState = Arrays.copyOf(this.state, x*y);
			int tmp = nextState[point1];
			nextState[point1] = nextState[point2];
			nextState[point2] = tmp;
			return nextState;
		}
		
		public String toString() {
			StringBuilder str = new StringBuilder("");
			for(int n : state) {
				str.append(n);
			}
			return str.toString();
		}
	}
	
	/**
	 * パズルを解く
	 * @param puzzle 初期状態
	 * @return 操作回数
	 */
	private String solve(int[] puzzle) {
		ArrayDeque<Puzzle> queue = new ArrayDeque<Puzzle>();
		queue.add(new Puzzle(0, puzzle, null));
		Puzzle now;
		while(queue.size()>0) {
			// キューの先頭の状態を取り出し,現在の状態を更新
			now = queue.poll();

			// 完成したかの確認
			if(now.check()) {
				return ""+now.depth;
			}

			if(!isVisit[now.stateCode]) { // 枝狩り
				// 現在の状態から1移動で生成される次の状態をすべて生成し,キューに入れる.						
				for(int nextMove : MOVABLE_PAIRS[now.movablePiecePoint]) {
					queue.add(new Puzzle(now.depth+1, now.move(now.movablePiecePoint,nextMove), now));
				}
			}
			isVisit[now.stateCode] = true;
		}
		return "";
	}
	
	public static void main(String[] args) {
		new Main();
	}

}