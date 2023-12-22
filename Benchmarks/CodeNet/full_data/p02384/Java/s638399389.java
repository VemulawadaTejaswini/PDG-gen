import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String[] labelStr = sc.nextLine().split(" ");

		int[] label = new int[6];
		for (int i=0; i < 6; i++) {
			label[i] = Integer.parseInt(labelStr[i]);
		}

		Dice d = new Dice(label);

		int q = sc.nextInt();
		for ( int i=0; i < q; i++) {
			int ul = sc.nextInt(); // upper label
			int fl = sc.nextInt(); // front label

			if (ul == d.ue) {}
			else if (ul == d.mae) d.kok('N');
			else if (ul == d.migi) d.kok('W');
			else if (ul == d.ushiro) d.kok('S');
			else if (ul == d.hidari) d.kok('E');
			else if (ul == d.shita) d.kok('N').kok('N');

			if (fl == d.mae) {}
			else if (fl == d.migi) d.kok('R');
			else if (fl == d.ushiro) d.kok('R').kok('R');
			else if (fl == d.hidari) d.kok('L');

			System.out.println(d.migi);
		}

	}

}

class Dice {
	int ue,mae,migi,hidari,ushiro,shita;

	Dice(int[] label) {
		ue = label[0];
		mae = label[1];
		migi = label[2];
		hidari = label[3];
		ushiro = label[4];
		shita = label[5];
	}

	Dice kok(char newsrl) { // korogasu or kaitenn saseru
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
		} else
			return false;
	}

}