import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String[] line1 = sc.nextLine().split(" ");
		String[] line2 = sc.nextLine().split(" ");

		int[] label1 = new int[6];
		int[] label2 = new int[6];

		for (int i=0; i < 6; i++) {
			label1[i] = Integer.parseInt(line1[i]);
			label2[i] = Integer.parseInt(line2[i]);
		}

		Dice d1 = new Dice(label1);
		Dice d2 = new Dice(label2);

		char[] order = ( "LLLL" + "SWWW" + "LSSS" +
				"LEEE" + "LNNN" + "WRRR" ).toCharArray();

		for (int i=0; i < order.length; i++) {
			d2.kok(order[i]);
			if ( d1.check(d2) ) {
				System.out.println("Yes");
				break;
			}
			if (i == order.length -1) System.out.println("No");
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