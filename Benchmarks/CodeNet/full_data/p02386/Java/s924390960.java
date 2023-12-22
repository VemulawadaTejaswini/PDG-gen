import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Dice[] dices = new Dice[n];

		for (int i = 0; i < n; i++) {
			dices[i] = new Dice();
			for (int j = 0; j < 6; j++) {
				dices[i].faces.add(sc.nextInt());
			}
		}

		boolean hasSameDice = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 1; k <= 6; k++) {
					dices[j].roll(dices[i].getFace(k));
					for (int l = 0; l < 4; l++) {
						if (dices[i].getFace(2) == dices[j].getFace(2))break;
						dices[j].spin();
					}
					if (dices[i].getFace(1) == dices[j].getFace(1) &&
							dices[i].getFace(2) == dices[j].getFace(2) &&
							dices[i].getFace(3) == dices[j].getFace(3) &&
							dices[i].getFace(4) == dices[j].getFace(4) &&
							dices[i].getFace(5) == dices[j].getFace(5) &&
							dices[i].getFace(6) == dices[j].getFace(6)) {
						hasSameDice = true;
						break;
					}
				}
			}
			if (hasSameDice)break;
		}

		System.out.println(hasSameDice ? "No" : "Yes");

	}
}

class Dice {
	List<Integer> faces;

	public Dice() {
		this.faces = new ArrayList<Integer>();
		faces.add(0);
	}

	public void roll(int direction) {
		faces.set(0, faces.get(1));
		switch (faces.indexOf(direction)) {
		case 5:
			faces.set(1, faces.get(5));
			faces.set(5, faces.get(6));
			faces.set(6, faces.get(2));
			faces.set(2, faces.get(0));
			break;
		case 3:
			faces.set(1, faces.get(3));
			faces.set(3, faces.get(6));
			faces.set(6, faces.get(4));
			faces.set(4, faces.get(0));
			break;
		case 2:
			faces.set(1, faces.get(2));
			faces.set(2, faces.get(6));
			faces.set(6, faces.get(5));
			faces.set(5, faces.get(0));
			break;
		case 4:
			faces.set(1, faces.get(4));
			faces.set(4, faces.get(6));
			faces.set(6, faces.get(3));
			faces.set(3, faces.get(0));
			break;
		case 6:
			faces.set(1, faces.get(6));
			faces.set(6, faces.get(0));
			faces.set(0, faces.get(2));
			faces.set(2, faces.get(5));
			faces.set(5, faces.get(0));
			break;
		default:
			break;
		}
	}

	public void spin() {
		faces.set(0, faces.get(2));
		faces.set(2, faces.get(3));
		faces.set(3, faces.get(5));
		faces.set(5, faces.get(4));
		faces.set(4, faces.get(0));
	}

	public int getFace(int face) {
		return faces.get(face);
	}

}

