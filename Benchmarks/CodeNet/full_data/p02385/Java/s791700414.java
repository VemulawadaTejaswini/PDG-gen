import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bekkai1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		String[] d1labeldata = br.readLine().split(" ");
		String[] d2labeldata = br.readLine().split(" ");

		Dice d1 = new Dice(d1labeldata);
		Dice d2 = new Dice(d2labeldata);

		int top;
		for (top = 0; top < 6; top++) {
			if ( d1.label[0].equals(d2.label[top]) ) break;
		}

		//System.out.println(top);

		switch (top) {
		case 0:
			break;
		case 1:
			d2.koroN();
			break;
		case 2:
			d2.koroW();
			break;
		case 3:
			d2.koroE();
			break;
		case 4:
			d2.koroS();
			break;
		case 5:
			d2.koroN().koroN();
			break;
		default:
			System.out.println("No");
		}

		int front;
		for (front = 1; front <= 4; front++) {
			if ( d1.label[1].equals(d2.label[front]) ) break;
		}

		//System.out.println(front);

		switch (front) {
		case 1:
			break;
		case 2:
			d2.kaitenTokei();
			break;
		case 3:
			d2.kaitenHanTokei();
			break;
		case 4:
			d2.kaitenTokei().kaitenTokei();
			break;
		default:
			System.out.println("No");
		}

		if ( d1.label[2].equals(d2.label[2]) ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	static class Dice {
		String[] label;

		Dice(String[] labeldata) {
			label = new String[labeldata.length];

			for (int i = 0; i < labeldata.length; i++) {
				label[i] = labeldata[i];
			}
		}

		Dice koroN() {
			String temp;
			temp = label[0];
			label[0] = label[1];
			label[1] = label[5];
			label[5] = label[4];
			label[4] = temp;
			return this;
		}

		Dice koroS() {
			String temp;
			temp = label[0];
			label[0] = label[4];
			label[4] = label[5];
			label[5] = label[1];
			label[1] = temp;
			return this;
		}

		Dice koroE() {
			String temp;
			temp = label[0];
			label[0] = label[3];
			label[3] = label[5];
			label[5] = label[2];
			label[2] = temp;
			return this;
		}

		Dice koroW() {
			String temp;
			temp = label[0];
			label[0] = label[2];
			label[2] = label[5];
			label[5] = label[3];
			label[3] = temp;
			return this;
		}

		Dice kaitenTokei() {
			String temp;
			temp = label[1];
			label[1] = label[2];
			label[2] = label[4];
			label[4] = label[3];
			label[3] = temp;
			return this;
		}

		Dice kaitenHanTokei() {
			String temp;
			temp = label[1];
			label[1] = label[3];
			label[3] = label[4];
			label[4] = label[2];
			label[2] = temp;
			return this;
		}

	}

}