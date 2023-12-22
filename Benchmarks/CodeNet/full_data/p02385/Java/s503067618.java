import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		dice1.createDice(in.readLine().split(" "));
		dice2.createDice(in.readLine().split(" "));

		dice1.check(dice2);
	}
}

class Dice {
	public int on, tw, th, fo, fi, si;

	public Dice() {

	}

	public Dice(int on, int tw, int th, int fo, int fi, int si) {
		this.on = on;
		this.tw = tw;
		this.th = th;
		this.fo = fo;
		this.fi = fi;
		this.si = si;
	}

	void createDice(String[] data) {
		int[] diceNums = new int[6];
		for (int i = 0; i < data.length; i++) {
			diceNums[i] = Integer.parseInt(data[i]);
		}
		on = diceNums[0];
		tw = diceNums[1];
		th = diceNums[2];
		fo = diceNums[3];
		fi = diceNums[4];
		si = diceNums[5];
	}

	void check(Dice otherDice) {
		boolean result = false;
		int checkTimes = 1;
		while (checkTimes <= 25) {
			while (checkTimes <= 5) {
				result = this.match(otherDice);
				if (result)
					break;
				checkTimes++;
				if (checkTimes == 5) {
					otherDice.south();
				} else {
					otherDice.east();
				}
			}
			if (result)
				break;
			while (checkTimes <= 10) {
				result = this.match(otherDice);
				if (result)
					break;
				checkTimes++;
				if (checkTimes == 10) {
					otherDice.south();
				} else {
					otherDice.east();
				}
			}
			if (result)
				break;
			while (checkTimes <= 15) {
				result = this.match(otherDice);
				if (result)
					break;
				checkTimes++;
				if (checkTimes == 15) {
					otherDice.south();
				} else {
					otherDice.east();
				}
			}
			if (result)
				break;
			while (checkTimes <= 20) {
				result = this.match(otherDice);
				if (result)
					break;
				checkTimes++;
				if (checkTimes == 20) {
					otherDice.south();
				} else {
					otherDice.east();
				}
			}
			if (result)
				break;
			while (checkTimes < 25) {
				result = this.match(otherDice);
				if (result)
					break;
				checkTimes++;
				otherDice.east();
			}
			if (result)
				break;
		}

		if (result) {
			System.out.println("Yes"); // ?????´??????
		} else {
			System.out.println("No"); // ?????´?????????
		}
	}

	boolean match(Dice otherDice) {
		if (this.on == otherDice.on && this.tw == otherDice.tw
				&& this.th == otherDice.th && this.fo == otherDice.fo
				&& this.fi == otherDice.fi && this.si == otherDice.si) {
			return true;
		}
		return false;
	}

	public void north() {
		int temp = on;
		on = tw;
		tw = si;
		si = fi;
		fi = temp;
	}

	public void east() {
		int temp = on;
		on = fo;
		fo = si;
		si = th;
		th = temp;
	}

	public void west() {
		int temp = on;
		on = th;
		th = si;
		si = fo;
		fo = temp;
	}

	public void south() {
		int temp = on;
		on = fi;
		fi = si;
		si = tw;
		tw = temp;
	}
}