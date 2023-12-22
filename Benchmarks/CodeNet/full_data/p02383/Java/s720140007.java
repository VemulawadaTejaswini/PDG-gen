import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String[] line = sc.nextLine().split(" ");

		int[] label = new int[line.length];
		for (int i=0; i < label.length; i++) {
			label[i] = Integer.parseInt(line[i]);
		}

		char[] order = sc.nextLine().toCharArray();

		Dice d = new Dice(label);

		for (int i=0; i < order.length; i++) {
			d.koroOrKaiten(order[i]);
		}

		System.out.println(d.ue);
	}

}

class Dice {
	int ue,mae,migi,hidari,ushiro,shita;

	int[] label = {
			this.ue, this.mae,
			this.migi, this.hidari,
			this.ushiro, this.shita,
	};

	Dice(int[] label) {
		ue = label[0];
		mae = label[1];
		migi = label[2];
		hidari = label[3];
		ushiro = label[4];
		shita = label[5];
	}

	Dice koroOrKaiten(char newsrl) {
		int temp = 0;

		switch (newsrl) {
		case 'N':
			temp = ue;
			ue = mae;
			mae = shita;
			shita =ushiro;
			ushiro = temp;
			break;
		case 'S':
			temp = ue;
			ue = ushiro;
			ushiro = shita;
			shita = mae;
			mae = temp;
			break;
		case 'E':
			temp = ue;
			ue = hidari;
			hidari = shita;
			shita = migi;
			migi = temp;
			break;
		case 'W':
			temp = ue;
			ue = migi;
			migi = shita;
			shita = hidari;
			hidari = temp;
			break;
		case 'R':
			temp = mae;
			mae = migi;
			migi = ushiro;
			ushiro = hidari;
			hidari = temp;
			break;
		case 'L':
			temp = mae;
			mae = hidari;
			hidari = ushiro;
			ushiro = migi;
			migi = temp;
			break;
		}

		return this;
	}

	boolean check(Dice d) {
		if (this.ue == d.ue && this.mae == d.mae &&
				this.migi == d.migi && this.hidari == d.hidari &&
				this.ushiro == d.ushiro && this.shita == d.shita) {
			return true;
		} else return false;
	}

}