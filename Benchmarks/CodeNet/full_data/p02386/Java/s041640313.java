import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private String diceTop;
	private String diceFront;
	private String diceRight;
	private String diceLeft;
	private String diceBack;
	private String diceBottom;

	// ダイスのコンストラクタ
	Main(String top, String front, String right, String left, String back, String bottom) {
		setDiceTop(top);
		setDiceFront(front);
		setDiceRight(right);
		setDiceLeft(left);
		setDiceBack(back);
		setDiceBottom(bottom);
	}

	// ダイスのゲッター
	String getDiceTop() {
		return diceTop;
	}

	String getDiceFront() {
		return diceFront;
	}

	String getDiceRight() {
		return diceRight;
	}

	String getDiceLeft() {
		return diceLeft;
	}

	String getDiceBack() {
		return diceBack;
	}

	String getDiceBottom() {
		return diceBottom;
	}

	// ダイスのセッターメソッド
	void setDiceTop(String diceTop) {
		this.diceTop = diceTop;
	}

	void setDiceFront(String diceFront) {
		this.diceFront = diceFront;
	}

	void setDiceRight(String diceRight) {
		this.diceRight = diceRight;
	}

	void setDiceLeft(String diceLeft) {
		this.diceLeft = diceLeft;
	}

	void setDiceBack(String diceBack) {
		this.diceBack = diceBack;
	}

	void setDiceBottom(String diceBottom) {
		this.diceBottom = diceBottom;
	}

	@Override
	public boolean equals(Object obj) {
		// 引数のオブジェクトがDice型と一致するかチェック
		if (obj instanceof Main) {
			Main dice = (Main) obj;
			// ダイスの全面が一致しているときtrue
			if (this.diceTop.equals(dice.getDiceTop()) && this.diceFront.equals(dice.getDiceFront())
					&& this.diceRight.equals(dice.getDiceRight()) && this.diceLeft.equals(dice.getDiceLeft())
					&& this.diceBack.equals(dice.getDiceBack()) && this.diceBottom.equals(dice.getDiceBottom())) {
				return true;
			}
		}
		return false;
	}

	// メインメソッド
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numberOfDice = scan.nextInt();
		// ダイスのインスタンスの変数を格納するリスト
		List<Main> diceName = new ArrayList<>();

		for (int i = 0; i < numberOfDice; i++) {
			// ダイスのインスタンスの生成
			Main dice = new Main(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
			// ダイスのインスタンスを追加
			diceName.add(dice);
		}

		// サイコロの組み合わせ分ループ
		top: for (int i = 0; i < numberOfDice - 1; i++) {
			for (int j = 1; i + j < numberOfDice; j++) {
				// 入力の段階で全面一致しているとき
				if (diceName.get(i).equals(diceName.get(i + j))) {
					System.out.println("No");
					break top;
				} else {
					// 北側に4回転
					for (int countN = 0; countN < 4; countN++) {
						diceName.get(i).diceRoll("N");

						// 回転するたびに上面をチェック
						if (diceName.get(i).getDiceTop().equals(diceName.get(i + j).getDiceTop())) {
							// 上面が一致したら側面と底面のチェック
							if (diceName.get(i).equals(diceName.get(i + j))) {
								// 全面一致したいたら脱ループ
								System.out.println("No");
								diceName.get(i).printNumber();
								break top;

								// 側面のうち一つが一致しないとき
							} else {
								// 右に最大３回転
								for (int countR = 0; countR < 3; countR++) {
									diceName.get(i).diceRoll("R");

									// 回転するたび側面と底面の一致をチェック
									if (diceName.get(i).equals(diceName.get(i + j))) {
										// 全面合っていたらループ脱
										System.out.println("No");
										break top;
									}
								}
							}
						}
					}
					if (diceName.get(i).equals(diceName.get(i + j))) {
						System.out.println("No");
						diceName.get(i).printNumber();
						break top;
					} else {
						// 次は東側で出る面をチェック
						for (int countE = 0; countE < 4; countE++) {
							// 東側に4回転
							diceName.get(i).diceRoll("E");

							// 回転するたびに上面をチェック
							if (diceName.get(i).getDiceTop().equals(diceName.get(i + j).getDiceTop())) {
								// 上面が一致したら側面と底面のチェック
								if (diceName.get(i).equals(diceName.get(i + j))) {
									// 全面合っていたら脱ループ
									System.out.println("No");
									break top;
									// 側面のうち一つが一致しないとき
								} else {
									// 右に最大３回転
									for (int countR = 0; countR < 3; countR++) {
										diceName.get(i).diceRoll("R");

										// 回転するたび側面と底面の一致をチェック
										if (diceName.get(i).equals(diceName.get(i + j))) {
											// 全面合っていたらループ脱
											System.out.println("No");
											break top;
										}
									}
								}
							}
						}

					}
				}
				// 同じサイコロが一組でもあった場合
				if (diceName.get(i).equals(diceName.get(i + j))) {
					System.out.println("No");
					diceName.get(i).printNumber();
					break top;
				} else {
					if (i + j == numberOfDice - 1) {
						// サイコロがすべて異なるとき
						System.out.println("Yes");
						break top;
					}
				}
				scan.close();
			} // 2番目のfor分
		} // 一番頭のfor文

		scan.close();

	}

	// ダイスを振ったときに上に来る目が変わる
	void diceRoll(String direction) {
		for (int i = 0; i < direction.length(); i++) {
			String letterDirection = String.valueOf(direction.charAt(i));

			if (letterDirection.equals("E")) {
				// サイコロが東側に転がる
				String change = getDiceTop();
				setDiceTop(getDiceLeft());
				setDiceLeft(getDiceBottom());
				setDiceBottom(getDiceRight());
				setDiceRight(change);

				// サイコロが南側に転がる
			} else if (letterDirection.equals("S")) {
				String change = getDiceTop();
				setDiceTop(getDiceBack());
				setDiceBack(getDiceBottom());
				setDiceBottom(getDiceFront());
				setDiceFront(change);
				;
				// ダイスが西側に転がる
			} else if (letterDirection.equals("W")) {
				String change = getDiceTop();
				setDiceTop(getDiceRight());
				setDiceRight(getDiceBottom());
				setDiceBottom(getDiceLeft());
				setDiceLeft(change);

				// ダイスが北側に転がる
			} else if (letterDirection.equals("N")) {
				String change = getDiceTop();
				setDiceTop(getDiceFront());
				setDiceFront(getDiceBottom());
				setDiceBottom(getDiceBack());
				setDiceBack(change);

				// ダイスが左向きに回転する
			} else if (letterDirection.equals("L")) {
				String change = getDiceFront();
				setDiceFront(getDiceRight());
				setDiceRight(getDiceBack());
				setDiceBack(getDiceLeft());
				setDiceLeft(change);

				// ダイスが右向きに回転
			} else if (letterDirection.equals("R")) {
				String change = getDiceFront();
				setDiceFront(getDiceLeft());
				setDiceLeft(getDiceBack());
				setDiceBack(getDiceRight());
				setDiceRight(change);
			}
		}
	}

	// ダイスの目をすべて出力(確認用)
	void printNumber() {
		System.out.print(getDiceTop());
		System.out.print(getDiceFront());
		System.out.print(getDiceRight());
		System.out.print(getDiceLeft());
		System.out.print(getDiceBack());
		System.out.println(getDiceBottom());
	}
}

