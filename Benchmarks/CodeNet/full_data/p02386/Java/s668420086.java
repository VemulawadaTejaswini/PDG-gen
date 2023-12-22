import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			sc.nextLine();
			Dice[] dices = new Dice[n];
			for(int i = 0; i < n; i++) {
				dices[i] = new Dice(sc.nextLine().split(" "));
			}

			Boolean[] clear = new Boolean[n];

			for (int i = 1; i < n; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 4; k++) {
						for (int h = 0; h < 4; h++) {
							if (Arrays.equals(dices[0].d, dices[i].d)) {
								clear[i - 1] = false;
								break;
							}else {
								clear[i - 1] = true;
							}
							dices[i].S();
						}
						if (!clear[i - 1]) break;
						dices[i].E();
					}
					if (!clear[i - 1]) break;
					dices[i].R();
				}
			}
			if (!Bool(clear)) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
	public static Boolean Bool(Boolean[] b) {
		for (int i = 0; i < b.length - 1; i++) {
			if (!b[i]) return false;
		}
		return true;
	}
	static class Dice{
		private int[] d = new int[6];

		public Dice(String[] d_num) {
			for(int i = 0;i < d.length;i++) {
				d[i] = Integer.parseInt(d_num[i]);
			}
		}

		public void N() {
		    int tmp = d[0];
		    d[0] = d[1];
		    d[1] = d[5];
		    d[5] = d[4];
		    d[4] = tmp;
		}

		public void E() {
		    int tmp = d[0];
		    d[0] = d[3];
		    d[3] = d[5];
		    d[5] = d[2];
		    d[2] = tmp;
		}

		public void W() {
		    int tmp = d[0];
		    d[0] = d[2];
		    d[2] = d[5];
		    d[5] = d[3];
		    d[3] = tmp;
		}

		public void S() {
		    int tmp = d[0];
		    d[0] = d[4];
		    d[4] = d[5];
		    d[5] = d[1];
		    d[1] = tmp;
		}
		public void R() {
			int tmp = d[1];
			d[1] = d[3];
			d[3] = d[4];
			d[4] = d[2];
			d[2] = tmp;
		}
	}
}

