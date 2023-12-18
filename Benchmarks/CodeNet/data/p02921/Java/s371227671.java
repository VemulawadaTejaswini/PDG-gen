import java.util.Scanner;

public class Main {

	static Main instance = new Main();
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値(N)
		int numN = scan.nextInt();

		//入力値リスト
		int[][] list = new int[numN][numN - 1];

		//Fightリスト(昇順)
		Fight[][] fightList = new Fight[numN][numN];

		// 入力値の読み取り
		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numN - 1; j++) {
				list[i][j] = scan.nextInt() - 1;
			}
		}

		// Fightのインスタンスを作る
		for (int i = 0; i < numN; i++) {
			for (int j =0; j < numN; j++) {
				if (i > j) {
					fightList[i][j] = fightList[j][i];
				} else if (i < j){
					fightList[i][j] = instance.new Fight(i, j);
				}
			}
		}

		// Fightの入れ子を作る
		for (int i = 0; i < numN; i++) {
			for (int j = 1; j < numN - 1; j++) {
				int before = list[i][j-1];
				int next = list[i][j];

				Fight befFight = fightList[i][before];
				Fight nextFight = fightList[i][next];

				nextFight.setBefore(befFight);
			}
		}

		int max = 1;
		for (Fight[] f1: fightList) {
			for (Fight f: f1) {
				if (f != null && f.getLength() > max) {
					max = f.getLength();
				}
			}
		}

		for (Fight[] f1: fightList) {
			for (Fight f: f1) {
				if (f != null && !f.check()) {
					max = -1;
				}
			}
		}

		System.out.println(max);
	}

	public class Fight {
		int base;
		int enemy;
		int length;
		Fight before1;
		Fight before2;

		public Fight(int base, int enemy) {
			this.base = base;
			this.enemy = enemy;
			this.length = 1;
		}

		public void setBefore(Fight before) {

			if (this.before1 == null) {
				this.before1 = before;
			} else {
				this.before2 = before;
			}

			if (this.before2 == null) {
				this.length = this.before1.length + 1;
			} else {
				this.length = Math.max(this.before1.length, this.before2.length) + 1;
			}
		}

		public int getLength() {
			return length;
		}

		public boolean check() {

			if (before1 == null) {
				return true;
			} else if (before2 == null) {
				return this.length >= before1.getLength();
			} else {
				return this.length >= before1.getLength() && this.length >= before2.getLength();
			}
		}
	}
}