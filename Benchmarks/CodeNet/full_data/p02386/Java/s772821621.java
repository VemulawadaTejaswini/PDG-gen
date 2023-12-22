import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dice {
	public int[] value;
	public Dice(String[] info) {
		this.value = new int[6];
		for (int i = 0; i < value.length; i++) {
			this.value[i] = Integer.parseInt(info[i]);
		}
	}

	public int getTop( ) {
		return value[0];
	}

	public void rollingNorth() {
		int work = this.value[0];
		this.value[0] = this.value[1];
		this.value[1] = this.value[5];
		this.value[5] = this.value[4];
		this.value[4] = work;
	}

	public void rollingWest() {
		int work = this.value[0];
		this.value[0] = this.value[2];
		this.value[2] = this.value[5];
		this.value[5] = this.value[3];
		this.value[3] = work;
	}

	public void changeTop(int index) {
		if (index < 3) {
			rollingNorth();
		} else if (index == 3) {
			rollingWest();
		} else if (index == 4) {
			rollingWest();
			rollingWest();
		}
	}

	public void turn(String direction) {
		int work = 0;;
		if (direction.equals("S")) {
			// ?????????????¨??????¢
			work = this.value[1];
			this.value[1] = this.value[3];
			this.value[3] = this.value[4];
			this.value[4] = this.value[2];
			this.value[2] = work;
		} else {
			// ????????????????????¢
			work = this.value[0];
			this.value[0] = this.value[2];
			this.value[2] = this.value[5];
			this.value[5] = this.value[3];
			this.value[3] = work;
		}
	}

	public boolean isMatch(Dice target) {
		for (int i = 1; i < this.value.length; i++) {
			if (this.value[i] != target.value[i]) {
				return false;
			}
		}
		return true;
	}

	public boolean compare(Dice target) {
		boolean isMatch = false;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (this.getTop() != target.getTop()) break;
				isMatch = this.isMatch(target);
				if (isMatch) break;
				target.turn("S");
			}
			if (isMatch) break;
			target.changeTop(i);
		}
		if (isMatch) return true;
		else return false;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Dice[] diceArray = new Dice[n];
		for (int i = 0; i < n; i++) {
			diceArray[i] = new Dice(br.readLine().split(" "));
		}
		boolean isMatch = false;

		for (int i = 0; i < diceArray.length - 1; i++) {
			for (int j = i + 1; j < diceArray.length; j++) {
				isMatch = diceArray[i].compare(diceArray[j]);
				if (isMatch) break;
			}
			if (isMatch) break;
		}

		if (isMatch) System.out.println("No");
		else System.out.println("Yes");
	}
}