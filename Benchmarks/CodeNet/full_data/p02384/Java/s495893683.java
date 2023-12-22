import java.util.Scanner;

/**
 * 鈴木くんのプログラムを元（参考）に作成 クラス内の変数を直接読み込ませないようにカプセル化（？）をしてみたが、
 * 果たしてこれがカプセル化なのかがわからない…
 * 
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Dice2 dc = new Dice2();
		dc.dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		int q = sc.nextInt();
		int top, front;
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			top = sc.nextInt();
			front = sc.nextInt();
			r[i] = dc.getRight(top, front);
		}

		for (int i = 0; i < q; i++) {
			System.out.println(r[i]);
		}
		sc.close();// Scannerを閉じる
	}

}

/**
 * Dice2クラス ダイスの面に数字をインプットする。回転させたりする。
 * 
 *
 */
class Dice2 {
	private int T, S, E, W, N, U;

	Dice2() {
		this.T = 0; // Top
		this.S = 0;
		this.E = 0;
		this.W = 0;
		this.N = 0;
		this.U = 0; // Under
	}

	/**
	 * Diceに数字をインプットする
	 * @param T_1	真上
	 * @param S_2	南
	 * @param E_3	東
	 * @param W_4	西
	 * @param N_5	北
	 * @param U_6	真下
	 */
	void dice(int T_1, int S_2, int E_3, int W_4, int N_5, int U_6) {
		this.T = T_1; // Top
		this.S = S_2;
		this.E = E_3;
		this.W = W_4;
		this.N = N_5;
		this.U = U_6; // Under
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * 南方向にサイコロを傾ける
	 */
	void MoveSouth() {
		int a = T;
		T = N;
		N = U;
		U = S;
		S = a;
	}

	void MoveEast() {
		int a = T;
		T = W;
		W = U;
		U = E;
		E = a;
	}

	void MoveNorth() {
		int a = T;
		T = S;
		S = U;
		U = N;
		N = a;
	}

	void MoveWest() {
		int a = T;
		T = E;
		E = U;
		U = W;
		W = a;
	}

	void right() {// 時計周りの回転
		int a = S;
		S = E;
		E = N;
		N = W;
		W = a;
	}

	/**
	 * 
	 * @param t 真上の数字（上面）
	 * @param f 南側の数字（前面）
	 * @return 東側（側面）の求めるべき数字
	 */
	int getRight(int t, int f) {
		for (int i = 0; i < 3; i++) {
			if (t == T) {
				break;
			}
			MoveNorth();
			if (t == T) {
				break;
			}
			MoveWest();
		}
		for (int i = 0; i < 3; i++) {
			if (f == S) {
				break;
			}
			right();
		}
		return E;
	}

}
