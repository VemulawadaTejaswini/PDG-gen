import java.util.Scanner;

public class Main {
	private String diceEyes1;
	private String diceEyes2;
	private String diceEyes3;
	private String diceEyes4;
	private String diceEyes5;
	private String diceEyes6;

	// ダイスのゲッター
	String getDiceEyes1() {
		return diceEyes1;
	}

	String getDiceEyes2() {
		return diceEyes2;
	}

	String getDiceEyes3() {
		return diceEyes3;
	}

	String getDiceEyes4() {
		return diceEyes4;
	}

	String getDiceEyes5() {
		return diceEyes5;
	}

	String getDiceEyes6() {
		return diceEyes6;
	}

	// ダイスのセッターメソッド
	void setDiceEyes1(String diceEyes1) {
		this.diceEyes1 = diceEyes1;
	}

	void setDiceEyes2(String diceEyes2) {
		this.diceEyes2 = diceEyes2;
	}

	void setDiceEyes3(String diceEyes3) {
		this.diceEyes3 = diceEyes3;
	}

	void setDiceEyes4(String diceEyes4) {
		this.diceEyes4 = diceEyes4;
	}

	void setDiceEyes5(String diceEyes5) {
		this.diceEyes5 = diceEyes5;
	}

	void setDiceEyes6(String diceEyes6) {
		this.diceEyes6 = diceEyes6;
	}

	@Override
	public boolean equals(Object obj) {
		// 引数のオブジェクトがMain型と一致するかチェック
		if (obj instanceof Main) {
			Main dice = (Main) obj;
			// ダイスの全面が一致しているときtrue
			if (this.diceEyes1.equals(dice.getDiceEyes1()) && this.diceEyes2.equals(dice.getDiceEyes2())
					&& this.diceEyes3.equals(dice.getDiceEyes3()) && this.diceEyes4.equals(dice.getDiceEyes4())
					&& this.diceEyes5.equals(dice.getDiceEyes5()) && this.diceEyes6.equals(dice.getDiceEyes6())) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// インスタンスの作成(サイコロの目はすべて入力)
		Main dice = new Main(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
		Main dice2 = new Main(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next());


		//入力の段階で全面一致しているとき
		if (dice.equals(dice2)) {
			System.out.println("Yes");
		}else{
			// 北側に4回転
			top:for (int i = 0; i < 4; i++) {
				dice.diceRoll("N");

				// 回転するたびに上面をチェック
				if (dice.getDiceEyes1().equals(dice2.getDiceEyes1())) {
					// 上面が一致したら側面と底面のチェック
					if (dice.equals(dice2)) {
						// 全面合っていたら脱ループ
						break;
						// 側面のうち一つが一致しないとき
					} else {
						// 右に最大３回転
						for (int j = 0; j < 3; j++) {
							dice.diceRoll("R");

							// 回転するたび側面と底面の一致をチェック
							if (dice.equals(dice2)) {
								// 全面合っていたらループ脱
								break top;
							}
						}
					}
				}
			}
			if (dice.equals(dice2)) {
				System.out.println("Yes");
			} else {
				// 次は東側で出る面をチェック
				top:for (int i = 0; i < 4; i++) {
					// 東側に4回転
					dice.diceRoll("E");

					// 回転するたびに上面をチェック
					if (dice.getDiceEyes1().equals(dice2.getDiceEyes1())) {
						// 上面が一致したら側面と底面のチェック
						if (dice.equals(dice2)) {
							// 全面合っていたら脱ループ
							break;
							// 側面のうち一つが一致しないとき
						} else {
							// 右に最大３回転
							for (int j = 0; j < 3; j++) {
								dice.diceRoll("R");

								// 回転するたび側面と底面の一致をチェック
								if (dice.equals(dice2)) {
									// 全面合っていたらループ脱
									break top;
								}
							}
						}
					}
				}
				if (dice.equals(dice2)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
		scan.close();
	}

	// ダイスのコンストラクタ
	Main(String one, String two, String three, String four, String five, String six) {
		getNumber(one, two, three, four, five, six);
	}

	// ダイスの目に数字を振り分けるメソッド
	void getNumber(String one, String two, String three, String four, String five, String six) {
		setDiceEyes1(one);
		setDiceEyes2(two);
		setDiceEyes3(three);
		setDiceEyes4(four);
		setDiceEyes5(five);
		setDiceEyes6(six);
	}

	// ダイスを振ったときに上に来る目を変えるメソッド
	void diceRoll(String direction) {
		for (int i = 0; i < direction.length(); i++) {
			String letterDirection = String.valueOf(direction.charAt(i));

			// サイコロが東側に転がったとき
			if (letterDirection.equals("E")) {
				String change = getDiceEyes1();
				setDiceEyes1(getDiceEyes4());
				setDiceEyes4(getDiceEyes6());
				setDiceEyes6(getDiceEyes3());
				setDiceEyes3(change);

				// サイコロが南側に転がったとき
			} else if (letterDirection.equals("S")) {
				String change = getDiceEyes1();
				setDiceEyes1(getDiceEyes5());
				setDiceEyes5(getDiceEyes6());
				setDiceEyes6(getDiceEyes2());
				setDiceEyes2(change);
				;
				// ダイスが西側に転がったとき
			} else if (letterDirection.equals("W")) {
				String change = getDiceEyes1();
				setDiceEyes1(getDiceEyes3());
				setDiceEyes3(getDiceEyes6());
				setDiceEyes6(getDiceEyes4());
				setDiceEyes4(change);

				// ダイスが北側に転がったとき
			} else if (letterDirection.equals("N")) {
				String change = getDiceEyes1();
				setDiceEyes1(getDiceEyes2());
				setDiceEyes2(getDiceEyes6());
				setDiceEyes6(getDiceEyes5());
				setDiceEyes5(change);

				// ダイスが左向きに回転したとき
			} else if (letterDirection.equals("L")) {
				String change = getDiceEyes2();
				setDiceEyes2(getDiceEyes3());
				setDiceEyes3(getDiceEyes5());
				setDiceEyes5(getDiceEyes4());
				setDiceEyes4(change);

				// ダイスが右向きに回転したとき
			} else if (letterDirection.equals("R")) {
				String change = getDiceEyes2();
				setDiceEyes2(getDiceEyes4());
				setDiceEyes4(getDiceEyes5());
				setDiceEyes5(getDiceEyes3());
				setDiceEyes3(change);

			}
		}

	}

}

