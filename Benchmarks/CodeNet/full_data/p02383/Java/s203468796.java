import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dice = br.readLine().split(" ");
		String roll = br.readLine();
		ArrayList<Integer> spotY = new ArrayList<Integer>();
		ArrayList<Integer> spotX = new ArrayList<Integer>();
		spotY.add(5); spotY.add(1); spotY.add(2); spotY.add(6);
		spotX.add(4); spotX.add(1); spotX.add(3); spotX.add(6);
		for (int i = 0; i < roll.length(); i++) {
			switch (roll.substring(i, i + 1)) {
			case "N":
				spotY.add(spotY.get(0));
				spotY.remove(0);
				spotX.set(1, spotY.get(1));
				spotX.set(3, spotY.get(3));
				break;
			case "E":
				spotX.add(0, spotX.get(3));
				spotX.remove(4);
				spotY.set(1, spotX.get(1));
				spotY.set(3, spotX.get(3));
				break;
			case "S":
				spotY.add(0, spotY.get(3));
				spotY.remove(4);
				spotX.set(1, spotY.get(1));
				spotX.set(3, spotY.get(3));
				break;
			case "W":
				spotX.add(spotX.get(0));
				spotX.remove(0);
				spotY.set(1, spotX.get(1));
				spotY.set(3, spotX.get(3));
				break;
			}
		}
		System.out.println(dice[spotX.get(1) - 1]);
	}
}