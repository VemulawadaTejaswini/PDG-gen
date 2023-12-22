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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// インスタンスの作成
		Main dice = new Main(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
		// サイコロを振り、上に来る目を変えるメソッド
		dice.diceRoll(scan.next());
		System.out.println(dice.getDiceEyes1());
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
				String change = diceEyes1;
				diceEyes1 = diceEyes4;
				diceEyes4 = diceEyes6;
				diceEyes6 = diceEyes3;
				diceEyes3 = change;
				// サイコロが南側に転がったとき
			} else if (letterDirection.equals("S")) {
				String change = diceEyes1;
				diceEyes1 = diceEyes5;
				diceEyes5 = diceEyes6;
				diceEyes6 = diceEyes2;
				diceEyes2 = change;
				// ダイスが西側に転がったとき
			} else if (letterDirection.equals("W")) {
				String change = diceEyes1;
				diceEyes1 = diceEyes3;
				diceEyes3 = diceEyes6;
				diceEyes6 = diceEyes4;
				diceEyes4 = change;
				// ダイスが北側に転がったとき
			} else if (letterDirection.equals("N")) {
				String change = diceEyes1;
				diceEyes1 = diceEyes2;
				diceEyes2 = diceEyes6;
				diceEyes6 = diceEyes5;
				diceEyes5 = change;
			}

		}

	}

}

