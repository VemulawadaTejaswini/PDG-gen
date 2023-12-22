import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dice {
	public String[] value;
	public Dice(String[] info, int size) {
		this.value = new String[size];
		for (int i = 0; i < size; i++) {
			this.value[i] = info[i];
		}
	}
}

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dice dice = new Dice(br.readLine().split(" "), 6);
		String[] commands = br.readLine().split("");

		for (String command : commands) {
			String work = dice.value[0];
			if (command.equals("N")) {
				dice.value[0] = dice.value[1];
				dice.value[1] = dice.value[5];
				dice.value[5] = dice.value[4];
				dice.value[4] = work;
			} else if (command.equals("E")) {
				dice.value[0] = dice.value[3];
				dice.value[3] = dice.value[5];
				dice.value[5] = dice.value[2];
				dice.value[2] = work;
			} else if (command.equals("W")) {
				dice.value[0] = dice.value[2];
				dice.value[2] = dice.value[5];
				dice.value[5] = dice.value[3];
				dice.value[3] = work;
			} else {
				dice.value[0] = dice.value[4];
				dice.value[4] = dice.value[5];
				dice.value[5] = dice.value[1];
				dice.value[1] = work;
			}
		}
		System.out.println(dice.value[0]);
	}
}