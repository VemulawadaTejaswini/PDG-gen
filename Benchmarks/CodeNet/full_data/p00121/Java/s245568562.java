import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * AIZU 0121
 */
public class Main {
	private final int x = 2;
	private final int y = 4;
	final int size = x*y;

	// [0の座標番号][交換候補の座標]
	private final static byte[][] MOVABLE_PAIRS = {
		{1,4}, {0,2,5}, {1,3,6}, {2,7},
		{0,5}, {1,4,6}, {2,5,7}, {3,6}
	};

	// 既に生成した状態かどうかを管理するフラグセット
	private BitSet isVisit = new BitSet(76543211);
	
	// 完成形の状態コード
	private final int answerStateCode = 1234567;
	
	// stateを整数に変換する際の係数
	private final static int[] coefficients = {10000000,1000000,100000,10000,1000,100,10,1};
	
	private Main() {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			byte[] puzzle = new byte[size];
			for(int i=0; i<size; i++) {
				puzzle[i] = in.nextByte();
			}
			System.out.println(solve(puzzle));
			isVisit.clear();
		}
		in.close();
	}
	
	
	class Puzzle {
		// 座標番号
		// 0 1 2 3
		// 4 5 6 7
		final byte[] state; // パズルの状態
		
		final int depth; // 深さ(操作回数)

		final int movablePiecePoint; // パズル内にある動かせるピースの座標 
		final int stateCode; // 状態で一意に決まるindex(枝狩り用)
		
		protected Puzzle (int depth, byte[] state){
			this.depth = depth;
			this.state = state;
			
			// 0(動かせるピース)の座標を探索
			int tmp = 0;
			for(int i=0;i<size;i++) {
				if(state[i]==0) {
					tmp = i;
					break;
				}
			}
			this.movablePiecePoint = tmp;
			
			// 状態コードの計算
			int index = 0;
			for(int i=0; i<size; i++) {
				index += coefficients[i]*state[i];
			}
			this.stateCode = index;
		}
		
		/**
		 * 次の状態を生成する
		 * @param point1,point2 交換するピースの位置番号
		 * @return 移動後の状態を表す配列
		 */
		protected byte[] move(int point1, int point2) {
			byte[] nextState = new byte[size];
			for(int i=0;i<size;i++) {
				if(i==point1) {
					nextState[i] = state[point2];
				} else if(i==point2) {
					nextState[i] = state[point1];
				} else {
					nextState[i] = state[i];
				}
			}
			
			/*
			byte[] nextState = Arrays.copyOf(this.state, size);
			byte tmp = nextState[point1];
			nextState[point1] = nextState[point2];
			nextState[point2] = tmp;*/
			return nextState;
		}
	}
	
	/**
	 * パズルを解く
	 * @param puzzle 初期状態
	 * @return 操作回数
	 */
	private String solve(byte[] puzzle) {
		LinkedList<Puzzle> queue = new LinkedList<Puzzle>();
		queue.add(new Puzzle(0, puzzle));
		Puzzle now;
		while(!queue.isEmpty()) {
			// キューの先頭の状態を取り出し,現在の状態を更新
			now = queue.poll();

			// 完成したかどうかの確認
			if(answerStateCode == now.stateCode) {
				return ""+now.depth;
			}

			if(!isVisit.get(now.stateCode)) { // 枝狩りが可能かチェック
				// 現在の状態から1移動で生成される次の状態をすべて生成し,キューに入れる.						
				for(int nextMove : MOVABLE_PAIRS[now.movablePiecePoint]) {
					queue.add(new Puzzle(now.depth+1, now.move(now.movablePiecePoint, nextMove)));
				}
			}
			isVisit.set(now.stateCode, true);
		}
		return "";
	}
	
	public static void main(String[] args) {
		new Main();
	}

}