import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new java.util.Scanner(System.in);

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuilder sb = new StringBuilder();

		String[] intStr = br.readLine().split(" ");
		//intStr = br.readLine().split(" ");
		int[] men = new int[intStr.length];
		for (int i = 0; i < intStr.length; i++) {
			men[i] = Integer.parseInt(intStr[i]);
		}

		Dice d = new Dice(men);

		String news = br.readLine();
		char[] meirei = news.toCharArray();

		for (char c : meirei) {
			switch (c) {
				case 'S':
					d.koroS();
					break;
				case 'N':
					d.koroN();
					break;
				case 'W':
					d.koroW();
					break;
				case 'E':
					d.koroE();
					break;
			}
		}
		System.out.println(d.men[0]);
	}

}

class Dice {
	int[] men = new int[6];

	Dice(int[] men) {
		for (int i = 0; i < men.length; i++) {
			this.men[i] = men[i];
		}
	}

	void koroS() {
		int temp = this.men[0];
		men[0] = men[4];
		men[4] = men[5];
		men[5] = men[1];
		men[1] = temp;
	}

	void koroN() {
		int temp = this.men[0];
		men[0] = men[1];
		men[1] = men[5];
		men[5] = men[4];
		men[4] = temp;
	}

	void koroW() {
		int temp = this.men[0];
		men[0] = men[2];
		men[2] = men[5];
		men[5] = men[3];
		men[3] = temp;
	}

	void koroE() {
		int temp = this.men[0];
		men[0] = men[3];
		men[3] = men[5];
		men[5] = men[2];
		men[2] = temp;
	}
}